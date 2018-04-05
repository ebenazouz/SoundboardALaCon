package com.example.erwan.soundboardalacon;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer mpDespair = MediaPlayer.create(this, R.raw.despair_sound);
        final MediaPlayer mpPayeSalePute = MediaPlayer.create(this, R.raw.paye_sale_pute);
        final MediaPlayer mpSuceZboub = MediaPlayer.create(this, R.raw.suce_moi_le_zboub);
        final MediaPlayer mpPAYE = MediaPlayer.create(this, R.raw.payeeee);
        final MediaPlayer mpGrandMereEncaisse = MediaPlayer.create(this, R.raw.grand_mere_encaisse);


        Button boutonDesespoir = (Button) this.findViewById(R.id.buttonDésespoir);
        boutonDesespoir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpDespair.start();
            }
        });
        //TODO zboub
        Button boutonZboub = (Button) this.findViewById(R.id.buttonZboub);
        boutonDesespoir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpSuceZboub.start();
            }
        });

        //TODO paye sale pute
        Button boutonPaye = (Button) this.findViewById(R.id.buttonPaye);
        boutonDesespoir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpPayeSalePute.start();
            }
        });

        //TODO grand mere encaisse
        Button boutonGrandMere = (Button) this.findViewById(R.id.buttonGrandMere);
        boutonDesespoir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpGrandMereEncaisse.start();
            }
        });
        //TODO payeee
        Button boutonPayeeee = (Button) this.findViewById(R.id.buttonPayeeee);
        boutonDesespoir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpPAYE.start();
            }
        });
    }
}
