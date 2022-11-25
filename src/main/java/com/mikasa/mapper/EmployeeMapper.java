package com.mikasa.mapper;
/*
 * @  Author  mikasa
 * @  Date  2022/11/24 15:36
 * @  Version 1.0
 */


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mikasa.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
