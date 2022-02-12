package kz.iitu.ioc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank implements ContentList{


    List<ContentList> contentsList = new ArrayList<ContentList>();

    @Override
    public void add(ContentList contentList) {
        contentsList.add(contentList);
    }

    @Override
    public ContentList getChild(int i) {
        return contentsList.get(i);
    }

    @Override
    public void remove(ContentList contentList) {
        contentsList.remove(contentList);
    }

    @Override
    public void print() {
        System.out.println("bank");
        Iterator<ContentList> it = contentsList.iterator();
        while (it.hasNext()) {
            ContentList contentList = it.next();
            contentList.print();
        }
        //Вывод списка
    }


}
