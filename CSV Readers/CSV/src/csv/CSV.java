package csv;

// Using BufferedReader method to read CSV

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CSV {
  public static void main(String[] args) {
    String line = " ";
    String splitBy = ",";
    try {
      //parsing a CSV file into BufferedReader class constructor  
      BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\wha\\data.csv"));
      while ((line = br.readLine()) != null)
      //returns a Boolean value  
      {
        String[] employee = line.split(splitBy);
        //use comma as separator  
        System.out.println("Emp[First Name=" + employee[0] + ", Last Name=" + employee[1]  + ", Account Number=" + employee[2] +", City=" + employee[3]  + "]");
      }
    }
    catch(IOException e) {
      e.printStackTrace();
    }
  }
}