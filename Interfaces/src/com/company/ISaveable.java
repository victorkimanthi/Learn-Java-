package com.company;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    /*ArrayList <String> vehicleComponents();
     void  fillFields(ArrayList<String> arrayList );*/
    List<String> write();
    void read(List<String> savedValues);
}
