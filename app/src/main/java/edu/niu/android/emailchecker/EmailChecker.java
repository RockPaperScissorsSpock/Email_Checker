package edu.niu.android.emailchecker;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EmailChecker
{
    /*
    private String Email;

    //Constructer.
    public EmailChecker()
    {
        Email = this.Email;
    }
/*
    public void SetEmail(String Email)
    {
        this.Email = Email;
    }
*/
    //Check if Email is Valid.
    public Boolean validEmail(String email)
    {
        if(email.contains("@") && email.substring(email.indexOf("@")).contains("."))
        {
            return Boolean.TRUE;
        }

        else
        {
            return Boolean.FALSE;
        }
    }
}