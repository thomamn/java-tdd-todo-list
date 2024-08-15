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

    @Test
    public void changeStatusTest() {
        TodoList todoList=new TodoList();
        Assertions.assertFalse(todoList.changeStatus("Test the changeStatus() method"));
        todoList.add("Test the changeStatus() method");
        Assertions.assertTrue(todoList.changeStatus("Test the changeStatus() method"));
    }

    @Test
    public void displayStatusTest() {
        TodoList todoList=new TodoList();
        Assertions.assertFalse(todoList.changeStatus("Test the statusDisplay() method"));
        todoList.add("Test the statusDisplay() method");
        Assertions.assertTrue(todoList.changeStatus("Test the statusDisplay() method"));
    }

    @Test
    public void searchTest() {
        TodoList todoList=new TodoList();
        Assertions.assertFalse(todoList.search("Test search() method"));
        todoList.add("Test search() method");
        Assertions.assertTrue(todoList.search("Test search() method"));
    }
}
