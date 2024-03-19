package com.example.eshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.eshop.navigation.StartNavigation
import dagger.hilt.android.AndroidEntryPoint

//@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
              StartNavigation()
        }
    }
}
//val firebaseFirestore  =  FirebaseFirestore.getInstance()

//        shoesList.forEach {
//            firestore.collection("Shoes").document("${it.id}")
//                .set(it)
//                .addOnSuccessListener {
//                    Toast.makeText(this, "SUccess", Toast.LENGTH_SHORT).show()
//                }
//                .addOnFailureListener {
//                    Toast.makeText(this, "Failure", Toast.LENGTH_SHORT).show()
//
//                }
//        }