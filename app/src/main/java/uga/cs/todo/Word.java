package uga.cs.todo;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
@Entity(tableName = "word_table")

public class Word{


    @PrimaryKey
    @NonNull
    @ColumnInfo(name="word")
    private String mWord;
    public Word(@NonNull String word) {this.mWord = word;}










    public String getWord(){Object word = new Word("DongYu");
    System.out.print(Word.class == word.getClass());return this.mWord;}







}
