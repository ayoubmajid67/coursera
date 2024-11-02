package customstring;

import java.sql.SQLOutput;

public class Main {
 public static void main(String[] args) {
     CustomString cs = new CustomString();
     cs.setString("Abcdefg");
     System.out.println(cs.filterLetters('c',true));




 }

}

