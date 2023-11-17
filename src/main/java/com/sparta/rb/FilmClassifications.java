package com.sparta.rb;

public class FilmClassifications {
    //added withAdult boolean for 12A
    public static String availableClassifications(int ageOfViewer, boolean withAdult)
    {
        String result;
        //added conditional for children under 4
        if (ageOfViewer < 4)
        {
            result = "No films are available.";
        }
        //Added for children between 4 and 8
        else if (ageOfViewer < 8)
        {
            result = "U films are available.";
        }
        //removed 12 from result string
        else if (ageOfViewer < 12)
        {
            result = "U & PG films are available.";
        }
        //Added for children between 12 and 15 with an adult for 12A
        else if (ageOfViewer < 15 && withAdult)
        {
            result = "U, PG, 12 & 12A films are available.";
        }
        //removed 15 from result string
        else if (ageOfViewer < 15)
        {
            result = "U, PG & 12 films are available.";
        }
        //added else if for teenagers between 15 and 18
        else if (ageOfViewer < 18)
        {
            result = "U, PG, 12, 12A & 15 films are available.";
        }
        else
        {
            result = "All films are available.";
        }
        return result;
    }
}
