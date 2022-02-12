package kz.iitu.ioc;

public interface ContentList {
    public void print();

    public void add(ContentList contentList);

    public void remove(ContentList contentList);

    public ContentList getChild(int i);
}
