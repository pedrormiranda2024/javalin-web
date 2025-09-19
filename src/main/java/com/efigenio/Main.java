package com.efigenio;

import com.efigenio.config.AppConfig;

import com.efigenio.routes.Rotas;

public class Main {

    public static void main(String[] args) {

        Rotas rotas = new Rotas();
        AppConfig appConfig = new AppConfig();

        rotas.registraRotas(appConfig.iniciaApp());

    }
}