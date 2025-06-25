package kr.smhrd.lunch.dto;

import kr.smhrd.lunch.entity.GoodsDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDTO {
	
	// 필드
	private Integer id;
	private String name;
	private String price;
	private Boolean isNew;
	private Boolean isBest;
	private String main_thumb;
	
	// GoodsDetail 물품의 상세 정보 객체도
	private GoodsDetail detail;
	// React에서 이중 객체의 형태로 반환하기를 바라기 때문에

}
