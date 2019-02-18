package com.offical.website.srv.upload;

import java.io.InputStream;

public interface FileUploadService {

	/**
	 * 上传至腾讯云存储
	 * 
	 * @param srcFile     源文件
	 * @param contentType 文件类型
	 * @param srcFileName 文件名
	 * @param nfsType     文件分类
	 * @return
	 * @throws Exception
	 */
	String copy(InputStream input, String contentType, String srcFileName, int nfsType,String prefix) throws Exception;

	/**
	 * 上聊天资源
	 * 
	 * @param input
	 * @param contentType
	 * @param srcFileName
	 * @return
	 * @throws Exception
	 */
	String copy2Chat(InputStream input, String contentType, String srcFileName) throws Exception;

	/**
	 * 上传头像
	 * 
	 * @param input
	 * @param contentType
	 * @param srcFileName
	 * @return
	 * @throws Exception
	 */
	String copy2Avatar(InputStream input, String contentType, String srcFileName) throws Exception;
	
	/**
	 * 上传apk
	 * 
	 * @param input
	 * @param contentType
	 * @param srcFileName
	 * @return
	 * @throws Exception
	 */
	String copy2Apk(InputStream input, String contentType, String srcFileName,String pefix) throws Exception;
}
