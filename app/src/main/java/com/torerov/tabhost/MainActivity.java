package com.torerov.tabhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup(); // 등록 메소드
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("TAB1").setContent(R.id.linearLayout));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("TAB2").setContent(R.id.linearLayout));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("TAB3").setContent(R.id.linearLayout));

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                if(tabId.equals("tab1")){
                    
                }else if(tabId.equals("tab2")){

                }else if(tabId.equals("tab3")){

                }
            }
        });
    }
}
