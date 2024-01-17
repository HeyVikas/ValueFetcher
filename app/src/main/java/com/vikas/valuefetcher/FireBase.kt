package com.vikas.valuefetcher

import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

class FireBase{
    val db = Firebase.firestore
    fun Send(Name: String){

        val x = hashMapOf(
            "name" to Name
        )

        db.collection("folder")
            .document("file")
            .set(x)

    }
}