package com.example.firebase_exercise.data

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
class User(var name: String = "", var age: String = "", var email: String = "")