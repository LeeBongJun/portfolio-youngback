package com.youngback.portfolio.presentation.dto

import com.youngback.portfolio.domain.entity.Link

data class LinkDTO(
    val name: String,
    val content: String
) {

    constructor(link: Link) : this(
        name = link.name.lowercase(),
        content = link.content
    )


}