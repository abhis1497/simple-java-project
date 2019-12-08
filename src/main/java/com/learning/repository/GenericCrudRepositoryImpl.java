package com.learning.repository;

import com.learning.model.Identity;

import java.util.List;

public class GenericCrudRepositoryImpl<T extends Identity> implements GenericCrudRepository<T> {

    @Override
    public void create(T t, List<T> tList) {
        tList.add(t);
    }

    @Override
    public void display(int id, List<T> tList) {
        tList.stream().filter(i -> i.getId() == id).findFirst().ifPresent(System.out::println);
    }

    @Override
    public void displayAll(List<T> tList) {
        tList.forEach(System.out::println);
    }

    @Override
    public void update(T t, List<T> tList) throws Exception {
        delete(t.getId(), tList);
        create(t, tList);
    }

    @Override
    public void delete(int id, List<T> tList) throws Exception {
        tList.remove(tList.stream().filter(i -> i.getId() == id).findFirst().orElseThrow(Exception::new));
    }

}
