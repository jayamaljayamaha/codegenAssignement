package com.codegen.repositaries;

import com.codegen.dataModels.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface hotelRepositary extends CrudRepository <Hotel,Integer> {


}
