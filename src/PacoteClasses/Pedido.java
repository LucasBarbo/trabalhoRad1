package PacoteClasses;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Integer id;
    private String origemPedido;
    private String cerimonial;
    private String horaEvento;
    private String indicacao;
    private String localEvento;
    private String endereco, obs;
    private LocalDate dataPedido, dataEvento;
    private Cliente cliente;
    private TipoEvendo tipoEvendo;
    private List<ItemPedido> itens;
    private Integer idCliente;
    private Integer idevento;
    private Integer idpedido;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrigemPedido() {
        return origemPedido;
    }

    public void setOrigemPedido(String origemPedido) {
        this.origemPedido = origemPedido;
    }

    public String getCerimonial() {
        return cerimonial;
    }

    public void setCerimonial(String cerimonial) {
        this.cerimonial = cerimonial;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TipoEvendo getTipoEvento() {
        return tipoEvendo;
    }

    public void setTipoEvendo(TipoEvendo tipoEvendo) {
        this.tipoEvendo = tipoEvendo;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    /**
     * @return the idCliente
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the idevento
     */
    public Integer getIdevento() {
        return idevento;
    }

    /**
     * @param idevento the idevento to set
     */
    public void setIdevento(Integer idevento) {
        this.idevento = idevento;
    }

    /**
     * @return the idpedido
     */
    public Integer getIdpedido() {
        return idpedido;
    }

    /**
     * @param idpedido the idpedido to set
     */
    public void setIdpedido(Integer idpedido) {
        this.idpedido = idpedido;
    }
    

}
