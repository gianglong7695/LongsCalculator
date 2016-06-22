package app.gianglong.longscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class InfomationActivity extends AppCompatActivity {
    String [] arr = {"Điều khoản sử dụng","Tính năng & Hướng dẫn", "Kiểm tra phiên bản mới", "Hỗ trợ", "Liên hệ"};
    ArrayAdapter<String> adapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infomation);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Thông tin ứng dụng");

        lv = (ListView) findViewById(R.id.lvInfo);
        adapter = new ArrayAdapter<String>(this, R.layout.row_listview, arr);
        lv.setAdapter(adapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return true;
    }
}
