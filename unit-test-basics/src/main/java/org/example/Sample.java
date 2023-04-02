package org.example;

public class Sample {
    public String getMyName(){
        return "Alihan Özgöç";
    }

    public int addTwoNumber(int a,int b){
        return a+b;
    }

    public boolean isPositive(int number){
        return number > 0;
    }

    public String[] getTokens(String text, String separator){
        return text.split(separator);
    }
}
