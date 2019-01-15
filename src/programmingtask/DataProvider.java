package programmingtask;

import java.util.Collection;

public interface DataProvider<T extends Pair> {
    int count(); //number of elements
    Collection<T> get(int page, int pageLength); //page starts with 0 f.e. get(1,20) should returns 20 elements from 2 page of results
    Collection<T> getAll();
}
