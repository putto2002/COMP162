import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
public class AntApp {
    public static void main(String[] args){
        ArrayList<Ant> ants = new ArrayList<Ant>();

        try {
            int numAnt = 0;
            Scanner sc = new Scanner(new File("./antJourneys.txt"));
            
            while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] lineArray = line.split(":");
            ants.add(new Ant(lineArray[0], lineArray.length - 1));
            for(int i = 1; i < lineArray.length; i++) {
                String[] pointArray = lineArray[i].split(",");
                int x = Integer.parseInt(pointArray[0].trim());
                int y = Integer.parseInt(pointArray[1].trim());
                ants.get(numAnt).addPointVisited(new Point(x, y));
                
                
                 
                 
               }
            
            numAnt++;
            }
        } catch(Exception e){
            System.out.println("file not found");
        }  
        
        for(Ant ant: ants){
            System.out.println(ant.toString() +  "\n");
        }
        
            
    }
    
}
