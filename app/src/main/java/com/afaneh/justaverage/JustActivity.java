package com.afaneh.justaverage;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Locale;

public class JustActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText Old_hrs = (EditText)findViewById(R.id.old_hrs);
        final EditText Old_cum = (EditText)findViewById(R.id.old_cum);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_next1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                    Intent myIntent = new Intent(v.getContext(), CalActivity.class);
                    startActivityForResult(myIntent, 0);

                    // check if the fields are empty
                    if (TextUtils.isEmpty(Old_hrs.getText().toString())
                            || TextUtils.isEmpty(Old_cum.getText().toString())) {
                        return;
                    }

                    // read EditText and fill variables with numbers
                    Global.OldHrs = Float.parseFloat(Old_hrs.getText().toString());
                    Global.OldCum = Float.parseFloat(Old_cum.getText().toString());
            }
        });
    }
}

