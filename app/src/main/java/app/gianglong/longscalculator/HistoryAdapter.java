package app.gianglong.longscalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Giang Long on 21/6/2016.
 */
public class HistoryAdapter extends ArrayAdapter<HistoryObject> {
    public HistoryAdapter(Context context, int resource, List<HistoryObject> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        convertView = inflater.inflate(R.layout.row_history, null);

        HistoryObject historyObject = getItem(position);
        TextView calculations = (TextView) convertView.findViewById(R.id.history_tvCalculations);
        TextView result = (TextView) convertView.findViewById(R.id.history_tvResult);

        calculations.setText(historyObject.calculations);
        result.setText(historyObject.result);

        return convertView;
    }
}
