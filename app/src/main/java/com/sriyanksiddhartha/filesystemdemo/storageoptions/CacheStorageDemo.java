package com.sriyanksiddhartha.filesystemdemo.storageoptions;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.sriyanksiddhartha.filesystemdemo.R;

public class CacheStorageDemo extends AppCompatActivity {

	private EditText etInternalCacheData, etExternalCacheData;
	private TextView txvInternalCacheData, txvExternalCacheData;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cache_storage);

		etInternalCacheData = (EditText) findViewById(R.id.etInternalCacheData);
		etExternalCacheData = (EditText) findViewById(R.id.etExternalCacheData);

		txvInternalCacheData = (TextView) findViewById(R.id.txvInternalCacheContent);
		txvExternalCacheData = (TextView) findViewById(R.id.txvExternalCacheContent);
	}

	public void saveToInternalCache(View view) {

	}

	public void saveToExternalCache(View view) {

	}

	public void loadFromInternalCache(View view) {

	}

	public void loadFromExternalCache(View view) {

	}
}
