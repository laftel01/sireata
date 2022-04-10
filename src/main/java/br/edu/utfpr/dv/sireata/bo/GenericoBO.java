package br.edu.utfpr.dv.sireata.bo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GenericoBO {
	public void exceptionTreatment(Exception e) throws Exception{
		Logger.getGlobal().log(Level.SEVERE, e.getMessage(), e);
		
		throw new Exception(e.getMessage());
	}
}
