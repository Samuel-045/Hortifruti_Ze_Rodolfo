package sacolao;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
	
        public class InterfaceGráfica2 extends JPanel{
		private JButton btcomprar;
		private JRadioButton rbcredito, rbdinheiro, rbdebito;
		private JCheckBox ckbanana, maca, uva, pera, abacaxi, melancia;
		private JLabel Jabacaxi, Jbanana, Jmaça, Jmelancia, Jpera, Juva, jlmensagem, bemvindo;
		private ImageIcon iabacaxi, ibanana, imaça, imelancia, ipera, iuva;
		
		
		
		
        public InterfaceGráfica2(){
			inicializarComponentes();
			definirEventos();
		}
		
		private void inicializarComponentes() {
			
			bemvindo = new JLabel("Bem vindo ao Sacolão zé Rodolfo. Faça suas compras");
			bemvindo.setForeground(Color.blue);
			bemvindo.setBounds(320, 0, 500, 50);
			add(bemvindo);
			
			iabacaxi = new ImageIcon("C:\\Users\\Ana Paula\\eclipse-workspace\\terceirosemestre\\src\\sacolao\\imgs\\abacaxi1.png");
			Jabacaxi = new JLabel(iabacaxi);
			Jabacaxi.setBounds(0, 300, 180, 300);
			add(Jabacaxi);
		    Jabacaxi.setVisible(false);
			
			ibanana = new ImageIcon("C:\\Users\\Ana Paula\\eclipse-workspace\\terceirosemestre\\src\\sacolao\\imgs\\banana.jpg");
			Jbanana = new JLabel(ibanana);
			Jbanana.setBounds(150 ,300 , 180, 300);
			add(Jbanana);
			Jbanana.setVisible(false);
			
			imaça = new ImageIcon("C:\\Users\\Ana Paula\\eclipse-workspace\\terceirosemestre\\src\\sacolao\\imgs\\maça.jpg");
			Jmaça = new JLabel(imaça);
			Jmaça.setBounds(320, 300, 180, 300);
			add(Jmaça);
			Jmaça.setVisible(false);
				
			ipera = new ImageIcon("C:\\Users\\Ana Paula\\eclipse-workspace\\terceirosemestre\\src\\sacolao\\imgs\\pera.jpg");
			Jpera= new JLabel(ipera);
			Jpera.setBounds(480, 300, 180, 300);
			add(Jpera);
			Jpera.setVisible(false);
			
			iuva = new ImageIcon("C:\\Users\\Ana Paula\\eclipse-workspace\\terceirosemestre\\src\\sacolao\\imgs\\uva1.jpg");
			Juva= new JLabel(iuva);
			Juva.setBounds(660, 300, 180, 300);
			add(Juva);
			Juva.setVisible(false);
			
			imelancia = new ImageIcon("C:\\Users\\Ana Paula\\eclipse-workspace\\terceirosemestre\\src\\sacolao\\imgs\\melancia.jpg");
			Jmelancia= new JLabel(imelancia);
			Jmelancia.setBounds(840, 300, 180, 300);
			add(Jmelancia);
			Jmelancia.setVisible(false);
			
			//botão de comprar
			setLayout(null);
			btcomprar = new JButton("Comprar");
			btcomprar.setBounds(400,250,100,20);
			add(btcomprar);
			
			//forma pagamento
			//credito
			rbcredito = new JRadioButton("Crédito");
			rbcredito.setBounds(400,200,100,25);
			add(rbcredito);                                       /////
			
			//debito
			rbdebito = new JRadioButton("Débito");
			rbdebito.setBounds(700,200,100,25);
			add(rbdebito);                                        /////
			
			//Dinheiro
			rbdinheiro = new JRadioButton("Dinheiro");
			rbdinheiro.setBounds(70,200,100,25);
			add(rbdinheiro);                                      /////
			
			//frutas (produtos)
			//banana
			ckbanana = new  JCheckBox("Banana");
			ckbanana.setBounds(400,125,100,25);
			add(ckbanana);
			
			//maça
			maca = new  JCheckBox("Maça");
			maca.setBounds(700,125,100,25);
			add(maca);
			
			//banana
			uva = new  JCheckBox("Uva");
			uva.setBounds(70,125,100,25);
			add(uva);
			
			//pera
			pera = new  JCheckBox("Pera");
			pera.setBounds(400,75,100,25);
			add(pera);
			
			//abacaxi
			abacaxi = new  JCheckBox("Abacaxi");
			abacaxi.setBounds(700,75,100,25);
			add(abacaxi);
			
			//melancia
			melancia = new  JCheckBox("Melancia");
			melancia.setBounds(70,75,100,25);
			add(melancia);
			
			//mensagem
			jlmensagem= new JLabel("");
			jlmensagem.setBounds(150,270,1000,50);
			add(jlmensagem);
			
		}
		
		private void definirEventos() {
			btcomprar.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0){	
			if(rbcredito.isSelected()) {
				jlmensagem.setText("A forma escolhida de pagamento foi crédito. Frutas escolhidas:");
			}else if(rbdebito.isSelected()) {
				jlmensagem.setText("A forma escolhida de pagamento foi débito. Frutas escolhidas:");
			}else if(rbdinheiro.isSelected()) {
				jlmensagem.setText("A forma de pagamento escolhida foi dinheiro. Frutas escolhidas:");
			}
			
			if(ckbanana.isSelected()) {
				Jbanana.setVisible(true);
			}else {
				Jbanana.setVisible(false);
			}
			
			if(maca.isSelected()) {
				Jmaça.setVisible(true);
			}else {
				Jmaça.setVisible(false);
			}
			
			if(abacaxi.isSelected()) {
				add(Jabacaxi);
				Jabacaxi.setVisible(true);
			}else {
				Jabacaxi.setVisible(false);
			}
			
			if(pera.isSelected()) {
				Jpera.setVisible(true);
			}else {
				Jpera.setVisible(false);
			}
			
			if(uva.isSelected()) {
				Juva.setVisible(true);
			}else {
				Juva.setVisible(false);
			}
			
			if(melancia.isSelected()) {
				Jmelancia.setVisible(true);
			}else {
				Jmelancia.setVisible(false);
			}
			
		}
			});
			
		}
				
	public static void main(String args[]){
		 JFrame frame = new JFrame("Sacolão do zé Rodolfo");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().add(new InterfaceGráfica2());
		 frame.setBounds(100,10,1040,670);
		 frame.validate();
		 frame.setVisible(true);
	}
}
		
        
