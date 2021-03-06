package com.example.sqlitedb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHack extends SQLiteOpenHelper{

	public DBHack(Context context) {
		super(context, "mydb.db", null, 1);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table contact(id integer primary key autoincrement,name text,phone long unique)");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
		db.execSQL("drop table if exists contact");
		onCreate(db);
	}
	public Long saveData(String name,long phone){
		SQLiteDatabase db=getWritableDatabase();
		ContentValues values=new ContentValues();
		values.put("name", name);
		values.put("phone", phone);
		Long row=db.insert("contact", null, values);
		return row;
	}
	public Cursor viewAll(){
		SQLiteDatabase db=getWritableDatabase();
		Cursor cursor=db.rawQuery("select* from contact",null);
		return cursor;
	}

	public void updateContact(Contacts contact) {
		SQLiteDatabase db=getWritableDatabase();
		ContentValues values=new ContentValues();
		values.put("name", contact.getName());
		values.put("phone", contact.getPhone());
		db.update("contact", values, "id=?", new String[]{String.valueOf(contact.getId())});
	}

	public void deleteContact(String tid) {
		SQLiteDatabase db=getWritableDatabase();
		db.delete("contact", "id=?", new String[]{tid});
	}
}
