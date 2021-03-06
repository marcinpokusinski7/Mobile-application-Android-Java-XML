package com.example.nawigacja.WedyjskaTeoria;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.nawigacja.R;
import com.example.nawigacja.WedyjskaFragment;

import java.util.ArrayList;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class WedyjskaFragmentVertCross extends Fragment {
    private LinearLayout back;
    private EditText kolumna1;
    private EditText kolumna2;
    private EditText kolumna3;
    private EditText kolumna4;
    private EditText kolumna5;
    private EditText kolumna6;
    private EditText kolumna7;
    private EditText kolumna8;
    private EditText kolumna9;
    private EditText kolumna10, kolumna11, kolumna12;
    private TextView losowaliczba;
    private EditText wynik;
    private LinearLayout sprawdz;
    private ImageView refresh;
    private TextView potega;

    int number;
    int numbertwo;
    CardView expandableView;
    Button arrowBtn;
    CardView cardView;

    private ColorStateList textColorDefaultRb;

    public WedyjskaFragmentVertCross() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_wedyjska_vertcross, container, false);
        wynik = (EditText) v.findViewById(R.id.wynik);
        sprawdz = (LinearLayout) v.findViewById(R.id.button_sprawdz);
        losowaliczba = (TextView) v.findViewById(R.id.losowaliczba);
        back = (LinearLayout) v.findViewById(R.id.button_back);
        potega = (TextView) v.findViewById(R.id.potega);
        kolumna1 = (EditText) v.findViewById(R.id.kolumna1);
        kolumna2 = (EditText) v.findViewById(R.id.kolumna2);
        kolumna3 = (EditText) v.findViewById(R.id.kolumna3);
        kolumna4 = (EditText) v.findViewById(R.id.kolumna4);
        kolumna5 = (EditText) v.findViewById(R.id.kolumna5);
        kolumna6 = (EditText) v.findViewById(R.id.kolumna6);
        kolumna7 = (EditText) v.findViewById(R.id.kolumna7);
        kolumna8 = (EditText) v.findViewById(R.id.kolumna8);
        kolumna9 = (EditText) v.findViewById(R.id.kolumna9);
        kolumna10 = (EditText) v.findViewById(R.id.kolumna10);
        kolumna11 = (EditText) v.findViewById(R.id.kolumna11);
        kolumna12 = (EditText) v.findViewById(R.id.kolumna12);

        refresh = (ImageView) v.findViewById(R.id.refresh);
        //losowaliczba.setText(generowanieString(6));
        losowaliczba.setText(Integer.toString(number));
        expandableView = (CardView) v.findViewById(R.id.expandableView);
        arrowBtn = (Button) v.findViewById(R.id.arrowBtn);
        cardView = (CardView) v.findViewById(R.id.cardView);
        textColorDefaultRb = wynik.getTextColors();
        /*arrowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (expandableView.getVisibility()==View.GONE) {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.VISIBLE);
                    arrowBtn.setBackgroundResource(R.drawable.ic_arrrow_up);
                }else{
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.GONE);
                    arrowBtn.setBackgroundResource(R.drawable.ic_arrow_down);
                }
            }


        });*/

        potega.setText(Integer.toString(numbertwo));

        Random randtwo = new Random();
        numbertwo = randtwo.nextInt(100);



        Random rand = new Random();
        number = rand.nextInt(100);
        if ( number == 0 ){
            number++;

        }
        String myStringg = String.valueOf(numbertwo);
        potega.setText(myStringg);
        String myString = String.valueOf(number);
        losowaliczba.setText(myString);
        sprawdz.setOnClickListener(new View.OnClickListener() {                // potegowanie liczb z koncowka 5
            @Override
            public void onClick(View view) {
                wynik.setText(Integer.toString(number*numbertwo));
                wynik.setTextColor(Color.GREEN);
            }
        });

        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wynik.getText().clear();
                Random randtwo = new Random();
                numbertwo = randtwo.nextInt(100);
                kolumna1.getText().clear();
                kolumna2.getText().clear();
                kolumna3.getText().clear();

                kolumna6.getText().clear();
                kolumna7.getText().clear();
                kolumna8.getText().clear();
                kolumna9.getText().clear();
                kolumna10.getText().clear();
                kolumna11.getText().clear();
                kolumna12.getText().clear();
                wynik.setTextColor(textColorDefaultRb);
                Random rand = new Random();
                number = rand.nextInt(100);
                if ( number == 0 ){
                    number++;

                }
                if ( numbertwo == 0 ){
                    numbertwo++;

                }
                String myStringg = String.valueOf(numbertwo);
                potega.setText(myStringg);
                String myString = String.valueOf(number);
                losowaliczba.setText(myString);
            }
        });



        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WedyjskaFragment wedyjskaFragment = new WedyjskaFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right);
                transaction.replace(R.id.fragment_container, wedyjskaFragment);

                transaction.commit();

            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WedyjskaFragmentVertCrossTeory wedyjskaFragmentVertCrossTeory = new WedyjskaFragmentVertCrossTeory();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                //transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right);
                transaction.replace(R.id.fragment_container, wedyjskaFragmentVertCrossTeory);
                cardView.setBackgroundResource(R.drawable.bg_item_cho);
                transaction.commit();
            }
        });



        return v;

    }



    /*private String generowanieString(int lenght){
        char[] chars = "123456789".toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < 4; i++){

            char c = chars[random.nextInt(chars.length)];
            stringBuilder.append(c);

        }
        return stringBuilder.toString();
    }*/

}
