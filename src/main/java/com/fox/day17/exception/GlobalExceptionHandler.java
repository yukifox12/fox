package com.fox.day17.exception;

import com.fox.day17.vo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
   /*
   * 全局异常处理类 捕获所有异常
   * */
    @ExceptionHandler(Exception.class)
    public Result ex(Exception ex) {
        ex.printStackTrace();
        String message = ex.getMessage();
        return Result.error(message);
    }
}