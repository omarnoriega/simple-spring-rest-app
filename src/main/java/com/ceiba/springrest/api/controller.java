package com.ceiba.springrest.api;
import com.ceiba.springrest.servicio.RespuestaServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

   RespuestaServicio respuestaServicio = new RespuestaServicio();

    private static Logger LOGGER = LoggerFactory.getLogger(controller.class);

    @GetMapping("/ping")
    ResponseEntity<Object> responder() {
        LOGGER.info("Servicio consultado");
        return respuestaServicio.generarRespuesta(HttpStatus.OK, false, "Success", null);
    }

}
