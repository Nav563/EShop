package com.example.eshop.di

import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


//@Module
//@InstallIn(SingletonComponent::class)
//object AppModule {
//
//    @Singleton
//    @Provides
//    fun provideFirestore(): FirebaseFirestore {
//        return FirebaseFirestore.getInstance()
//    }

//    @Singleton
//    @Provides
//    @ViewModelKeySet
//    fun provideViewModelKeySet(): Set<String> {
//        return setOf()
//    }
//}