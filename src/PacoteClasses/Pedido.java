package PacoteClasses;

import java.sql.Date;
import java.util.List;

public class Pedido {

    private Integer id;
    private String origemPedido, cerimonial, horaEvento, indicacao,localEvento,enderecoEvento,obs;
    private Date dataPedido; 
    private Cliente cliente;
    private Date dataEvento;
    private TipoEvento tipoEvento;
    List<ItemPedido> item;
    
}
