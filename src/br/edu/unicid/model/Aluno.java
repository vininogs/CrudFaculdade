package br.edu.unicid.model;


public class Aluno {
	//tela 1  Curso
	private String curso;
	private String campus;
	private int grupoPeriodo; //0-Matutino 1-Vespertino 2-Noturno
	//tela 2 Notas e Faltas
	private int rgm2;
	private String showNomeAluno;
	private String showCurso;
	private String disciplina;
	private String semestre;
	private String nota;
	private String faltas;
	//tela 3 Boletim
	private String showRGMNomeCurso;
	private String showNotasEFaltas;
	//tela 4 dados pessoais
	private int rgm1;
	private String nomeAluno;
	private String nascAluno;
	private String cpfAluno;
	private String emailAluno; 
	private String endAluno;
	private String municipAluno;
	private String uf;
	private String celularAluno;
	private int rgmtest;
	
	
	
	public Aluno(String curso, String campus, int grupoPeriodo, int rgm2, String showNomeAluno, String showCurso,
			String disciplina, String semestre, String nota, String faltas, String showRGMNomeCurso,
			String showNotasEFaltas, int rgm1, String nomeAluno, String nascAluno, String cpfAluno, String emailAluno,
			String endAluno, String municipAluno, String uf, String celularAluno, int rgmtest) {
		super();
		this.curso = curso;
		this.campus = campus;
		this.grupoPeriodo = grupoPeriodo;
		this.rgm2 = rgm2;
		this.showNomeAluno = showNomeAluno;
		this.showCurso = showCurso;
		this.disciplina = disciplina;
		this.semestre = semestre;
		this.nota = nota;
		this.faltas = faltas;
		this.showRGMNomeCurso = showRGMNomeCurso;
		this.showNotasEFaltas = showNotasEFaltas;
		this.rgm1 = rgm1;
		this.nomeAluno = nomeAluno;
		this.nascAluno = nascAluno;
		this.cpfAluno = cpfAluno;
		this.emailAluno = emailAluno;
		this.endAluno = endAluno;
		this.municipAluno = municipAluno;
		this.uf = uf;
		this.celularAluno = celularAluno;
		this.rgmtest = rgmtest;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public String getCampus() {
		return campus;
	}



	public void setCampus(String campus) {
		this.campus = campus;
	}



	public int getGrupoPeriodo() {
		return grupoPeriodo;
	}



	public void setGrupoPeriodo(int grupoPeriodo) {
		this.grupoPeriodo = grupoPeriodo;
	}



	public int getRgm2() {
		return rgm2;
	}



	public void setRgm2(int rgm2) {
		this.rgm2 = rgm2;
	}



	public String getShowNomeAluno() {
		return showNomeAluno;
	}



	public void setShowNomeAluno(String showNomeAluno) {
		this.showNomeAluno = showNomeAluno;
	}



	public String getShowCurso() {
		return showCurso;
	}



	public void setShowCurso(String showCurso) {
		this.showCurso = showCurso;
	}



	public String getDisciplina() {
		return disciplina;
	}



	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}



	public String getSemestre() {
		return semestre;
	}



	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}



	public String getNota() {
		return nota;
	}



	public void setNota(String nota) {
		this.nota = nota;
	}



	public String getFaltas() {
		return faltas;
	}



	public void setFaltas(String faltas) {
		this.faltas = faltas;
	}



	public String getShowRGMNomeCurso() {
		return showRGMNomeCurso;
	}



	public void setShowRGMNomeCurso(String showRGMNomeCurso) {
		this.showRGMNomeCurso = showRGMNomeCurso;
	}



	public String getShowNotasEFaltas() {
		return showNotasEFaltas;
	}



	public void setShowNotasEFaltas(String showNotasEFaltas) {
		this.showNotasEFaltas = showNotasEFaltas;
	}



	public int getRgm1() {
		return rgm1;
	}



	public void setRgm1(int rgm1) {
		this.rgm1 = rgm1;
	}



	public String getNomeAluno() {
		return nomeAluno;
	}



	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}



	public String getNascAluno() {
		return nascAluno;
	}



	public void setNascAluno(String nascAluno) {
		this.nascAluno = nascAluno;
	}



	public String getCpfAluno() {
		return cpfAluno;
	}



	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}



	public String getEmailAluno() {
		return emailAluno;
	}



	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}



	public String getEndAluno() {
		return endAluno;
	}



	public void setEndAluno(String endAluno) {
		this.endAluno = endAluno;
	}



	public String getMunicipAluno() {
		return municipAluno;
	}



	public void setMunicipAluno(String municipAluno) {
		this.municipAluno = municipAluno;
	}



	public String getUf() {
		return uf;
	}



	public void setUf(String uf) {
		this.uf = uf;
	}



	public String getCelularAluno() {
		return celularAluno;
	}



	public void setCelularAluno(String celularAluno) {
		this.celularAluno = celularAluno;
	}



	public int getRgmtest() {
		return rgmtest;
	}



	public void setRgmtest(int rgmtest) {
		this.rgmtest = rgmtest;
	}



	public Aluno() {
		super();
	}
	
}
