package com.promineotech.jeep.service;

import java.util.List;
//import org.springframework.stereotype.Service;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
//import lombok.extern.slf4j.Slf4j;


//@Service

public interface JeepSalesService {

  //static List<Jeep> fetchJeeps(JeepModel model, String trim) {
  //log.info("The fetchJeeps method was called with model={} and trim={}",
  //    model, trim);
  
  List<Jeep> fetchJeeps(JeepModel model, String trim);
  //  return null;
  }


