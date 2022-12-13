import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class SixersController {

    @FXML
    private Text first_name;

    @FXML
    private Text height_feet;

    @FXML
    private Text height_inches;

    @FXML
    private Text last_name;

    @FXML
    private Text position;

    @FXML
    private Text weight;

    @FXML
    protected void displaysNextPlayer(ActionEvent event) {
      updateNextPlayer(); 
    }
    
    @FXML 
    protected void handleRefreshButtonAction(ActionEvent event) {
      update
    }
   
    private HttpClient client;
    
    private Player player;
}

