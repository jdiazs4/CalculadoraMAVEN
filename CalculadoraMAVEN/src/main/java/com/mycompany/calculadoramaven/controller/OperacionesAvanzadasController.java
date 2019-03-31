/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoramaven.controller;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joan
 */
@RestController
public class OperacionesAvanzadasController {
    
    @GetMapping("/factorial")
    public double Factorial(@RequestParam double numero){
        if(numero>=0 && numero<=100){
            double test=1;
            for(double i=numero;i>1;i--){
                test = test *i;
            }
            return test;
        }else{
            return 0;
        }
    }
    
    @GetMapping("/potencia2")
    public double Potencia2(@RequestParam int a){
        return pow(a,2);
    }
    
    @GetMapping("/potencia")
    public double Potencia(@RequestParam int a,@RequestParam int b){
        return pow(a,b);
    }
    
    @GetMapping("/absoluto")
    public double Absoluto(@RequestParam double a){
        return abs(a);
    }
    
    @GetMapping("/raiz")
    public double Raiz(@RequestParam int a){
        return sqrt(a);
    }
}
