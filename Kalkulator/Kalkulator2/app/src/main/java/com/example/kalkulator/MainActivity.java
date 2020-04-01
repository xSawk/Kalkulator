package com.example.kalkulator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.widget.Toast;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22;
    TextView input;
    String process;

    public void toastDlg()
    {
        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.Error), Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }





    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadLocale();
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getResources().getString(R.string.app_name));




        input = (TextView) findViewById(R.id.tvExp);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b14 = (Button) findViewById(R.id.button14);
        b15 = (Button) findViewById(R.id.button15);
        b16 = (Button) findViewById(R.id.button16);
        b17 = (Button) findViewById(R.id.button17);
        b18 = (Button) findViewById(R.id.button18);
        b19 = (Button) findViewById(R.id.button19);
        b20 = (Button) findViewById(R.id.button20);
        b21 = (Button) findViewById(R.id.button21);
        b22 = (Button) findViewById(R.id.button22);





        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String str = input.getText().toString();

                if (str.length() > 1) {

                    str = str.substring(0, str.length() - 1);
                    input.setText(str);
                } else if (str.length() <= 1) {
                    input.setText("");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input.setText("");

            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               process = input.getText().toString();
                input.setText(process + "7");


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "8");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "9");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "/");

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    process = input.getText().toString();
                    input.setText("sqrt" + "(" + process + ")");


            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "4");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "5");

            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "6");

            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "*");

            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "%");

            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "1");

            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "2");

            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "3");

            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "-");

            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                double x, y;

                    try{
                        x = Double.parseDouble(process);
                        y = 1 / x;
                        process = String.valueOf(y);
                        if(process=="Infinity") {
                            toastDlg();
                        }
                        else {
                            input.setText(process);
                        }
                    }catch (Exception e)
                    {
                       toastDlg();
                    }


            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "0");

            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                double i;


                try {
                    i = Double.parseDouble(process);
                    if (i > 0) {
                        input.setText("-" + process);
                    } else if (i < 0) {
                        input.setText(process.replaceFirst("-", ""));
                    }
                }catch (Exception e)
                {
                    toastDlg();
                }

            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + ".");

            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "+");

            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Expression Expression = new ExpressionBuilder(input.getText().toString()).build();


                    double result = Expression.evaluate();
                    String s = String.valueOf(result);
                    input.setText(s);

                } catch (Exception ex) {
                    ex.printStackTrace();
                    input.setText("");
                    toastDlg();

                }



            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item3:
                finish();
                System.exit(0);
                break;
            case R.id.item1:
                Toast toast=Toast.makeText(getApplicationContext(),getString(R.string.AboutText),Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                break;
            case R.id.item2:
                showLangDialog();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showLangDialog()
    {
        String[] lang={"PL","EN"};
        AlertDialog.Builder mbulider = new AlertDialog.Builder(MainActivity.this);
        mbulider.setTitle("Change language");
        mbulider.setSingleChoiceItems(lang, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (which==0)
                {
                    setLocale("pl");
                    recreate();
                }
                if (which==1)
                {
                    setLocale("en");
                    recreate();
                }
                dialog.dismiss();
            }
        });
        AlertDialog mDialog= mbulider.create();
        mDialog.show();


    }

    private void setLocale(String lang) {

        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor = getSharedPreferences("Settings",MODE_PRIVATE).edit();
        editor.putString("My_Lang",lang);
        editor.apply();

    }
     public void loadLocale()
     {
         SharedPreferences prefs =getSharedPreferences("Settings",Activity.MODE_PRIVATE);
         String language = prefs.getString("My_Lang","");
         setLocale(language);
     }





}