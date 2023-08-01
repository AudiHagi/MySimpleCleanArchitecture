package com.portofolio.mysimplecleanarchitecture.data

import com.portofolio.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}