package com.youngback.portfolio.presentation.dto

import com.youngback.portfolio.domain.entity.Achievement
import com.youngback.portfolio.domain.entity.Experience
import com.youngback.portfolio.domain.entity.Skill
import java.time.format.DateTimeFormatter

class ResumeDTO(
    experiences: List<Experience>,
    achievements: List<Achievement>,
    skills: List<Skill>
) {
    var experience : List<ExperienceDTO> = experiences.map { experiences  ->
        ExperienceDTO(
            title = experiences.title,
            description = experiences.description,
            startYearMonth = "${experiences.startYear}.${experiences.startMonth}" ,
            endYearMonth = experiences.getEndYearMonth(),
            details = experiences.details.map { detail -> detail.content }
        )
    }

    var achievements: List<AchievementDTO> = achievements.map { achievement ->
        AchievementDTO(
            title = achievement.title,
            description = achievement.description,
            host = achievement.host,
            achievedDate = achievement.achievedDate
                ?.format(DateTimeFormatter.ISO_LOCAL_DATE)
                ?.replace("-", ".")
        )
    }

        var skills: List<SkillDTO> = skills.map { skill -> SkillDTO(skill) }
}