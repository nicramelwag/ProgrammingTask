/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingtask;

import java.util.Collection;

/**
 *
 * @author Marcin
 */
public class ProgrammingTask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("test");
        DataProvider provider = new SimpleDataProvider();
        DataContainer container = new SimpleDataContainer();
        container.load(provider);
        container.printAll();
        container.add(5, new SimpleData("Polska", "Kraków"));
        container.add(6, new SimpleData("Polska", "Zakopane"));
        container.printAll();
    }
    
}
