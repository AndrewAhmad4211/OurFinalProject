
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;
import javafx.application.Platform;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

import com.google.gson.Gson;



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
    
    private HttpClient client;
    
    private Player player;

    @FXML
    protected void displaysNextPlayer(ActionEvent event) {
      // updateNextPlayer(); 
    }
   
   // create button
   Button button = new Button("Next");
   // give the button an action to go to the next player 
   
   
}

