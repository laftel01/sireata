package br.edu.utfpr.dv.sireata.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GenericoDAO {
	public void closeCon(Connection conn, Statement stmt, ResultSet rs) throws SQLException{
		if((rs != null) && !rs.isClosed())
			rs.close();
		if((stmt != null) && !stmt.isClosed())
			stmt.close();
		if((conn != null) && !conn.isClosed())
			conn.close();
	}	
	public void closeCon(Connection conn, Statement stmt) throws SQLException{
		if((stmt != null) && !stmt.isClosed())
			stmt.close();
		if((conn != null) && !conn.isClosed())
			conn.close();
	}
}
