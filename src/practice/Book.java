package practice;

public class Book {
    private String title;
    private double price;
    private int noOfPages;

    public void setTitle(String t)
    {
        title=t;
    }
    public void setPrice(double p)
    {
        price=p;
    }
    public void setNoOfPages(int n)
    {
        noOfPages=n;
    }
    public void display()
    {
      System.out.println("Book Title->" + title + " BookPrice-> " + price + " BookPages-> " + noOfPages);
    }
    public static void main (String[] args)
    {
      Book b1=new Book();
      b1.setTitle("Oops");
      b1.setPrice(200);
      b1.setNoOfPages(350);
      b1.display();

        Book b2=new Book();
        b2.setTitle("Java");
        b2.setPrice(300);
        b2.setNoOfPages(450);
        b2.display();
    }
}

