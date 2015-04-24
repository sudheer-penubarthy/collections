package com.compare;

/**
 * Created by sudheer on 27/3/15.
 */
abstract class RestrictedFruit {
    protected String name;
    protected int size;

    protected RestrictedFruit(String name, int size){
        this.name = name;
        this.size = size;
    }

    public boolean equals(Object o){
        if(o instanceof RestrictedFruit){
            RestrictedFruit that = (RestrictedFruit)o;
            return this.name.equals(that.name) && this.size == that.size;
        }else{
            return false;
        }
    }

    public int hash(){
        return name.hashCode()*29 + size;
    }

    protected int compareTo(RestrictedFruit that) {
        return this.size < that.size ? -1 : this.size == that.size ? 0 : 1;
    }

    @Override
    public String toString() {
        return "Restricted Fruit : "+name+" with size : "+size;
    }
}
