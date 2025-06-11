package com.example.asmn2java5.Repository;

import com.example.asmn2java5.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdersRepository extends JpaRepository<Orders,Integer> {
}
