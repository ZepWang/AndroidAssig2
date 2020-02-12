package com.example.project;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtF, txtC, txtKm, txtMile, txtKg, txtLb, txtLitre, txtGallon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtF = findViewById(R.id.txtF);
        txtC = findViewById(R.id.txtC);
        txtKm = findViewById(R.id.txtKm);
        txtMile = findViewById(R.id.txtMile);
        txtKg = findViewById(R.id.txtKg);
        txtLb = findViewById(R.id.txtLb);
        txtLitre = findViewById(R.id.txtLitre);
        txtGallon = findViewById(R.id.txtGallon);


        txtF.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strF = s.toString();
                        Log.i("UnitConverter", "Value in txtF = " + strF);

                        if (!txtF.isFocused())
                            return;
                        if (strF.length() == 0)
                            return;


                        try {
                            double valF = Double.parseDouble(strF);
                            double valC = (valF - 32.0)*5/9;
                            String strC = Double.toString(valC);
                            Log.i("UnitConverter", "Value in txtC = " + strC);

                            MainActivity.this.txtC.setText(strC);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

        txtC.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strC = s.toString();
                        Log.i("UnitConverter", "Value in txtC = " + strC);

                        if (!txtC.isFocused())
                            return;
                        if (strC.length() == 0)
                            return;

                        try {
                            double valC = Double.parseDouble(strC);
                            double valF = valC*9/5 + 32;
                            String strF = Double.toString(valF);
                            Log.i("UnitConverter", "Value in txtF = " + strF);

                            MainActivity.this.txtF.setText(strF);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

        txtKm.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strKm = s.toString();
                        Log.i("UnitConverter", "Value in txtKm = " + strKm);

                        if (!txtKm.isFocused())
                            return;
                        if (strKm.length() == 0)
                            return;


                        try {
                            double valKm = Double.parseDouble(strKm);
                            double valMile = valKm*0.6213;
                            String strMile = Double.toString(valMile);
                            Log.i("UnitConverter", "Value in txtMile = " + strMile);

                            MainActivity.this.txtMile.setText(strMile);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

        txtMile.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strMile = s.toString();
                        Log.i("UnitConverter", "Value in txtC = " + strMile);

                        if (!txtMile.isFocused())
                            return;
                        if (strMile.length() == 0)
                            return;

                        try {
                            double valMile = Double.parseDouble(strMile);
                            double valKm = valMile*1.609;
                            String strKm = Double.toString(valKm);
                            Log.i("UnitConverter", "Value in txtKm = " + strKm);

                            MainActivity.this.txtKm.setText(strKm);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );
        txtKg.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strKg = s.toString();
                        Log.i("UnitConverter", "Value in txtKg = " + strKg);

                        if (!txtKg.isFocused())
                            return;
                        if (strKg.length() == 0)
                            return;


                        try {
                            double valKg = Double.parseDouble(strKg);
                            double valLb = valKg*2.2046;
                            String strLb = Double.toString(valLb);
                            Log.i("UnitConverter", "Value in txtLb = " + strLb);

                            MainActivity.this.txtLb.setText(strLb);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

        txtLb.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strLb = s.toString();
                        Log.i("UnitConverter", "Value in txtLb = " + strLb);

                        if (!txtLb.isFocused())
                            return;
                        if (strLb.length() == 0)
                            return;

                        try {
                            double valLb = Double.parseDouble(strLb);
                            double valKg = valLb*0.4535;
                            String strKg = Double.toString(valKg);
                            Log.i("UnitConverter", "Value in txtF = " + strKg);

                            MainActivity.this.txtKg.setText(strKg);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );
        txtLitre.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strLitre = s.toString();
                        Log.i("UnitConverter", "Value in txtF = " + strLitre);

                        if (!txtLitre.isFocused())
                            return;
                        if (strLitre.length() == 0)
                            return;


                        try {
                            double valLitre = Double.parseDouble(strLitre);
                            double valGallon = valLitre*0.2641;
                            String strGallon = Double.toString(valGallon);
                            Log.i("UnitConverter", "Value in txtC = " + strGallon);

                            MainActivity.this.txtGallon.setText(strGallon);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );

        txtGallon.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) { }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

                    @Override
                    public void afterTextChanged(Editable s) {
                        String strGallon = s.toString();
                        Log.i("UnitConverter", "Value in txtGallon = " + strGallon);

                        if (!txtGallon.isFocused())
                            return;
                        if (strGallon.length() == 0)
                            return;

                        try {
                            double valGallon = Double.parseDouble(strGallon);
                            double valLitre = valGallon*3.785;
                            String strLitre = Double.toString(valLitre);
                            Log.i("UnitConverter", "Value in txtLitre = " + strLitre);

                            MainActivity.this.txtLitre.setText(strLitre);

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } );
    }
}
