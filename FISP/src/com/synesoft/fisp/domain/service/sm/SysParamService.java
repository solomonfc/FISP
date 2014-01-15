package com.synesoft.fisp.domain.service.sm;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.synesoft.fisp.domain.model.SysParam;

public interface SysParamService {

	public Page<SysParam> querySysParamPage(Pageable pageable);
	
	public SysParam querySysParam(SysParam sysParam);

	public int insertSysParam(SysParam sysParam);

	public int updateSysParam(SysParam sysParam);
	
	public int delSysParam(SysParam sysParam);

	public List<SysParam> querySysParamList();

	public Page<SysParam> querySysPrmList(Pageable pageable,
			SysParam sysParam);

	public int add(SysParam sysParam);

	public int queryGroupCode(SysParam sysParam);
}
