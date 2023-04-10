/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.JOptionPane;
import java.util.*;
import java.io.*;
public class Sample {
    public static void main(String[] args) throws IOException {
//       String create = JOptionPane.showInputDialog("Enter a File Name to be created:");
//       CreateFile(create);
//       
//       String message = JOptionPane.showInputDialog("Enter a message to input to a file");
//       WriteFile(create,message);
//       
       String myFile = JOptionPane.showInputDialog("Enter a File name you want to open:");
       
       OpenFile(myFile);
    }
    
    
    public static void CreateFile(String create) throws IOException{
        try{
            File nFile = new File(create);
            
            if (nFile.createNewFile()){
                    JOptionPane.showMessageDialog(null,"File Created:" + nFile.getName());
            }else{
                JOptionPane.showMessageDialog(null,"File Already Exists");
                
            }
        }catch (IOException e){
            JOptionPane.showMessageDialog(null,"An error Occured");
        }
    }
    public static void WriteFile(String create, String message) throws IOException{
        try{
            FileWriter fWrite = new FileWriter(create);
            fWrite.write(message);
            fWrite.close();
            JOptionPane.showMessageDialog(null,"Successfully wrote message");
        }  catch (IOException e){
            JOptionPane.showMessageDialog(null,"An error Occured");
        }
        
    }
    
    public static void OpenFile(String myFile) {
	File myObj = new File(myFile);
	try {
		Scanner myReader = new Scanner(myObj);
		System.out.println();
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			JOptionPane.showMessageDialog(null,"------File Content------" + "\n" + data);
		}
	} catch (FileNotFoundException e) {
		System.out.print("File not found");
	}
	} 
}

