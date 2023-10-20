package edu.niu.android.emailchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EmailChecker emailChecker;

    public EditText emailEditText;
    public Button subButton;
    public TextView statusLabel;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        EmailChecker = new EmailChecker();          //Call Constructor.
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(email);

        statusLabel = findViewById(status);




    }
}