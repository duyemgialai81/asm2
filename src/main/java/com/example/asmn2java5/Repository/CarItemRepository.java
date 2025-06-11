package com.example.asmn2java5.Repository;

import com.example.asmn2java5.Entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarItemRepository extends JpaRepository<CartItem,Integer> {
}
