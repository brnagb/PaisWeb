package service;

import java.io.IOException;
import java.util.ArrayList;

import model.Pais;
import dao.PaisDao;

public class VendedorService {
	PaisDao dao;
	
	public VendedorService(){
		dao = new PaisDao();
	}
	public ArrayList<Pais> listarPaises() throws IOException {
		return dao.listarPaises();
	}
	public ArrayList<Pais> listarPaises(String chave) throws IOException {
		return dao.listarPaises(chave);
	}

}
