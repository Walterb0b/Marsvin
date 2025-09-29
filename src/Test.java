import java.util.*;
import java.io.*;
public class Test {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        ArrayList<Marsvin> marsvinList = new ArrayList<>();
        String fileName = "Marsvin.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;

            while((line = br.readLine()) != null){
                String[] parts = line.split(";");
                if(parts.length == 3){
                    String name = parts[0];
                    String race = parts[1];
                    int food = Integer.parseInt(parts[2]);

                    marsvinList.add(new Marsvin(name, race, food));
                }
            }
        } catch(IOException e){
            System.out.println("Error while reading " + e.getMessage());
        }

        for(Marsvin m : marsvinList){
            System.out.println(m);
        }
        System.out.println();
        Collections.sort(marsvinList, new CompareName());
        System.out.println("Sorted by name");
        for(Marsvin m : marsvinList){
            System.out.println(m);
        }
    }
}
