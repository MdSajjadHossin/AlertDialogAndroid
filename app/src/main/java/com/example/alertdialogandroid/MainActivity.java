package com.example.alertdialogandroid;

import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Single Button Alert Dialog
//        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
//
//        alertDialog.setTitle("Terms & Condition");
//        alertDialog.setIcon(R.drawable.ic_baseline_perm_device_information_24);
//        alertDialog.setMessage("Are Agree With All the Terms & Condition!");
//
//        alertDialog.setButton(Dialog.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Toast.makeText(MainActivity.this, "Yes", Toast.LENGTH_SHORT).show();
//            }
//        });
//       alertDialog.show();

        //Two Button Alert Dialog
        AlertDialog.Builder deleteDialog = new AlertDialog.Builder(MainActivity.this);
        deleteDialog.setTitle("Want To Delete?");
        deleteDialog.setIcon(R.drawable.ic_baseline_delete_24);
        deleteDialog.setMessage("Are You Sure You Want To Delete?");

        deleteDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Write Delete Code;
                Toast.makeText(MainActivity.this, "Item Deleted", Toast.LENGTH_SHORT).show();
            }
        });

        deleteDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Write Code
                Toast.makeText(MainActivity.this, "Item Not Deleted", Toast.LENGTH_SHORT).show();
            }
        });
        deleteDialog.show();

    }
        //Three Button Alert Dialog


    @Override
    public void onBackPressed() {
        AlertDialog.Builder exitDialog = new AlertDialog.Builder(this);

        exitDialog.setIcon(R.drawable.ic_baseline_exit_to_app_24);
        exitDialog.setTitle("Exit?");
        exitDialog.setMessage("Are You Sure You Want to Exit");
        exitDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Welcome Back", Toast.LENGTH_SHORT).show();
            }
        });

        exitDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.super.onBackPressed();
                Toast.makeText(MainActivity.this, "Good Bye", Toast.LENGTH_SHORT).show();
            }
        });

        exitDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Activity Canceled", Toast.LENGTH_SHORT).show();
            }
        });
        exitDialog.show();
    }
}