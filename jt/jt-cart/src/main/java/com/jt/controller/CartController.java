package com.jt.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.jt.pojo.Cart;
import com.jt.service.DubboCartService;

@Controller
@RequestMapping("/cart")
public class CartController {
	@Reference(timeout=3000)
	private DubboCartService cartService;
	/**
	 * 1.根据用户信息获取购物车列表数据
	 */
	@RequestMapping("/show")
	public String show(Model model) {
	
		return "cart";
	}
}
