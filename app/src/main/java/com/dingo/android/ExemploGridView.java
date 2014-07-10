package com.dingo.android;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;


/**
 * Exemplo do GridView para visualizar imagens
 *
 * @author rlecheta
 */
public class ExemploGridView extends Activity {
    // array com os ids das imagens
    int[] imagens = {
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

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_exemplo_grid_view);
        GridView grid = (GridView) findViewById(R.id.grid1);
        grid.setAdapter(new AdaptadorImagem(this, imagens));
        grid.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int posicao, long id) {
                Toast.makeText(ExemploGridView.this, "Imagem selecionada: " + posicao, Toast.LENGTH_SHORT).show();
            }
        });
    }
}