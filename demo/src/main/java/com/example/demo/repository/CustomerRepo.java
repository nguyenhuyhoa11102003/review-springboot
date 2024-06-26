package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Customer;
import com.example.demo.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

//    @Query("select c.orders from Customer c where c.cId=?1")
//    public List<Orders> getAllOrderByCid(Integer cId);

    public Customer findByEmail(String email);
}