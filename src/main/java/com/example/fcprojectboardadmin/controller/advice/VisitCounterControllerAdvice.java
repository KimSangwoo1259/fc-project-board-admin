package com.example.fcprojectboardadmin.controller.advice;

import com.example.fcprojectboardadmin.service.VisitCounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@RequiredArgsConstructor
@ControllerAdvice
public class VisitCounterControllerAdvice {
    private final VisitCounterService visitCounterService;

    @ModelAttribute("visitCount")
    public Long visitCount() {
        return visitCounterService.visitCount();
    }
}
