package com.afaneh.justaverage;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableRow;

public class CalActivity extends AppCompatActivity {

    private Spinner spinner1c, spinner2c, spinner3c, spinner4c, spinner5c, spinner6c, spinner7c, spinner8c, spinner9c, spinner10c;
    private Spinner spinner1h, spinner2h, spinner3h, spinner4h, spinner5h, spinner6h, spinner7h, spinner8h, spinner9h, spinner10h;
    private FloatingActionButton fab1, fab2;
    private TableRow TableRow2, TableRow3, TableRow4, TableRow5, TableRow6, TableRow7, TableRow8, TableRow9, TableRow10;
    private EditText Marknew1, Marknew2, Marknew3, Marknew4, Marknew5, Marknew6, Marknew7, Marknew8, Marknew9, Marknew10;
    private EditText Markold1, Markold2, Markold3, Markold4, Markold5, Markold6, Markold7, Markold8, Markold9, Markold10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Marknew1 = (EditText) findViewById(R.id.marknew1);
        Marknew2 = (EditText) findViewById(R.id.marknew2);
        Marknew3 = (EditText) findViewById(R.id.marknew3);
        Marknew4 = (EditText) findViewById(R.id.marknew4);
        Marknew5 = (EditText) findViewById(R.id.marknew5);
        Marknew6 = (EditText) findViewById(R.id.marknew6);
        Marknew7 = (EditText) findViewById(R.id.marknew7);
        Marknew8 = (EditText) findViewById(R.id.marknew8);
        Marknew9 = (EditText) findViewById(R.id.marknew9);
        Marknew10 = (EditText) findViewById(R.id.marknew10);

        Markold1 = (EditText) findViewById(R.id.markold1);
        Markold2 = (EditText) findViewById(R.id.markold2);
        Markold3 = (EditText) findViewById(R.id.markold3);
        Markold4 = (EditText) findViewById(R.id.markold4);
        Markold5 = (EditText) findViewById(R.id.markold5);
        Markold6 = (EditText) findViewById(R.id.markold6);
        Markold7 = (EditText) findViewById(R.id.markold7);
        Markold8 = (EditText) findViewById(R.id.markold8);
        Markold9 = (EditText) findViewById(R.id.markold9);
        Markold10 = (EditText) findViewById(R.id.markold10);

        spinner1c = (Spinner) findViewById(R.id.spinner1c);
        spinner2c = (Spinner) findViewById(R.id.spinner2c);
        spinner3c = (Spinner) findViewById(R.id.spinner3c);
        spinner4c = (Spinner) findViewById(R.id.spinner4c);
        spinner5c = (Spinner) findViewById(R.id.spinner5c);
        spinner6c = (Spinner) findViewById(R.id.spinner6c);
        spinner7c = (Spinner) findViewById(R.id.spinner7c);
        spinner8c = (Spinner) findViewById(R.id.spinner8c);
        spinner9c = (Spinner) findViewById(R.id.spinner9c);
        spinner10c = (Spinner) findViewById(R.id.spinner10c);

        spinner1h = (Spinner) findViewById(R.id.spinner1h);
        spinner2h = (Spinner) findViewById(R.id.spinner2h);
        spinner3h = (Spinner) findViewById(R.id.spinner3h);
        spinner4h = (Spinner) findViewById(R.id.spinner4h);
        spinner5h = (Spinner) findViewById(R.id.spinner5h);
        spinner6h = (Spinner) findViewById(R.id.spinner6h);
        spinner7h = (Spinner) findViewById(R.id.spinner7h);
        spinner8h = (Spinner) findViewById(R.id.spinner8h);
        spinner9h = (Spinner) findViewById(R.id.spinner9h);
        spinner10h = (Spinner) findViewById(R.id.spinner10h);

        TableRow2 = (TableRow) findViewById(R.id.tableRow2);
        TableRow3 = (TableRow) findViewById(R.id.tableRow3);
        TableRow4 = (TableRow) findViewById(R.id.tableRow4);
        TableRow5 = (TableRow) findViewById(R.id.tableRow5);
        TableRow6 = (TableRow) findViewById(R.id.tableRow6);
        TableRow7 = (TableRow) findViewById(R.id.tableRow7);
        TableRow8 = (TableRow) findViewById(R.id.tableRow8);
        TableRow9 = (TableRow) findViewById(R.id.tableRow9);
        TableRow10 = (TableRow) findViewById(R.id.tableRow10);

        addListenerOnButton();
	addListenerOnSpinnerItemSelection();

    }

	public void addListenerOnSpinnerItemSelection(){
		spinner1c.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner2c.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner3c.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner4c.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner5c.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner6c.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner7c.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner8c.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner9c.setOnItemSelectedListener(new CustomOnItemSelectedListener());
        spinner10c.setOnItemSelectedListener(new CustomOnItemSelectedListener());
	}

	//get the selected dropdown list value
	public void addListenerOnButton() {

        fab1 = (FloatingActionButton) findViewById(R.id.fab_back1);
	    fab1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v){
				Intent myIntent = new Intent(v.getContext(), JustActivity.class);
				startActivityForResult(myIntent, 0);
			}
		});

        fab2 = (FloatingActionButton) findViewById(R.id.fab_next2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), FinalActivity.class);
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
                Global.MarkOld1 = Float.parseFloat(Markold1.getText().toString());
                Global.MarkNew1 = Float.parseFloat(Marknew1.getText().toString());
                Global.MarkOld2 = Float.parseFloat(Markold2.getText().toString());
                Global.MarkNew2 = Float.parseFloat(Marknew2.getText().toString());
                Global.MarkOld3 = Float.parseFloat(Markold3.getText().toString());
                Global.MarkNew3 = Float.parseFloat(Marknew3.getText().toString());
                Global.MarkOld4 = Float.parseFloat(Markold4.getText().toString());
                Global.MarkNew4 = Float.parseFloat(Marknew4.getText().toString());
                Global.MarkOld5 = Float.parseFloat(Markold5.getText().toString());
                Global.MarkNew5 = Float.parseFloat(Marknew5.getText().toString());
                Global.MarkOld6 = Float.parseFloat(Markold6.getText().toString());
                Global.MarkNew6 = Float.parseFloat(Marknew6.getText().toString());
                Global.MarkOld7 = Float.parseFloat(Markold7.getText().toString());
                Global.MarkNew7 = Float.parseFloat(Marknew7.getText().toString());
                Global.MarkOld8 = Float.parseFloat(Markold8.getText().toString());
                Global.MarkNew8 = Float.parseFloat(Marknew8.getText().toString());
                Global.MarkOld9 = Float.parseFloat(Markold9.getText().toString());
                Global.MarkNew9 = Float.parseFloat(Marknew9.getText().toString());
                Global.MarkOld10 = Float.parseFloat(Markold10.getText().toString());
                Global.MarkNew10 = Float.parseFloat(Marknew10.getText().toString());

            }
        });
	}

    public class CustomOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

            Spinner spinner = (Spinner) parent;
            int coursepos = spinner.getSelectedItemPosition();
            switch (spinner.getId()) {
                case R.id.spinner1c:
                    switch(coursepos) {
                        case 2: //Repeated
                            Markold1.setVisibility(View.VISIBLE);
                            Marknew1.setVisibility(View.VISIBLE);
                            spinner1h.setVisibility(View.VISIBLE);
                            TableRow2.setVisibility(View.VISIBLE);
                            break;
                        case 1: //New
                            Markold1.setVisibility(View.GONE);
                            Markold1.setText("0");
                            Marknew1.setVisibility(View.VISIBLE);
                            spinner1h.setVisibility(View.VISIBLE);
                            TableRow2.setVisibility(View.VISIBLE);
                            break;
                        case 3: //Delete
                            Markold1.setVisibility(View.GONE);
                            Marknew1.setVisibility(View.GONE);
                            spinner1h.setVisibility(View.GONE);
                            Markold1.setText("0");
                            Marknew1.setText("0");
                            spinner1h.setSelection(0);
                            break;
                    }
                    break;
                case R.id.spinner2c:
                    switch(coursepos) {
                        case 2: //New
                        Markold2.setVisibility(View.VISIBLE);
                        Marknew2.setVisibility(View.VISIBLE);
                        spinner2h.setVisibility(View.VISIBLE);
                        TableRow3.setVisibility(View.VISIBLE);
                    break;
                        case 1: //Repeated
                        Markold2.setVisibility(View.GONE);
                        Markold2.setText("0");
                        Marknew2.setVisibility(View.VISIBLE);
                        spinner2h.setVisibility(View.VISIBLE);
                        TableRow3.setVisibility(View.VISIBLE);
                    break;
                        case 3: //Delete
                        Markold2.setVisibility(View.GONE);
                        Marknew2.setVisibility(View.GONE);
                        spinner2h.setVisibility(View.GONE);
                        TableRow2.setVisibility(View.GONE);
                        Markold2.setText("0");
                        Marknew2.setText("0");
                        spinner2h.setSelection(0);
                        break;
                    }
                    break;
                case R.id.spinner3c:
                    switch(coursepos) {
                        case 2: //New
                        Markold3.setVisibility(View.VISIBLE);
                        Marknew3.setVisibility(View.VISIBLE);
                        spinner3h.setVisibility(View.VISIBLE);
                        TableRow4.setVisibility(View.VISIBLE);
                        break;
                        case 1: //Repeated
                        Markold3.setVisibility(View.GONE);
                        Markold3.setText("0");
                        Marknew3.setVisibility(View.VISIBLE);
                        spinner3h.setVisibility(View.VISIBLE);
                        TableRow4.setVisibility(View.VISIBLE);
                    break;
                        case 3: //Delete
                        Markold3.setVisibility(View.GONE);
                        Marknew3.setVisibility(View.GONE);
                        spinner3h.setVisibility(View.GONE);
                        TableRow3.setVisibility(View.GONE);
                        Markold3.setText("0");
                        Marknew3.setText("0");
                        spinner3h.setSelection(0);
                        break;
                    }
                    break;
                case R.id.spinner4c:
                    switch(coursepos) {
                        case 2: //New
                        Markold4.setVisibility(View.VISIBLE);
                        Marknew4.setVisibility(View.VISIBLE);
                        spinner4h.setVisibility(View.VISIBLE);
                        TableRow5.setVisibility(View.VISIBLE);
                    break;
                        case 1: //Repeated
                        Markold4.setVisibility(View.GONE);
                        Markold4.setText("0");
                        Marknew4.setVisibility(View.VISIBLE);
                        spinner4h.setVisibility(View.VISIBLE);
                        TableRow5.setVisibility(View.VISIBLE);
                    break;
                        case 3: //Delete
                        Markold4.setVisibility(View.GONE);
                        Marknew4.setVisibility(View.GONE);
                        spinner4h.setVisibility(View.GONE);
                        TableRow4.setVisibility(View.GONE);
                        Markold4.setText("0");
                        Marknew4.setText("0");
                        spinner4h.setSelection(0);
                        break;
                    }
                    break;
                case R.id.spinner5c:
                    switch(coursepos) {
                        case 2: //New
                        Markold5.setVisibility(View.VISIBLE);
                        Marknew5.setVisibility(View.VISIBLE);
                        spinner5h.setVisibility(View.VISIBLE);
                        TableRow6.setVisibility(View.VISIBLE);
                    break;
                        case 1: //Repeated
                        Markold5.setVisibility(View.GONE);
                        Markold5.setText("0");
                        Marknew5.setVisibility(View.VISIBLE);
                        spinner5h.setVisibility(View.VISIBLE);
                        TableRow6.setVisibility(View.VISIBLE);
                    break;
                        case 3: //Delete
                        Markold5.setVisibility(View.GONE);
                        Marknew5.setVisibility(View.GONE);
                        spinner5h.setVisibility(View.GONE);
                        TableRow5.setVisibility(View.GONE);
                        Markold5.setText("0");
                        Marknew5.setText("0");
                        spinner5h.setSelection(0);
                        break;
                    }
                    break;
                case R.id.spinner6c:
                    switch(coursepos) {
                        case 2: //New
                        Markold6.setVisibility(View.VISIBLE);
                        Marknew6.setVisibility(View.VISIBLE);
                        spinner6h.setVisibility(View.VISIBLE);
                        TableRow7.setVisibility(View.VISIBLE);
                    break;
                        case 1: //Repeated
                        Markold6.setVisibility(View.GONE);
                        Markold6.setText("0");
                        Marknew6.setVisibility(View.VISIBLE);
                        spinner6h.setVisibility(View.VISIBLE);
                        TableRow7.setVisibility(View.VISIBLE);
                    break;
                        case 3: //Delete
                        Markold6.setVisibility(View.GONE);
                        Marknew6.setVisibility(View.GONE);
                        spinner6h.setVisibility(View.GONE);
                        TableRow6.setVisibility(View.GONE);
                        Markold6.setText("0");
                        Marknew6.setText("0");
                        spinner6h.setSelection(0);
                        break;
                    }
                    break;
                case R.id.spinner7c:
                    switch(coursepos) {
                        case 2: //New
                        Markold7.setVisibility(View.VISIBLE);
                        Marknew7.setVisibility(View.VISIBLE);
                        spinner7h.setVisibility(View.VISIBLE);
                        TableRow8.setVisibility(View.VISIBLE);
                    break;
                        case 1: //Repeated
                        Markold7.setVisibility(View.GONE);
                        Markold7.setText("0");
                        Marknew7.setVisibility(View.VISIBLE);
                        spinner7h.setVisibility(View.VISIBLE);
                        TableRow8.setVisibility(View.VISIBLE);
                    break;
                        case 3: //Delete
                        Markold7.setVisibility(View.GONE);
                        Marknew7.setVisibility(View.GONE);
                        spinner7h.setVisibility(View.GONE);
                        TableRow7.setVisibility(View.GONE);
                        Markold7.setText("0");
                        Marknew7.setText("0");
                        spinner7h.setSelection(0);
                        break;
                    }
                    break;
                case R.id.spinner8c:
                    switch(coursepos) {
                        case 2: //New
                        Markold8.setVisibility(View.VISIBLE);
                        Marknew8.setVisibility(View.VISIBLE);
                        spinner8h.setVisibility(View.VISIBLE);
                        TableRow9.setVisibility(View.VISIBLE);
                    break;
                        case 1: //Repeated
                        Markold8.setVisibility(View.GONE);
                        Markold8.setText("0");
                        Marknew8.setVisibility(View.VISIBLE);
                        spinner8h.setVisibility(View.VISIBLE);
                        TableRow9.setVisibility(View.VISIBLE);
                    break;
                        case 3: //Delete
                        Markold8.setVisibility(View.GONE);
                        Marknew8.setVisibility(View.GONE);
                        spinner8h.setVisibility(View.GONE);
                        TableRow8.setVisibility(View.GONE);
                        Markold8.setText("0");
                        Marknew8.setText("0");
                        spinner8h.setSelection(0);
                        break;
                    }
                    break;
                case R.id.spinner9c:
                    switch(coursepos) {
                        case 2: //New
                        Markold9.setVisibility(View.VISIBLE);
                        Marknew9.setVisibility(View.VISIBLE);
                        spinner9h.setVisibility(View.VISIBLE);
                        TableRow10.setVisibility(View.VISIBLE);
                    break;
                        case 1: //Repeated
                        Markold9.setVisibility(View.GONE);
                        Markold9.setText("0");
                        Marknew9.setVisibility(View.VISIBLE);
                        spinner9h.setVisibility(View.VISIBLE);
                        TableRow10.setVisibility(View.VISIBLE);
                    break;
                        case 3: //Delete
                        Markold9.setVisibility(View.GONE);
                        Marknew9.setVisibility(View.GONE);
                        spinner9h.setVisibility(View.GONE);
                        TableRow9.setVisibility(View.GONE);
                        Markold9.setText("0");
                        Marknew9.setText("0");
                        spinner9h.setSelection(0);
                        break;
                    }
                    break;
                case R.id.spinner10c:
                    switch(coursepos) {
                        case 2: //New
                        Markold10.setVisibility(View.VISIBLE);
                        Marknew10.setVisibility(View.VISIBLE);
                        spinner10h.setVisibility(View.VISIBLE);
                    break;
                        case 1: //Repeated
                        Markold10.setVisibility(View.GONE);
                        Markold10.setText("0");
                        Marknew10.setVisibility(View.VISIBLE);
                        spinner10h.setVisibility(View.VISIBLE);
                    break;
                        case 3: //Delete
                        Markold10.setVisibility(View.GONE);
                        Marknew10.setVisibility(View.GONE);
                        spinner10h.setVisibility(View.GONE);
                        TableRow10.setVisibility(View.GONE);
                        Markold10.setText("0");
                        Marknew10.setText("0");
                        spinner10h.setSelection(0);
                        break;
                    }
                    break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub

        }

    }

}
