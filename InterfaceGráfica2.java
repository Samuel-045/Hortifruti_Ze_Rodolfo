package sacolao;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
	
        public class InterfaceGráfica2 extends JPanel{
		private JButton btcomprar, btfinalizar;
		private JRadioButton rbcredito, rbdinheiro, rbdebito;
		private JCheckBox ckbanana, maca, uva, pera, abacaxi, melancia;
		private JLabel Jabacaxi, Jbanana, Jmaça, Jmelancia, Jpera, Juva, jlmensagem, jlmensagem2, bemvindo;
		private ImageIcon iabacaxi, ibanana, imaça, imelancia, ipera, iuva;
		private int total=0, peraPR=0, macaPR=0, bananaPR=0,abacaxiPR=0, melanciaPR=0,uvaPR=0;
		private ButtonGroup grpBtt;
		
		
		
        public InterfaceGráfica2(){
			inicializarComponentes();
			definirEventos();
		}
		
		private void inicializarComponentes() {
			
			bemvindo = new JLabel("Bem vindo ao Hortifrúti zé Rodolfo. Faça suas compras");
			bemvindo.setForeground(Color.blue);
			bemvindo.setBounds(340, 0, 500, 50);
			add(bemvindo);
			
			iabacaxi = new ImageIcon(getClass().getResource("\\imgs\\abacaxi.png"));
			Jabacaxi = new JLabel(iabacaxi);
			Jabacaxi.setBounds(0, 320, 170, 300);
			add(Jabacaxi);
		    Jabacaxi.setVisible(false);
			
			ibanana = new ImageIcon(getClass().getResource("\\imgs\\banana.png"));
			Jbanana = new JLabel(ibanana);
			Jbanana.setBounds(150 ,320 , 180, 300);
			add(Jbanana);
			Jbanana.setVisible(false);
			
			imaça = new ImageIcon(getClass().getResource("\\imgs\\maca.png"));
			Jmaça = new JLabel(imaça);
			Jmaça.setBounds(325, 320, 180, 300);
			add(Jmaça);
			Jmaça.setVisible(false);
				
			ipera = new ImageIcon(getClass().getResource("\\imgs\\pera.png"));
			Jpera= new JLabel(ipera);
			Jpera.setBounds(507, 320, 180, 300);
			add(Jpera);
			Jpera.setVisible(false);
			
			iuva = new ImageIcon(getClass().getResource("\\imgs\\uva.png"));
			Juva= new JLabel(iuva);
			Juva.setBounds(687,320, 180, 300);
			add(Juva);
			Juva.setVisible(false);
			
			imelancia = new ImageIcon(getClass().getResource("\\imgs\\melancia.png"));
			Jmelancia= new JLabel(imelancia);
			Jmelancia.setBounds(870, 320, 180, 300);
			add(Jmelancia);
			Jmelancia.setVisible(false);
			
			//botão de comprar
			setLayout(null);
			btcomprar = new JButton("Comprar");
			btcomprar.setBounds(450,250,100,20);
			add(btcomprar);
			
			//botão para finalizar compra, que só aparece após os produtos serem comprados
			btfinalizar = new JButton("Finalizar compra");
			btfinalizar.setBounds(800, 640, 150, 30);
			add(btfinalizar);
			btfinalizar.setVisible(false);
			
			//forma pagamento
			//credito
			rbcredito = new JRadioButton("Crédito");
			rbcredito.setBounds(450,200,100,25);
			add(rbcredito);                                       /////
			
			//debito
			rbdebito = new JRadioButton("Débito");
			rbdebito.setBounds(800,200,100,25);
			add(rbdebito);                                        /////
			
			//Dinheiro
			rbdinheiro = new JRadioButton("Dinheiro");
			rbdinheiro.setBounds(70,200,100,25);
			add(rbdinheiro);                                      /////
			
			//frutas (produtos)
			//banana
			ckbanana = new  JCheckBox("Banana R$7,00");
			ckbanana.setBounds(450,125,150,25);
			add(ckbanana);
			
			//maça
			maca = new  JCheckBox("Maça R$6,00");
			maca.setBounds(800,125,150,25);
			add(maca);
			
			//banana
			uva = new  JCheckBox("Uva R$10,00");
			uva.setBounds(70,125,150,25);
			add(uva);
			
			//pera
			pera = new  JCheckBox("Pera R$13,00");
			pera.setBounds(450,75,150,25);
			add(pera);
			
			//abacaxi
			abacaxi = new  JCheckBox("Abacaxi R$10,00");
			abacaxi.setBounds(800,75,150,25);
			add(abacaxi);
			
			//melancia
			melancia = new  JCheckBox("Melancia R$20,00");
			melancia.setBounds(70,75,150,25);
			add(melancia);
			
			//mensagem
			jlmensagem= new JLabel("");
			jlmensagem.setBounds(150,270,1000,50);
			add(jlmensagem);
			
			jlmensagem2= new JLabel("");
			jlmensagem2.setBounds(160,290,500,50);
			add(jlmensagem2);
			
			grpBtt = new ButtonGroup();
			grpBtt.add(rbcredito);
			grpBtt.add(rbdebito);
			grpBtt.add(rbdinheiro);
		}
		
		private void definirEventos() {
			btcomprar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){
										
					
					if(rbcredito.isSelected()) {
						jlmensagem.setText("A forma de pagamento escolhida foi crédito. Frutas escolhidas:");
					}else if(rbdebito.isSelected()) {
						jlmensagem.setText("A forma de pagamento escolhida foi débito. Frutas escolhidas:");
					}else if(rbdinheiro.isSelected()) {
						jlmensagem.setText("A forma de pagamento escolhida foi dinheiro. Frutas escolhidas:");
					}
					
					if(ckbanana.isSelected()) {
						Jbanana.setVisible(true);
						bananaPR=7;
					}else {
						Jbanana.setVisible(false);
						bananaPR=0;
					}
					
					if(maca.isSelected()) {
						macaPR=6;
						Jmaça.setVisible(true);
					}else {
						Jmaça.setVisible(false);
						macaPR=0;
					}
					
					if(abacaxi.isSelected()) {
						abacaxiPR=10;
						Jabacaxi.setVisible(true);
					}else {
						Jabacaxi.setVisible(false);
						abacaxiPR=0;
					}
					
					if(pera.isSelected()) {
						peraPR=13;
						Jpera.setVisible(true);
					}else {
						Jpera.setVisible(false);
						peraPR=0;
					}
					
					if(uva.isSelected()) {
						uvaPR=10;
						Juva.setVisible(true);
					}else {
						Juva.setVisible(false);
						uvaPR=0;
					}
					
					if(melancia.isSelected()) {
						melanciaPR=20;
						Jmelancia.setVisible(true);
					}else {
						Jmelancia.setVisible(false);
						melanciaPR=0;
					}
					
					total=macaPR+bananaPR+peraPR+abacaxiPR+uvaPR+melanciaPR;
					jlmensagem2.setText(String.format("Total em R$: %d,00",total));
					
					btfinalizar.setVisible(true);
			
		}
			});
			
			btfinalizar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Compra finalizada. Valor = R$"+total+",00", "Mensagem de finalização de compra", JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
					
				}
			}) ;
			
		}
				
	public static void main(String args[]){
		 JFrame frame = new JFrame("Hortifrúti do zé Rodolfo");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().add(new InterfaceGráfica2());
		 frame.setBounds(100,0,1080,730);
		 frame.validate();
		 frame.setVisible(true);
	}
}
		
        
