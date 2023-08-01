package com.portofolio.mysimplecleanarchitecture.data

import com.portofolio.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) =
        MessageEntity("Hello $name! welcome to Clean Architecture")
}