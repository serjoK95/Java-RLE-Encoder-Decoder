package rlencoder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;


public class RLEncoder {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("test.txt");
        String text = "";
        int i;
        int len = 0;
        
        while((i = file.read())!= -1){
            char ch = (char)i;
            text = text + ch;
            len = text.length();
        }
        
        String compressed = "";
        
        char ch = 0;
        int count = 1;
        for ( int x = 0; x < text.length(); x++) {
            if(ch == text.charAt(x)){
                count = count + 1;
            }else {
                if(count!=1){
                    compressed = compressed + count;
                }
                compressed = compressed + ch;
                ch = text.charAt(x);
                count = 1;
            }
        }
        
        try {
            		File txtfile = new File("compressed.txt");
			FileWriter fileWriter = new FileWriter(txtfile);
			fileWriter.write(compressed);
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("Content of text.txt before compression: "+text);
        System.out.println("Content of text.txt after compression: " + compressed);
        System.out.println("Compression ratio: "+(compressed.length()*1.0/len));
        System.out.println("text.txt located in root folder of RLEncoder!");
        System.out.println("Compressed content of text.txt saved to compressed.txt(root folder) successfully.");
        }
    }
