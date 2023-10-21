/******************************************************************************************
 *                                                                                        *
 *  CSCI 322                             Assignment 4                          Fall 2023  *
 *                                                                                        *
 *          App Name: EmailChecker                                                       *
 *                                                                                        *
 *        Class Name: MainActivity.java                                                   *
 *                                                                                        *
 *      Developer(s): Milad Jizan z1943173, Mark Southwood z058227                        *
 *                                                                                        *
 *          Due Date: 10/20/2023                                                          *
 *                                                                                        *
 *           Purpose: The purpose of this project is to develop an UI without XML and we  *
 *                    chose to use the Grid Layout like the TicTacToe app. This app       *
 *                    checks a user supplied email address to see if it is valid          *
 *                    based on if there is an @ symbol followed by a .                    *
 *                                                                                        *
 *****************************************************************************************/


package edu.niu.android.emailchecker;

import android.os.Bundle;
import android.text.TextWatcher;
import android.text.Editable;
import android.widget.Button;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Variables
    private EmailChecker model;
    private UIView view;

    //Instantiate Model and View.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name);

        model = new EmailChecker();
        ButtonHandler bh = new ButtonHandler();
        view = new UIView(this, bh);
        setContentView(view);
    }

    //Implement Button handling.
    private class ButtonHandler implements View.OnClickListener
    {
        public void onClick(View v)
        {
            String email = view.getEmailText();
            boolean valEmail = model.validEmail(email);
            view.validEmailUpdate(valEmail);
        }
    }
}
