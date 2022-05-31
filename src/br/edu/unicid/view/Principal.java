package br.edu.unicid.view;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

import br.edu.unicid.dao.AlunoDAO;
import br.edu.unicid.model.Aluno;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField showNomeAluno;
	private JTextField showCurso;
	private JTextField rgm2;
	private JTextField faltas;
	private JTextField rgm1;
	private JTextField emailAluno;
	private JTextField endAluno;
	private JTextField municipAluno;
	private final ButtonGroup grupoPeriodo = new ButtonGroup();
	private Aluno aluno;
	private AlunoDAO dao;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField nascAluno;
	private JTextField txtRGM;
	private JTextField rgmtest;
	private JTextField txtCPF;
	private JTextField txtCurso;
	private JTextField txtDisciplina;
	private JTextField txtNotas;
	private JTextField txtFaltas;

	/**
	 * Launch the application.
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		
		setTitle("Cadastro de Alunos - UNICID");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Aluno");
		menuBar.add(mnNewMenu);


		

		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Sair");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmNewMenuItem_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.SHIFT_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenu mnNotasEFaltas = new JMenu("Notas e Faltas");
		menuBar.add(mnNotasEFaltas);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Salvar");
		mnNotasEFaltas.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("Alterar");
		mntmNewMenuItem_1_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		mnNotasEFaltas.add(mntmNewMenuItem_1_1);
		
		JMenuItem mntmNewMenuItem_2_1 = new JMenuItem("Excluir");
		mnNotasEFaltas.add(mntmNewMenuItem_2_1);
		
		JMenuItem mntmNewMenuItem_3_1 = new JMenuItem("Consultar");
		mnNotasEFaltas.add(mntmNewMenuItem_3_1);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmNewMenuItem_3_1_1 = new JMenuItem("Sobre");
		mntmNewMenuItem_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Contate os desenvolvedores");
			}
		});
		mnAjuda.add(mntmNewMenuItem_3_1_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 48, 414, 202);
		contentPane.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Curso", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Curso");
		lblNewLabel_5.setBounds(10, 11, 46, 14);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Campus");
		lblNewLabel_5_1.setBounds(10, 49, 46, 14);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Periodo");
		lblNewLabel_5_1_1.setBounds(10, 88, 46, 14);
		panel_2.add(lblNewLabel_5_1_1);
		
		JComboBox curso = new JComboBox();
		curso.setModel(new DefaultComboBoxModel(new String[] {"Analise e Desenvolvimento de Sistemas", "Psicologia", "RH"}));
		curso.setBounds(85, 7, 314, 22);
		panel_2.add(curso);
		
		JComboBox campus = new JComboBox();
		campus.setModel(new DefaultComboBoxModel(new String[] {"Tatuape", "Pinheiros"}));
		campus.setBounds(85, 45, 314, 22);
		panel_2.add(campus);
		
		JRadioButton rdbtnNewMatutino = new JRadioButton("Matutino");
		rdbtnNewMatutino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aluno.setGrupoPeriodo(0);
				
			}
		});
		buttonGroup_1.add(rdbtnNewMatutino);
		rdbtnNewMatutino.setBounds(85, 84, 74, 23);
		panel_2.add(rdbtnNewMatutino);
		
		JRadioButton rdbtnVespertino = new JRadioButton("Vespertino");
		rdbtnVespertino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aluno.setGrupoPeriodo(1);
			}
		});
		buttonGroup_1.add(rdbtnVespertino);
		rdbtnVespertino.setBounds(176, 84, 109, 23);
		panel_2.add(rdbtnVespertino);
		
		JRadioButton rdbtnNewNoturno = new JRadioButton("Noturno");
		rdbtnNewNoturno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aluno.setGrupoPeriodo(2);
			}
		});
		buttonGroup_1.add(rdbtnNewNoturno);
		rdbtnNewNoturno.setBounds(306, 84, 109, 23);
		panel_2.add(rdbtnNewNoturno);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, panel, null);
		panel.setLayout(null);
		
		showNomeAluno = new JTextField();
		showNomeAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		showNomeAluno.setText("Dever\u00E1 mostrar o nome do aluno");
		showNomeAluno.setEnabled(false);
		showNomeAluno.setBounds(204, 11, 195, 20);
		panel.add(showNomeAluno);
		showNomeAluno.setColumns(10);
		
		showCurso = new JTextField();
		showCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		showCurso.setText("Dever\u00E1 mostrar o curso do aluno");
		showCurso.setEnabled(false);
		showCurso.setBounds(10, 43, 389, 20);
		panel.add(showCurso);
		showCurso.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("RGM");
		lblNewLabel.setBounds(10, 14, 46, 14);
		panel.add(lblNewLabel);
		
		rgm2 = new JTextField();
		rgm2.setBounds(41, 11, 153, 20);
		panel.add(rgm2);
		rgm2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Disciplina");
		lblNewLabel_1.setBounds(10, 90, 66, 14);
		panel.add(lblNewLabel_1);
		
		JComboBox disciplina = new JComboBox();
		disciplina.setModel(new DefaultComboBoxModel(new String[] {"Programa\u00E7\u00E3o Orientada a Objetos", "Banco de dados", "Redes"}));
		disciplina.setBounds(77, 86, 322, 22);
		panel.add(disciplina);
		
		JLabel lblNewLabel_2 = new JLabel("Semestre");
		lblNewLabel_2.setBounds(10, 129, 53, 14);
		panel.add(lblNewLabel_2);
		
		JComboBox semestre = new JComboBox();
		semestre.setModel(new DefaultComboBoxModel(new String[] {"2021-1", "2021-2", "2022-1", "2022-2"}));
		semestre.setBounds(65, 125, 77, 22);
		panel.add(semestre);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nota");
		lblNewLabel_2_1.setBounds(152, 129, 46, 14);
		panel.add(lblNewLabel_2_1);
		
		JComboBox nota = new JComboBox();
		nota.setModel(new DefaultComboBoxModel(new String[] {"0,5", "1,0", "5", "6"}));
		nota.setBounds(187, 125, 77, 22);
		panel.add(nota);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Faltas");
		lblNewLabel_2_1_1.setBounds(274, 130, 46, 14);
		panel.add(lblNewLabel_2_1_1);
		
		faltas = new JTextField();
		faltas.setBounds(313, 127, 86, 20);
		panel.add(faltas);
		faltas.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Boletim", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNomeAluno = new JLabel("Inserir o RGM:");
		lblNomeAluno.setBounds(10, 27, 87, 14);
		panel_3.add(lblNomeAluno);
		
		txtRGM = new JTextField();
		txtRGM.setBounds(111, 24, 86, 20);
		panel_3.add(txtRGM);
		txtRGM.setColumns(10);
		
		rgmtest = new JTextField();
		rgmtest.setBounds(10, 91, 126, 20);
		panel_3.add(rgmtest);
		rgmtest.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Nome");
		lblNewLabel_6.setBounds(56, 66, 46, 14);
		panel_3.add(lblNewLabel_6);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(146, 91, 100, 20);
		panel_3.add(txtCPF);
		
		JLabel lblNewLabel_6_1 = new JLabel("CPF");
		lblNewLabel_6_1.setBounds(187, 66, 32, 14);
		panel_3.add(lblNewLabel_6_1);
		
		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(256, 91, 143, 20);
		panel_3.add(txtCurso);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Curso");
		lblNewLabel_6_1_1.setBounds(300, 66, 55, 14);
		panel_3.add(lblNewLabel_6_1_1);
		
		txtDisciplina = new JTextField();
		txtDisciplina.setColumns(10);
		txtDisciplina.setBounds(10, 143, 126, 20);
		panel_3.add(txtDisciplina);
		
		JLabel lblNewLabel_6_2 = new JLabel("Disciplina");
		lblNewLabel_6_2.setBounds(56, 122, 65, 14);
		panel_3.add(lblNewLabel_6_2);
		
		txtNotas = new JTextField();
		txtNotas.setColumns(10);
		txtNotas.setBounds(158, 143, 80, 20);
		panel_3.add(txtNotas);
		
		JLabel lblNewLabel_6_1_2 = new JLabel("Notas");
		lblNewLabel_6_1_2.setBounds(187, 122, 51, 14);
		panel_3.add(lblNewLabel_6_1_2);
		
		txtFaltas = new JTextField();
		txtFaltas.setColumns(10);
		txtFaltas.setBounds(279, 143, 80, 20);
		panel_3.add(txtFaltas);
		
		JLabel lblNewLabel_6_1_2_1 = new JLabel("Faltas");
		lblNewLabel_6_1_2_1.setBounds(300, 122, 55, 14);
		panel_3.add(lblNewLabel_6_1_2_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("RGM");
		lblNewLabel_3.setBounds(10, 11, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Data de nascimento");
		lblNewLabel_4.setBounds(10, 36, 126, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Email");
		lblNewLabel_4_1.setBounds(10, 70, 46, 14);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("End");
		lblNewLabel_4_1_1.setBounds(9, 103, 46, 14);
		panel_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Municipio");
		lblNewLabel_4_1_1_1.setBounds(10, 134, 74, 14);
		panel_1.add(lblNewLabel_4_1_1_1);
		
		rgm1 = new JTextField();
		rgm1.setBounds(70, 8, 86, 20);
		panel_1.add(rgm1);
		rgm1.setColumns(10);
		
		emailAluno = new JTextField();
		emailAluno.setColumns(10);
		emailAluno.setBounds(46, 67, 353, 20);
		panel_1.add(emailAluno);
		
		endAluno = new JTextField();
		endAluno.setColumns(10);
		endAluno.setBounds(35, 100, 364, 20);
		panel_1.add(endAluno);
		
		municipAluno = new JTextField();
		municipAluno.setText("S\u00E3o Paulo");
		municipAluno.setColumns(10);
		municipAluno.setBounds(88, 131, 68, 20);
		panel_1.add(municipAluno);
		
		JLabel lblNewLabel_3_1 = new JLabel("UF");
		lblNewLabel_3_1.setBounds(166, 134, 46, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Nome");
		lblNewLabel_3_2.setBounds(166, 11, 46, 14);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("CPF");
		lblNewLabel_3_2_1.setBounds(234, 36, 46, 14);
		panel_1.add(lblNewLabel_3_2_1);
		
		JComboBox uf = new JComboBox();
		uf.setModel(new DefaultComboBoxModel(new String[] {"SP", "SC", "RJ", "MG"}));
		uf.setBounds(187, 130, 46, 22);
		panel_1.add(uf);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("Celular");
		lblNewLabel_3_2_1_1.setBounds(243, 134, 46, 14);
		panel_1.add(lblNewLabel_3_2_1_1);
		
		JFormattedTextField nomeAluno = new JFormattedTextField();
		nomeAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		nomeAluno.setBounds(202, 8, 197, 20);
		panel_1.add(nomeAluno);
		
		JFormattedTextField celularAluno = new JFormattedTextField();
		celularAluno.setBounds(302, 131, 86, 20);
		panel_1.add(celularAluno);
		
		JFormattedTextField cpfAluno = new JFormattedTextField();
		cpfAluno.setBounds(262, 36, 126, 17);
		panel_1.add(cpfAluno);
		
		nascAluno = new JTextField();
		nascAluno.setBounds(126, 33, 86, 20);
		panel_1.add(nascAluno);
		nascAluno.setColumns(10);
		
		
		
		
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salvar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					aluno = new Aluno();
					aluno.setCurso((String)curso.getSelectedItem());
					aluno.setCampus((String)campus.getSelectedItem());
					//aluno.setGrupoPeriodo((String) grupoPeriodo.getElements());
					aluno.setRgm1(Integer.parseInt(rgm1.getText()));
					aluno.setNomeAluno(nomeAluno.getText());
					aluno.setNascAluno(nascAluno.getText());
				    aluno.setCpfAluno(cpfAluno.getText());
					aluno.setEmailAluno(emailAluno.getText());
					aluno.setEndAluno(endAluno.getText());
					aluno.setMunicipAluno(municipAluno.getText());
					aluno.setUf((String)uf.getSelectedItem());
					aluno.setCelularAluno(celularAluno.getText());
					aluno.setDisciplina((String)disciplina.getSelectedItem());
					aluno.setFaltas(faltas.getText());
					aluno.setNota((String)nota.getSelectedItem());

					
					dao = new AlunoDAO();
					dao.salvar(aluno);

					JOptionPane.showMessageDialog(null, "Salvo com sucesso");

				} catch (Exception erro) {
					JOptionPane.showMessageDialog(null,"Erro ao salvar: " + erro);
				}
			}
		});
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Alterar");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				aluno = new Aluno();
				aluno.setCurso((String)curso.getSelectedItem());
				aluno.setCampus((String)campus.getSelectedItem());
				//aluno.setGrupoPeriodo((String) grupoPeriodo.getElements());
				aluno.setRgm1(Integer.parseInt(rgm1.getText()));
				aluno.setNomeAluno(nomeAluno.getText());
				aluno.setNascAluno(nascAluno.getText());
			    aluno.setCpfAluno(cpfAluno.getText());
				aluno.setEmailAluno(emailAluno.getText());
				aluno.setEndAluno(endAluno.getText());
				aluno.setMunicipAluno(municipAluno.getText());
				aluno.setUf((String)uf.getSelectedItem());
				aluno.setCelularAluno(celularAluno.getText());

				
				dao = new AlunoDAO();
				dao.alterar(aluno);
				JOptionPane.showMessageDialog(null, "Alterado com sucesso");
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null,"Erro ao alterar: " + erro);
			}}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Consultar");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						dao = new AlunoDAO();
						int codigo = Integer.parseInt(txtRGM.getText());

						aluno = dao.consultar(codigo);

						rgmtest.setText(aluno.getNomeAluno());
						txtCPF.setText(aluno.getCpfAluno());
						txtCurso.setText(aluno.getCurso());
						txtDisciplina.setText(aluno.getDisciplina());
						txtNotas.setText(aluno.getNota());
						txtFaltas.setText(aluno.getFaltas());

						
						JOptionPane.showMessageDialog(null, "Listado com sucesso");
					} catch (Exception erro) {
						JOptionPane.showMessageDialog(null,"Erro ao Listar: " + erro);
					}
				}
			});

		mnNewMenu.add(mntmNewMenuItem_2);
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Excluir");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					dao = new AlunoDAO();
					int codigo = Integer.parseInt(rgm1.getText());
					dao.excluir(codigo);
					
					JOptionPane.showMessageDialog(null, "Excluido com sucesso");
				} catch (Exception erro) {
					JOptionPane.showMessageDialog(null,"Erro ao Excluir: " + erro);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		
		

		
	}
}
