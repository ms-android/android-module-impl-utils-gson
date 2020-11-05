package com.ms.module.impl.utils.gson;


import com.google.gson.Gson;
import com.ms.module.supers.inter.utils.IGsonUtilsAdapter;

import java.lang.reflect.Type;

public class GsonUtilsImpl extends IGsonUtilsAdapter {

    private Gson gson;

    public GsonUtilsImpl() {
        gson = new Gson();
    }

    @Override
    public String toJson(Object object) {
        return gson.toJson(object);
    }

    @Override
    public <T> T fromJson(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }

    @Override
    public <T> T fromJson(String json, Type typeOfT) {
        return gson.fromJson(json, typeOfT);
    }
}