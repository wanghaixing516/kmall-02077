package com.kgc.kmall.manager.service;

import com.kgc.kmall.bean.PmsBaseCatalog1;
import com.kgc.kmall.manager.mapepr.PmsBaseCatalog1Mapper;
import com.kgc.kmall.manager.mapepr.PmsBaseCatalog2Mapper;
import com.kgc.kmall.manager.mapepr.PmsBaseCatalog3Mapper;
import com.kgc.kmall.service.CatalogService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
@Service
public class CatalogServiceImpl implements CatalogService {
    @Resource
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Resource
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Resource
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;
/*
* 一级查询
* */
    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1>pmsBaseCatalog1s=pmsBaseCatalog1Mapper.selectByExample(null);
        return pmsBaseCatalog1s;
    }
}
