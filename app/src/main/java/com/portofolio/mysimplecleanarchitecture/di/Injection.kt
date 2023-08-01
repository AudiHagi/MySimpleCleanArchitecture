package com.portofolio.mysimplecleanarchitecture.di

import com.portofolio.mysimplecleanarchitecture.data.IMessageDataSource
import com.portofolio.mysimplecleanarchitecture.data.MessageDataSource
import com.portofolio.mysimplecleanarchitecture.data.MessageRepository
import com.portofolio.mysimplecleanarchitecture.domain.IMessageRepository
import com.portofolio.mysimplecleanarchitecture.domain.MessageInteractor
import com.portofolio.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}