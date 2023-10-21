/*******************************************************************************************
 *                                                                                         *
 *  Class Name: UIView                                                                     *
 *                                                                                         *
 *     Purpose: This class sets up the Model for the app. It has only one method which     *
 *     checks the email that was entered for a @ symbol followed by a "." and returns      *
 *     a boolean.                                                                          *
 *                                                                                         *
 ******************************************************************************************/

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