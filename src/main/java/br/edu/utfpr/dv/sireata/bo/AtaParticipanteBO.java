package br.edu.utfpr.dv.sireata.bo;

import java.util.List;

import br.edu.utfpr.dv.sireata.dao.AtaParticipanteDAO;
import br.edu.utfpr.dv.sireata.model.AtaParticipante;

public class AtaParticipanteBO extends GenericoBO{
		
	public AtaParticipante buscarPorId(int id) throws Exception{
		try{
			AtaParticipanteDAO dao = new AtaParticipanteDAO();
			
			return dao.buscarPorId(id);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public List<AtaParticipante> listarPorAta(int idAta) throws Exception{
		try{
			AtaParticipanteDAO dao = new AtaParticipanteDAO();
			
			return dao.listarPorAta(idAta);
		}catch(Exception e){
			exceptionTreatment(e);
			return null;
		}
	}
	
	public void validarDados(AtaParticipante participante) throws Exception{
		if((participante.getParticipante() == null) || (participante.getParticipante().getIdUsuario() == 0)){
			throw new Exception("Informe o usuário.");
		}
		if((!participante.isPresente()) && (participante.getMotivo().trim().isEmpty())){
			throw new Exception("Informe o motivo da ausência.");
		}
		if(participante.isPresente()){
			participante.setMotivo("");
		}
	}
	
	public int salvar(AtaParticipante participante) throws Exception{
		try{
			if((participante.getAta() == null) || (participante.getAta().getIdAta() == 0)){
				throw new Exception("Informe a ata.");
			}
			
			this.validarDados(participante);
			
			AtaParticipanteDAO dao = new AtaParticipanteDAO();
			
			return dao.salvar(participante);
		}catch(Exception e){
			exceptionTreatment(e);
			return 0;
		}
	}
	
	public void excluir(AtaParticipante participante) throws Exception{
		this.excluir(participante.getIdAtaParticipante());
	}
	
	public void excluir(int id) throws Exception{
		try{
			AtaParticipanteDAO dao = new AtaParticipanteDAO();
			
			dao.excluir(id);
		}catch(Exception e){
			exceptionTreatment(e);
		}
	}

}
