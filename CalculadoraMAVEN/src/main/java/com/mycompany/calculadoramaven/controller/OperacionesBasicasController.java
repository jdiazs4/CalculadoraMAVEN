/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadoramaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joan
 */
@RestController
public class OperacionesBasicasController {
    @GetMapping("/sumar")
    public int Sumar(@RequestParam int a,@RequestParam int b){
        return a+b;
    }
    
    @GetMapping("/multiplicar")
    public int Multiplicar(@RequestParam int a,@RequestParam int b){
        return a*b;
    }
    
    @GetMapping("/restar")
    public int Restar(@RequestParam int a,@RequestParam int b){
        return a-b;
    }
    
    @GetMapping("/dividir")
    public float Dividir(@RequestParam int a,@RequestParam int b){
        return a/b;
    }
}
