package com.afaneh.justaverage;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Spinner;

public class CalActivity extends AppCompatActivity {

    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cal);
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);

        // calculator
        final Spinner  spinner1h = (Spinner) findViewById(R.id.spinner1h);
        final EditText markold1 = (EditText) findViewById(R.id.markold1);
        final EditText marknew1 = (EditText) findViewById(R.id.marknew1);
        final Spinner  spinner2h = (Spinner) findViewById(R.id.spinner2h);
        final EditText markold2 = (EditText) findViewById(R.id.markold2);
        final EditText marknew2 = (EditText) findViewById(R.id.marknew2);
        final Spinner  spinner3h = (Spinner) findViewById(R.id.spinner3h);
        final EditText markold3 = (EditText) findViewById(R.id.markold3);
        final EditText marknew3 = (EditText) findViewById(R.id.marknew3);
        final Spinner  spinner4h = (Spinner) findViewById(R.id.spinner4h);
        final EditText markold4 = (EditText) findViewById(R.id.markold4);
        final EditText marknew4 = (EditText) findViewById(R.id.marknew4);
        final Spinner  spinner5h = (Spinner) findViewById(R.id.spinner5h);
        final EditText markold5 = (EditText) findViewById(R.id.markold5);
        final EditText marknew5 = (EditText) findViewById(R.id.marknew5);
        final Spinner  spinner6h = (Spinner) findViewById(R.id.spinner6h);
        final EditText markold6 = (EditText) findViewById(R.id.markold6);
        final EditText marknew6 = (EditText) findViewById(R.id.marknew6);
        final Spinner  spinner7h = (Spinner) findViewById(R.id.spinner7h);
        final EditText markold7 = (EditText) findViewById(R.id.markold7);
        final EditText marknew7 = (EditText) findViewById(R.id.marknew7);
        final Spinner  spinner8h = (Spinner) findViewById(R.id.spinner8h);
        final EditText markold8 = (EditText) findViewById(R.id.markold8);
        final EditText marknew8 = (EditText) findViewById(R.id.marknew8);
        final Spinner  spinner9h = (Spinner) findViewById(R.id.spinner9h);
        final EditText markold9 = (EditText) findViewById(R.id.markold9);
        final EditText marknew9 = (EditText) findViewById(R.id.marknew9);
        final Spinner  spinner10h = (Spinner) findViewById(R.id.spinner10h);
        final EditText markold10 = (EditText) findViewById(R.id.markold10);
        final EditText marknew10 = (EditText) findViewById(R.id.marknew10);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_back1);
		fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v){
				Intent myIntent = new Intent(v.getContext(), JustActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});

		FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.fab_next2);
		fab2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v){
                Intent myIntent = new Intent(v.getContext(), FinalActivity.class);
                startActivityForResult(myIntent, 0);
                // read Spinner and fill variables with numbers
                Global.Spinner1h = String.valueOf(spinner1h.getSelectedItem());
                Global.Spinner2h = String.valueOf(spinner2h.getSelectedItem());
                Global.Spinner3h = String.valueOf(spinner3h.getSelectedItem());
                Global.Spinner4h = String.valueOf(spinner4h.getSelectedItem());
                Global.Spinner5h = String.valueOf(spinner5h.getSelectedItem());
                Global.Spinner6h = String.valueOf(spinner6h.getSelectedItem());
                Global.Spinner7h = String.valueOf(spinner7h.getSelectedItem());
                Global.Spinner8h = String.valueOf(spinner8h.getSelectedItem());
                Global.Spinner9h = String.valueOf(spinner9h.getSelectedItem());
                Global.Spinner10h = String.valueOf(spinner10h.getSelectedItem());
                // read EditText and fill variables with numbers
                Global.MarkOld1 = Float.parseFloat(markold1.getText().toString());
                Global.MarkNew1 = Float.parseFloat(marknew1.getText().toString());
                Global.MarkOld2 = Float.parseFloat(markold2.getText().toString());
                Global.MarkNew2 = Float.parseFloat(marknew2.getText().toString());
                Global.MarkOld3 = Float.parseFloat(markold3.getText().toString());
                Global.MarkNew3 = Float.parseFloat(marknew3.getText().toString());
                Global.MarkOld4 = Float.parseFloat(markold4.getText().toString());
                Global.MarkNew4 = Float.parseFloat(marknew4.getText().toString());
                Global.MarkOld5 = Float.parseFloat(markold5.getText().toString());
                Global.MarkNew5 = Float.parseFloat(marknew5.getText().toString());
                Global.MarkOld6 = Float.parseFloat(markold6.getText().toString());
                Global.MarkNew6 = Float.parseFloat(marknew6.getText().toString());
                Global.MarkOld7 = Float.parseFloat(markold7.getText().toString());
                Global.MarkNew7 = Float.parseFloat(marknew7.getText().toString());
                Global.MarkOld8 = Float.parseFloat(markold8.getText().toString());
                Global.MarkNew8 = Float.parseFloat(marknew8.getText().toString());
                Global.MarkOld9 = Float.parseFloat(markold9.getText().toString());
                Global.MarkNew9 = Float.parseFloat(marknew9.getText().toString());
                Global.MarkOld10 = Float.parseFloat(markold10.getText().toString());
                Global.MarkNew10 = Float.parseFloat(marknew10.getText().toString());
            }
		});
    }
}
