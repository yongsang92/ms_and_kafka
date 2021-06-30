package com.example.demo.Repo;

import com.example.demo.Entity.Store;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepo extends JpaRepository<Store,Long> {
    
}
