package com.poly.utils;


import jakarta.servlet.http.HttpServletResponse;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

public class CookieUtils {
	public static Cookie add(String name, String value, int hours, HttpServletResponse response) {
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(hours * 60 * 60);
		cookie.setPath("/");
		response.addCookie(cookie);
		return cookie;
	}
	public static String get(String name, HttpServletRequest req) {
		Cookie[] cookies  = req.getCookies();
		if(cookies != null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equalsIgnoreCase(name)) {
					return cookie.getValue();
				}
			}
		}
		return "";
	}
}
