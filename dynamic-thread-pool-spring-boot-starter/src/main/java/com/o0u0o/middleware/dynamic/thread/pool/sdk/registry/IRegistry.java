package com.o0u0o.middleware.dynamic.thread.pool.sdk.registry;

import com.o0u0o.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @author o0u0o
 * @description 注册中心接口
 * @create 2024-05-12 16:21
 */
public interface IRegistry {

    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}
