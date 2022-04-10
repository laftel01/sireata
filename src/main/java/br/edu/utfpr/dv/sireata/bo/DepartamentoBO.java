package br.edu.utfpr.dv.sireata.bo;

import java.util.List;

import br.edu.utfpr.dv.sireata.dao.DepartamentoDAO;
import br.edu.utfpr.dv.sireata.model.Departamento;

public class DepartamentoBO extends GenericoBO {
	
	public Departamento buscarPorId(int id) throws Exception{
		try{
			DepartamentoDAO dao = new DepartamentoDAO();
			
			return dao.buscarPorId(id);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public Departamento buscarPorOrgao(int idOrgao) throws Exception{
		try{
			DepartamentoDAO dao = new DepartamentoDAO();
			
			return dao.buscarPorOrgao(idOrgao);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public List<Departamento> listarTodos(boolean apenasAtivos) throws Exception{
		try{
			DepartamentoDAO dao = new DepartamentoDAO();
			
			return dao.listarTodos(apenasAtivos);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public List<Departamento> listarPorCampus(int idCampus, boolean apenasAtivos) throws Exception{
		try{
			DepartamentoDAO dao = new DepartamentoDAO();
			
			return dao.listarPorCampus(idCampus, apenasAtivos);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public List<Departamento> listarParaCriacaoAta(int idCampus, int idUsuario) throws Exception{
		try{
			DepartamentoDAO dao = new DepartamentoDAO();
			
			return dao.listarParaCriacaoAta(idCampus, idUsuario);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public List<Departamento> listarParaConsultaAtas(int idCampus, int idUsuario) throws Exception{
		try{
			DepartamentoDAO dao = new DepartamentoDAO();
			
			return dao.listarParaConsultaAtas(idCampus, idUsuario);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public int salvar(Departamento departamento) throws Exception{
		if((departamento.getCampus() == null) || (departamento.getCampus().getIdCampus() == 0)){
			throw new Exception("Informe o câmpus do departamento.");
		}
		if(departamento.getNome().isEmpty()){
			throw new Exception("Informe o nome do departamento.");
		}
		
		try{
			DepartamentoDAO dao = new DepartamentoDAO();
			
			return dao.salvar(departamento);
		}catch(Exception e){
			exceptionTreatment(e);
			return 0;
		}
	}

}
