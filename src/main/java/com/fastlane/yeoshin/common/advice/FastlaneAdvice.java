package com.fastlane.yeoshin.common.advice;

import com.fastlane.yeoshin.common.exception.FastlaneException;
import com.fastlane.yeoshin.common.entity.FastlaneExceptionEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class FastlaneAdvice {
    @ExceptionHandler({FastlaneException.class})
    public ResponseEntity<FastlaneExceptionEntity> exceptionHandler(HttpServletRequest request, FastlaneException e) {

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(FastlaneExceptionEntity.builder()
                        .errorCode(HttpStatus.CONFLICT.toString())
                        .errorMsg(e.getMessage())
                        .build());
    }
}
