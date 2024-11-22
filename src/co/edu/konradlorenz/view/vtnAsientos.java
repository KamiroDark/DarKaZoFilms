package co.edu.konradlorenz.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class vtnAsientos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vtnAsientos frame = new vtnAsientos();
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
	public vtnAsientos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 896);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpnMenu = new JPanel();
		jpnMenu.setBounds(0, 0, 1193, 87);
		contentPane.add(jpnMenu);
		jpnMenu.setLayout(null);
		jpnMenu.setForeground(Color.RED);
		jpnMenu.setBackground(Color.RED);
		
		JLabel lblTitulo = new JLabel("DarKaZo");
		lblTitulo.setFont(new Font("Impact", Font.PLAIN, 52));
		lblTitulo.setBounds(10, 11, 176, 64);
		jpnMenu.add(lblTitulo);
		
		JPanel jpnPantalla = new JPanel();
		jpnPantalla.setBounds(87, 115, 1006, 41);
		jpnPantalla.setToolTipText("PANTALLA");
		jpnPantalla.setBackground(new Color(0, 0, 0));
		contentPane.add(jpnPantalla);
		
		JLabel lblPantalla = new JLabel("PANTALLA");
		lblPantalla.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPantalla.setForeground(new Color(255, 255, 255));
		jpnPantalla.add(lblPantalla);
		
		JPanel jpnAsientos = new JPanel();
		jpnAsientos.setBorder(new LineBorder(new Color(0, 0, 0)));
		jpnAsientos.setBounds(87, 155, 1006, 534);
		contentPane.add(jpnAsientos);
		jpnAsientos.setLayout(null);
		
		JLabel lblFilaA = new JLabel("A");
		lblFilaA.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaA.setBounds(31, 48, 19, 14);
		jpnAsientos.add(lblFilaA);
		
		JButton btnGeneralA1 = new JButton("A1");
		btnGeneralA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 1;
		        int columna = 1;

		        btnGeneralA1.setText("OC");
		        btnGeneralA1.setBackground(Color.GRAY);
		        btnGeneralA1.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralA1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralA1.setBounds(74, 30, 57, 57);
		jpnAsientos.add(btnGeneralA1);
		
		JButton btnGeneralA2 = new JButton("A2");
		btnGeneralA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 1;
		        int columna = 2;

		        btnGeneralA2.setText("OC");
		        btnGeneralA2.setBackground(Color.GRAY);
		        btnGeneralA2.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralA2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralA2.setBounds(141, 30, 57, 57);
		jpnAsientos.add(btnGeneralA2);
		
		JButton btnGeneralA3 = new JButton("A3");
		btnGeneralA3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 1;
		        int columna = 3;

		        btnGeneralA3.setText("OC");
		        btnGeneralA3.setBackground(Color.GRAY);
		        btnGeneralA3.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralA3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralA3.setBounds(208, 30, 57, 57);
		jpnAsientos.add(btnGeneralA3);
		
		JButton btnGeneralA4 = new JButton("A4");
		btnGeneralA4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 1;
		        int columna = 4;

		        btnGeneralA4.setText("OC");
		        btnGeneralA4.setBackground(Color.GRAY);
		        btnGeneralA4.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralA4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralA4.setBounds(277, 30, 57, 57);
		jpnAsientos.add(btnGeneralA4);
		
		JButton btnGeneralA5 = new JButton("A5");
		btnGeneralA5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 1;
		        int columna = 5;

		        btnGeneralA5.setText("OC");
		        btnGeneralA5.setBackground(Color.GRAY);
		        btnGeneralA5.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralA5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralA5.setBounds(344, 30, 57, 57);
		jpnAsientos.add(btnGeneralA5);
		
		JButton btnGeneralA6 = new JButton("A6");
		btnGeneralA6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 1;
		        int columna = 6;

		        btnGeneralA6.setText("OC");
		        btnGeneralA6.setBackground(Color.GRAY);
		        btnGeneralA6.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralA6.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralA6.setBounds(411, 30, 57, 57);
		jpnAsientos.add(btnGeneralA6);
		
		JButton btnGeneralA7 = new JButton("A7");
		btnGeneralA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 1;
		        int columna = 7;

		        btnGeneralA7.setText("OC");
		        btnGeneralA7.setBackground(Color.GRAY);
		        btnGeneralA7.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralA7.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralA7.setBounds(534, 30, 57, 57);
		jpnAsientos.add(btnGeneralA7);
		
		JButton btnGeneralA8 = new JButton("A8");
		btnGeneralA8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 1;
		        int columna = 8;

		        btnGeneralA8.setText("OC");
		        btnGeneralA8.setBackground(Color.GRAY);
		        btnGeneralA8.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralA8.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralA8.setBounds(601, 30, 57, 57);
		jpnAsientos.add(btnGeneralA8);
		
		JButton btnGeneralA9 = new JButton("A9");
		btnGeneralA9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 1;
		        int columna = 9;

		        btnGeneralA9.setText("OC");
		        btnGeneralA9.setBackground(Color.GRAY);
		        btnGeneralA9.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralA9.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralA9.setBounds(668, 30, 57, 57);
		jpnAsientos.add(btnGeneralA9);
		
		JButton btnGeneralA10 = new JButton("A10");
		btnGeneralA10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 1;
		        int columna = 10;

		        btnGeneralA10.setText("OC");
		        btnGeneralA10.setBackground(Color.GRAY);
		        btnGeneralA10.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralA10.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralA10.setBounds(735, 30, 57, 57);
		jpnAsientos.add(btnGeneralA10);
		
		JButton btnGeneralA11 = new JButton("A11");
		btnGeneralA11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 1;
		        int columna = 11;

		        btnGeneralA11.setText("OC");
		        btnGeneralA11.setBackground(Color.GRAY);
		        btnGeneralA11.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralA11.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralA11.setBounds(802, 30, 57, 57);
		jpnAsientos.add(btnGeneralA11);
		
		JButton btnGeneralA12 = new JButton("A12");
		btnGeneralA12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 1;
		        int columna = 12;

		        btnGeneralA12.setText("OC");
		        btnGeneralA12.setBackground(Color.GRAY);
		        btnGeneralA12.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralA12.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralA12.setBounds(869, 30, 57, 57);
		jpnAsientos.add(btnGeneralA12);
		
		JLabel lblFilaA_1 = new JLabel("A");
		lblFilaA_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaA_1.setBounds(957, 48, 19, 14);
		jpnAsientos.add(lblFilaA_1);

		
		JLabel lblFilaB = new JLabel("B");
		lblFilaB.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaB.setBounds(31, 120, 19, 14);
		jpnAsientos.add(lblFilaB);
		
		JButton btnGeneralB1 = new JButton("B1");
		btnGeneralB1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 2;
		        int columna = 1;

		        btnGeneralB1.setText("OC");
		        btnGeneralB1.setBackground(Color.GRAY);
		        btnGeneralB1.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralB1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralB1.setBounds(74, 98, 57, 57);
		jpnAsientos.add(btnGeneralB1);
		
		JButton btnGeneralB2 = new JButton("B2");
		btnGeneralB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 2;
		        int columna = 2;

		        btnGeneralB2.setText("OC");
		        btnGeneralB2.setBackground(Color.GRAY);
		        btnGeneralB2.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralB2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralB2.setBounds(141, 98, 57, 57);
		jpnAsientos.add(btnGeneralB2);
		
		JButton btnGeneralB3 = new JButton("B3");
		btnGeneralB3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 2;
		        int columna = 3;

		        btnGeneralB3.setText("OC");
		        btnGeneralB3.setBackground(Color.GRAY);
		        btnGeneralB3.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralB3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralB3.setBounds(208, 98, 57, 57);
		jpnAsientos.add(btnGeneralB3);
		
		JButton btnGeneralB4 = new JButton("B4");
		btnGeneralB4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 2;
		        int columna = 4;

		        btnGeneralB4.setText("OC");
		        btnGeneralB4.setBackground(Color.GRAY);
		        btnGeneralB4.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralB4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralB4.setBounds(277, 98, 57, 57);
		jpnAsientos.add(btnGeneralB4);
		
		JButton btnGeneralB5 = new JButton("B5");
		btnGeneralB5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 2;
		        int columna = 5;

		        btnGeneralB5.setText("OC");
		        btnGeneralB5.setBackground(Color.GRAY);
		        btnGeneralB5.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralB5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralB5.setBounds(344, 98, 57, 57);
		jpnAsientos.add(btnGeneralB5);
		
		JButton btnGeneralB6 = new JButton("B6");
		btnGeneralB6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 2;
		        int columna = 6;

		        btnGeneralB6.setText("OC");
		        btnGeneralB6.setBackground(Color.GRAY);
		        btnGeneralB6.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralB6.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralB6.setBounds(411, 98, 57, 57);
		jpnAsientos.add(btnGeneralB6);
		
		JButton btnGeneralB7 = new JButton("B7");
		btnGeneralB7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 2;
		        int columna = 7;

		        btnGeneralB7.setText("OC");
		        btnGeneralB7.setBackground(Color.GRAY);
		        btnGeneralB7.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralB7.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralB7.setBounds(534, 98, 57, 57);
		jpnAsientos.add(btnGeneralB7);
		
		JButton btnGeneralB8 = new JButton("B8");
		btnGeneralB8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 2;
		        int columna = 8;

		        btnGeneralB8.setText("OC");
		        btnGeneralB8.setBackground(Color.GRAY);
		        btnGeneralB8.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralB8.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralB8.setBounds(601, 98, 57, 57);
		jpnAsientos.add(btnGeneralB8);
		
		JButton btnGeneralB9 = new JButton("B9");
		btnGeneralB9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 2;
		        int columna = 9;

		        btnGeneralB9.setText("OC");
		        btnGeneralB9.setBackground(Color.GRAY);
		        btnGeneralB9.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralB9.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralB9.setBounds(668, 98, 57, 57);
		jpnAsientos.add(btnGeneralB9);
		
		JButton btnGeneralB10 = new JButton("B10");
		btnGeneralB10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 2;
		        int columna = 10;

		        btnGeneralB10.setText("OC");
		        btnGeneralB10.setBackground(Color.GRAY);
		        btnGeneralB10.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralB10.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralB10.setBounds(735, 98, 57, 57);
		jpnAsientos.add(btnGeneralB10);
		
		JButton btnGeneralB11 = new JButton("B11");
		btnGeneralB11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 2;
		        int columna = 11;

		        btnGeneralB11.setText("OC");
		        btnGeneralB11.setBackground(Color.GRAY);
		        btnGeneralB11.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralB11.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralB11.setBounds(802, 98, 57, 57);
		jpnAsientos.add(btnGeneralB11);
		
		JButton btnGeneralB12 = new JButton("B12");
		btnGeneralB12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 2;
		        int columna = 12;

		        btnGeneralB12.setText("OC");
		        btnGeneralB12.setBackground(Color.GRAY);
		        btnGeneralB12.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralB12.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralB12.setBounds(869, 98, 57, 57);
		jpnAsientos.add(btnGeneralB12);
		
		JLabel lblFilaB_1 = new JLabel("B");
		lblFilaB_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaB_1.setBounds(957, 120, 19, 14);
		jpnAsientos.add(lblFilaB_1);
		
		JLabel lblFilaC = new JLabel("C");
		lblFilaC.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaC.setBounds(31, 188, 19, 14);
		jpnAsientos.add(lblFilaC);
		
		JButton btnGeneralC1 = new JButton("C1");
		btnGeneralC1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 3;
		        int columna = 1;

		        btnGeneralC1.setText("OC");
		        btnGeneralC1.setBackground(Color.GRAY);
		        btnGeneralC1.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralC1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralC1.setBounds(74, 166, 57, 57);
		jpnAsientos.add(btnGeneralC1);
		
		JButton btnGeneralC2 = new JButton("C2");
		btnGeneralC2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 3;
		        int columna = 2;

		        btnGeneralC2.setText("OC");
		        btnGeneralC2.setBackground(Color.GRAY);
		        btnGeneralC2.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralC2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralC2.setBounds(141, 166, 57, 57);
		jpnAsientos.add(btnGeneralC2);
		
		JButton btnGeneralC3 = new JButton("C3");
		btnGeneralC3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 3;
		        int columna = 3;

		        btnGeneralC3.setText("OC");
		        btnGeneralC3.setBackground(Color.GRAY);
		        btnGeneralC3.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralC3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralC3.setBounds(208, 166, 57, 57);
		jpnAsientos.add(btnGeneralC3);
		
		JButton btnGeneralC4 = new JButton("C4");
		btnGeneralC4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 3;
		        int columna = 4;

		        btnGeneralC4.setText("OC");
		        btnGeneralC4.setBackground(Color.GRAY);
		        btnGeneralC4.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralC4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralC4.setBounds(277, 166, 57, 57);
		jpnAsientos.add(btnGeneralC4);
		
		JButton btnGeneralC5 = new JButton("C5");
		btnGeneralC5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 3;
		        int columna = 5;

		        btnGeneralC5.setText("OC");
		        btnGeneralC5.setBackground(Color.GRAY);
		        btnGeneralC5.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralC5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralC5.setBounds(344, 166, 57, 57);
		jpnAsientos.add(btnGeneralC5);
		
		JButton btnGeneralC6 = new JButton("C6");
		btnGeneralC6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 3;
		        int columna = 6;

		        btnGeneralC6.setText("OC");
		        btnGeneralC6.setBackground(Color.GRAY);
		        btnGeneralC6.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralC6.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralC6.setBounds(411, 166, 57, 57);
		jpnAsientos.add(btnGeneralC6);
		
		JButton btnGeneralC7 = new JButton("C7");
		btnGeneralC7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 3;
		        int columna = 7;

		        btnGeneralC7.setText("OC");
		        btnGeneralC7.setBackground(Color.GRAY);
		        btnGeneralC7.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralC7.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralC7.setBounds(534, 166, 57, 57);
		jpnAsientos.add(btnGeneralC7);
		
		JButton btnGeneralC8 = new JButton("C8");
		btnGeneralC8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 3;
		        int columna = 8;

		        btnGeneralC8.setText("OC");
		        btnGeneralC8.setBackground(Color.GRAY);
		        btnGeneralC8.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralC8.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralC8.setBounds(601, 166, 57, 57);
		jpnAsientos.add(btnGeneralC8);
		
		JButton btnGeneralC9 = new JButton("C9");
		btnGeneralC9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 3;
		        int columna = 9;

		        btnGeneralC9.setText("OC");
		        btnGeneralC9.setBackground(Color.GRAY);
		        btnGeneralC9.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralC9.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralC9.setBounds(668, 166, 57, 57);
		jpnAsientos.add(btnGeneralC9);
		
		JButton btnGeneralC10 = new JButton("C10");
		btnGeneralC10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 3;
		        int columna = 10;

		        btnGeneralC10.setText("OC");
		        btnGeneralC10.setBackground(Color.GRAY);
		        btnGeneralC10.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralC10.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralC10.setBounds(735, 166, 57, 57);
		jpnAsientos.add(btnGeneralC10);
		
		JButton btnGeneralC11 = new JButton("C11");
		btnGeneralC11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 3;
		        int columna = 11;

		        btnGeneralC11.setText("OC");
		        btnGeneralC11.setBackground(Color.GRAY);
		        btnGeneralC11.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralC11.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralC11.setBounds(802, 166, 57, 57);
		jpnAsientos.add(btnGeneralC11);
		
		JButton btnGeneralC12 = new JButton("C12");
		btnGeneralC12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 3;
		        int columna = 12;

		        btnGeneralC12.setText("OC");
		        btnGeneralC12.setBackground(Color.GRAY);
		        btnGeneralC12.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralC12.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralC12.setBounds(869, 166, 57, 57);
		jpnAsientos.add(btnGeneralC12);
		
		JLabel lblFilaC_1 = new JLabel("C");
		lblFilaC_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaC_1.setBounds(957, 188, 19, 14);
		jpnAsientos.add(lblFilaC_1);
		
		JLabel lblFilaD = new JLabel("D\r\n");
		lblFilaD.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaD.setBounds(31, 256, 19, 14);
		jpnAsientos.add(lblFilaD);
		
		JButton btnGeneralD1 = new JButton("D1");
		btnGeneralD1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 4;
		        int columna = 1;

		        btnGeneralD1.setText("OC");
		        btnGeneralD1.setBackground(Color.GRAY);
		        btnGeneralD1.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralD1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralD1.setBounds(74, 234, 57, 57);
		jpnAsientos.add(btnGeneralD1);
		
		JButton btnGeneralD2 = new JButton("D2");
		btnGeneralD2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 4;
		        int columna = 2;

		        btnGeneralD2.setText("OC");
		        btnGeneralD2.setBackground(Color.GRAY);
		        btnGeneralD2.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralD2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralD2.setBounds(141, 234, 57, 57);
		jpnAsientos.add(btnGeneralD2);
		
		JButton btnGeneralD3 = new JButton("D3");
		btnGeneralD3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 4;
		        int columna = 3;

		        btnGeneralD3.setText("OC");
		        btnGeneralD3.setBackground(Color.GRAY);
		        btnGeneralD3.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralD3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralD3.setBounds(208, 234, 57, 57);
		jpnAsientos.add(btnGeneralD3);
		
		JButton btnGeneralD4 = new JButton("D4");
		btnGeneralD4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 4;
		        int columna = 4;

		        btnGeneralD4.setText("OC");
		        btnGeneralD4.setBackground(Color.GRAY);
		        btnGeneralD4.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralD4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralD4.setBounds(277, 234, 57, 57);
		jpnAsientos.add(btnGeneralD4);
		
		JButton btnGeneralD5 = new JButton("D5");
		btnGeneralD5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 4;
		        int columna = 5;

		        btnGeneralD5.setText("OC");
		        btnGeneralD5.setBackground(Color.GRAY);
		        btnGeneralD5.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralD5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralD5.setBounds(344, 234, 57, 57);
		jpnAsientos.add(btnGeneralD5);
		
		JButton btnGeneralD6 = new JButton("D6");
		btnGeneralD6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 4;
		        int columna = 6;

		        btnGeneralD6.setText("OC");
		        btnGeneralD6.setBackground(Color.GRAY);
		        btnGeneralD6.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralD6.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralD6.setBounds(411, 234, 57, 57);
		jpnAsientos.add(btnGeneralD6);
		
		JButton btnGeneralD7 = new JButton("D7");
		btnGeneralD7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 4;
		        int columna = 7;

		        btnGeneralD7.setText("OC");
		        btnGeneralD7.setBackground(Color.GRAY);
		        btnGeneralD7.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralD7.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralD7.setBounds(534, 234, 57, 57);
		jpnAsientos.add(btnGeneralD7);
		
		JButton btnGeneralD8 = new JButton("D8");
		btnGeneralD8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 4;
		        int columna = 8;

		        btnGeneralD8.setText("OC");
		        btnGeneralD8.setBackground(Color.GRAY);
		        btnGeneralD8.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralD8.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralD8.setBounds(601, 234, 57, 57);
		jpnAsientos.add(btnGeneralD8);
		
		JButton btnGeneralD9 = new JButton("D9");
		btnGeneralD9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 4;
		        int columna = 9;

		        btnGeneralD9.setText("OC");
		        btnGeneralD9.setBackground(Color.GRAY);
		        btnGeneralD9.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralD9.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralD9.setBounds(668, 234, 57, 57);
		jpnAsientos.add(btnGeneralD9);
		
		JButton btnGeneralD10 = new JButton("D10");
		btnGeneralD10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 4;
		        int columna = 10;

		        btnGeneralD10.setText("OC");
		        btnGeneralD10.setBackground(Color.GRAY);
		        btnGeneralD10.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralD10.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralD10.setBounds(735, 234, 57, 57);
		jpnAsientos.add(btnGeneralD10);
		
		JButton btnGeneralD11 = new JButton("D11");
		btnGeneralD11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 4;
		        int columna = 11;

		        btnGeneralD11.setText("OC");
		        btnGeneralD11.setBackground(Color.GRAY);
		        btnGeneralD11.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralD11.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralD11.setBounds(802, 234, 57, 57);
		jpnAsientos.add(btnGeneralD11);
		
		JButton btnGeneralD12 = new JButton("D12");
		btnGeneralD12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 4;
		        int columna = 12;

		        btnGeneralD12.setText("OC");
		        btnGeneralD12.setBackground(Color.GRAY);
		        btnGeneralD12.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralD12.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralD12.setBounds(869, 234, 57, 57);
		jpnAsientos.add(btnGeneralD12);
		
		JLabel lblFilaD_1 = new JLabel("D");
		lblFilaD_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaD_1.setBounds(957, 256, 19, 14);
		jpnAsientos.add(lblFilaD_1);
		
		JLabel lblFilaE = new JLabel("E");
		lblFilaE.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaE.setBounds(31, 324, 19, 14);
		jpnAsientos.add(lblFilaE);
		
		JButton btnGeneralE1 = new JButton("E1");
		btnGeneralE1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 5;
		        int columna = 1;

		        btnGeneralE1.setText("OC");
		        btnGeneralE1.setBackground(Color.GRAY);
		        btnGeneralE1.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralE1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralE1.setBounds(74, 302, 57, 57);
		jpnAsientos.add(btnGeneralE1);
		
		JButton btnGeneralE2 = new JButton("E2");
		btnGeneralE2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 5;
		        int columna = 2;

		        btnGeneralE2.setText("OC");
		        btnGeneralE2.setBackground(Color.GRAY);
		        btnGeneralE2.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralE2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralE2.setBounds(141, 302, 57, 57);
		jpnAsientos.add(btnGeneralE2);
		
		JButton btnGeneralE3 = new JButton("E3");
		btnGeneralE3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 5;
		        int columna = 3;

		        btnGeneralE3.setText("OC");
		        btnGeneralE3.setBackground(Color.GRAY);
		        btnGeneralE3.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralE3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralE3.setBounds(208, 302, 57, 57);
		jpnAsientos.add(btnGeneralE3);
		
		JButton btnGeneralE4 = new JButton("E4");
		btnGeneralE4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 5;
		        int columna = 4;

		        btnGeneralE4.setText("OC");
		        btnGeneralE4.setBackground(Color.GRAY);
		        btnGeneralE4.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralE4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralE4.setBounds(277, 302, 57, 57);
		jpnAsientos.add(btnGeneralE4);
		
		JButton btnGeneralE5 = new JButton("E5");
		btnGeneralE5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 5;
		        int columna = 5;

		        btnGeneralE5.setText("OC");
		        btnGeneralE5.setBackground(Color.GRAY);
		        btnGeneralE5.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralE5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralE5.setBounds(344, 302, 57, 57);
		jpnAsientos.add(btnGeneralE5);
		
		JButton btnGeneralE6 = new JButton("E6");
		btnGeneralE6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 5;
		        int columna = 6;

		        btnGeneralE6.setText("OC");
		        btnGeneralE6.setBackground(Color.GRAY);
		        btnGeneralE6.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralE6.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralE6.setBounds(411, 302, 57, 57);
		jpnAsientos.add(btnGeneralE6);
		
		JButton btnGeneralE7 = new JButton("E7");
		btnGeneralE7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 5;
		        int columna = 7;

		        btnGeneralE7.setText("OC");
		        btnGeneralE7.setBackground(Color.GRAY);
		        btnGeneralE7.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralE7.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralE7.setBounds(534, 302, 57, 57);
		jpnAsientos.add(btnGeneralE7);
		
		JButton btnGeneralE8 = new JButton("E8");
		btnGeneralE8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 5;
		        int columna = 8;

		        btnGeneralE8.setText("OC");
		        btnGeneralE8.setBackground(Color.GRAY);
		        btnGeneralE8.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralE8.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralE8.setBounds(601, 302, 57, 57);
		jpnAsientos.add(btnGeneralE8);
		
		JButton btnGeneralE9 = new JButton("E9");
		btnGeneralE9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 5;
		        int columna = 9;

		        btnGeneralE9.setText("OC");
		        btnGeneralE9.setBackground(Color.GRAY);
		        btnGeneralE9.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralE9.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralE9.setBounds(668, 302, 57, 57);
		jpnAsientos.add(btnGeneralE9);
		
		JButton btnGeneralE10 = new JButton("E10");
		btnGeneralE10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 5;
		        int columna = 10;

		        btnGeneralE10.setText("OC");
		        btnGeneralE10.setBackground(Color.GRAY);
		        btnGeneralE10.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralE10.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralE10.setBounds(735, 302, 57, 57);
		jpnAsientos.add(btnGeneralE10);
		
		JButton btnGeneralE11 = new JButton("E11");
		btnGeneralE11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 5;
		        int columna = 11;

		        btnGeneralE11.setText("OC");
		        btnGeneralE11.setBackground(Color.GRAY);
		        btnGeneralE11.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralE11.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralE11.setBounds(802, 302, 57, 57);
		jpnAsientos.add(btnGeneralE11);
		
		JButton btnGeneralE12 = new JButton("E12");
		btnGeneralE12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 5;
		        int columna = 12;

		        btnGeneralE12.setText("OC");
		        btnGeneralE12.setBackground(Color.GRAY);
		        btnGeneralE12.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnGeneralE12.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGeneralE12.setBounds(869, 302, 57, 57);
		jpnAsientos.add(btnGeneralE12);
		
		JLabel lblFilaE_1 = new JLabel("E");
		lblFilaE_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaE_1.setBounds(957, 324, 19, 14);
		jpnAsientos.add(lblFilaE_1);
		
		JLabel lblFilaF = new JLabel("F");
		lblFilaF.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaF.setBounds(31, 420, 19, 14);
		jpnAsientos.add(lblFilaF);
		
		JButton btnPremiumF1 = new JButton("F1");
		btnPremiumF1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 6;
		        int columna = 1;

		        btnPremiumF1.setText("OC");
		        btnPremiumF1.setBackground(Color.GRAY);
		        btnPremiumF1.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumF1.setBackground(Color.ORANGE);
		btnPremiumF1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumF1.setBounds(74, 398, 57, 57);
		jpnAsientos.add(btnPremiumF1);
		
		JButton btnPremiumF2 = new JButton("F2");
		btnPremiumF2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 6;
		        int columna = 2;

		        btnPremiumF2.setText("OC");
		        btnPremiumF2.setBackground(Color.GRAY);
		        btnPremiumF2.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumF2.setBackground(Color.ORANGE);
		btnPremiumF2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumF2.setBounds(141, 398, 57, 57);
		jpnAsientos.add(btnPremiumF2);
		
		JButton btnPremiumF3 = new JButton("F3");
		btnPremiumF3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 6;
		        int columna = 3;

		        btnPremiumF3.setText("OC");
		        btnPremiumF3.setBackground(Color.GRAY);
		        btnPremiumF3.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumF3.setBackground(Color.ORANGE);
		btnPremiumF3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumF3.setBounds(208, 398, 57, 57);
		jpnAsientos.add(btnPremiumF3);
		
		JButton btnPremiumF4 = new JButton("F4");
		btnPremiumF4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 6;
		        int columna = 4;

		        btnPremiumF4.setText("OC");
		        btnPremiumF4.setBackground(Color.GRAY);
		        btnPremiumF4.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumF4.setBackground(Color.ORANGE);
		btnPremiumF4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumF4.setBounds(277, 398, 57, 57);
		jpnAsientos.add(btnPremiumF4);
		
		JButton btnPremiumF5 = new JButton("F5");
		btnPremiumF5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 6;
		        int columna = 5;

		        btnPremiumF5.setText("OC");
		        btnPremiumF5.setBackground(Color.GRAY);
		        btnPremiumF5.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumF5.setBackground(Color.ORANGE);
		btnPremiumF5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumF5.setBounds(344, 398, 57, 57);
		jpnAsientos.add(btnPremiumF5);
		
		JButton btnPremiumF6 = new JButton("F6");
		btnPremiumF6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 6;
		        int columna = 6;

		        btnPremiumF6.setText("OC");
		        btnPremiumF6.setBackground(Color.GRAY);
		        btnPremiumF6.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumF6.setBackground(Color.ORANGE);
		btnPremiumF6.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumF6.setBounds(411, 398, 57, 57);
		jpnAsientos.add(btnPremiumF6);
		
		JButton btnPremiumF7 = new JButton("F7");
		btnPremiumF7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 6;
		        int columna = 7;

		        btnPremiumF7.setText("OC");
		        btnPremiumF7.setBackground(Color.GRAY);
		        btnPremiumF7.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumF7.setBackground(Color.ORANGE);
		btnPremiumF7.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumF7.setBounds(534, 398, 57, 57);
		jpnAsientos.add(btnPremiumF7);
		
		JButton btnPremiumF8 = new JButton("F8");
		btnPremiumF8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 6;
		        int columna = 8;

		        btnPremiumF8.setText("OC");
		        btnPremiumF8.setBackground(Color.GRAY);
		        btnPremiumF8.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumF8.setBackground(Color.ORANGE);
		btnPremiumF8.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumF8.setBounds(601, 398, 57, 57);
		jpnAsientos.add(btnPremiumF8);
		
		JButton btnPremiumF9 = new JButton("F9");
		btnPremiumF9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 6;
		        int columna = 9;

		        btnPremiumF9.setText("OC");
		        btnPremiumF9.setBackground(Color.GRAY);
		        btnPremiumF9.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumF9.setBackground(Color.ORANGE);
		btnPremiumF9.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumF9.setBounds(668, 398, 57, 57);
		jpnAsientos.add(btnPremiumF9);
		
		JButton btnPremiumF10 = new JButton("F10");
		btnPremiumF10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 6;
		        int columna = 10;

		        btnPremiumF10.setText("OC");
		        btnPremiumF10.setBackground(Color.GRAY);
		        btnPremiumF10.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumF10.setBackground(Color.ORANGE);
		btnPremiumF10.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumF10.setBounds(735, 398, 57, 57);
		jpnAsientos.add(btnPremiumF10);
		
		JButton btnPremiumF11 = new JButton("F11");
		btnPremiumF11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 6;
		        int columna = 11;

		        btnPremiumF11.setText("OC");
		        btnPremiumF11.setBackground(Color.GRAY);
		        btnPremiumF11.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumF11.setBackground(Color.ORANGE);
		btnPremiumF11.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumF11.setBounds(802, 398, 57, 57);
		jpnAsientos.add(btnPremiumF11);
		
		JButton btnPremiumF12 = new JButton("F12");
		btnPremiumF11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 6;
		        int columna = 12;

		        btnPremiumF12.setText("OC");
		        btnPremiumF12.setBackground(Color.GRAY);
		        btnPremiumF12.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumF12.setBackground(Color.ORANGE);
		btnPremiumF12.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumF12.setBounds(869, 398, 57, 57);
		jpnAsientos.add(btnPremiumF12);
		
		JLabel lblFilaF_1 = new JLabel("F");
		lblFilaF_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaF_1.setBounds(957, 420, 19, 14);
		jpnAsientos.add(lblFilaF_1);
		
		JLabel lblFilaG = new JLabel("G");
		lblFilaG.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaG.setBounds(31, 474, 19, 35);
		jpnAsientos.add(lblFilaG);
		
		JButton btnPremiumG1 = new JButton("G1");
		btnPremiumG1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 7;
		        int columna = 1;

		        btnPremiumG1.setText("OC");
		        btnPremiumG1.setBackground(Color.GRAY);
		        btnPremiumG1.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumG1.setBackground(Color.ORANGE);
		btnPremiumG1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumG1.setBounds(74, 466, 57, 57);
		jpnAsientos.add(btnPremiumG1);
		
		JButton btnPremiumG2 = new JButton("G2");
		btnPremiumG2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 7;
		        int columna = 2;

		        btnPremiumG2.setText("OC");
		        btnPremiumG2.setBackground(Color.GRAY);
		        btnPremiumG2.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumG2.setBackground(Color.ORANGE);
		btnPremiumG2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumG2.setBounds(141, 466, 57, 57);
		jpnAsientos.add(btnPremiumG2);
		
		JButton btnPremiumG3 = new JButton("G3");
		btnPremiumG3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 7;
		        int columna = 3;

		        btnPremiumG3.setText("OC");
		        btnPremiumG3.setBackground(Color.GRAY);
		        btnPremiumG3.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumG3.setBackground(Color.ORANGE);
		btnPremiumG3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumG3.setBounds(208, 466, 57, 57);
		jpnAsientos.add(btnPremiumG3);
		
		JButton btnPremiumG4 = new JButton("G4");
		btnPremiumG4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 7;
		        int columna = 4;

		        btnPremiumG4.setText("OC");
		        btnPremiumG4.setBackground(Color.GRAY);
		        btnPremiumG4.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumG4.setBackground(Color.ORANGE);
		btnPremiumG4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumG4.setBounds(277, 466, 57, 57);
		jpnAsientos.add(btnPremiumG4);
		
		JButton btnPremiumG5 = new JButton("G5");
		btnPremiumG5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 7;
		        int columna = 5;

		        btnPremiumG5.setText("OC");
		        btnPremiumG5.setBackground(Color.GRAY);
		        btnPremiumG5.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumG5.setBackground(Color.ORANGE);
		btnPremiumG5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumG5.setBounds(344, 466, 57, 57);
		jpnAsientos.add(btnPremiumG5);
		
		JButton btnPremiumG6 = new JButton("G6");
		btnPremiumG6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 7;
		        int columna = 6;

		        btnPremiumG6.setText("OC");
		        btnPremiumG6.setBackground(Color.GRAY);
		        btnPremiumG6.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumG6.setBackground(Color.ORANGE);
		btnPremiumG6.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumG6.setBounds(411, 466, 57, 57);
		jpnAsientos.add(btnPremiumG6);
		
		JButton btnPremiumG7 = new JButton("G7");
		btnPremiumG7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 7;
		        int columna = 7;

		        btnPremiumG7.setText("OC");
		        btnPremiumG7.setBackground(Color.GRAY);
		        btnPremiumG7.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumG7.setBackground(Color.ORANGE);
		btnPremiumG7.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumG7.setBounds(534, 466, 57, 57);
		jpnAsientos.add(btnPremiumG7);
		
		JButton btnPremiumG8 = new JButton("G8");
		btnPremiumG8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 7;
		        int columna = 8;

		        btnPremiumG8.setText("OC");
		        btnPremiumG8.setBackground(Color.GRAY);
		        btnPremiumG8.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumG8.setBackground(Color.ORANGE);
		btnPremiumG8.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumG8.setBounds(601, 466, 57, 57);
		jpnAsientos.add(btnPremiumG8);
		
		JButton btnPremiumG9 = new JButton("G9");
		btnPremiumG9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 7;
		        int columna = 9;

		        btnPremiumG9.setText("OC");
		        btnPremiumG9.setBackground(Color.GRAY);
		        btnPremiumG9.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumG9.setBackground(Color.ORANGE);
		btnPremiumG9.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumG9.setBounds(668, 466, 57, 57);
		jpnAsientos.add(btnPremiumG9);
		
		JButton btnPremiumG10 = new JButton("G10");
		btnPremiumG10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 7;
		        int columna = 10;

		        btnPremiumG10.setText("OC");
		        btnPremiumG10.setBackground(Color.GRAY);
		        btnPremiumG10.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumG10.setBackground(Color.ORANGE);
		btnPremiumG10.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumG10.setBounds(735, 466, 57, 57);
		jpnAsientos.add(btnPremiumG10);
		
		JButton btnPremiumG11 = new JButton("G11");
		btnPremiumG11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 7;
		        int columna = 11;

		        btnPremiumG11.setText("OC");
		        btnPremiumG11.setBackground(Color.GRAY);
		        btnPremiumG11.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumG11.setBackground(Color.ORANGE);
		btnPremiumG11.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumG11.setBounds(802, 466, 57, 57);
		jpnAsientos.add(btnPremiumG11);
		
		JButton btnPremiumG12 = new JButton("G12");
		btnPremiumG12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int fila = 7;
		        int columna = 12;

		        btnPremiumG12.setText("OC");
		        btnPremiumG12.setBackground(Color.GRAY);
		        btnPremiumG12.setEnabled(false);

		        System.out.println("Asiento reservado en fila " + fila + " columna " + columna);
			}
		});
		btnPremiumG12.setBackground(Color.ORANGE);
		btnPremiumG12.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnPremiumG12.setBounds(869, 466, 57, 57);
		jpnAsientos.add(btnPremiumG12);
		
		JLabel lblFilaG_1 = new JLabel("G");
		lblFilaG_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFilaG_1.setBounds(957, 481, 19, 21);
		jpnAsientos.add(lblFilaG_1);
		
		JButton btnContinuar = new JButton("Continuar\r\n");
		btnContinuar.setBackground(new Color(255, 0, 0));
		btnContinuar.setForeground(new Color(0, 0, 0));
		btnContinuar.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vtnVentaMop VentaMop = new vtnVentaMop();
				VentaMop.setVisible(true);
				vtnAsientos.this.setVisible(false);
			}
		});
		btnContinuar.setBounds(930, 700, 163, 31);
		contentPane.add(btnContinuar);
		
		JLabel lblPremier = new JLabel("*La fila F y G son asientos premier");
		lblPremier.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPremier.setBounds(87, 700, 344, 30);
		contentPane.add(lblPremier);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vntMenuPrincipal Menu = new vntMenuPrincipal();
				Menu.setVisible(true);
				vtnAsientos.this.setVisible(false);
			}
		});
		btnRegresar.setForeground(Color.BLACK);
		btnRegresar.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
		btnRegresar.setBackground(Color.RED);
		btnRegresar.setBounds(10, 815, 163, 31);
		contentPane.add(btnRegresar);
	}
}
