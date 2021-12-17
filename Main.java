import javafx.application.Application;
import javafx.stage.Stage;
import controller.Controller;
import model.Model;
import main.view.MainInterface;



public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller();

        view.createMainWindow();

    }
}