package com.example.daggerhilt.modules

import com.example.daggerhilt.iterface.DemoTwo
import com.example.daggerhilt.iterface.DemoTwoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModel2 {
    @Provides
    @Singleton
    fun getDemoTwo():DemoTwo{
        return DemoTwoImpl()
    }
}