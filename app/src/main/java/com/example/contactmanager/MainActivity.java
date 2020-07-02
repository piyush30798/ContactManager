package com.example.contactmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

     private Toolbar toolb;
     private TabLayout tabLayout;
     private AppBarLayout appBarLayout;
     private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolb=findViewById(R.id.toolb);
        setSupportActionBar(toolb);
        tabLayout=findViewById(R.id.tabL);
        appBarLayout=findViewById(R.id.appB);
        viewPager=findViewById(R.id.viewP);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentDial(),"DialPad");
        adapter.AddFragment(new FragmentContacts(),"Contacts");
        adapter.AddFragment(new FragmentNearBy(),"NearBy");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

}