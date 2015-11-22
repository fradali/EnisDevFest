package com.enis;

import com.enis.data.Accommodation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ali on 22/11/15.
 */
public class PlaceResponseAccommodation {

        public enum Status {OK, ZERO_RESULTS, OVER_QUERY_LIMIT, REQUEST_DENIED, INVALID_REQUEST}

        public Status status;
        public String errorMessage;
        public List<Accommodation> places = new ArrayList<>();

    }


