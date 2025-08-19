package br.fiap.conexao;

import br.fiap.modelo.Categoria;
import br.fiap.modelo.CategoriaDAO;

import java.util.List;

public class Teste {
    public static void main(String[] args) {

        CategoriaDAO dao = new CategoriaDAO();


        List<Categoria> lista = dao.listar();
        for (Categoria categoria : lista) {
            System.out.println(categoria.getId() + "-->" + categoria.getCategoria());
        }
    }//main

}//class
