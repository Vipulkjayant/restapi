package Entitys;

public class Book {

    private int id;
    private String name;
    private double prize;
    public Book() {
    }
    public Book(int id, String name, double prize) {
        this.id = id;
        this.name = name;
        this.prize = prize;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrize() {
        return prize;
    }
    public void setPrize(double prize) {
        this.prize = prize;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", prize=" + prize + "]";
    }

    
    
    
}
