package com.hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by saylik on 03/05/15.
 */
public class AllDays implements Iterable<Days> {

    List<Days> days = new ArrayList<Days>();
    public void addDays(Days day){
        days.add(day);
    }

    @Override
    public Iterator<Days> iterator() {
        return days.iterator();
    }
}
