package com.education.common.exception.file;

import com.education.common.exception.base.BaseException;

/**
 * 文件信息异常类
 * 
 * @author education
 */
public class FileException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }

}
