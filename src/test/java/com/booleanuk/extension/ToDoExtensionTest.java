package com.booleanuk.extension;

import com.booleanuk.core.TodoList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToDoExtensionTest {
    public ToDoExtensionTest(){}
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTest() {
        ToDoExtension todoList=new ToDoExtension();

        Assertions.assertTrue(todoList.add("1", new String[]{"Thing", "Time", "Incomplete"}));
        Assertions.assertFalse(todoList.add("1", new String[]{"Thing", "Time", "Incomplete"}));
    }
    @Test
    public void displayTest() {
        ToDoExtension todoList=new ToDoExtension();
        Assertions.assertFalse(todoList.display());
        todoList.add("1", new String[]{"Thing", "Time", "Incomplete"});
        todoList.add("2", new String[]{"Stuff", "Period", "Incomplete"});
        Assertions.assertTrue(todoList.display());
    }




}
