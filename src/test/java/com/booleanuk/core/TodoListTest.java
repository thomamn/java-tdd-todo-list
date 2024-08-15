package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    public TodoListTest(){}
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    @Test
    public void addTest() {
        TodoList todoList=new TodoList();

        Assertions.assertTrue(todoList.add("Write add() test"));
        Assertions.assertFalse(todoList.add("Write add() test"));
    }

    @Test
    public void displayTest() {
        TodoList todoList=new TodoList();
        Assertions.assertFalse(todoList.display());
        todoList.add("Add something to the todo-list");
        todoList.add("Test the display() method with tasks added");
        Assertions.assertTrue(todoList.display());
    }
}
