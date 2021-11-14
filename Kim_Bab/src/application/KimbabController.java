package application;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class KimbabController implements Initializable {
	@FXML Button BtnCanselAction, Btn1_1P, Btn1_2P, Btn1_3P, Btn1_4P, Btn1_1M, Btn1_2M, Btn1_3M, Btn1_4, BtnOrder,
	Btn2_1P, Btn2_2P, Btn2_3P, Btn2_4P, Btn2_1M, Btn2_2M, Btn2_3M, Btn2_4;
	@FXML Label lblamount;
	@FXML TextArea txtOrder;
	 
	public int sum = 0;
	private String[]  orderm = {"µ·°¡¾²Á¤½Ä", "Á¦À°ººÀ½¹ä", "Â¥Àå¹ä", "±èÄ¡Âî°³", "ºÐ½ÄÁ¤½Ä", "¼ø´ë", "¶±ººÀÌ", "¶ó¸éÁ¤½Ä"};
	private int[] count = new int[8];
	private int ct = 0;
	
	private AmountModel model = new AmountModel();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		for(int i = 0; i < 8; i++) { count[i]=0;}
		
	}
		
	public void menuAppend() {
		txtOrder.setText("");
		for(int i=0; i < 8; i++) {
			if(count[i] !=0) txtOrder.appendText(orderm[i] + " [" + count[i] + "]" + "\n");
		}
	}

		public void Btn1_1PAction(ActionEvent event) {
			count[0]++;
			menuAppend();
		}
		public void Btn1_2PAction(ActionEvent event) {
			count[1]++;
			menuAppend();
		}
		public void Btn1_3PAction(ActionEvent event) {
			count[2]++;
			menuAppend();
		}
		public void Btn1_4PAction(ActionEvent event) {
			count[3]++;
			menuAppend();
		}
		public void Btn2_1PAction(ActionEvent event) {
			count[4]++;
			menuAppend();
		}
		public void Btn2_2PAction(ActionEvent event) {
			count[5]++;
			menuAppend();
		}
		public void Btn2_3PAction(ActionEvent event) {
			count[6]++;
			menuAppend();
		}
		public void Btn2_4PAction(ActionEvent event) {
			count[7]++;
			menuAppend();
		}
	
		
		
		public void Btn1_1MAction(ActionEvent event) {
			if(count[0] > 0) count[0]--;
			else count[0] = 0;
			menuAppend();
		}
		public void Btn1_2MAction(ActionEvent event) {
			if(count[1] > 0) count[1]--;
			else count[1] = 0;
			menuAppend();
		}
		public void Btn1_3MAction(ActionEvent event) {
			if(count[2] > 0) count[2]--;
			else count[2] = 0;
			menuAppend();
		}
		public void Btn1_4MAction(ActionEvent event) {
			if(count[3] > 0) count[3]--;
			else count[3] = 0;
			menuAppend();
		}
		public void Btn2_1MAction(ActionEvent event) {
			if(count[4] > 0) count[4]--;
			else count[4] = 0;
			menuAppend();
		}
		public void Btn2_2MAction(ActionEvent event) {
			if(count[5] > 0) count[5]--;
			else count[5] = 0;
			menuAppend();
		}
		public void Btn2_3MAction(ActionEvent event) {
			if(count[6] > 0) count[6]--;
			else count[6] = 0;
			menuAppend();
		}
		public void Btn2_4MAction(ActionEvent event) {
			if(count[7] > 0) count[7]--;
			else count[7] = 0;
			menuAppend();
		}
		
		
		
		
		
		
		public void BtnOrderAction(ActionEvent event) {

			DecimalFormat df = new DecimalFormat("#,###");
			sum = model.asum(count);
			lblamount.setText(df.format(sum));;
			
			
		}
		public void BtnCanselAction(ActionEvent event) {
			for(int i=0; i < 8; i++) count[i] = 0;
			txtOrder.setText("");
			lblamount.setText("0");
		}



}
