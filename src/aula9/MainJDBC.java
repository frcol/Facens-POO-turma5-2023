package aula9;

import aula9.entity.Produto;
import aula9.dao.Produto2DAO;
import aula9.dao.ProdutoDAO;
import java.util.ArrayList;



public class MainJDBC {
    public static void main(String[] args) {
        
        Produto prod = new Produto(0, "XXXXXXXXXXXX", 15, 10000);
        
        new ProdutoDAO().inserir(prod);
    }
}
