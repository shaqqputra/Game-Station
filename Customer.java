import java.io.*;
import java.util.*;


public class Customer 
{
    static Scanner s1 = new Scanner(System.in);
    ArrayList<Customer> customerList = new ArrayList<Customer>();
    private String id;
    private String name;
    private String address;
    private String phone;
    private double money;

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName() 
    {
        System.out.print("Enter your name here: ");
        String name = s1.nextLine();
        if(name.length() > 20)
        {
            throw new IllegalArgumentException("Name must be 1 - 20 characters!");
        }
        else if(name.length() < 1)
        {
            throw new IllegalArgumentException("Invalid name input!");
        }
        this.name = name;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress() 
    {
        System.out.print("Enter your address here: ");
        String address = s1.nextLine();
        if(address.length() > 30)
        {
            throw new IllegalArgumentException("Address cannot exceed than 30 characters!");
        }
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    public void addCustomer()
    {
        id = "" + (long)(Math.random() * 40000000L);
        setName(name);
        setAddress(address);
        customerList.add(id, name, address);
    }

    static void backToMenu()
    {
        System.out.println("");
        System.out.print("Press Enter To Go Back...");
        s1.nextLine();
    }

    public void displayCustomer(){
        

        for(int i = 0; i < customerList.size(); i++)
        {
            System.out.println("Customer Name       : " + getName());
            System.out.println("Customer Address    : " + getAddress());
            System.out.println("Customer Phone      : " + getPhone());
            System.out.println("Customer Money      : " + getMoney());
        }
    }

    public void selectMenu()
    {
        int ch = 0;
        do
        {
            System.out.println("1. Create Customer");
            System.out.println("2. Display Customer");
            System.out.print("Select Menu: ");
            ch = s1.nextInt();
            s1.nextLine();

            switch(ch)
            {
                case 1:
                {
                    addCustomer();
                    break;
                }
                case 2:
                {
                    displayCustomer();
                    break;
                }
            }
        }
        while(ch != 0);
    }
}
