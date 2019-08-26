package com.dicoding.submissionandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.dicoding.myrecyclerview.test.BuildConfig.CardViewWisataAdapter;
import com.dicoding.myrecyclerview.test.BuildConfig.ListWisataAdapter;
import com.dicoding.myrecyclerview.test.BuildConfig.WisataData;
import com.dicoding.myrecyclerview.test.BuildConfig.wisata;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvwisata;
    private String title = "Ngalam.in";
    private ArrayList<wisata> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);
        rvwisata = findViewById(R.id.rv_wisata);
        rvwisata.setHasFixedSize(true);

        ArrayList<wisata> list = new ArrayList<wisata>(WisataData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvwisata.setLayoutManager(new LinearLayoutManager(this));
        ArrayList<wisata> list = new ArrayList<wisata>();
        ListWisataAdapter listHeroAdapter = new ListWisataAdapter(list);
        rvwisata.setAdapter(listHeroAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "Ngalam.in";
                showRecyclerList();
                break;

            case R.id.action_cardview:
                title = "Ngalam.in";
                showRecyclerCardView();
                break;
        }
    }
    private void showRecyclerCardView(){
        rvwisata.setLayoutManager(new LinearLayoutManager(this));
        CardViewWisataAdapter cardViewWisataAdapter = new CardViewWisataAdapter(list);
        rvwisata.setAdapter(cardViewWisataAdapter);
    }
    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}