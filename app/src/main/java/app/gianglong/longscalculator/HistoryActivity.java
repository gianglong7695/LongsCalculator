package app.gianglong.longscalculator;

import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HistoryActivity extends AppCompatActivity {
    ListView lvHistory;
    Database db;
    ArrayList<HistoryObject> arrlResult;
    HistoryAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        lvHistory = (ListView) findViewById(R.id.lvHistory);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Lịch sử");

        db = new Database(this);
        arrlResult = new ArrayList<>();

        Cursor c = db.getData("Select * from " + Database.TABLE_NAME);

        while (c.moveToNext()){
            arrlResult.add(new HistoryObject(c.getString(1), c.getString(2)));
        }

        adapter = new HistoryAdapter(getApplicationContext(), R.layout.row_history, arrlResult);
        lvHistory.setAdapter(adapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
            break;

            case R.id.action_delete:
                AlertDialog.Builder builder = new AlertDialog.Builder(HistoryActivity.this);
                builder.setTitle("Xóa");
                builder.setMessage("Bạn sẽ mất toàn bộ lịch sử đã lưu trên máy. Bạn có chắc ?");
                builder.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                builder.setPositiveButton("Chắc chắn", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        db.deleteTable();
                        arrlResult.clear();
                        adapter.notifyDataSetChanged();
                        Toast.makeText(HistoryActivity.this, "Đã xóa dữ liệu !!!", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.create().show();


                break;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.history_menu, menu);

        return true;
    }
}
