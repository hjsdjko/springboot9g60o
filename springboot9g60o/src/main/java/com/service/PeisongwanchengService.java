package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeisongwanchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeisongwanchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeisongwanchengView;


/**
 * 配送完成
 *
 * @author 
 * @email 
 * @date 2022-04-16 17:23:54
 */
public interface PeisongwanchengService extends IService<PeisongwanchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeisongwanchengVO> selectListVO(Wrapper<PeisongwanchengEntity> wrapper);
   	
   	PeisongwanchengVO selectVO(@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);
   	
   	List<PeisongwanchengView> selectListView(Wrapper<PeisongwanchengEntity> wrapper);
   	
   	PeisongwanchengView selectView(@Param("ew") Wrapper<PeisongwanchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeisongwanchengEntity> wrapper);
   	

}

