package com.zyh.java.fun;

/**
 * 执行代码的并返回结果的函数式接口
 * @author zhaoyinghao
 * @date 2022-01-06
 */
@FunctionalInterface
public interface ExecReturnFunction <T> {

    T exec( );

}

