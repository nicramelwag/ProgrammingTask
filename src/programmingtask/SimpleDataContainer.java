/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingtask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Marcin
 */
public class SimpleDataContainer implements DataContainer<Integer, SimpleData>
{
    private Collection<Pair<Integer, SimpleData>> collection = new ArrayList<>();

    @Override
    public void load(DataProvider<Pair<Integer, SimpleData>> dataProwider) {
        collection = dataProwider.getAll();
    }

    @Override
    public void add(Integer id, SimpleData data) {
        collection.add(new Pair(id, data));
    }

    @Override
    public void update(Integer id, SimpleData data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SimpleData findById(Integer id) {
        for (Pair<Integer, SimpleData> pair : collection) {
            if (pair.getKey().equals(id)) {
                return pair.getValue();
            }
        }
        
        return null;
    }

    @Override
    public void remove(Integer id) {
        for (Pair<Integer, SimpleData> pair : collection) {
            if (pair.getKey().equals(id)) {
                collection.remove(pair);
            }
        }
    }

    @Override
    public void printAll() {
         for (Pair<Integer, SimpleData> pair : collection) {
            System.out.println(pair);
        }
    }

    @Override
    public void print(int from, int to) {
        for (int i = from; i < to; i++){
            
        }
    }

    @Override
    public void clear() {
        collection.clear();
    }

    @Override
    public Collection<SimpleData> get(int from, int to) {
        Collection<SimpleData> dataList = new ArrayList<>();
        for (int i = from; i < to; i++){
            SimpleData simpleData = findById(i);
            if (simpleData != null) dataList.add(simpleData);
        }
        
        return dataList;
    }
    
    public Collection<SimpleData> getAllData() {
        Collection<SimpleData> dataList = new ArrayList<>();
        for (Pair<Integer, SimpleData> pair : collection) {
            SimpleData simpleData = pair.getValue();
            if (simpleData != null) dataList.add(simpleData);
        }
        
        return dataList;
    }

    @Override
    public Collection<SimpleData> filter(Predicate<SimpleData> predicate) {     
        return getAllData().stream().filter(predicate).collect(Collectors.<SimpleData>toList());
    }
    
}
