package com.dingo.android;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getActionBar();
        //   actionBar.setDisplayHomeAsUpEnabled(true);
        populateView();

    }

    public void populateView() {
        //   ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.android.R.layout.simple_list_item_1, myStringArray);
        GridView gd = (GridView) findViewById(R.id.gv_list_games);
        int[] imagens = {R.drawable.smile1, R.drawable.smile2,
                R.drawable.smile1, R.drawable.smile2, R.drawable.smile1,
                R.drawable.smile2, R.drawable.smile1, R.drawable.smile2,
        R.drawable.dc,
                R.drawable.amarelinha,
                R.drawable.bdg,
                R.drawable.bola,
                R.drawable.corda,
                R.drawable.corre,
                R.drawable.piao,
                R.drawable.pipa,
                R.drawable.cs,
                R.drawable.peteca,
                R.drawable.corridasaco,
                R.drawable.ee,
                R.drawable.tsf
        };

        GridView grid = (GridView) findViewById(R.id.gv_list_games);
        grid.setAdapter(new AdapterGames(this, imagens));

        grid.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int posicao, long id) {
                Toast.makeText(MainActivity.this, "Imagem selecionada: " + posicao, Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_options_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            case R.id.option_settings:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
