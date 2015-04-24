package com.compare;


/**
 * Created by sudheer on 27/3/15.
 */
abstract class Fruit implements Comparable<Fruit>{
    protected String name;
    protected int size;

    protected Fruit(String name, int size){
        this.name = name;
        this.size = size;
    }

    public boolean equals(Object o){
        if(o instanceof Fruit){
            Fruit that = (Fruit)o;
            return this.name.equals(that.name) && this.size == that.size;
        }else{
            return false;
        }
    }

    public int hash(){
        return name.hashCode()*29 + size;
    }

    @Override
    public int compareTo(Fruit that) {
        return this.size < that.size ? -1 : this.size == that.size ? 0 : 1;
    }
}
