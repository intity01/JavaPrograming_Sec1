import javax.swing.*;
public class EX_2 {

	public static void main(String[] args) {
		double weight = Double.parseDouble
				(JOptionPane.showInputDialog("Input weight"));
		
		double height = Double.parseDouble
				(JOptionPane.showInputDialog("Input height"))/* [/100] */;
		
		height = height / 100;
		
		double BMI = weight/(height*height);
		String bmiCategory;
		if (BMI<18.5) bmiCategory = "Underweight";
		else if (BMI<25) bmiCategory = "Normal-weight";
		else if (BMI<30) bmiCategory = "Overweight";
		else bmiCategory = "Obesity";
		
		JOptionPane.showMessageDialog(null, "BMI = "
				+ String.format("%.1f",BMI) + "\nYou're "+ bmiCategory,"BMI",JOptionPane.WARNING_MESSAGE);
		/*if(BMI < 18.5) {
			JOptionPane.showMessageDialog(null, "BMI = "
					+ BMI + "AMD" + JOptionPane.WARNING_MESSAGE );
		}
		else if(BMI <=24.9) {
			JOptionPane.showMessageDialog(null, "BMI = "
					+ BMI );
		}
		else if(BMI <=29.9) {
			JOptionPane.showMessageDialog(null, "BMI = "
					+ BMI);
		}	
		else if(BMI >30) {
				JOptionPane.showMessageDialog(null, "BMI = "
						+ BMI + "intel"+ JOptionPane.WARNING_MESSAGE);	
		}*/
	}

}
