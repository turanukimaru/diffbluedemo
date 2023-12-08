package com.example.diffbluedemo.repo;

import com.example.diffbluedemo.entity.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<Dummy,Long> {
}
