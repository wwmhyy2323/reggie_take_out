package com.mikasa.service.impl;
/*
 * @  Author  mikasa
 * @  Date  2022/11/24 15:37
 * @  Version 1.0
 */


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mikasa.mapper.EmployeeMapper;
import com.mikasa.pojo.Employee;
import com.mikasa.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService{

}
