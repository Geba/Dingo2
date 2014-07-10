package com.dingo.android;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Adaptador de imagem para os exemplos de GridView, Gallery e ImageSwitcher
 *
 * @author ricardo
 *
 */
public class AdaptadorImagem extends BaseAdapter {
    private Context ctx;
    private final int[] imagens;
    public AdaptadorImagem(Context c, int[] imagens) {
        this.ctx = c;
        this.imagens = imagens;
    }
    public int getCount() {
        return imagens.length;
    }
    public Object getItem(int posicao) {
        return posicao;
    }
    public long getItemId(int posicao) {
        return posicao;
    }
    public View getView(int posicao, View convertView, ViewGroup parent) {
        ImageView img = new ImageView(ctx);
        img.setImageResource(imagens[posicao]);
        RelativeLayout.LayoutParams param = (RelativeLayout.LayoutParams) img.getLayoutParams();
        img.setAdjustViewBounds(true);

        /*param.height=100;
        param.width=100;
        img.setLayoutParams(param);
        */
        return img;
    }
}