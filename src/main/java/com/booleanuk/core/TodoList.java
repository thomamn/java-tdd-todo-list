package com.booleanuk.core;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

    // the boolean order decides which status the todo-list will be displaying
    // true corresponds to complete, false to incomplete
    public ArrayList<String> statusDisplay(String status){
        ArrayList<String> tasks=new ArrayList<>();
        if (taskList.isEmpty()){
            return tasks;
        }
        else{
            for(String key:taskList.keySet()){
                if (taskList.get(key)==status){
                    tasks.add(key);
                }
            }
            return tasks;
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
    public String[] sort(boolean order) {
        if (taskList.isEmpty()) {
            return new String[]{};
        } else {

            String[] sorted = new String[taskList.size()];
            int i=0;
            for (String key: taskList.keySet()){
                sorted[i]=key;
                i+=1;
            }


            if (order == true) {
                Arrays.sort(sorted);
            } else if (order == false) {
                Arrays.sort(sorted, Comparator.reverseOrder());

            }
            return sorted;
        }
    }
}
