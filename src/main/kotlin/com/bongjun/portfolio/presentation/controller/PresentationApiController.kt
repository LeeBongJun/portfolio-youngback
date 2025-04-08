package com.bongjun.portfolio.presentation.controller

import com.bongjun.portfolio.presentation.dto.IntroductionDTO
import com.bongjun.portfolio.presentation.dto.LinkDTO
import com.bongjun.portfolio.presentation.dto.ProjectDTO
import com.bongjun.portfolio.presentation.dto.ResumeDTO
import com.bongjun.portfolio.presentation.service.PresentationService
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import kotlin.coroutines.RestrictsSuspension

@RestController
@RequestMapping("/api")
class PresentationApiController(
    private val presentationService: PresentationService
) {

    @GetMapping("/test")
    fun test(): String {
        return "OK"
    }

    @GetMapping("/v1/introductions")
    fun getLinks(): List<LinkDTO> {
        return presentationService.getLinks()
    }

    @GetMapping("/v1/links")
    fun getIntroductions(): List<IntroductionDTO> {
        return presentationService.getIntroductions()
    }

    @GetMapping("/v1/resume")
    fun getResume(): ResumeDTO {
        return presentationService.getResume()
    }

    @GetMapping("/v1/projects")
    fun getProjects(): List<ProjectDTO> {
        return presentationService.getProjects()
    }

}