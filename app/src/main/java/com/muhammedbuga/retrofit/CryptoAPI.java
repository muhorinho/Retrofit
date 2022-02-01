package com.muhammedbuga.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    @GET("prices?key=da7c6c81dcc2f621001731eacab3a0b9c2a38a72")
    Call<List<CryptoModel>> getData();
}
