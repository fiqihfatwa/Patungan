package com.example.android.patungan.DBHandler;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.HashMap;

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

    public boolean cek_user(){
        String query = "SELECT * FROM "+ Table;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public void deleteUsers() {
        SQLiteDatabase db = this.getWritableDatabase();
        // Delete All Rows
        db.delete(Table, null, null);
        db.close();

        Log.d("Delete User", "Deleted all user info from sqlite");
    }


    public HashMap<String, String> getUserDetails() {
        HashMap<String, String> user = new HashMap<String, String>();
        String selectQuery = "SELECT  * FROM " + Table;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        // Move to first row
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            user.put("email", cursor.getString(0));
            user.put("nama", cursor.getString(1));
        }
        cursor.close();
        db.close();
        // return user
        Log.d("DB user detail", "Fetching user from Sqlite: " + user.toString());

        return user;
    }
}
