package com.classifieds.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classifieds.entity.PostEntity;
import com.classifieds.repository.PostRepository;
import com.classifieds.web.model.ResultInfo;

@Service
public class HomeApplianceService {

	@Autowired
	private PostRepository postRepository;

	public List<ResultInfo> fetchHomeApplianceResultforSubId(Integer subId) {
		
		List<ResultInfo> resultInfoList = new ArrayList<ResultInfo>();
		if(subId != null){
			buildResultInfoList(resultInfoList, postRepository.findAll());
		}else{
			return null;
		}
		return resultInfoList;
	}

	public void buildResultInfoList(List<ResultInfo> resultInfoList,
			List<PostEntity> resultEntityList) {

		for (PostEntity post : resultEntityList) {
			ResultInfo postInfo = new ResultInfo();

			postInfo.setDesc(post.getDesc());
			postInfo.setId(post.getId());
			postInfo.setLocation(post.getLocation());
			postInfo.setLocationId(post.getLocationId());
			postInfo.setPrice(post.getPrice());
			postInfo.setPrimaryImage(post.getPrimaryImage());
			postInfo.setSellerType(post.getSellerType());
			postInfo.setSubCategory(post.getSubCategory());
			postInfo.setTitle(post.getTitle());
			resultInfoList.add(postInfo);
		}
	}
}
