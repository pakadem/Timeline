package com.example.timeline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class TimelineActivity extends AppCompatActivity {
    ListView listview;
//    Context context;
//    ArrayList tl_arrlist;

     String country_names[] = {"Bostwana",
                                "Eswatini",
                                "Lesotho",
                                "Malawi",
                                "Mali",
                                "Mozambique",
                                "Namibia",
                                "South Africa",
                                "Tanzania",
                                "Zambia",
                                "Zimbabwe"
                                };

    int country_flags[] = { R.drawable.flag_botswana,
                            R.drawable.flag_eswatini,
                            R.drawable.flag_lesotho,
                            R.drawable.flag_malawi,
                            R.drawable.flag_mali,
                            R.drawable.flag_mozambique,
                            R.drawable.flag_nambia,
                            R.drawable.flag_sa,
                            R.drawable.flag_tanzania,
                            R.drawable.flag_zambia,
                            R.drawable.flag_zimbabwe
                        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);


        listview = (ListView) findViewById(R.id.timeline_ListView);

        CustomAdapter customadapter = new CustomAdapter (getApplicationContext(), country_names, country_flags);
        listview.setAdapter(customadapter);
        int i = country_names.length;
        listview.setOnClickListener( new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Country", Toast.LENGTH_LONG).show();
            }
        });
    }

}