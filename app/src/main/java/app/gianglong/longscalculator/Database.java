package app.gianglong.longscalculator;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Giang Long on 21/6/2016.
 */
public class Database extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Calculator";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "tb_history";
    public static final String ROW_ID = "id";
    public static final String ROW_CALCULATIONS = "calculations";
    public static final String ROW_RESULT = "result";

    SQLiteDatabase db;

    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        db = getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create table
        String sql = "Create table if not exists " + TABLE_NAME + "( _" + ROW_ID + " integer primary key, " + ROW_CALCULATIONS + " text, " + ROW_RESULT + " text " + ")" ;
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void query(String strQuery){
        db.execSQL(strQuery);
    }

    public Cursor getData(String sql){
        db = getWritableDatabase();
        return db.rawQuery(sql, null);
    }


    public void insert(String calculations, String result){
        query("Insert into " + TABLE_NAME + " values ( NULL, " + "'" + calculations + "'" + ", " + "'" + result + "'" +" )" );
    }

    public void deleteTable(){
        query("Delete from " + TABLE_NAME);
    }

}
