package com.learning.service;

import com.learning.model.Identity;

import java.util.List;

public class GenericCrudService<T extends Identity> {
    void create(T t, List<T> tList) {
        tList.add(t);
    }

    void display(int id, List<T> tList) {
        tList.stream().filter(i -> i.getId() == id).findFirst().toString();
    }

    void displayAll(List<T> tList) {
        tList.forEach(T::toString);
    }

    void update(T t, List<T> tList) throws Exception {
        delete(t.getId(), tList);
        create(t, tList);
    }

    void delete(int id, List<T> tList) throws Exception {
        tList.remove(tList.stream().filter(i -> i.getId() == id).findFirst().orElseThrow(Exception::new));
    }

}
