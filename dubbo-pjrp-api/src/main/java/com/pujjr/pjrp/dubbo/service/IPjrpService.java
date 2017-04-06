package com.pujjr.pjrp.dubbo.service;

import com.pujjr.vo.PageVo;

public interface IPjrpService {
	public String selectCreditInfo(String tranCode, String timeBegin, String timeEnd);

	/**
	 * 查询催收记录(分页查询)
	 * @param timeBegin 起始时间
	 * @param timeEnd 终止时间
	 * @param pageNum 当前页
	 * @param pageSize 页码大小
	 * @return 查询结果对象
	 */
	public PageVo selectCreditInfo(String timeBegin, String timeEnd,String pageNum,String pageSize);
	/**
	 * 查询征信信息(excel导出)
	 * @param timeBegin
	 * @param timeEnd
	 * @return 文件osskey
	 */
	public String exportCreditInfo(String timeBegin, String timeEnd);
	
	/**
	 * 查询催收记录(分页查询)
	 * @param timeBegin 起始时间
	 * @param timeEnd 终止时间
	 * @param pageNum 当前页
	 * @param pageSize 页码大小
	 * @return 查询结果对象
	 */
	public PageVo selectCollectionLog(String timeBegin, String timeEnd,String pageNum,String pageSize);
	/**
	 * 查询催收记录(excel导出)
	 * @param timeBegin
	 * @param timeEnd
	 * @return 文件osskey
	 */
	public String exportCollectionLog(String timeBegin, String timeEnd);
	
	/**
	 * 查询逾期催收数据
	 * @param time
	 * @param pageNum
	 * @param pageSize
	 * @return 查询结果对象
	 */
	public PageVo selectOverdueCollection(String time,String pageNum,String pageSize);
	
	/**
	 * 导出逾期催收数据
	 * @param time
	 * @return 文件osskey
	 */
	public String exportOverdueCollection(String time);
}
