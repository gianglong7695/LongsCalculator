package app.gianglong.longscalculator;

import android.util.Log;


/**
 * Created by Giang Long on 7/6/2016.
 */
public class Calculate {
    String value = "";
    public boolean isMinus = false;

    public void setText(String text) {
        String temp = MainActivity.tvCalculation.getText().toString();
        temp += text;
        MainActivity.tvCalculation.setText(temp);

        //-- Save values
        saveValues(text);
        //Log.d("Save press", MainActivity.arrPress.size() + " - " + text);

    }

    public void resetText(String calculation) {
        String result = MainActivity.tvResult.getText().toString();

        MainActivity.arrCalculations.clear();
        MainActivity.arrNumbers.clear();
        MainActivity.arrNumbers.add(result);


        result += calculation;
        MainActivity.tvCalculation.setText(result);
        MainActivity.arrCalculations.add(calculation);
        MainActivity.arrPress.add(calculation);
        isMinus = false;
        value = "";

    }

    public void clear() {
        MainActivity.tvCalculation.setText("");
        MainActivity.tvResult.setText("0");
        MainActivity.arrCalculations.clear();
        MainActivity.arrNumbers.clear();
        MainActivity.arrPress.clear();
        isMinus = false;
        value = "";
    }

    public void newCalculation() {
        MainActivity.tvCalculation.setText("");
        MainActivity.arrCalculations.clear();
        MainActivity.arrNumbers.clear();
        value = "";
    }

    public void backSpace() {
        String temp = MainActivity.tvCalculation.getText().toString();

        if (temp.length() > 0) {
            if (temp.length() > 1) {
                String newStr = temp.substring(0, temp.length() - 1);
                String lastStr = temp.substring(temp.length()-1, temp.length());

                if (value.length() > 0) {
                    value = value.substring(0, value.length() - 1);
                    if (MainActivity.arrNumbers.size() > 0) {
                        MainActivity.arrNumbers.remove(MainActivity.arrNumbers.size() - 1);
                        MainActivity.arrNumbers.add(value);
                    }
                }
                MainActivity.tvCalculation.setText(newStr);
            } else {
                String newStr = temp.substring(0, temp.length() - 1);
                if (value.length() > 0) {
                    value = value.substring(0, value.length() - 1);
                }
                MainActivity.tvCalculation.setText(newStr);
                MainActivity.tvResult.setText("0");
            }
        }
    }

    public double calculate() {
        if (MainActivity.arrNumbers.size() == MainActivity.arrCalculations.size()) {
            MainActivity.arrNumbers.add(value); // Save last number
        }

        double result = Double.parseDouble(MainActivity.arrNumbers.get(0)); // Result = numbers[0]
        for (int i = 0; i < MainActivity.arrCalculations.size(); i++) {
            if (MainActivity.arrCalculations.get(i).equals("+")) {
                result += Double.parseDouble(MainActivity.arrNumbers.get(i + 1));
            }
            if (MainActivity.arrCalculations.get(i).equals("-")) {
                result -= Double.parseDouble(MainActivity.arrNumbers.get(i + 1));
            }
            if (MainActivity.arrCalculations.get(i).equals("×")) {
                result *= Double.parseDouble(MainActivity.arrNumbers.get(i + 1));
            }
            if (MainActivity.arrCalculations.get(i).equals("÷")) {
                result /= Double.parseDouble(MainActivity.arrNumbers.get(i + 1));
            }
            if (MainActivity.arrCalculations.get(i).equals("%")) {
                result %= Double.parseDouble(MainActivity.arrNumbers.get(i + 1));
            }
        }


        return result;
    }

    public void saveValues(String text) {
        if (!MainActivity.arrPress.get(MainActivity.arrPress.size() - 1).equals("=")) {
            if (text.equals("+") || text.equals("-") || text.equals("×") || text.equals("÷") || text.equals("%")) {
                MainActivity.arrNumbers.add(value);
                MainActivity.arrCalculations.add(text);
                //Log.d("Message", "Saved value : " + value + " (Size: " + MainActivity.arrNumbers.size() + ")");
                value = "";
                isMinus = false; // reset minus value
            } else {
                value += text;
            }
        } else {
            MainActivity.arrCalculations.add(text);
            value = "";
        }
    }

    public void minus() {
        if (!isMinus) {
            value = "-" + value;
            String temp = MainActivity.tvCalculation.getText().toString();
            if (MainActivity.arrCalculations.size() == 0) {
                temp = "-" + temp;
            } else {
                temp = temp + "-";
            }

            MainActivity.tvCalculation.setText(temp);

            isMinus = true;

        } else {

            if (value.length() > 1) {
                value = value.substring(1, value.length() - 1);
            } else if (value.length() == 1) {
                value = "";
            }
            String temp = MainActivity.tvCalculation.getText().toString();
            if (MainActivity.arrCalculations.size() == 0) {
                temp = temp.substring(1, temp.length());
            } else {
                temp = temp.substring(0, temp.length() - 1);
            }
            MainActivity.tvCalculation.setText(temp);

            isMinus = false;
        }

    }


    // Log methods
    public void myLog(String text) {
        Log.d("Calculate", text);
    }

    public void myLog(int text) {
        Log.d("Calculate", text + "");
    }

}
