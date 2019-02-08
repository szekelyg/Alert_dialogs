package com.gmstr.alert_dialogs;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button showDialog;
    private Button showAnotherDialog;

    private AlertDialog.Builder dialog;
    private AlertDialog.Builder dialog_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDialog = findViewById(R.id.button_id);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new AlertDialog.Builder(MainActivity.this);

                //Set title
                dialog.setTitle(getResources().getString(R.string.dialog_title));

                //Set message
                dialog.setMessage(getResources().getString(R.string.dialog_message));

                //set Cancelabe
                dialog.setCancelable(false);

                //Set an icon
                dialog.setIcon(android.R.drawable.alert_dark_frame);

                //set Positive button
                dialog.setPositiveButton(getResources().getString(R.string.positive_button),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                MainActivity.this.finish();
                            }
                        });

                //set Negative Button
                dialog.setNegativeButton(getResources().getString(R.string.negative_button),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                //create dialog
                AlertDialog alertD = dialog.create();

                alertD.show();
            }
        });


        showAnotherDialog = findViewById(R.id.button_id_2);
        showAnotherDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog_2 = new AlertDialog.Builder(MainActivity.this);

                dialog_2.setTitle(getResources().getString(R.string.seconddialog_title));

                dialog_2.setMessage(getResources().getString(R.string.second_dialog_message));

                dialog_2.setCancelable(true);

                dialog_2.setPositiveButton(getResources().getString(R.string.positive_button), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                    }
                });

                dialog_2.setNegativeButton(getResources().getString(R.string.negative_button), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alertd2 =  dialog_2.create();

                alertd2.show();
            }
        });




    }
}
