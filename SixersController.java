
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
    
    // private Stats stats;

    private String [] players = {"192","145","200"};
    int counter = 0;
    
    @FXML
    protected void displaysNextPlayer(ActionEvent event) {
      System.out.println("Button pressed");
      updatePlayerData();
    }
    
    protected void updateUI(){
         first_name.setText(player.first_name);
         last_name.setText(player.last_name);
         height_feet.setText(player.height_feet+"");
         height_inches.setText(player.height_inches+"");
         position.setText(player.position);
         weight.setText(player.weight_pounds+"");
    }
   
    protected void processPlayerData(String data) {
         System.out.println(data); 
         Gson gson = new Gson();
         this.player = gson.fromJson(data, Player.class);
         
         
         Platform.runLater( new Runnable() {
                           public void run() {
                              updateUI();
                           }
                        });
    }
    protected void updatePlayerData(){
         if(this.client == null)
            this.client = HttpClient.newHttpClient();
            
         try{
              HttpRequest request = HttpRequest.newBuilder()
                  .uri(new URI("https://www.balldontlie.io/api/v1/players/"+players[counter++ % 3]))
                  .GET()
                  .build();
              
              client.sendAsync(request, BodyHandlers.ofString())
                  .thenApply(HttpResponse::body)
                  .thenAccept(this::processPlayerData); 
         } catch(URISyntaxException e){
               System.out.println("Issue with request");
         }
         System.out.println("Updating Information...");
    }
   
   
   
   
   
   
          
}

