package com.learning.repository;

import com.learning.model.Identity;

import java.util.List;

public class GenericCrudRepository<T extends Identity> {
    public void create(T t, List<T> tList) {
        tList.add(t);
    }

    public void display(int id, List<T> tList) {
        tList.stream().filter(i -> i.getId() == id).findFirst().ifPresent(System.out::println);
    }

    public void displayAll(List<T> tList) {
        tList.forEach(System.out::println);
    }

    public void update(T t, List<T> tList) throws Exception {
        delete(t.getId(), tList);
        create(t, tList);
    }

    public void delete(int id, List<T> tList) throws Exception {
        tList.remove(tList.stream().filter(i -> i.getId() == id).findFirst().orElseThrow(Exception::new));
    }

}
