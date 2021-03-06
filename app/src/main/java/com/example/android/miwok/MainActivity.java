/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

/*
        // find the view that shows the numbers category
        TextView numbers = (TextView)findViewById(R.id.numbers);
        // find the view that shows the family category
        TextView family = (TextView)findViewById(R.id.family);
        // find the view that shows the phrases category
        TextView phrases = (TextView)findViewById(R.id.phrases);
        // find the view that shows the colors category
        TextView colors = (TextView)findViewById(R.id.colors);
        //set a ClickListner on that view
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //create nwe intent to open {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                //start the new activity
                startActivity(numbersIntent);
            }
        });
        //set a ClickListner on that view
        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //create nwe intent to open {@link FamilyActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                //start the new activity
                startActivity(familyIntent);
            }
        });
        //set a ClickListner on that view
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //create nwe intent to open {@link PhrasesActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                //start the new activity
                startActivity(phrasesIntent);
            }
        });
        //set a ClickListner on that view
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //create nwe intent to open {@link ColorsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                //start the new activity
                startActivity(colorsIntent);
            }
        });*/
    }
}
