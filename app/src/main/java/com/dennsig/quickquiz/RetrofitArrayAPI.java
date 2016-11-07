package com.dennsig.quickquiz;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by Dennis Gimbergsson on 2016-11-07.
 **/

public interface RetrofitArrayAPI {
    /*
     * Retrofit get annotation with our URL
     * And our method that will return us details of student.
    */
    @GET("quickquiz/index.json")
    Call<List<Student>> getStudentDetails();
}
