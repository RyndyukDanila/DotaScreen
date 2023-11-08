package com.example.dotascreen.ui

import com.example.dotascreen.R
import com.example.dotascreen.domain.Comment
import com.example.dotascreen.domain.User

data class CommentUi constructor(
    val user: User,
    val comment: Comment
)

val comments = listOf(
    CommentUi(
        user = User(
            "Auguste Conte",
            R.drawable.avatar_1
        ),
        comment = Comment(
            "February 14, 2019",
            "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    ),
    CommentUi(
        user = User(
            "Jang Marcelino",
            R.drawable.avatar_2
        ),
        comment = Comment(
            "February 14, 2019",
            "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    ),
)