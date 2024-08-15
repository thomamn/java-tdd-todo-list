package com.booleanuk.core;
import java.util.HashMap;
public class TodoList {
    HashMap<String, String> taskList=new HashMap<String, String>();

    public boolean add(String task){
        if(!taskList.containsKey(task)){
            taskList.put(task, "Incomplete");
            return true;
        }
        else{
            return false;
        }
    }

    public boolean display(){
        if (taskList.isEmpty()){
            return false;
        }
        else{
            for (String key:taskList.keySet()){
                System.out.println(taskList.get(key));
            }
            return true;
        }
    }
}
