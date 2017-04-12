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
	/**
	 * 查询台账(财务部 fdept：financial department)
	 * @param time
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageVo selectLedgerOfFdept(String time,String pageNum,String pageSize);
	/**
	 * 导出台账(财务部 )
	 * @param time
	 * @return
	 */
	public String exportLedgerOfFdept(String time);
	
	
	/**
	 * 查询入账记录(财务部 fdept：financial department)
	 * @param time
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageVo selectRecordLogOfFdept(String time,String pageNum,String pageSize);
	/**
	 * 导出入账记录(财务部 )
	 * @param time
	 * @return
	 */
	public String exportRecordLogOfFdept(String time);
	
	/**
	 * 查询进度表
	 * @param timeBegin
	 * @param timeEnd
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageVo selectProgress(String timeBegin, String timeEnd,String pageNum,String pageSize);

	/**
	 * 导出进度表
	 * @param timeBegin
	 * @param timeEnd
	 * @return
	 */
	public String exportProgress(String timeBegin, String timeEnd);
	
	/**
	 * 查询月放款数据
	 * @param time
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageVo selectMonthLoanData(String time,String pageNum,String pageSize);

	/**
	 * 导出月放款数据
	 * @param time
	 * @return
	 */
	public String exportMonthLoanData(String time);
}
