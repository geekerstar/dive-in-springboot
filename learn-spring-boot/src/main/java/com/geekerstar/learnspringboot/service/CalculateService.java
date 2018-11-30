package com.geekerstar.learnspringboot.service;

/**
 * 计算服务
 */
public interface CalculateService {
    /**
     * 从多个整数sum求和
     * @param values多个整数
     * @return sum累加值
     */
    Integer sum(Integer... values);
}
