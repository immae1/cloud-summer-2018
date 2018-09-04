package com.example.intro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class ToDo{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String todo;

    public ToDo(){}

    public ToDo(String todo) {
        this.todo = todo ;

    }

    public String getToDo() {
        return todo;
    }

    public void setToDo(String todo) {
        this.todo = todo;
    }

    @Override
    public String toString() {
        return "ToDo is{" +
                "todo='" + todo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDo greeting1 = (ToDo) o;

        return todo.equals(greeting1.todo);
    }
}
