package com.example.gpa_cal;

import java.util.ArrayList;

public class Analysis_Result_Count {
    public Float[] count(String result, Float result_cnt[]) {

      float[] ret_count = new float[];
      ret_count = result_nt[];
        if (result.equals("A+") || result.equals("A") || result.equals("A-"))
            ret_count[0] = ret_count[0] + 1;
        else if (result.equals("B+") || result.equals("B") || result.equals("B-"))
            ret_count[1] = ret_count[1] + 1;
        else if (result.equals("C+") || result.equals("C") || result.equals("C-"))
            ret_count[2] = ret_count[2] + 1;
        else if (result.equals("D+") || result.equals("D") || result.equals("D-"))
            ret_count[3] = ret_count[3] + 1;
        else if (result.equals("F"))
            ret_count[4] = ret_count[4] + 1;
        else
            ret_count[5] = ret_count[5] + 1;

        return ret_count;
    }

    public Float[] count_1(String Result, Float Result_cnt_1[]) {

        if (Result.equals("F")) {
            Result_cnt_1[2] = Result_cnt_1[2] + 1;
        } else if (Result.equals("D") | Result.equals("D-") | Result.equals("D+") | Result.equals("C-")) {
            Result_cnt_1[1] = Result_cnt_1[1] + 1;
        } else {
            Result_cnt_1[0] = Result_cnt_1[0] + 1;
        }
        return Result_cnt_1;
    }
}
