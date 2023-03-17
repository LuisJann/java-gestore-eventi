package org.oop.events;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EventProgram {
    private String title;
    private List<Event> list;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty()){
            throw new RuntimeException("Inserisci un titolo");
        }
        this.title = title;
    }

    public List<Event> getList() {
        return list;
    }

    public void setList(List<Event> list) {
        this.list = list;
    }

    public List<Event> eventInDate(LocalDate data){
        List<Event> e = new ArrayList<>();

        for (Event event: list) {
            if (event.getDate().equals(data)){
                e.add(event);
            }
        }
        return e;
    }

    public EventProgram(String title, List<Event> list) {
        this.title = title;
        this.list = list;
    }

    public void eventListSize(){
        System.out.println("In questa data ci sono " + list.size() + " eventi");
    }

    public void clearList(){
        list.clear();
    }

    @Override
    public String toString() {
        return "EventProgram{" +
                "title='" + title + '\'' +
                ", list=" + list +
                '}';
    }
}
