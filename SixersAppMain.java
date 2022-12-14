import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.util.*;

public class SixersAppMain extends Application{
   public static void main(String[] args){
      launch(args);
   }
   
   @Override
   public void start(Stage stage) throws Exception{
   
      Parent root = FXMLLoader.load(getClass().getResource("SceneBuilder.fxml"));
      Scene scene = new Scene(root);  
      // check how to add picture as title
      stage.setScene(scene);
      stage.show();
      
   }
   
   @Override
   public void stop(){
      // System.out.println("Stop is called in A 
   }
   
}