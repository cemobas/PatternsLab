package com.patlab.sp.main;

import com.patlab.sp.cf.ClientFilterService;

public class ServicesPortalMain {

	public static void main(String[] args) {
		String[] surnames = {"BAS", "BA", "BAS"};
		String id = "XX0111112";
		ClientFilterService.call(surnames, id);
	}
}
