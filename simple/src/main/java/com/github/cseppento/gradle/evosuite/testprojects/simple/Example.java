package com.github.cseppento.gradle.evosuite.testprojects.simple;

public final class Example{

    public int proc(int a, int b, int x){

        if((a>1) && (b==0)){
            x = x/a;
        }

        if ((a==2) || (x>1)){
            x = x+1;
        }
        return x;
    }

}