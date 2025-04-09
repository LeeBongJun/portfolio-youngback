package com.bongjun.portfolio

import com.bongjun.portfolio.domain.constant.SkillType
import com.bongjun.portfolio.domain.entity.*
import com.bongjun.portfolio.domain.repository.*
import jakarta.annotation.PostConstruct
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
@Profile(value = ["default"])
class DataInitializer(
    private val achievementRepository: AchievementRepository,
    private val introductionRepository: IntroductionRepository,
    private val linkRepository: LinkRepository,
    private val skillRepository: SkillRepository,
    private val projectRepository: ProjectRepository,
    private val experienceRepository: ExperienceRepository
) {
    var log = LoggerFactory.getLogger(DataInitializer::class.java)

    @PostConstruct
    fun initializeData() {
        log.info("스프링이 실행되었습니다. 데스트 데이터를 초기화 합니다.")

        // achievement 초기화
        val achievements = mutableListOf<Achievement>(
            Achievement(
                title = "제 6회 벤처창업 아이템 경진대회" ,
                description = "벤처창업 아이템 경진대회" ,
                host =  "폴리텍" ,
                achievedDate = LocalDate.of(2022, 7, 1),
                isActive = true
            )
        )
        achievementRepository.saveAll(achievements)

        // introduction 초기화
        val introductions = mutableListOf<Introduction>(
            Introduction(content = "주도적으로 문제를 찾고, 해결하는 이봉준입니다.", isActive = true),
            Introduction(content = "기술을 위한 기술이 아닌, 비즈니스 문제를 풀기 위한 기술을 추구합니다." , isActive = true),
            Introduction(content = "기존 소스를 리팩토링하여 더 좋은 구조롤 개선하는 작업을 좋아합니다." , isActive = true)
        )
        introductionRepository.saveAll(introductions)

        // link 초기화
        val links = mutableListOf<Link>(
            Link(name = "Github", content = "https://github.com/LeeBongJun", isActive = true)
        )
        linkRepository.saveAll(links)

        // experience / experience_detail 초기화
        val experience1 = Experience(
            title = "부산폴리텍대학교",
            description = "컴퓨터공학 전공",
            startYear = 2022,
            startMonth = 3,
            endYear = 2024,
            endMonth = 2,
            isActive = true,
        )
        experience1.addDetails(
            mutableListOf(
                ExperienceDetail(content = "GPA 4.3/4.5", isActive = true),
            )
        )

        val experience2 = Experience(
            title = "(주)복산나이스",
            description = "개발직",
            startYear = 2024,
            startMonth = 3,
            endYear = 2024,
            endMonth = 11,
            isActive = true,
        )
        experience2.addDetails(
            mutableListOf(
                ExperienceDetail(content = "ERP 개발", isActive = true)
            )
        )
        experienceRepository.saveAll(mutableListOf(experience1, experience2))

        // skill 초기화
        val java = Skill(name = "Java", type = SkillType.LANGUAGE.name, isActive = true)
        val C = Skill(name = "C#", type = SkillType.LANGUAGE.name, isActive = true)
        val kotlin = Skill(name = "Kotlin", type = SkillType.LANGUAGE.name, isActive = true)
        val nodejs = Skill(name = "NodeJS", type = SkillType.LANGUAGE.name, isActive = true)
        val spring = Skill(name = "Spring", type = SkillType.FRAMEWORK.name, isActive = true)
        val restjs = Skill(name = "RestJS", type = SkillType.FRAMEWORK.name, isActive = true)
        val mysql = Skill(name = "MySQL", type = SkillType.DATABASE.name, isActive = true)
        val oracle = Skill(name = "Oracle", type = SkillType.DATABASE.name, isActive = true)
        skillRepository.saveAll(mutableListOf(java, C, kotlin, nodejs, restjs,  spring, mysql, oracle))
    }
}