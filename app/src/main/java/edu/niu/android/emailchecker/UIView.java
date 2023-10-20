package edu.niu.android.emailchecker;

import android.content.Context;
import android.widget.EditText;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;



public class UIView extends GridLayout{

    private EditText emailEntry;
    private TextView emailIndicator;
    private Button submit;


    public UIView(Context context, OnClickListener listener)
    {
        super(context);


        // Set a single column
        setColumnCount(1);

        // Set up the validEmail TextView
        emailIndicator = new TextView(context);
        GridLayout.LayoutParams labelParams = new GridLayout.LayoutParams();
        labelParams.width = LayoutParams.WRAP_CONTENT;
        labelParams.height = LayoutParams.WRAP_CONTENT;
        labelParams.setMargins(0, 200, 0, 0);
        emailIndicator.setLayoutParams(labelParams);
        emailIndicator.setText("Email Checker");
        emailIndicator.setTextSize(22);
        addView(emailIndicator);


        // Set up the emailEntry EditText

        emailEntry = new EditText(context);
        GridLayout.LayoutParams passwordParams = new GridLayout.LayoutParams();
        passwordParams.width = LayoutParams.MATCH_PARENT;
        passwordParams.height = LayoutParams.WRAP_CONTENT;
        passwordParams.setMargins(0, 100, 0, 0);
        emailEntry.setLayoutParams(passwordParams);
        emailEntry.setHint("Enter an email");
        addView(emailEntry);

        // Set up the submit Button

        submit = new Button(context);
        GridLayout.LayoutParams buttonParams = new GridLayout.LayoutParams();
        buttonParams.width = LayoutParams.MATCH_PARENT;
        buttonParams.height = LayoutParams.WRAP_CONTENT;
        buttonParams.setMargins(0, 100, 0, 0);
        submit.setLayoutParams(buttonParams);
        submit.setText("Submit");
        addView(submit);


        submit.setOnClickListener(listener);
    }



    // Returns the user's email entry
    public String getEmailText() {
        return emailEntry.getText().toString();
    }
    // Change the color/text of the strengthIndicator based on the isWeak method from the model
    public void validEmailUpdate(boolean validEmail) {
        if (validEmail) {
            emailIndicator.setText("Valid Email");
            emailIndicator.setTextColor(getResources().getColor(R.color.green));
        } else {
            emailIndicator.setText("Invalid Email");
            emailIndicator.setTextColor(getResources().getColor(R.color.red));
        }
    }
}