package com.example.nawigacja.WedyjskaTeoria;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class WedyjskaFragmentSub extends Fragment {
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
    private EditText kolumna10;
    private EditText kolumna11;
    private EditText kolumna12;
    private EditText kolumna13;
    private EditText kolumna14;
    private EditText kolumna15;
    private TextView losowaliczba;
    private EditText wynik;
    private Button hund, tho, hundtho;
    private LinearLayout sprawdz;
    private ImageView refresh;
    private TextView potega;
    CardView expandableView;
    Button arrowBtn;
    CardView cardView;

    private ColorStateList textColorDefaultRb;

    int number = 1000;
    int numbertwo = 10000;
    int numberthree = 100000;
    int rande, randtwoe, randthreee;
    public WedyjskaFragmentSub() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_wedyjska_sub, container, false);
        wynik = (EditText) v.findViewById(R.id.wynik);
        sprawdz = (LinearLayout) v.findViewById(R.id.button_sprawdz);
        losowaliczba = (TextView) v.findViewById(R.id.losowaliczba);
        back = (LinearLayout) v.findViewById(R.id.button_back);
        hund = (Button) v.findViewById(R.id.hund);
        tho = (Button) v.findViewById(R.id.tho);
        hundtho = (Button) v.findViewById(R.id.hundtho);
        textColorDefaultRb = wynik.getTextColors();
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
        kolumna12= (EditText) v.findViewById(R.id.kolumna12);
        kolumna13 = (EditText) v.findViewById(R.id.kolumna13);
        kolumna14 = (EditText) v.findViewById(R.id.kolumna14);
        kolumna15 = (EditText) v.findViewById(R.id.kolumna15);

        refresh = (ImageView) v.findViewById(R.id.refresh);
        //losowaliczba.setText(generowanieString(6));
        losowaliczba.setText(Integer.toString(number));
        expandableView = (CardView) v.findViewById(R.id.expandableView);
        arrowBtn = (Button) v.findViewById(R.id.arrowBtn);
        cardView = (CardView) v.findViewById(R.id.cardView);

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

        potega.setText(Integer.toString(rande));

        Random rand = new Random();
         rande= rand.nextInt(1000);
        Random randtwo = new Random();
        randtwoe = randtwo.nextInt(10000);
        Random randthree = new Random();
        randthreee = randthree.nextInt(100000);







                losowaliczba.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        sprawdz.setOnClickListener(new View.OnClickListener() {                // potegowanie liczb z koncowka 5
                            @Override
                            public void onClick(View view) {
                                if (losowaliczba.getText().toString().trim().length() > 0) {
                                    int a = Integer.parseInt(losowaliczba.getText().toString().trim());
                                    int b = Integer.parseInt(potega.getText().toString().trim());
                                    wynik.setText(Integer.toString(a - b));
                                    wynik.setTextColor(Color.GREEN);
                                }
                            }
                        });

                    }
                });




        String myStringg = String.valueOf(rande);
        potega.setText(myStringg);
        String myString = String.valueOf(number);
        losowaliczba.setText(myString);
                      // potegowanie liczb z koncowka 5
        hund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wynik.getText().clear();
                Random rand = new Random();
                rande = rand.nextInt(1000);


                if ( rande == 0 ){
                    rande++;
                }
                kolumna1.getText().clear();
                kolumna2.getText().clear();
                kolumna3.getText().clear();
                kolumna4.getText().clear();
                kolumna5.getText().clear();
                kolumna6.getText().clear();
                kolumna7.getText().clear();
                kolumna8.getText().clear();
                kolumna9.getText().clear();
                kolumna10.getText().clear();
                kolumna11.getText().clear();
                kolumna12.getText().clear();
                kolumna13.getText().clear();
                kolumna14.getText().clear();
                kolumna15.getText().clear();
                wynik.getText().clear();
                wynik.setTextColor(textColorDefaultRb);
                String myStringg = String.valueOf(rande);
                potega.setText(myStringg);
                String myString = String.valueOf(number);
                losowaliczba.setText(myString);
            }
        });

        tho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wynik.getText().clear();
                Random randtwo = new Random();
                randtwoe = randtwo.nextInt(10000);


                if ( randtwoe == 0 ){
                    randtwoe++;
                    kolumna1.getText().clear();
                    kolumna2.getText().clear();
                    kolumna3.getText().clear();
                    kolumna4.getText().clear();
                    kolumna5.getText().clear();
                    kolumna6.getText().clear();
                    kolumna7.getText().clear();
                    kolumna8.getText().clear();
                    kolumna9.getText().clear();
                    kolumna10.getText().clear();
                    wynik.getText().clear();
                    wynik.setTextColor(textColorDefaultRb);

                }

                String myStringg = String.valueOf(randtwoe);
                potega.setText(myStringg);
                String myString = String.valueOf(numbertwo);
                losowaliczba.setText(myString);
            }
        });

        hundtho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wynik.getText().clear();
                Random randthree = new Random();
                randthreee = randthree.nextInt(100000);
                kolumna1.getText().clear();
                kolumna2.getText().clear();
                kolumna3.getText().clear();
                kolumna4.getText().clear();
                kolumna5.getText().clear();
                kolumna6.getText().clear();
                kolumna7.getText().clear();
                kolumna8.getText().clear();
                kolumna9.getText().clear();
                kolumna10.getText().clear();

                wynik.setTextColor(textColorDefaultRb);

                if ( randthreee == 0 ){
                    randthreee++;

                }

                String myStringg = String.valueOf(randthreee);
                potega.setText(myStringg);
                String myString = String.valueOf(numberthree);
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
                WedyjskaFragmentSubTeory wedyjskaFragmentSubTeory = new WedyjskaFragmentSubTeory();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                //transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right, R.anim.enter_from_right, R.anim.exit_to_right);
                transaction.replace(R.id.fragment_container, wedyjskaFragmentSubTeory);
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

