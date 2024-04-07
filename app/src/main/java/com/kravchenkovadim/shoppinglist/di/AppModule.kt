package com.kravchenkovadim.shoppinglist.di

import android.app.Application
import androidx.room.Room
import com.kravchenkovadim.shoppinglist.data.AddItemRepoImpl
import com.kravchenkovadim.shoppinglist.data.AddItemRepository
import com.kravchenkovadim.shoppinglist.data.MainDb
import com.kravchenkovadim.shoppinglist.data.NoteRepoImpl
import com.kravchenkovadim.shoppinglist.data.NoteRepository
import com.kravchenkovadim.shoppinglist.data.ShoppingListRepoImp
import com.kravchenkovadim.shoppinglist.data.ShoppingListRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
        @Provides
        @Singleton
        fun provideMainDb(app: Application): MainDb{
            return Room.databaseBuilder(
                app,
                MainDb::class.java,
                "shop_list_db"
            ).build()
        }

    @Provides
    @Singleton
    fun provideShopRepo(db : MainDb) : ShoppingListRepository{
        return ShoppingListRepoImp(db.shoppingListDao)
    }

    @Provides
    @Singleton
    fun provideAddItemRepo(db : MainDb) : AddItemRepository{
        return AddItemRepoImpl(db.addItemDao)
    }

    @Provides
    @Singleton
    fun provideNoteRepo(db : MainDb) : NoteRepository {
        return NoteRepoImpl(db.noteDao)
    }
}