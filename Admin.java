public class Admin extends Employee{
    private String adminName;
    private String adminId;
    private String gameName;
    private String adminPhoneNumber;

    public Admin() {
        
    }

    public Admin(String adminName, String adminId, String gameName) {
        this.adminName = adminName;
        this.adminId = adminId;
        this.gameName = gameName;
    }


    public String getAdminName() {
        return this.adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminId() {
        return this.adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getGameName() {
        return this.gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getAdminPhoneNumber() {
        return this.adminPhoneNumber;
    }

    public void setAdminPhoneNumber(String adminPhoneNumber) {
        this.adminPhoneNumber = adminPhoneNumber;
    }

   

    public void createAdmin(){
        System.out.println("----------------------------");
        System.out.println("        CREATE ADMIN        ");
        System.out.println("----------------------------");


    }


}
