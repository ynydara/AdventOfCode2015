import java.io.File;  
import java.io.FileNotFoundException; 
import java.util.Scanner;
public class DayOneAdventOfCode {
    public static void main(String[] agrs)
    {
       System.out.println( whichFloor("1"));
        //An opening parenthesis, (, means he should go up one floor, 
        //and a closing parenthesis, ), means he should go down one floor.
    }
    public static int whichFloor(String a){
        int floorCount = 0;
        try{
        File myFile = new File("parenthesis.txt");
        Scanner myScanner = new Scanner(myFile);
        while(myScanner.hasNext()){

            String data = myScanner.nextLine();
            for(int i =0; i < data.length(); i++){
                // System.out.println(data.charAt(i));
                // if (floorCount == -1){
                //     return i;
                // } //For part 2 of the challenge
                if (data.charAt(i) == '('){
                    floorCount+=1;
                                            }
                if (data.charAt(i) == ')'){
                    floorCount-=1;
                
             }
                
               }
             }
            myScanner.close();                     
            }         
        catch (FileNotFoundException e){
            System.out.println("cannot find file");
        }    
        return floorCount;
    }
}
