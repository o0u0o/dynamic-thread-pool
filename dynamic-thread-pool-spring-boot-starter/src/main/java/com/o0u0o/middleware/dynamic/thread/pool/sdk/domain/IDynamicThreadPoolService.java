package com.o0u0o.middleware.dynamic.thread.pool.sdk.domain;

import com.o0u0o.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * <h1>动态线程池服务</h1>
 * @author o0u0o
 * @description 动态线程池服务
 * @create 2024-05-12 16:04
 */
public interface IDynamicThreadPoolService {

    /**
     * <h2>查询线程池列表</h2>
     * @return List<ThreadPoolConfigEntity> 线程池配置列表
     */
    List<ThreadPoolConfigEntity> queryThreadPoolList();

    /**
     * <h2>根据线程池名称查询线程池配置</h2>
     * @param threadPoolName 线程池名称
     * @return ThreadPoolConfigEntity 线程池配置实体
     */
    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    /**
     * <h2>更新线程池配置</h2>
     * @param threadPoolConfigEntity 线程池配置实体
     */
    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);

}
