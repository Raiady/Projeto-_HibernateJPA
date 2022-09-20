
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Teste{
public static void main(String[] args) {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("ComercioPU");
    
    EntityManager em = factory.createEntityManager();
    
    Produtos Funcionario = new Produtos();
    Funcionario.setFornecedor("Roberto Sans dante");
    Funcionario.setMarca("Limpo");
    Funcionario.setProcedencia("Anvisa");
    Funcionario.setTipo_produto("Produto de Limpeza");
    Funcionario.setDescricao_Produto("Produto direcionado a limpeza de moveis");
    Funcionario.setDataValidade(parseData("25/11/2022"));
    Funcionario.setValorTotal("R$ 1.750,00");
    
    EntityTransaction tx = em.getTransaction();
    tx.begin();
    em.persist(Funcionario);
    tx.commit();
    em.close();
    factory.close();
    
    

    
}

    private static Calendar parseData(String data) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar;
        } catch (ParseException e) {
             throw new IllegalArgumentException(e);
        }
        //To change body of generated methods, choose Tools | Templates.
    }
}
