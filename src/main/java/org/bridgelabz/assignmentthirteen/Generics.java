package org.bridgelabz.assignmentthirteen;

/***
 * @author -> Sameer Jadhav
 * @version  -> 16.0.2
 * @since  -> 2021.10.28
 */

public class Generics
{
    Float a;
    Float b;
    Float c;

    public Generics(Float a, Float b, Float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Float max(){
        Float max;
        if(this.a.compareTo(this.b)>0){
            max = this.a;
        }else {
            max = this.b;
        }
        if (max.compareTo(this.c)>0){
            return max;
        }else {
            return c;
        }

    }
}
