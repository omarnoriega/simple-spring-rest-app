package com.ceiba.springrest.api;
import com.ceiba.springrest.servicio.RespuestaServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class controller {

   RespuestaServicio respuestaServicio = new RespuestaServicio();

    private static Logger LOGGER = LoggerFactory.getLogger(controller.class);

    @GetMapping("/ping")
    ResponseEntity<Object> responder() {
        LOGGER.info("Country list fetched");
        return respuestaServicio.generateResponse(HttpStatus.OK, false, "Success", null);
    }

}
