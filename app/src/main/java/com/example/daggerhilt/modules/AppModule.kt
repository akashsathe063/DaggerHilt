package com.example.daggerhilt.modules

import com.example.daggerhilt.iterface.DemoOnEImpl
import com.example.daggerhilt.iterface.DemoOne
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * whe we use the @Bind annotation then
 * we want to create a abstarct class
 */
@Module
@InstallIn(SingletonComponent::class)
 abstract class AppModule {
     @Binds
     @Singleton
   abstract fun getOneInterface(
         demoOnEImpl: DemoOnEImpl
     ):DemoOne
}