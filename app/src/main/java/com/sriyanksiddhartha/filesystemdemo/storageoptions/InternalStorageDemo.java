package com.sriyanksiddhartha.filesystemdemo.storageoptions;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.sriyanksiddhartha.filesystemdemo.R;
import com.sriyanksiddhartha.filesystemdemo.displayscreens.InternalStorageDisplay;


public class InternalStorageDemo extends AppCompatActivity {

	private EditText etFileName, etMessage, etFileToDelete;
	private TextView txvInternalStoragePath, txvFilesList;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.internal_storage);

		etFileName 		= (EditText) findViewById(R.id.etFileName);
		etMessage 		= (EditText) findViewById(R.id.etMessage);
		etFileToDelete 	= (EditText) findViewById(R.id.etFileToDelete);

		txvInternalStoragePath 	= (TextView) findViewById(R.id.txvInternalStoragePath);
		txvFilesList 			= (TextView) findViewById(R.id.txvFilesList);
	}

	public void saveToInternalStorage(View view) {

	}

	public void moveToDisplayScreen(View view) {

		Intent intent = new Intent(this, InternalStorageDisplay.class);
		startActivity(intent);
	}

	public void showInternalStoragePath(View view) {

	}

	public void showFilesList(View view) {

	}

	public void deleteFile(View view) {

	}
}
