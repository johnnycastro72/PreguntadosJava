package controller;

import java.util.ArrayList;

public interface IQuery<T> {
    public ArrayList<T> query(T o);

    public ArrayList<T> query();
}
