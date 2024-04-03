package com.dambu.dambu_store_backend.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.http.HttpStatus;

import java.util.Map;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;

@Data
@SuperBuilder
@JsonInclude(NON_DEFAULT)

public class HttpResponse {

    protected  String timeStamp;
    protected  int statusCode;
    protected  String message;
    protected HttpStatus status;
    protected Map<?,?> data;
}
