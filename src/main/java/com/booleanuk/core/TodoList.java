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


    public boolean changeStatus(String task){
        if(taskList.containsKey(task)){

            taskList.replace(task, "Complete");
            return true;
        }
        else{
            return false;
        }
    }

    public boolean statusDisplay(String task){
        if (taskList.containsKey(task)){
            taskList.get(task);
            return true;
        }
        else{
            return false;
        }

    }

    public boolean search(String task){
        return taskList.containsKey(task);
    }

    public boolean remove(String task){
        if (taskList.containsKey(task)){
            taskList.remove(task);
            return true;
        }
        else{
            return false;
        }
    }
}
