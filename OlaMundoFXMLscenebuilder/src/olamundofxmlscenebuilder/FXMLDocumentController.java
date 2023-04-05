
package olamundofxmlscenebuilder;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensagem;
    @FXML
    private Button btnClica;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
      lblMensagem.setText("Olá Mundo, esse é o JavaFX :)");
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
