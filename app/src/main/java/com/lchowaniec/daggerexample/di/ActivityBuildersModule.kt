package com.lchowaniec.daggerexample.di

import com.lchowaniec.daggerexample.AuthActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeAuthActivity(): AuthActivity



}