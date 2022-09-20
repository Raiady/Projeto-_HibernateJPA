import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
/*
Nesta atividade, você deverá criar um projeto com Hibernate/JPA no mesmo modelo 
criado no exemplo Galeria de Arte, contudo utilizando uma tema diferente,
procurando resolver um problema da sociedade. Além do desenvolvimento, 
grave um vídeo sobre o problema abordado pelo seu sistema e mostre o funcionamento
do mesmo, mostrando os dados sendo salvo no banco de dados. 
Seu projeto deverá ter, no mínimo, uma Entidade, que será armazenada em um banco de dados. 
 */
/**
 @author Raiady França
 */

@Entity/*indica que os objetos dessa classe se tornem persistivel ao banco*/
@Table(name = "Relatorio_Produtos")
public class Produtos {
    @Id/*toda a entidade precisa de uma chave primaria*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nome_Fornecedor", nullable = true)
    private String Fornecedor;
    @Column(name = "nome_Marca", nullable = true)
    private String Marca;
    private String Descricao_Produto;
    private String tipo_produto;
    private String procedencia;
    private String ValorTotal;
    @Temporal(TemporalType.DATE)
    @Column(name = "data_hora", nullable = false)
    private Calendar dataValidade;
    
    public int getId() {
        return id;
    }

 
    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

   

    public String getFornecedor() {
        return Fornecedor;
    }

    /**
     * @param Fornecedor the Fornecedor to set
     */
    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the tipo_produto
     */
    public String getTipo_produto() {
        return tipo_produto;
    }

    /**
     * @param tipo_produto the tipo_produto to set
     */
    public void setTipo_produto(String tipo_produto) {
        this.tipo_produto = tipo_produto;
    }

    /**
     * @return the dataValidade
     */
    public Calendar getDataValidade() {
        return dataValidade;
    }

    /**
     * @param dataValidade the dataValidade to set
     */
    public void setDataValidade(Calendar dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * @return the ValorTotal
     */
    public String getValorTotal() {
        return ValorTotal;
    }

    /**
     * @param ValorTotal the ValorTotal to set
     */
    public void setValorTotal(String ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    /**
     * @return the Descricao_Produto
     */
    public String getDescricao_Produto() {
        return Descricao_Produto;
    }

    /**
     * @param Descricao_Produto the Descricao_Produto to set
     */
    public void setDescricao_Produto(String Descricao_Produto) {
        this.Descricao_Produto = Descricao_Produto;
    }

    /**
     * @return the Fornecedor
     */
    
}
