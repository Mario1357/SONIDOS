package com.example.mario.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
  private MediaPlayer musica,osoo,loboo,perroo,caballoo,delfinee,tigree;
   private  Button sonidoo,oso,lobos,perros,caballos,delfines,tigres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonidoo = (Button)findViewById(R.id.sonido);

        sonidoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musica = MediaPlayer.create(MainActivity.this,R.raw.abeja);
                musica.start();


            }
        });

        oso = (Button)findViewById(R.id.sonido2);
        oso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                osoo = MediaPlayer.create(MainActivity.this,R.raw.oso);
                osoo.start();

            }
        });
        lobos = (Button)findViewById(R.id.lobo);
        lobos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loboo = MediaPlayer.create(MainActivity.this,R.raw.lobo);
                loboo.start();

            }
        });
        perros = (Button)findViewById(R.id.perro);
        perros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perroo = MediaPlayer.create(MainActivity.this,R.raw.peroo);
                perroo.start();

            }
        });
        caballos = (Button)findViewById(R.id.caballo);
        caballos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caballoo = MediaPlayer.create(MainActivity.this,R.raw.caballo);
                caballoo.start();

            }
        });
        delfines = (Button)findViewById(R.id.delfin);
        delfines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delfinee = MediaPlayer.create(MainActivity.this,R.raw.delfines);
                delfinee.start();

            }
        });
        tigres = (Button)findViewById(R.id.tigre);
        tigres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tigree = MediaPlayer.create(MainActivity.this,R.raw.tigre);
                tigree.start();

            }
        });
    }

    }

