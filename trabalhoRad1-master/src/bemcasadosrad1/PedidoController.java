/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bemcasadosrad1;

import PacoteClasses.Cliente;
import PacoteClasses.ItemPedido;
import PacoteClasses.Produto;
import PacoteClasses.TipoEvento;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import Services.ClienteService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import Services.ItemPedidoService;
import Services.ProdutoService;
import Services.ServiceException;
import Services.TipoEventoService;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.binding.Bindings;
import javafx.scene.control.SelectionMode;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 *
 * @author Diosefer
 */
public class PedidoController implements Initializable {
    
    private static final List<ItemPedido> produtos = new ArrayList<>();
    double s=0;
    private  ObservableList<ItemPedido> infoItens;
    
    @FXML
    private TextField localContratadoT, cerimonialT, horarioT, qtdProduto;
    
    @FXML
    private TextField valorTotalProduto;
    
    @FXML
    private DatePicker dataPeidoT, dataEventoT;
    
    @FXML
    private TableView tabela;
    
    @FXML
    private TableColumn colunaProduto;
    
    @FXML
    private TableColumn colunaQtd;
    
    @FXML
    private TableColumn colunaValor;
    
    @FXML
    private TextField valorTotalLista;
     
        
    @FXML
    private ComboBox<Cliente> clientesCombo;
    
    @FXML
    private ComboBox<TipoEvento> tipoCombo;
    
    @FXML
    private ComboBox<Produto> produtoCombo;
    
    
   
    
    
    @FXML
    private void produtoEvento(ActionEvent event){
       double valor =  Double.parseDouble(produtoCombo.getValue().getValor());
       int qtd = Integer.parseInt(qtdProduto.getText());
       
       double result = valor * qtd;
       
       // transformo o valor da operação em string para setar no textfild da tela
       String resultString = String.valueOf(result);
       
       
       valorTotalProduto.setText(resultString);
    
    }
    
    
    @FXML
    private void adicionar(ActionEvent event) {
        ItemPedido item = new ItemPedido();
       
        double valor =  Double.parseDouble(produtoCombo.getValue().getValor());
        
       
       item.setProduto(produtoCombo.getValue());
       item.setQuantidade(Integer.parseInt(qtdProduto.getText()));
       item.setValor(valor * item.getQuantidade());
       
       
       
       produtos.add(item);
       
        colunaProduto.setCellValueFactory(new PropertyValueFactory<>("produto"));
        colunaValor.setCellValueFactory(new PropertyValueFactory<>("valor"));
        colunaQtd.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
       
       ObservableList<ItemPedido> infoItens = FXCollections.observableArrayList(produtos);
       
       tabela.setItems(infoItens);
       
       s = 0;
       for(ItemPedido i : produtos){
               s = s + i.getValor();
            }
            
            String soma = String.valueOf(s);
            valorTotalLista.setText(soma);
       
       
       
       
    }
    
    
    
   @FXML
   private void excluir(ActionEvent e){
       

   
       tabela.getSelectionModel().getSelectedItem();
       
       int idTab = tabela.getSelectionModel().getFocusedIndex();
       infoItens.remove(idTab);
       tabela.getSelectionModel().clearSelection(idTab, colunaValor);
       tabela.getItems().remove(idTab);
       tabela.setItems(infoItens);
   }
    
    @FXML
    private void salvarPedido(ActionEvent event) {
           
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //colocando no combo os clientes
        ClienteService cliS = new ClienteService();       
        ObservableList<Cliente> clientes = FXCollections.observableArrayList(cliS.buscarTodos());
        clientesCombo.setItems(clientes);
        
        //colocando no combo os tipos de eventos
        TipoEventoService tipoE = new TipoEventoService();       
        ObservableList<TipoEvento> eventos = FXCollections.observableArrayList(tipoE.buscarTodos());
        tipoCombo.setItems(eventos);
        
         //colocando no combo os produtos
        ProdutoService prod = new ProdutoService();       
        ObservableList<Produto> pro = FXCollections.observableArrayList(prod.buscarTodos());
        produtoCombo.setItems(pro);
        
        
        
        
        tabela.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); 
         
            
    
        
    }    
    
}
