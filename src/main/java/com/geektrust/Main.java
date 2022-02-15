package com.geektrust;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import model.commands.CommandExecutor;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	CommandExecutor commandExecutor = new CommandExecutor();
        //String fileName = args[0];//"C:\\Users\\Abhijeet\\Desktop\\file.txt";//
    	String fileName = "sample_input\\input2.txt";
        final File file = new File(fileName);
        final BufferedReader reader = new BufferedReader(new FileReader(file));
        String input = reader.readLine();
        while (input != null) {
            //System.out.println(input);
            commandExecutor.runCommand(input);
            input = reader.readLine();
        }
	
	}
}
