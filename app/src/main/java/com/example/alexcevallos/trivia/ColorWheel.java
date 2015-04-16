package com.example.alexcevallos.trivia;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by alexcevallos on 4/15/15.
 */
public class ColorWheel {

    //Variables

    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    //Methods
    public int getColor(){



        //The button was clicked, update fact label with new fact
        String color = "";

        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new random generator
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;

    }
}