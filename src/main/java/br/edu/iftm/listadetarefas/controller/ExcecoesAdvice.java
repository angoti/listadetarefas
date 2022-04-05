package br.edu.iftm.listadetarefas.controller;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcecoesAdvice {

    @ExceptionHandler
    ResponseEntity<String> idNaoExiste(EmptyResultDataAccessException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id inexistente");
    }  
    
    @ExceptionHandler
    ResponseEntity<String> formatoErrado(org.springframework.web.HttpMediaTypeNotSupportedException ex) {
        return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body("Formato errado");
    }
}
