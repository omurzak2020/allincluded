package com.example.a2lesson3.remote;

import android.hardware.usb.UsbEndpoint;

import retrofit2.Call;
import retrofit2.http.GET;

public interface  GhibliApi {

    @GET(UsbEndpoint.GET_FILM)
    Call<>
}
