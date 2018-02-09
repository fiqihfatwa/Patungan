package com.example.android.patungan.DBHandler;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by isadadi on 2/10/2018.
 */



public class SQLiteHandler extends SQLiteOpenHelper {

    private static final String DBName = "patungan";
    private  static  final  String Table = "user";
    public SQLiteHandler(Context context) {
        super(context, DBName, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+Table+ " (email TEXT PRIMARY KEY, nama TEXT, alamat TEXT," +
                "telepon TEXT, nama_bank TEXT, an_bank TEXT, no_rekening TEXT, ktp TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Table);
        // Create tables again
        onCreate(db);
    }

    public void addUser(String email, String name, String alamat, String telepon, String nama_bank, String an_bank, String no_rekening, String ktp) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("email", email); // Nim
        values.put("nama", name); // Nama
        values.put("telepon", telepon);
        values.put("nama_bank", nama_bank);
        values.put("an_bank", an_bank);
        values.put("no_rekening", no_rekening);
        values.put("ktp", ktp);

        // Inserting Row
        long id = db.insert(Table, null, values);
        db.close(); // Closing database connection

        Log.d("SQLite", "New user inserted into sqlite: " + id);
    }
}
