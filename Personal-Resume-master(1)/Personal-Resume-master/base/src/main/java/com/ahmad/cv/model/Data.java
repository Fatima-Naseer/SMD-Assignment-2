package com.ahmad.cv.model;

import java.util.ArrayList;

public class Data {
    public static ArrayList<demo> data =new ArrayList<>();

    public static ArrayList<demo> getdata(){
        String[] titles={"Career Goals","Ownership"};
        String[] details={"works gives fruit","key to success"};

        for(int i=0; i<titles.length; i++){
            demo current = new demo(titles[i],details[i]);
            data.add(current);
        }
        return data;
    }
}
