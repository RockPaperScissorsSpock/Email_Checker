package edu.niu.android.emailchecker;

import android.os.Bundle;
import android.text.TextWatcher;
import android.text.Editable;
import android.widget.Button;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EmailChecker model;
    private UIView view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name);

        model = new EmailChecker();
        ButtonHandler bh = new ButtonHandler();
        view = new UIView(this, bh);
        setContentView(view);
    }

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
