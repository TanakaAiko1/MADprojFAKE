package com.MAD.domain.di

import org.koin.dsl.module

val domainModule = module {
    includes(useCaseModule)
}