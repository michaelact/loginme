package com.nightwolf.loginme.repository

import com.nightwolf.loginme.model.Course

object CourseRepository {
    val courses = listOf(
        Course(
            id = 1,
            title = "How to make modern poster for Beginner",
            instructor = "Nicole Tesla",
            price = 12000,
            rating = 4.5f,
            imageUrl = "https://picsum.photos/300/200",
            category = "Graphic Design"
        ),
        Course(
            id = 2,
            title = "Design system in easy way",
            instructor = "John Anderson",
            price = 23000,
            rating = 4.8f,
            imageUrl = "https://picsum.photos/300/201",
            category = "UX/UI Design"
        ),
        Course(
            id = 3,
            title = "Master Digital Illustration",
            instructor = "Sarah Parker",
            price = 33000,
            rating = 4.6f,
            imageUrl = "https://picsum.photos/300/202",
            category = "Illustration"
        )
    )

    val categories = listOf(
        "DATABASE SYSTEM",
        "MOBILE PROGRAMMING",
        "CLOUD COMPUTING"
    )
}
