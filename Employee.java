public class Employee {
    Scanner s1 = new Scanner(System.in);
    ArrayList employeeList = new ArrayList<Game>();

    private String employeeName;
    private String employeeId;
    private String employeePhoneNumber;

    int size = 0;
    public Employee() {

    }

    public Employee(String employeeName, String employeeId, String employeePhoneNumber) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeePhoneNumber() {
        return this.employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    // create
    public void createEmployee(){
        System.out.println("======================");
        System.out.println("    CREATE EMPLOYEE   ");
        System.out.println("======================");

            System.out.println("Input Employee Name: ");
            String employeeName = input.nextLine();
            // input.nextLine(); -> buat integer aja

            System.out.println("Input Employee Id: ");
            String employeeId = input.nextLine();

            System.out.println("Input Employee Phone Number: ");
            String employeePhoneNumber = input.nextLine();
    }    

    public void deleteEmployee(){
        
    }

    // show
    public void viewEmployee(){
        System.out.println("=====================");
        System.out.println("    EMPLOYEE LIST    ");
        System.out.println("=====================");

        if(size == 0){
            System.out.println("No Data!");
        } else{
            for(int i = 0; i < employeeList.size(); i++){
                System.out.println("Employee - " +i+1);
                System.out.println("Employee Name: "+ getEmployeeName());
                System.out.println("Employee Id: "+ getEmployeeId());
                System.out.println("Employee Phone Number: "+ getEmployeePhoneNumber());
                System.out.println();
            }    
        }
    }

    public void employeeMenu(){
        int input;
        do{
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Quit");
            System.out.println("Input: ");
            input = scan.nextInt();scan.nextLine();

            switch(input){
                case 1:{
                    createEmployee();
                    break;
                }
                case 2:{
                    viewEmployee();
                    break;
                }
                case 3:{

                }
                case 4:{

                }
                case 5:{
                    break;
                }
            }
        } while(input < 1 || input > 5);
    }
}





