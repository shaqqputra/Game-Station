import java.util.*;

public class Customer 
{
    Scanner s1 = new Scanner(System.in);
    ArrayList customerList = new ArrayList<Game>();
    private String id;
    private String name;
    private String address;
    private String phone;
    private double money;

    public String getId() 
    {
        return id;
    }
    public void setId() 
    {
        String idTemp;
        idTemp = UUID.randomUUID().toString();
        this.id = idTemp;
        customerList.add(new Customer(idTemp));
    }
    public String getName() 
    {
        return name;
    }
    public void setName() 
    {
        String nameTemp;
        do
        {
            System.out.print("Enter your name here [5 - 20 Characters]: ");
            nameTemp = s1.nextLine();
        }
        while(nameTemp.length() < 5 || nameTemp.length()> 20);
        this.name = nameTemp;
        customerList.add(new Customer(nameTemp));
    }
    public String getAddress() 
    {
        return address;
    }
    public void setAddress() 
    {
        String addressTemp;
        do
        {
            System.out.println("Enter your address: ");
            addressTemp = s1.nextLine();
        }
        while(addressTemp.length() < 0 || addressTemp.length() > 20);
        this.address = addressTemp;
        customerList.add(new Customer(addressTemp));
    }
    public String getPhone() 
    {
        return phone;
    }


    public void setPhone() 
    {
        String phoneTemp;
        boolean isValid =  phone.matches("\\d{3}-\\d{3}\\-d{4}");
        do
        {
            System.out.print("Enter your phone number: ");
            phoneTemp = s1.nextLine();
            if(phoneTemp != isValid)
            {
                System.out.println("Invalid phone number!");
            }
        }
        while(!isValid);
        this.phone = phoneTemp;
        customerList.add(new Customer(phoneTemp));
    }

    public String getMoney() 
    {
        return money;
    }
    public void setMoney() 
    {
        double moneyTemp;
        do
        {
            System.out.print("Enter the amount of your money [Min 10000 - Max 1000000]: ");
            moneyTemp = s1.nextDouble();
            s1.nextLine();
            if(moneyTemp < 0)
            {
                System.out.println("Money cannot below than 10000");
            }
            else if(moneyTemp > 1000000)
            {
                System.out.println("Money cannot exceed than 1000000");
            }
        }
        while(moneyTemp < 10000 || moneyTemp > 1000000);
        this.money = moneyTemp;
        customerList.add(new Customer(moneyTemp));
    }

    public void createCustomer()
    {
        setId();
        setName();
        setAddress();
        setPhone();
        setMoney();
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
                    createCustomer();
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
