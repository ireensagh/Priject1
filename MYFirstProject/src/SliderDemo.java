import  java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class SliderDemo implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo(){
		
		frame = new JFrame("slider demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,120,35);//the min,max,and starter numbers
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(5);
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setFont(new Font("MV Boli",Font.PLAIN,30));
		
		slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setText("C = "+ slider.getValue());
		
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		
		
		
		
	}
	
	
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		label.setText("C = "+ slider.getValue());
		System.out.println("C = "+slider.getValue());
		
	}
	
	

}