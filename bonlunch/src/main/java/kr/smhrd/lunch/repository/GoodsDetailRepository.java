package kr.smhrd.lunch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.smhrd.lunch.entity.GoodsDetail;

@Repository
public interface GoodsDetailRepository extends JpaRepository<GoodsDetail, Integer>{

}
