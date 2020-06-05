package com.sriyanksiddhartha.filesystemdemo.displayscreens;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.sriyanksiddhartha.filesystemdemo.R;

public class InternalStorageDisplay extends AppCompatActivity {

	private EditText etFileName;
	private TextView txvFileContent;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.internal_storage_display);

		etFileName = (EditText) findViewById(R.id.etFileName);
		txvFileContent = (TextView) findViewById(R.id.txvFileContent);
	}

	public void readAndDisplayFromFile(View view) {

		/*
		* File Content: "Hello from my file"
		* How Data is Actually Saved: 0110 0011 1001 1100 1111 -1
		* */
	}
}
