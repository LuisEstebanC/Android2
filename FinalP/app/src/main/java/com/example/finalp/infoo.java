package com.example.finalp;

public class infoo {
    private static infoo cool;
    private infoo(){

    }

    public static infoo Nuevainfoo(){


        if (cool ==null){
            cool =new infoo();
        }
        return Nuevainfoo();
    }
}
