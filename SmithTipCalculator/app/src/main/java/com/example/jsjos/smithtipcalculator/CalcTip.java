package com.example.jsjos.smithtipcalculator;

import java.text.DecimalFormat;

/**
 * Created by jsjos on 9/7/2017.
 */

public class CalcTip {

    public static double getTip(double price, int starRating) {
        double percentage = 0;
        if (starRating >= 1 && starRating <= 3) {
            percentage = 0.1;
        }
        else if (starRating >= 4 && starRating <= 5) {
            percentage = 0.13;
        }
        else if (starRating >= 6 && starRating <= 7) {
            percentage = 0.15;
        }
        else if (starRating >= 8 && starRating <= 9) {
            percentage = 0.20;
        }
        else if (starRating == 10) {
            percentage = 0.25;
        }

        // Calculate and Return Computed Tip
        return roundNum(price*percentage);
    }

    public static double roundNum(double numEnt) {
        DecimalFormat df = new DecimalFormat("#######.##");
        return Double.parseDouble(df.format(numEnt));
    }

    // Type 1 = Double, Type 2 = Int
    public static boolean isDefined(String inputStr, int type) {
        try {
            if(type == 1)
            {
                Double.parseDouble(inputStr);
                return true;
            }
            else if (type == 2)
            {
                Integer.parseInt(inputStr);
                return true;
            }

        }
        catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
