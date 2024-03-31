package com.szy.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szy.springbootinit.model.entity.Chart;
import com.szy.springbootinit.service.ChartService;
import com.szy.springbootinit.mapper.ChartMapper;
import org.springframework.stereotype.Service;

/**
* @author lenovo
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-03-27 19:03:24
*/
@Service
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart>
    implements ChartService{

}




