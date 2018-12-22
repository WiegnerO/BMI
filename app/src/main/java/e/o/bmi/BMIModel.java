package e.o.bmi;

import ca.roumani.i2c.Utility;

public class BMIModel {
    // attributes of the BMI Class
    private double weight;
    private double height;

    // constructor
    public BMIModel(String w, String h){
        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);
    }

    // Accesor method
    public String getBMI(){
        double index = this.weight/(this.height*this.height);
        String result = String.format("%.1f",index);
        return result;
    }

    //
    public String toPound(){
        double conversion = this.weight/0.454;
        String conversionResult = String.format("%.0f",conversion);
        return conversionResult;
    }

   public String toFeetInch(){
       double heightNumber = this.height;
       String heightConversion = Utility.m2FtInch(heightNumber);
       return heightConversion;
   }



    public static void main(String[] args) {
        BMIModel myModel = new BMIModel("100", "1.8");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("45", "1.35");
        System.out.println(myModel.getBMI());

        myModel = new BMIModel("100", "1.8");
        System.out.println("Your wieght is "+myModel.toPound()+"lbs, your height is "+myModel.toFeetInch()
                +",and your BMI is "+myModel.getBMI());


    }
}
