package com.example.gpa_cal;

public class Gpa_Calc_Supper {
    double cumPA;
    int cumCredit;

    Gpa_Calc_Supper() {

    }

    Gpa_Calc_Supper(double cumPA, double cumCredit) {
        cumPA = cumPA;
        cumCredit = (int)cumCredit;

    }

    public Double calculation(Array<String> results, Array<double> credits) {
      double val;
      for (int i = 0; i< results.size(); i++) {
        if (results[i].equals("A+")) {
            val = credits[i] * 4.3;
        } else if (results[i].equals("A")) {
            val = credits[i] * 4.0;
        } else if (results[i].equals("A-")) {
            val = credits[i] * 3.7;
        } else if (results[i].equals("B+")) {
            val = credits[i] * 3.3;
        } else if (results[i].equals("B")) {
            val = credits[i] * 3.0;
        } else if (results[i].equals("B-")) {
            val = credits[i] * 2.7;
        } else if (results[i].equals("C+")) {
            val = credits[i] * 2.3;
        } else if (results[i].equals("C")) {
            val = credits[i] * 2.0;
        } else if (results[i].equals("C-")) {
            val = credits[i] * 1.7;
        } else if (results[i].equals("D+")) {
            val = credits[i] * 1.3;
        } else if (results[i].equals("D")) {
            val = credits[i] * 1.0;
        } else if (results[i].equals("D-")) {
            val = credits[i] * 0.7;
        } else {
            val = credits[i] * 0.0;
        }
        cumPA += val;
        if (val > 0.0)
          cumCredit += (int)credits[i];
      }
      return cumPA / cumCredit;
    }

    public Double ADD_ONE(String result, double credit) {
      double val = 0.0;
      if (result.equals("A+")) {
          val = credit * 4.3;
      } else if (result.equals("A")) {
          val = credit * 4.0;
      } else if (result.equals("A-")) {
          val = credit * 3.7;
      } else if (result.equals("B+")) {
          val = credit * 3.3;
      } else if (result.equals("B")) {
          val = credit * 3.0;
      } else if (result.equals("B-")) {
          val = credit * 2.7;
      } else if (result.equals("C+")) {
          val = credit * 2.3;
      } else if (result.equals("C")) {
          val = credit * 2.0;
      } else if (result].equals("C-")) {
          val = credit * 1.7;
      } else if (result.equals("D+")) {
          val = credit * 1.3;
      } else if (result.equals("D")) {
          val = credit * 1.0;
      } else if (result.equals("D-")) {
          val = credit * 0.7;
      } else {
          val = credit * 0.0;
      }
      cumPA += val;
      if (val > 0.0)
        cumCredit += (int)credit;

      return cumPA / cumCredit;
    }

    public Double ADD_ONE(double result, double credit) {
      double val = 0.0;
          val = credit * result;
      cumPA += val;
      if (val > 0.0)
        cumCredit += (int)credit;

      return cumPA / cumCredit;
    }

    public Double REMOVE_ONE(String result, double credit) {
      double val = 0.0;
      if (result.equals("A+")) {
          val = credit * 4.3;
      } else if (result.equals("A")) {
          val = credit * 4.0;
      } else if (result.equals("A-")) {
          val = credit * 3.7;
      } else if (result.equals("B+")) {
          val = credit * 3.3;
      } else if (result.equals("B")) {
          val = credit * 3.0;
      } else if (result.equals("B-")) {
          val = credit * 2.7;
      } else if (result.equals("C+")) {
          val = credit * 2.3;
      } else if (result.equals("C")) {
          val = credit * 2.0;
      } else if (result].equals("C-")) {
          val = credit * 1.7;
      } else if (result.equals("D+")) {
          val = credit * 1.3;
      } else if (result.equals("D")) {
          val = credit * 1.0;
      } else if (result.equals("D-")) {
          val = credit * 0.7;
      } else {
          val = credit * 0.0;
      }
      cumPA -= val;
      if (val > 0.0)
        cumCredit -= (int)credit;

      return cumPA / cumCredit;
    }

    public Double REMOVE_ONE(double result, double credit) {
      double val = 0.0;
          val = credit * result;
      cumPA -= val;
      if (val > 0.0)
        cumCredit -= (int)credit;

      return cumPA / cumCredit;
    }

    public Double getGPA () {
      return cumPA / cumCredit;      
    }
}
