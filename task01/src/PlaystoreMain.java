

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;

public class PlaystoreMain {

public static void main(String[] args) {

    if (args.length == 0) {
            System.out.println("Invalid! No filename!");
            System.exit(1);

    try{

        File file = new File("sdfassessment.googleplaystore.csv");
        BufferedReader br = new BufferedReader(file);
        String Ps, List<Playstore>> classfied = br.lines()
               .skip(1)
               .map(row -> row.trim().split(","))
               .map(fields -> new playstore(fields[COL_APP], fields[COL_CATEGORY],fields[COL_RATING]))
               .collect(Collectors.groupingBy(playstore -> playstore.getCategory()));
    

        for (String category: classfied.keySet()) {
            List<Playstore> playstore = classfied.get(category);
            System.out.printf("%s (%d)\n", playstore, playstore.size());

        for (String category: classfied.keySet()) {
            List<Playstore> playstore = classfied.get(category);
            System.out.printf("%s (%d)\n", playstore, playstore.size());



    


    




        }
}
}
}
