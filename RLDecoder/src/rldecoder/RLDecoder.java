package rldecoder;

import java.io.IOException;
import java.io.FileReader;

public class RLDecoder {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("compressed.txt");
        StringBuilder decompressed = new StringBuilder();
        String text = "";
        int i;
    
        while((i = file.read())!= -1){
            char ch = (char)i;
            text = text + ch;
        }
            
        int count=0;
        for(int x=0;x<text.length();x++){
            char letter = text.charAt(x);
            if (Character.isDigit(letter)){
                count = count * 10 + letter - '0';
            } else {
                while (count > 0){
                    decompressed.append(letter);
                    count--;
                }
            }
        }

        
        System.out.println("Text from Compressed File(test.txt): " + text);
        System.out.println("Decompressed Text of the Compressed File: " + decompressed.toString());
        
    }
}