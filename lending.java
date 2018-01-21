public class URLA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PI = 5.0%, incomePI = 7.5%
		double contractAmount = 0, harzardInsurance = 0, tax = 0, 
				PI = 0, incomePI = 0, buildingMaintenance = 0;
		double loanAmount = contractAmount;
		double emd = contractAmount * 0.1, monthlyPayment = PI + harzardInsurance + tax + buildingMaintenance,
			   incomeMonthlyPayment = incomePI + harzardInsurance + tax + buildingMaintenance,
		       temp = 0, income = 0, deposit = 0, closingFee = loanAmount * 0.06;
		
		double[] liability = {475, 575};
		if(liability.length != 0){
			for(double x : liability){
				temp += x; 
			}
		}
		
		income = (incomeMonthlyPayment + temp) / 0.5;
		deposit = contractAmount - loanAmount + closingFee + (monthlyPayment * 3) - emd;
				
		System.out.println("Income is : " + income);
		System.out.println("Deposit amount is : " + deposit);
  
	}

}
