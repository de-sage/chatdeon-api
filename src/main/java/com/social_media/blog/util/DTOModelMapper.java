package com.social_media.blog.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.RequestResponseBodyMethodProcessor;

import javax.persistence.EntityManager;
import java.util.Collections;

public class DTOModelMapper extends RequestResponseBodyMethodProcessor {
    private static final ModelMapper modelMapper = new ModelMapper();

    private EntityManager entityManager;

    public DTOModelMapper(ObjectMapper objectMapper, EntityManager entityManager) {
        super(Collections.singletonList(new MappingJackson2CborHttpMessageConverter(objectMapper)));
        this.entityManager = entityManager;
    }
}
