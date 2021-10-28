package org.bridgelabz.assignmentthirteen;

/***
 * @author -> Sameer Jadhav
 * @version  -> 16.0.2
 * @since  -> 2021.10.28
 */

public class Generics
{
    Integer a;
    Integer b;
    Integer c;

    public Generics(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Integer max(){
        Integer max;
        if (this.a.compareTo(this.b) > 0){
            max = a;
        }else if (this.b.compareTo(this.c) > 0){
            max = b;
        }else {
            max = c;
        }
        return max;
    }
}
