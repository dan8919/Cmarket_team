package kr.co.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.domain.DepartDTO;
import kr.co.persistence.DpartDAO;
@Service
public class DepartServiceimpl implements DepartService{

	@Inject
	private DpartDAO dpartdao;
	
	
	/*
	 * @Override public void insert(DepartDTO dto) {
	 * 
	 * dpartdao.insert(dto); }
	 */



}
