package com.boventech.paginate;

import java.util.ArrayList;
import java.util.List;


public class PaginateSupportArray<E> extends ArrayList<E> implements PaginateSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int total;
	private int pageSize;
	private int page;
	
	
	public PaginateSupportArray(List<E> result) {
		super(result);
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotal() {
		return this.total;
	}

	
	public int getPageSize() {
		return this.pageSize;
	}

	
	public int getPage() {
		return this.page;
	}
	
	

}