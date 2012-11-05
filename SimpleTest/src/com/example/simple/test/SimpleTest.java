package com.example.simple.test;

import com.example.simple.SimpleActivity;
import com.example.simple.R;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

public class SimpleTest extends ActivityInstrumentationTestCase2<SimpleActivity> {
	private TextView total;  

	public SimpleTest() {
		super("com.example.simple", SimpleActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		SimpleActivity simpleActivity = getActivity();
		total = (TextView)simpleActivity.findViewById(R.id.total);
	}

	public void testSimple(){
		sendKeys( "2 ENTER ");
		sendKeys( "3 ENTER ");

		assertEquals("5", total.getText());
	}
}
