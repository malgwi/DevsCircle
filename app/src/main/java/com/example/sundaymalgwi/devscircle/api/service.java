package com.example.sundaymalgwi.devscircle.api;

import com.example.sundaymalgwi.devscircle.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sundaymalgwi on 15/09/2017.
 */

public interface service {
    @GET("/search/users?q=language:java+location:lagos")
    Call<ItemResponse> getItems();
}
