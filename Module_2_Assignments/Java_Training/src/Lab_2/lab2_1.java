package Lab_2;

import java.util.*;

abstract class item {
    public static void print(){}
};


class writtenItem extends item{

}

class book extends writtenItem{

}

class journalPaper extends writtenItem{
    private int year;
}

abstract class mediaItem extends item{
    private int runTime;

}

class video extends mediaItem{
    private String director_name;
    private String genre;
    private int year;

}

class cd extends mediaItem{
    // in minutes
    private String artist;
    private String genre;
    
}

public class lab2_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        


    }
}
