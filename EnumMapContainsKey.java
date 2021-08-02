package com.keyword;

import java.util.EnumMap;

enum JavaSet{HASHSET,LINKED_HASHSET,TREESET}
public class EnumMapContainsKey
{
    public static void main(String[] args)
    {
        EnumMap<JavaSet,String> map = new EnumMap<JavaSet, String>(JavaSet.class);
        map.put(JavaSet.HASHSET,"HS");
        map.put(JavaSet.LINKED_HASHSET,"LHS");
        map.put(JavaSet.TREESET,"TS");
        System.out.println("The Map is "+map);
        System.out.println((map.containsKey(JavaSet.HASHSET))?"True":"False");

    }

}
