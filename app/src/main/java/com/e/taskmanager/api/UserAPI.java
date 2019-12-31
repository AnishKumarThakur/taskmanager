package com.e.taskmanager.api;

import com.e.taskmanager.model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserAPI {
    @POST("user/signup")
    Call<Signu> registerUser(@Body Users users);

    @FormUrlEncoded
    @POST("user/login")
    Call <SignUpResponse> checkUser(@Fie)
}
