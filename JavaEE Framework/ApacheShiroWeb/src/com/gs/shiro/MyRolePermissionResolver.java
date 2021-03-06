package com.gs.shiro;

import java.util.Collection;

import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.permission.RolePermissionResolver;

import com.gs.service.RolePermissionService;
import com.gs.service.RolePermissionServiceImpl;

public class MyRolePermissionResolver implements RolePermissionResolver{
	
		private RolePermissionService service = new RolePermissionServiceImpl();
		/**
		 * 用来返回某个角色所对应的所有权限字符串
		 */
	    @Override
	    public Collection<Permission> resolvePermissionsInRole(String roleName) {
	    	return service.queryAllPermissionByRoleName(roleName);
	    }
}
