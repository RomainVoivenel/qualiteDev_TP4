import java.util.ArrayList;

public class DataService {
    private static DataService instance;

    private static DataService getInstance(){
        if (instance == null){
            instance = new DataService();
        }
        return instance;
    }
    private DataService(){

    }
}
