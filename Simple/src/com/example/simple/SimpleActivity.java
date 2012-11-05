package com.example.simple;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleActivity extends Activity implements TextWatcher     {

    private EditText editText1;
	private EditText editText2;
	private TextView total;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        editText1 =(EditText) findViewById(R.id.editText1);
   
        editText1.addTextChangedListener(this);
     
        
        
        editText2 =(EditText) findViewById(R.id.editText2);
        
        editText2.addTextChangedListener(this);
        
        total = (TextView)findViewById(R.id.total);
        
     
     
        Log.d("elise test"," onCreate" );
    
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
  


	public void afterTextChanged(Editable s) {
		
		 String total = "";

		 int int1 =  getIntValue(editText1);
		 int int2 =  getIntValue(editText2);
		
		 total += (int1+int2);
		 
		 this.total.setText(total);
		
	}

	private int getIntValue(EditText editText) {
		if(editText.getText().toString().length() == 0){
			editText.setText("0");
		}
		
		try {
			
			return Integer.valueOf(editText.getText().toString());
		} catch (NumberFormatException e) {
			Log.e("should NOT happen", e.getMessage());		
			return 0;
		}
	}

	public void beforeTextChanged(CharSequence s, int start, int count,
			int after) {
		
			// unused because I implemented TextWatcher
		
	}

	public void onTextChanged(CharSequence s, int start, int before, int count) {
		
		// unused because I implemented TextWatcher
		
	}

	



	


    
    
}
