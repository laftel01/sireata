package br.edu.utfpr.dv.sireata.bo;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.edu.utfpr.dv.sireata.dao.CampusDAO;
import br.edu.utfpr.dv.sireata.model.Campus;

public class CampusBO {

	public void exceptionTreatment(Exception e) throws Exception{
		Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
		
		throw new Exception(e.getMessage());
	}
	
	public Campus buscarPorId(int id) throws Exception{
		try{
			CampusDAO dao = new CampusDAO();
			
			return dao.buscarPorId(id);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public Campus buscarPorDepartamento(int idDepartamento) throws Exception{
		try{
			CampusDAO dao = new CampusDAO();
			
			return dao.buscarPorDepartamento(idDepartamento);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public List<Campus> listarTodos(boolean apenasAtivos) throws Exception{
		try{
			CampusDAO dao = new CampusDAO();
			
			return dao.listarTodos(apenasAtivos);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public List<Campus> listarParaCriacaoAta(int idUsuario) throws Exception{
		try{
			CampusDAO dao = new CampusDAO();
			
			return dao.listarParaCriacaoAta(idUsuario);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public List<Campus> listarParaConsultaAtas(int idUsuario) throws Exception{
		try{
			CampusDAO dao = new CampusDAO();
			
			return dao.listarParaConsultaAtas(idUsuario);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public int salvar(Campus campus) throws Exception{
		if(campus.getNome().isEmpty()){
			throw new Exception("Informe o nome do câmpus.");
		}
		
		try{
			CampusDAO dao = new CampusDAO();
			
			return dao.salvar(campus);
		}catch(Exception e){
			exceptionTreatment(e);
			return 0;
		}
	}

}
