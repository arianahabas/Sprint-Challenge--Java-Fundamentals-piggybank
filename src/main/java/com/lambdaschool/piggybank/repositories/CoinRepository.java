package com.lambdaschool.piggybank.repositories;

import com.lambdaschool.piggybank.model.Coin;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends CrudRepository<Coin, Long> {

}
