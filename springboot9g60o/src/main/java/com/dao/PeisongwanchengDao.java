package com.dao;

import com.entity.PeisongwanchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeisongwanchengVO;
import com.entity.view.PeisongwanchengView;


/**
 * 配送完成
 * 
 * @author 
 * @email 
 * @date 2022-04-16 17:23:54
 */
public interface PeisongwanchengDao extends BaseMapper<PeisongwanchengEntity> {
	
	List<PeisongwanchengVO> selectListVO(@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);
	
	PeisongwanchengVO selectVO(@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);
	
	List<PeisongwanchengView> selectListView(@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);

	List<PeisongwanchengView> selectListView(Pagination page,@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);
	
	PeisongwanchengView selectView(@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);
	

}
