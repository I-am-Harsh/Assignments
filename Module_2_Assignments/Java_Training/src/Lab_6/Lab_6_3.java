package Lab_6;

import java.io.File;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_6_3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {  
        File file = new File("testFile.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
		BufferedReader reader = new BufferedReader(input);
          
        String line; 
          
        // Initializing counters 
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0;  
        int whitespaceCount = 0; 
          
        // Reading line by line from the  
        // file until a null is returned 
        while((line = reader.readLine()) != null) 
        { 
            if(!(line.equals(""))) 
            { 
                  
                characterCount += line.length(); 
                  
                // \\s+ is the space delimiter in java 
                String[] wordList = line.split("\\s+"); 
                  
                countWord += wordList.length; 
                whitespaceCount += countWord -1; 
                  
                // [!?.:]+ is the sentence delimiter in java 
                String[] sentenceList = line.split("[!?.:]+"); 
                  
                sentenceCount += sentenceList.length; 
            } 
        } 
          
        System.out.println("Total word count = " + countWord); 
        System.out.println("Total number of Lines = " + sentenceCount); 
        System.out.println("Total number of characters = " + characterCount);  
		System.out.println("Total number of whitespaces = " + whitespaceCount);
		reader.close();
    } 
} 



