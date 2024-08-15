package com.booleanuk.core;
import java.lang.reflect.Array;
import java.util.Arrays;
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
    // the boolean order decides which order the todo-list will be displayed
    // true corresponds to ascending, false do descending
    public boolean sort(boolean order) {
        if (taskList.isEmpty()) {
            return false;
        } else {
            String[] sorted = (String[]) taskList.keySet().toArray();
            Arrays.sort(sorted);

            if (order == false) {
                for (int i = sorted.length - 1; i >= 0; i--) {
                    System.out.println(sorted[i]);
                }
            } else if (order == true) {
                for (int i = 0; i < sorted.length; i++) {
                    System.out.println(sorted[i]);
                }
            }
            return true;
        }
    }
}
