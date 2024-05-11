package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PeisongwanchengDao;
import com.entity.PeisongwanchengEntity;
import com.service.PeisongwanchengService;
import com.entity.vo.PeisongwanchengVO;
import com.entity.view.PeisongwanchengView;

@Service("peisongwanchengService")
public class PeisongwanchengServiceImpl extends ServiceImpl<PeisongwanchengDao, PeisongwanchengEntity> implements PeisongwanchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeisongwanchengEntity> page = this.selectPage(
                new Query<PeisongwanchengEntity>(params).getPage(),
                new EntityWrapper<PeisongwanchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeisongwanchengEntity> wrapper) {
		  Page<PeisongwanchengView> page =new Query<PeisongwanchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeisongwanchengVO> selectListVO(Wrapper<PeisongwanchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeisongwanchengVO selectVO(Wrapper<PeisongwanchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeisongwanchengView> selectListView(Wrapper<PeisongwanchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeisongwanchengView selectView(Wrapper<PeisongwanchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
