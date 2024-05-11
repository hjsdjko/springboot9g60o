package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.PeisongwanchengEntity;
import com.entity.view.PeisongwanchengView;

import com.service.PeisongwanchengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 配送完成
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-16 17:23:54
 */
@RestController
@RequestMapping("/peisongwancheng")
public class PeisongwanchengController {
    @Autowired
    private PeisongwanchengService peisongwanchengService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PeisongwanchengEntity peisongwancheng,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			peisongwancheng.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			peisongwancheng.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("peisongyuan")) {
			peisongwancheng.setPeisongyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PeisongwanchengEntity> ew = new EntityWrapper<PeisongwanchengEntity>();
		PageUtils page = peisongwanchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peisongwancheng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PeisongwanchengEntity peisongwancheng, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			peisongwancheng.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			peisongwancheng.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("peisongyuan")) {
			peisongwancheng.setPeisongyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PeisongwanchengEntity> ew = new EntityWrapper<PeisongwanchengEntity>();
		PageUtils page = peisongwanchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peisongwancheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PeisongwanchengEntity peisongwancheng){
       	EntityWrapper<PeisongwanchengEntity> ew = new EntityWrapper<PeisongwanchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( peisongwancheng, "peisongwancheng")); 
        return R.ok().put("data", peisongwanchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PeisongwanchengEntity peisongwancheng){
        EntityWrapper< PeisongwanchengEntity> ew = new EntityWrapper< PeisongwanchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( peisongwancheng, "peisongwancheng")); 
		PeisongwanchengView peisongwanchengView =  peisongwanchengService.selectView(ew);
		return R.ok("查询配送完成成功").put("data", peisongwanchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PeisongwanchengEntity peisongwancheng = peisongwanchengService.selectById(id);
        return R.ok().put("data", peisongwancheng);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PeisongwanchengEntity peisongwancheng = peisongwanchengService.selectById(id);
        return R.ok().put("data", peisongwancheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PeisongwanchengEntity peisongwancheng, HttpServletRequest request){
    	peisongwancheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peisongwancheng);
        peisongwanchengService.insert(peisongwancheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PeisongwanchengEntity peisongwancheng, HttpServletRequest request){
    	peisongwancheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peisongwancheng);
    	peisongwancheng.setUserid((Long)request.getSession().getAttribute("userId"));
        peisongwanchengService.insert(peisongwancheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PeisongwanchengEntity peisongwancheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(peisongwancheng);
        peisongwanchengService.updateById(peisongwancheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        peisongwanchengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<PeisongwanchengEntity> wrapper = new EntityWrapper<PeisongwanchengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			wrapper.eq("shangjiazhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("peisongyuan")) {
			wrapper.eq("peisongyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = peisongwanchengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
