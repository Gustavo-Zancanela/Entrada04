import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
       String linha1 = sc.nextLine();
        System.out.println(linha1);
        sc.nextLine();
        sc.nextLine();
        
        
        //Does this line contain "BlueBumper"?
        System.out.println(sc.findInLine("BlueBumper"));
       
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        int xPosition = Integer.parseInt(sc.findInLine("90"));
        int yPosition = Integer.parseInt(sc.findInLine("120"));
        
        System.out.println("X: " + xPosition + ", Y: " + yPosition);
        sc.close();
        
        Scanner sc2 = new Scanner (Input04.class.getResourceAsStream("Level05.txt"));
       
        System.out.println(sc2.next());
        sc2.close();
        
    }    
}
