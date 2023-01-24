import java.util.Scanner;


public class Game {
    private String gameId;
    private String gameName;
    private double gamePrice;
    private String gameGenre;
    ArrayList gameData = new ArrayList<Game>();

    Scanner scan = new Scanner(System.in);

    public String getGameId() {
        return this.gameId;
    }

    public void setGameId(){
        String idTemp;
        idTemp = RandomStringUtils.randomNumeric(6);
        this.gameId = idTemp;
    }

    public String getGameName() {
        return this.gameName;
    }

    public void setGameName() {
        String nameTemp;
        do{
            
            System.out.print("Enter the game name : ");
            nameTemp = scan.nextLine();
        }while(nameTemp == null);
        this.gameName = gameTemp;
    }

    public double getGamePrice() {
        return this.gamePrice;
    }

    public void setGamePrice() {
        double priceTemp;
        do{
            System.out.print("Enter the price of the game [10000 - 100000]: ");
            priceTemp = scan.nextDouble();
        }while(priceTemp < 10000 || priceTemp > 100000);

        this.gamePrice = priceTemp;
    }

    public String getGameGenre() {
        return this.gameGenre;
    }

    //cuman bisa "Action", "Sports", "Arcade"
    public void setGameGenre() {
        String genreTemp;
        do{
            System.out.print("Enter the game genre : ");
            genreTemp = scan.nextLine();
        }while(genreTemp.equals("Action") == false || genreTemp.equals("Sports") == false ||genreTemp.equals("Arcade") == false);
        this.gameGenre = gameGenre;
    }

    public void view(){

        for(int i = 0; i < gameData.size(); i++){
            System.out.println("Game name : " + gameName);
            System.out.println("Game id : " + gameId);
            System.out.println("Game genre : " + gameGenre);
            System.out.println("Game price : " + gamePrice);
        }
        
    }


    public void addGame(){
        setGameId();
        setGameName();
        setGameGenre();
        setGamePrice();
    }

    


}
