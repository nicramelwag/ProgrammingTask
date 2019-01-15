/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingtask;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Marcin
 */
public class SimpleDataProvider implements DataProvider<Pair<Integer, SimpleData>>{

    @Override
    public int count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Pair<Integer, SimpleData>> get(int page, int pageLength) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Pair<Integer, SimpleData>> getAll() {
        Collection<Pair<Integer, SimpleData>> list = new ArrayList<>();
        String csvFile = "Data/SimpleData.csv";
        String line = "";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] place = line.split(cvsSplitBy);
                SimpleData simpleData = new SimpleData(place[1], place[2]);
                list.add(new Pair(place[0], simpleData));

            }

        } catch (IOException e) {
            System.out.println(e);
        }
        
        return list;
    }
    
}
