package com.github.hofls.ehcache.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@CacheConfig(cacheNames = {"cache-rep-example"})
public class CacheableRepository {

    @Autowired
    ExternalService externalService;

    public void setExternalService(ExternalService externalService) {
        this.externalService = externalService;
    }

    @Cacheable(key = "{#root.methodName}")
    public List<String> getCachedList() {
        return externalService.getList();
    }

    @Cacheable(key = "{#root.methodName, #specialId}")
    public List<String> getCachedListBy(Long specialId) {
        return externalService.getListBy(specialId);
    }


}
