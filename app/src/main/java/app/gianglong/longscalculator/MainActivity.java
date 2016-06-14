package app.gianglong.longscalculator;

import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    private TextView bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9; // Buttons
    private TextView btAdd, btSub, btMul, btDiv, btRemaining; // Calculations
    private TextView btClear, btMinus, btBackSpace, btPoint, btResult; // Other
    public static TextView tvCalculation, tvResult; // Screen
    //----------------------------------------------------------------------------------------------
    Calculate mCalculate;
    public static ArrayList<String> arrCalculations;
    public static ArrayList<String> arrNumbers;
    public static ArrayList<String> arrPress; // Save all press

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        setEventButtons();
        //----------------
        mCalculate = new Calculate();
        arrCalculations = new ArrayList<>();
        arrNumbers = new ArrayList<>();
        arrPress = new ArrayList<>();


    }

    private void setViews(){
        //--//
        bt0 = (TextView) findViewById(R.id.num_0);
        bt1 = (TextView) findViewById(R.id.num_1);
        bt2 = (TextView) findViewById(R.id.num_2);
        bt3 = (TextView) findViewById(R.id.num_3);
        bt4 = (TextView) findViewById(R.id.num_4);
        bt5 = (TextView) findViewById(R.id.num_5);
        bt6 = (TextView) findViewById(R.id.num_6);
        bt7 = (TextView) findViewById(R.id.num_7);
        bt8 = (TextView) findViewById(R.id.num_8);
        bt9 = (TextView) findViewById(R.id.num_9);
        //--//
        btAdd = (TextView) findViewById(R.id.addition);
        btSub = (TextView) findViewById(R.id.subtraction);
        btMul = (TextView) findViewById(R.id.multiplication);
        btDiv = (TextView) findViewById(R.id.division);
        btRemaining = (TextView) findViewById(R.id.remaining);
        //--//
        btClear = (TextView) findViewById(R.id.clear);
        btMinus = (TextView) findViewById(R.id.minus);
        btBackSpace = (TextView) findViewById(R.id.backspace);
        btPoint = (TextView) findViewById(R.id.point);
        btResult = (TextView) findViewById(R.id.result);
        //--//
        tvCalculation = (TextView) findViewById(R.id.tvCalculation);
        tvResult = (TextView) findViewById(R.id.tvResult);
        //--//

    }
    private void setEventButtons(){
        bt0.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        bt0.setTextSize(38);
                        bt0.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size() - 1).equals("=")){
                                // Delete data before have a new calculation
                                mCalculate.newCalculation();

                                arrPress.add(bt0.getText().toString());
                                //--
                                mCalculate.setText(bt0.getText().toString());
                            }else{
                                arrPress.add(bt0.getText().toString());
                                //--
                                mCalculate.setText(bt0.getText().toString());
                            }
                        }else{
                            arrPress.add(bt0.getText().toString());
                            //--
                            mCalculate.setText(bt0.getText().toString());
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        bt0.setTextSize(23);
                        bt0.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        bt1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        bt1.setTextSize(38);
                        bt1.setTypeface(null, Typeface.BOLD);


                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size() - 1).equals("=")){
                                // Delete data before have a new calculation
                                mCalculate.newCalculation();

                                arrPress.add(bt1.getText().toString());
                                //--
                                mCalculate.setText(bt1.getText().toString());
                            }else{
                                arrPress.add(bt1.getText().toString());
                                //--
                                mCalculate.setText(bt1.getText().toString());
                            }

                        }else{
                            arrPress.add(bt1.getText().toString());
                            //--
                            mCalculate.setText(bt1.getText().toString());
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        bt1.setTextSize(23);
                        bt1.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        bt2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        bt2.setTextSize(38);
                        bt2.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size() - 1).equals("=")){
                                // Delete data before have a new calculation
                                mCalculate.newCalculation();

                                arrPress.add(bt2.getText().toString());
                                //--
                                mCalculate.setText(bt2.getText().toString());
                            }else{
                                arrPress.add(bt2.getText().toString());
                                //--
                                mCalculate.setText(bt2.getText().toString());
                            }
                        }else{
                            arrPress.add(bt2.getText().toString());
                            //--
                            mCalculate.setText(bt2.getText().toString());
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        bt2.setTextSize(23);
                        bt2.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        bt3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        bt3.setTextSize(38);
                        bt3.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size() - 1).equals("=")){
                                // Delete data before have a new calculation
                                mCalculate.newCalculation();

                                arrPress.add(bt3.getText().toString());
                                //--
                                mCalculate.setText(bt3.getText().toString());
                            }else{
                                arrPress.add(bt3.getText().toString());
                                //--
                                mCalculate.setText(bt3.getText().toString());
                            }
                        }else{
                            arrPress.add(bt3.getText().toString());
                            //--
                            mCalculate.setText(bt3.getText().toString());
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        bt3.setTextSize(23);
                        bt3.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        bt4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        bt4.setTextSize(38);
                        bt4.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size() - 1).equals("=")){
                                // Delete data before have a new calculation
                                mCalculate.newCalculation();

                                arrPress.add(bt4.getText().toString());
                                //--
                                mCalculate.setText(bt4.getText().toString());
                            }else{
                                arrPress.add(bt4.getText().toString());
                                //--
                                mCalculate.setText(bt4.getText().toString());
                            }
                        }else{
                            arrPress.add(bt4.getText().toString());
                            //--
                            mCalculate.setText(bt4.getText().toString());
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        bt4.setTextSize(23);
                        bt4.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        bt5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        bt5.setTextSize(38);
                        bt5.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size() - 1).equals("=")){
                                // Delete data before have a new calculation
                                mCalculate.newCalculation();

                                arrPress.add(bt5.getText().toString());
                                //--
                                mCalculate.setText(bt5.getText().toString());
                            }else{
                                arrPress.add(bt5.getText().toString());
                                //--
                                mCalculate.setText(bt5.getText().toString());
                            }
                        }else{
                            arrPress.add(bt5.getText().toString());
                            //--
                            mCalculate.setText(bt5.getText().toString());
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        bt5.setTextSize(23);
                        bt5.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        bt6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        bt6.setTextSize(38);
                        bt6.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size() - 1).equals("=")){
                                // Delete data before have a new calculation
                                mCalculate.newCalculation();

                                arrPress.add(bt6.getText().toString());
                                //--
                                mCalculate.setText(bt6.getText().toString());
                            }else{
                                arrPress.add(bt6.getText().toString());
                                //--
                                mCalculate.setText(bt6.getText().toString());
                            }
                        }else{
                            arrPress.add(bt6.getText().toString());
                            //--
                            mCalculate.setText(bt6.getText().toString());
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        bt6.setTextSize(23);
                        bt6.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        bt7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        bt7.setTextSize(38);
                        bt7.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size() - 1).equals("=")){
                                // Delete data before have a new calculation
                                mCalculate.newCalculation();

                                arrPress.add(bt7.getText().toString());
                                //--
                                mCalculate.setText(bt7.getText().toString());
                            }else{
                                arrPress.add(bt7.getText().toString());
                                //--
                                mCalculate.setText(bt7.getText().toString());
                            }
                        }else{
                            arrPress.add(bt7.getText().toString());
                            //--
                            mCalculate.setText(bt7.getText().toString());
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        bt7.setTextSize(23);
                        bt7.setTypeface(null, Typeface.NORMAL);

                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        bt8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        bt8.setTextSize(38);
                        bt8.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size() - 1).equals("=")){
                                // Delete data before have a new calculation
                                mCalculate.newCalculation();

                                arrPress.add(bt8.getText().toString());
                                //--
                                mCalculate.setText(bt8.getText().toString());
                            }else{
                                arrPress.add(bt8.getText().toString());
                                //--
                                mCalculate.setText(bt8.getText().toString());
                            }
                        }else{
                            arrPress.add(bt8.getText().toString());
                            //--
                            mCalculate.setText(bt8.getText().toString());
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        bt8.setTextSize(23);
                        bt8.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        bt9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        bt9.setTextSize(38);
                        bt9.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size() - 1).equals("=")){
                                // Delete data before have a new calculation
                                mCalculate.newCalculation();

                                arrPress.add(bt9.getText().toString());
                                //--
                                mCalculate.setText(bt9.getText().toString());
                            }else{
                                arrPress.add(bt9.getText().toString());
                                //--
                                mCalculate.setText(bt9.getText().toString());
                            }
                        }else{
                            arrPress.add(bt9.getText().toString());
                            //--
                            mCalculate.setText(bt9.getText().toString());
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        bt9.setTextSize(23);
                        bt9.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });

        btClear.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        btClear.setTextSize(38);
                        btClear.setTypeface(null, Typeface.BOLD);
                        arrPress.add(btClear.getText().toString());
                        // Clear screen
                        mCalculate.clear();
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        btClear.setTextSize(23);
                        btClear.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        btMinus.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        btMinus.setTextSize(38);
                        btMinus.setTypeface(null, Typeface.BOLD);
                        arrPress.add(btMinus.getText().toString());
                        // PRESSED
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        btMinus.setTextSize(23);
                        btMinus.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });

        btBackSpace.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        btBackSpace.setTextSize(38);
                        btBackSpace.setTypeface(null, Typeface.BOLD);
                        arrPress.add(btBackSpace.getText().toString());
                        // BackSpace
                        mCalculate.backSpace();
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        btBackSpace.setTextSize(23);
                        btBackSpace.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });

        // Calculations ----------------------------------------------------------------------------
        btAdd.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        btAdd.setTextSize(38);
                        btAdd.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size()-1).equals(btResult.getText().toString())){
                                mCalculate.resetText(btAdd.getText().toString());
                            }else{
                                if(!arrPress.get(arrPress.size() - 1).equals(btAdd.getText().toString())
                                    && !arrPress.get(arrPress.size() - 1).equals(btSub.getText().toString())
                                    && !arrPress.get(arrPress.size() - 1).equals(btMul.getText().toString())
                                    && !arrPress.get(arrPress.size() - 1).equals(btDiv.getText().toString())
                                    && !arrPress.get(arrPress.size() - 1).equals(btRemaining.getText().toString())){

                                    arrPress.add(btAdd.getText().toString());
                                    mCalculate.setText(btAdd.getText().toString());
                                }
                            }
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        btAdd.setTextSize(23);
                        btAdd.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
//        btSub.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                switch(event.getAction()) {
//                    case MotionEvent.ACTION_DOWN:
//                        btSub.setTextSize(38);
//                        btSub.setTypeface(null, Typeface.BOLD);
//                        arrPress.add(btSub.getText().toString());
//                        //--
//                        mCalculate.setText(btSub.getText().toString());
//                        return true; // if you want to handle the touch event
//                    case MotionEvent.ACTION_UP:
//                        btSub.setTextSize(23);
//                        bt9.setTypeface(null, Typeface.NORMAL);
//                        // RELEASED
//                        return true; // if you want to handle the touch event
//                }
//                return false;
//            }
//        });

        btSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        btSub.setTextSize(38);
                        btSub.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size()-1).equals(btResult.getText().toString())){
                                mCalculate.resetText(btSub.getText().toString());
                            }else{
                                if(!arrPress.get(arrPress.size() - 1).equals(btAdd.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btSub.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btMul.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btDiv.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btRemaining.getText().toString())){

                                    arrPress.add(btSub.getText().toString());
                                    mCalculate.setText(btSub.getText().toString());
                                }
                            }
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        btSub.setTextSize(23);
                        bt9.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        btMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        btMul.setTextSize(38);
                        btMul.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size()-1).equals(btResult.getText().toString())){
                                mCalculate.resetText(btMul.getText().toString());
                            }else{
                                if(!arrPress.get(arrPress.size() - 1).equals(btAdd.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btSub.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btMul.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btDiv.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btRemaining.getText().toString())){

                                    arrPress.add(btMul.getText().toString());
                                    mCalculate.setText(btMul.getText().toString());
                                }
                            }
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        btMul.setTextSize(23);
                        btMul.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        btDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        btDiv.setTextSize(38);
                        btDiv.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size()-1).equals(btResult.getText().toString())){
                                mCalculate.resetText(btDiv.getText().toString());
                            }else{
                                if(!arrPress.get(arrPress.size() - 1).equals(btAdd.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btSub.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btMul.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btDiv.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btRemaining.getText().toString())){

                                    arrPress.add(btDiv.getText().toString());
                                    mCalculate.setText(btDiv.getText().toString());
                                }
                            }
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        btDiv.setTextSize(23);
                        btDiv.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });
        btRemaining.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        btRemaining.setTextSize(38);
                        btRemaining.setTypeface(null, Typeface.BOLD);

                        if(arrPress.size() > 0){
                            if(arrPress.get(arrPress.size()-1).equals(btResult.getText().toString())){
                                mCalculate.resetText(btRemaining.getText().toString());
                            }else{
                                if(!arrPress.get(arrPress.size() - 1).equals(btAdd.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btSub.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btMul.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btDiv.getText().toString())
                                        && !arrPress.get(arrPress.size() - 1).equals(btRemaining.getText().toString())){

                                    arrPress.add(btRemaining.getText().toString());
                                    mCalculate.setText(btRemaining.getText().toString());
                                }
                            }
                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        btRemaining.setTextSize(23);
                        btRemaining.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });

        //------------------------------------------------------------------------------------------

        btPoint.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        btPoint.setTextSize(38);
                        btPoint.setTypeface(null, Typeface.BOLD);
                        arrPress.add(btPoint.getText().toString());
                        //--
                        mCalculate.setText(btPoint.getText().toString());
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        btPoint.setTextSize(23);
                        btPoint.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });

        btResult.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // Action
                        btResult.setTextSize(40);
                        btResult.setTypeface(null, Typeface.BOLD);

                        // Calculate
                        if(arrPress.size() > 0){
                            arrPress.add(btResult.getText().toString());

                            Double result = mCalculate.calculate();
                            if( result % 1 == 0){
                                String str = result + "";
                                tvResult.setText(str.substring(0, str.length() - 2));
                            }else{
                                tvResult.setText(String.valueOf(result));
                            }

                        }
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        btResult.setTextSize(23);
                        btResult.setTypeface(null, Typeface.NORMAL);
                        // RELEASED
                        return true; // if you want to handle the touch event
                }
                return false;
            }
        });


    }

    // Log methods
    public static void myLog(String text){
        Log.d("MainActivity", text);
    }
    public static void myLog(int text){
        Log.d("MainActivity", text + "");
    }

}
