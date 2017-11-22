package com.example.konong.latihan_uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class tampil extends AppCompatActivity {
    Intent i;
    int linkGambar;
    TextView judul,keterangan;
    ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        gambar= (ImageView) findViewById(R.id.gmbr);
        judul=(TextView) findViewById(R.id.judul);
        keterangan=(TextView) findViewById(R.id.ket);
        Intent i=getIntent();
        linkGambar = i.getIntExtra("gambar", linkGambar);
        gambar.setImageResource(linkGambar);
        keterangan.setText(i.getStringExtra("ket"));
        judul.setText(Html.fromHtml(""+i.getStringExtra("jud")));

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
