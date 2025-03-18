package com.o0u0o.middleware.dynamic.thread.pool.sdk.registry;

import com.o0u0o.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * <h1>注册中心接口</h1>
 * 该接口作为一个策略，除了Redis之外可以扩展其他的实现
 * @author o0u0o
 * @description 注册中心接口
 * @create 2024-05-12 16:21
 */
public interface IRegistry {

    /**
     * <h2>线程池上报</h2>
     * @param threadPoolEntities 线程池实体
     */
    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    /**
     * <h2>线程池配置上报</h2>
     * @param threadPoolConfigEntity 线程池配置
     */
    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
