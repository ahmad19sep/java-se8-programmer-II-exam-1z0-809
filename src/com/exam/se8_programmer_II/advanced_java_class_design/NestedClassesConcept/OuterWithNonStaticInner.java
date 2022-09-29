package com.exam.se8_programmer_II.advanced_java_class_design.NestedClassesConcept;

public class OuterWithNonStaticInner {
    private String name;
    private int totalIncome;
    private int totalExpenses;

    public class TotalIncome{
        private int salary;
        private int socialMediaProfit;
        private int farmsProfit;
        private int homeRent;
        private int carLoan;
        private int dailyExpenses;



        public void setHomeRent(int homeRent) {
            this.homeRent = homeRent;
        }


        public void setCarLoan(int carLoan) {
            this.carLoan = carLoan;
        }


        public void setDailyExpenses(int dailyExpenses) {
            this.dailyExpenses = dailyExpenses;
        }


        public void setSalary(int salary) {
            this.salary = salary;
        }



        public void setSocialMediaProfit(int socialMediaProfit) {
            this.socialMediaProfit = socialMediaProfit;
        }



        public void setFarmsProfit(int farmsProfit) {
            this.farmsProfit = farmsProfit;
        }
       public void personDetails() {
            totalIncome=farmsProfit+salary+socialMediaProfit;
           totalExpenses=homeRent+carLoan+(dailyExpenses*30);
        }



    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getTotalIncome() {
        return totalIncome;
    }



    public int getTotalExpenses() {
        return totalExpenses;
    }
    private int totalProfit(){
        return totalIncome-totalExpenses;
    }
    public String toString(){


    return "Total Profit of the month is ="+totalProfit();
    }







}

