package kr.smhrd.lunch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.smhrd.lunch.dto.GoodsDTO;
import kr.smhrd.lunch.entity.Goods;
import kr.smhrd.lunch.service.GoodsService;

//@CrossOrigin(origins = "http://localhost:5173")
@CrossOrigin(origins = "http://13.124.111.115:5173")
@RestController
@RequestMapping("/api")
public class GoodsController {
	
	@Autowired
	GoodsService goodsService;
	
	@GetMapping("/goods_list/{id}")
	public GoodsDTO getGoodsDetail(@PathVariable("id") int id) {
		System.out.println("전달받은 id : " + id);
		
		GoodsDTO goodsDetail = goodsService.getGoodsDetail(id);
		
		
		return goodsDetail;
	}
	
	@GetMapping("/goods_list")
	public List<GoodsDTO> getGoodsList() {
		System.out.println("[list 출력 컨트롤러]");
		
		// 2Step -> Service -> Repository 결과물 가지고 오는 작업
		// -> Service 클래스 불러오기!!
		
		// 전달받은 데이터 보내기
		List<GoodsDTO> list = goodsService.getGoodsList(); // -?
		
		System.out.println("[list 전체 목록]" + list);
		
		
		return list;
		
	}
}
