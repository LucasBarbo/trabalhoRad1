/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bemcasadosrad1;

import PacoteClasses.Cliente;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import Services.ClienteService;
import java.util.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import PacoteDAO.ClienteDAO;
/**
 *
 * @author Diosefer
 */
public class PedidoController implements Initializable {
    
    
    @FXML
    private TextField localContratadoT, cerimonialT, horarioT;
    
    @FXML
    private DatePicker dataPeidoT, dataEventoT;
           
    @FXML
    private ComboBox<Cliente> clientesCombo;
    
    
    @FXML
    private void salvarPedido(ActionEvent event) {
           
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ClienteService cliS = new ClienteService();
        
        
        
        ObservableList<Cliente> clientes = FXCollections.observableArrayList(cliS.buscarTodos());
        clientesCombo.setItems(clientes);
        
    }    
    
}
