package br.edu.unicid.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unicid.model.Aluno;
import br.edu.unicid.util.ConnectionFactory;

public class AlunoDAO {
	
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private Aluno aluno;

	
	public AlunoDAO() throws Exception {
		try {
			conn = ConnectionFactory.getConnection();
	} 
		catch(Exception e) {
		throw new Exception("Erro: " + e.getMessage());
	}
	
	}
	
	public void salvar( Aluno aluno ) throws Exception {

			
		
		String periodo = (aluno.getGrupoPeriodo() == 0 ? "MATUTINO" : (aluno.getGrupoPeriodo() == 1 ? "VESPERTINO" : "NOTURNO"));
		
		try {
			String sql = "INSERT INTO cadastroAluno(curso,campus,grupoPeriodo,rgm1,nomeAluno,nascAluno,cpfAluno,emailAluno,endAluno,municipAluno,uf,celularAluno,disciplina,nota,faltas,semestre)"
				+    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			ps = conn.prepareStatement(sql);
		    ps.setString(1,aluno.getCurso());
			ps.setString(2,aluno.getCampus());
			ps.setString(3,periodo);
			ps.setInt(4,aluno.getRgm1());
			ps.setString(5,aluno.getNomeAluno());
			ps.setString(6,aluno.getNascAluno());
		    ps.setString(7,aluno.getCpfAluno());
			ps.setString(8,aluno.getEmailAluno()); 
			ps.setString(9,aluno.getEndAluno());
			ps.setString(10,aluno.getMunicipAluno());
			ps.setString(11,aluno.getUf());
			ps.setString(12,aluno.getCelularAluno());
			ps.setString(13,aluno.getDisciplina());
			ps.setString(14,aluno.getNota());
			ps.setString(15,aluno.getFaltas());
			ps.setString(16,aluno.getSemestre());
			ps.executeUpdate();
			
			

	} 
		catch(Exception e)
	{
		throw new Exception("Erro dao: " + e.getMessage());
		}
	}
	
	public void alterar(Aluno aluno) throws Exception {
		
		String periodo = (aluno.getGrupoPeriodo() == 0 ? "MATUTINO" : (aluno.getGrupoPeriodo() == 1 ? "VESPERTINO" : "NOTURNO"));
		
		try {
			String sql = "UPDATE cadastroAluno SET curso=?,campus=?,grupoPeriodo=?,nomeAluno=?,nascAluno=?,cpfAluno=?,emailAluno=?, endAluno=?,municipAluno=?,uf=?,celularAluno=?,disciplina=?,nota=?,faltas=?,semestre=? " + "WHERE rgm1=?";
			ps = conn.prepareStatement(sql);
		    ps.setString(1,aluno.getCurso());
			ps.setString(2,aluno.getCampus());
			ps.setString(3,periodo);
			ps.setString(4,aluno.getNomeAluno());
			ps.setString(5,aluno.getNascAluno());
		    ps.setString(6,aluno.getCpfAluno());
			ps.setString(7,aluno.getEmailAluno()); 
			ps.setString(8,aluno.getEndAluno());
			ps.setString(9,aluno.getMunicipAluno());
			ps.setString(10,aluno.getUf());
			ps.setString(11,aluno.getCelularAluno());
			ps.setString(12,aluno.getDisciplina());
			ps.setString(13,aluno.getNota());
			ps.setString(14,aluno.getFaltas());
			ps.setString(15,aluno.getSemestre());
			ps.setInt(16,aluno.getRgm1());
			ps.executeUpdate();
			
		} catch (Exception erro) {
			throw new Exception("Erro " + erro.getMessage());
		}
	}

	public void excluir(int rgm1) throws Exception {
		try {
			String sql = "DELETE FROM cadastroAluno " + "WHERE rgm1=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, rgm1);
			ps.executeUpdate();
			
		} catch (Exception erro) {
			throw new Exception("Erro " + erro.getMessage());
		}

	}
	
	
	public List<Aluno> listarTodos() throws Exception {

		try {

			List<Aluno> alunos = new ArrayList<Aluno>();

			String sql = "SELECT * FROM cadastroaluno";

			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {

				aluno = new Aluno();
			    aluno.setCurso(rs.getString(1));
				aluno.setCampus(rs.getString(2));
				aluno.setRgm1(rs.getInt(3));
				aluno.setNomeAluno(rs.getString(4));
				aluno.setNascAluno(rs.getString(5));
			    aluno.setCpfAluno(rs.getString(6));
				aluno.setEmailAluno(rs.getString(7));
			    aluno.setEndAluno(rs.getString(8));
				aluno.setMunicipAluno(rs.getString(9));
				aluno.setUf(rs.getString(10));
				aluno.setCelularAluno(rs.getString(11));
				aluno.getGrupoPeriodo();
				
				alunos.add(aluno);
			}

			return alunos;

		} catch (Exception e) {
			throw new Exception("Erro: " + e.getMessage());
		}

	}

	
	public Aluno consultar (int rgmtest) throws Exception {

		try {

			aluno = new Aluno();

			String sql = "SELECT NomeAluno,CpfAluno,Curso,Disciplina,Nota,Faltas FROM cadastroaluno WHERE rgm1=?";

			ps = conn.prepareStatement(sql);
			ps.setInt(1, rgmtest);
			rs = ps.executeQuery();

			while (rs.next()) {
				
				aluno = new Aluno();
				
				aluno.setNomeAluno(rs.getString(1));
				aluno.setCpfAluno(rs.getString(2));
				aluno.setCurso(rs.getString(3));
				aluno.setDisciplina(rs.getString(4));
				aluno.setNota(rs.getString(5));
				aluno.setFaltas(rs.getString(6));
				
			}

			return aluno;

		} catch (Exception e) {
			throw new Exception("Erro: " + e.getMessage());
		}

	}

}



