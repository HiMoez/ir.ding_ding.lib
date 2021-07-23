package ir.ding_ding.lib;

import android.content.Context;
import android.widget.Toast;

public class Starter {
    public static void init(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
