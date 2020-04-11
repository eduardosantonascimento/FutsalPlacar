package com.example.android.placarfutsal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.placarfutsal.R;

public class MainActivity extends AppCompatActivity {

    int placarCasa = 0;
    int placarVisitante = 0;
    int amareloCasa = 0;
    int amareloVisitante = 0;
    int vermelhoCasa = 0;
    int vermelhoVisitante = 0;
    int faltaCasa = 0;
    int faltaVisitante = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Métodos do time da casa.
     */
    public void displayForTeamCasa(int placarCasa) {
        TextView scoreView = (TextView) findViewById(R.id.placarCasa);
        scoreView.setText(String.valueOf(placarCasa));
    }



    public void displayForAmareloCasa(int amareloCasa) {
        TextView amareloCasaView = (TextView) findViewById(R.id.amareloCasa);
        amareloCasaView.setText(String.valueOf(amareloCasa));
    }

    public void displayForVermelhoCasa(int vermelhoCasa) {
        TextView vermelhoCasaView = (TextView) findViewById(R.id.vermelhoCasa);
        vermelhoCasaView.setText(String.valueOf(vermelhoCasa));
    }

    public void displayForFaltaCasa(int faltaCasa) {
        TextView faltaCasaView = (TextView) findViewById(R.id.faltaCasa);
        faltaCasaView.setText(String.valueOf(faltaCasa));
    }


    /**
     * Métodos do time visitante.
     */


    public void displayForTeamVisitante(int placarVisitante) {
        TextView placarVisitanteView = (TextView) findViewById(R.id.placarVisitante);
        placarVisitanteView.setText(String.valueOf(placarVisitante));
    }



    public void displayForAmareloVisitante(int amareloVisitante) {
        TextView amareloVisitanteView = (TextView) findViewById(R.id.amareloVisitante);
        amareloVisitanteView.setText(String.valueOf(amareloVisitante));
    }

    public void displayForVermelhoVisitante(int vermelhoVisitante) {
        TextView vermelhoVisitanteView = (TextView) findViewById(R.id.vermelhoVisitante);
        vermelhoVisitanteView.setText(String.valueOf(vermelhoVisitante));
    }

    public void displayForFaltaVisitante(int faltaVisitante) {
        TextView faltaVisitanteView = (TextView) findViewById(R.id.faltaVisitante);
        faltaVisitanteView.setText(String.valueOf(faltaVisitante));
    }


    public void reset_score (View view){
        placarCasa = 0;
        placarVisitante = 0;
        amareloCasa = 0;
        amareloVisitante = 0;
        vermelhoCasa = 0;
        vermelhoVisitante = 0;
        faltaCasa = 0;
        faltaVisitante = 0;

        displayForTeamCasa(placarCasa);
        displayForTeamVisitante(placarVisitante);
        displayForAmareloVisitante(amareloCasa);
        displayForAmareloVisitante(amareloVisitante);
        displayForVermelhoCasa(vermelhoCasa);
        displayForVermelhoVisitante(vermelhoVisitante);
        displayForFaltaCasa(faltaCasa);
        displayForFaltaVisitante(faltaVisitante);

    }

    public void golCasa(View view) {
        placarCasa = placarCasa + 1;
        displayForTeamCasa(placarCasa);
    }

    public void cartaoAmareloCasa(View view) {
        amareloCasa = amareloCasa + 1;
        displayForAmareloCasa(amareloCasa);
    }

    public void cartaoVermelhoCasa(View view) {
        vermelhoCasa = vermelhoCasa + 1;
        displayForVermelhoCasa(vermelhoCasa);
    }

    public void faltaCasa (View view) {
        faltaCasa = faltaCasa + 1;
        displayForFaltaCasa(faltaCasa);
    }





    public void golVisitante(View view) {
        placarVisitante = placarVisitante + 1;
        displayForTeamVisitante(placarVisitante);
    }

    public void cartaoAmareloVisitante(View view) {
        amareloVisitante = amareloVisitante + 1;
        displayForAmareloVisitante(amareloVisitante);
    }

    public void cartaoVermelhoVisitante(View view) {
        vermelhoVisitante ++;
        displayForVermelhoVisitante(vermelhoVisitante);
    }

    public void faltaVisitante (View view) {
        faltaVisitante = faltaVisitante + 1;
        displayForFaltaVisitante(faltaVisitante);
    }

}
