/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingtask;

import java.util.Collection;
import java.util.function.Predicate;

public interface DataContainer<ID,DATA> {
    void load(DataProvider<Pair<ID,DATA>> dataProwider); //loads all data
    void add(ID id,DATA data);
    void update(ID id,DATA data);
    DATA findById(ID id);
    void remove(ID id);
    void printAll(); // prints all elements on the console
    void print(int from,int to); // prints elements <from,to) from start with 0
    void clear();
    Collection<DATA> get(int from,int to); // elements <from,to) from starts with 0
    Collection<DATA> filter(Predicate<DATA> filter);
}
