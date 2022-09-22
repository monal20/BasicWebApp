package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("frost")) {
            return "Robert Frost was an American poet and winner of four Pulitzer Prizes. " +
            "Famous works include Fire and Ice, Mending Wall, and Home Burial. " +
            "His 1916 poem, The Road Not Taken, is often read at graduation " +
            "ceremonies across the United States.";
        }
        if (query.toLowerCase().contains("your name")) {
            return "sl-ml2";
        }
        
        return "";
    }


}
