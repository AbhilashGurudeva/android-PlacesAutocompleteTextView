package com.seatgeek.placesautocomplete;

import android.support.annotation.NonNull;

import com.seatgeek.placesautocomplete.model.Place;

public interface OnPlaceSelectedListener {
    void onPlaceSelected(@NonNull Place place);
}
