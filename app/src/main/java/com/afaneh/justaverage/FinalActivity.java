package com.afaneh.justaverage;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

	TextView Hnew;
	TextView Anew;
	//TextView Nnew;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_final);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

		Global.result1 = (int) (Global.OldHrs + Float.parseFloat(Global.Spinner1h) + Float.parseFloat(Global.Spinner2h) + Float.parseFloat(Global.Spinner3h) + Float.parseFloat(Global.Spinner4h) + Float.parseFloat(Global.Spinner5h) + Float.parseFloat(Global.Spinner6h) + Float.parseFloat(Global.Spinner7h) + Float.parseFloat(Global.Spinner8h) + Float.parseFloat(Global.Spinner9h) + Float.parseFloat(Global.Spinner10h));

		Hnew = (TextView) findViewById(R.id.Hnew);
		Hnew.setText(String.valueOf(Global.result1));

		//int result3 = (int) ((Float.parseFloat(Global.Spinner1h)*(Global.MarkNew1 / Global.MarkNew1-Global.MarkOld1 / Global.MarkOld1))+(Float.parseFloat(Global.Spinner2h)*(Global.MarkNew2 / Global.MarkNew2-Global.MarkOld2 / Global.MarkOld2))+(Float.parseFloat(Global.Spinner3h)*(Global.MarkNew3 / Global.MarkNew3-Global.MarkOld3 / Global.MarkOld3))+(Float.parseFloat(Global.Spinner4h)*(Global.MarkNew4 / Global.MarkNew4-Global.MarkOld4 / Global.MarkOld4))+(Float.parseFloat(Global.Spinner5h)*(Global.MarkNew5 / Global.MarkNew5-Global.MarkOld5 / Global.MarkNew5))+(Float.parseFloat(Global.Spinner6h)*(Global.MarkNew6 / Global.MarkNew6-Global.MarkOld6 / Global.MarkOld6))+(Float.parseFloat(Global.Spinner7h)*(Global.MarkNew7 / Global.MarkNew7-Global.MarkOld7 / Global.MarkOld7))+(Float.parseFloat(Global.Spinner8h)*(Global.MarkNew8 / Global.MarkNew8-Global.MarkOld8 / Global.MarkOld8))+(Float.parseFloat(Global.Spinner9h)*(Global.MarkNew9 / Global.MarkNew9-Global.MarkOld9 / Global.MarkOld9))+(Float.parseFloat(Global.Spinner10h)*(Global.MarkNew10 / Global.MarkNew10-Global.MarkOld10 / Global.MarkOld10)));
		int result3 = (int) ((Float.parseFloat(Global.Spinner1h)*(((Global.MarkNew1 == 0)?0:1)-((Global.MarkOld1 == 0)?0:1)))+(Float.parseFloat(Global.Spinner2h)*(((Global.MarkNew2 == 0)?0:1)-((Global.MarkOld2 == 0)?0:1)))+(Float.parseFloat(Global.Spinner3h)*(((Global.MarkNew3 == 0)?0:1)-((Global.MarkOld3 == 0)?0:1)))+(Float.parseFloat(Global.Spinner4h)*(((Global.MarkNew4 == 0)?0:1)-((Global.MarkOld4 == 0)?0:1)))+(Float.parseFloat(Global.Spinner5h)*(((Global.MarkNew5 == 0)?0:1)-((Global.MarkOld5 == 0)?0:1)))+(Float.parseFloat(Global.Spinner6h)*(((Global.MarkNew6 == 0)?0:1)-((Global.MarkOld6 == 0)?0:1)))+(Float.parseFloat(Global.Spinner7h)*(((Global.MarkNew7 == 0)?0:1)-((Global.MarkOld7 == 0)?0:1)))+(Float.parseFloat(Global.Spinner8h)*(((Global.MarkNew8 == 0)?0:1)-((Global.MarkOld8 == 0)?0:1)))+(Float.parseFloat(Global.Spinner9h)*(((Global.MarkNew9 == 0)?0:1)-((Global.MarkOld9 == 0)?0:1)))+(Float.parseFloat(Global.Spinner10h)*(((Global.MarkNew10 == 0)?0:1)-((Global.MarkOld10 == 0)?0:1))));
		//Nnew = (TextView) findViewById(R.id.Nnew);
		//Nnew.setText(String.valueOf(result3));

		Global.result2 = (((Global.OldHrs - 6) * Global.OldCum) + Float.parseFloat(Global.Spinner1h) * (Global.MarkNew1 - Global.MarkOld1) + Float.parseFloat(Global.Spinner2h) * (Global.MarkNew2 - Global.MarkOld2) + Float.parseFloat(Global.Spinner3h) * (Global.MarkNew3-Global.MarkOld3) + Float.parseFloat(Global.Spinner4h) * (Global.MarkNew4-Global.MarkOld4) + Float.parseFloat(Global.Spinner5h) * (Global.MarkNew5-Global.MarkOld5) + Float.parseFloat(Global.Spinner6h) * (Global.MarkNew6-Global.MarkOld6) + Float.parseFloat(Global.Spinner7h) * (Global.MarkNew7 - Global.MarkOld7) + Float.parseFloat(Global.Spinner8h) * (Global.MarkNew8 - Global.MarkOld8) + Float.parseFloat(Global.Spinner9h) * (Global.MarkNew9-Global.MarkOld9) + Float.parseFloat(Global.Spinner10h) * (Global.MarkNew10-Global.MarkOld10)) / (Global.OldHrs - 6 + result3);

		Anew = (TextView) findViewById(R.id.Anew);
		Anew.setText(String.valueOf(Global.result2));

		FloatingActionButton fab1 = (FloatingActionButton) findViewById(R.id.fab_next3);
		fab1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent(v.getContext(), InfoActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});

		FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab_back2);
		fab2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent myIntent = new Intent(v.getContext(), CalActivity.class);
				startActivityForResult(myIntent, 0);
				Anew.setText("0");
				Hnew.setText("0");
			}
		});
	}
}
