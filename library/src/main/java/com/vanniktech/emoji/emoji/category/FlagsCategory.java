package com.vanniktech.emoji.emoji.category;

import android.support.annotation.DrawableRes;

import com.vanniktech.emoji.R;
import com.vanniktech.emoji.emoji.Emoji;
import com.vanniktech.emoji.emoji.EmojiCategory;

public class FlagsCategory implements EmojiCategory {

    private static final Emoji[] DATA = new Emoji[]{
            Emoji.fromCodePoints(0x1f1e6, 0x1f1e8),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1e9),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1eb),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1ee),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1f1),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1f4),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1f6),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1f8),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1f9),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1fa),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1fc),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1fd),
            Emoji.fromCodePoints(0x1f1e6, 0x1f1ff),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1e7),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1e9),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1eb),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1ed),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1ee),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1ef),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1f1),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1f3),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1f4),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1f6),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1f8),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1f9),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1fb),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1fc),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1fe),
            Emoji.fromCodePoints(0x1f1e7, 0x1f1ff),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1e8),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1e9),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1eb),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1ed),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1ee),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1f0),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1f1),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1f3),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1f4),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1f5),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1fa),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1fb),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1fc),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1fd),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1fe),
            Emoji.fromCodePoints(0x1f1e8, 0x1f1ff),
            Emoji.fromCodePoints(0x1f1e9, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1e9, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1e9, 0x1f1ef),
            Emoji.fromCodePoints(0x1f1e9, 0x1f1f0),
            Emoji.fromCodePoints(0x1f1e9, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1e9, 0x1f1f4),
            Emoji.fromCodePoints(0x1f1e9, 0x1f1ff),
            Emoji.fromCodePoints(0x1f1ea, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1ea, 0x1f1e8),
            Emoji.fromCodePoints(0x1f1ea, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1ea, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1ea, 0x1f1ed),
            Emoji.fromCodePoints(0x1f1ea, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1ea, 0x1f1f8),
            Emoji.fromCodePoints(0x1f1ea, 0x1f1f9),
            Emoji.fromCodePoints(0x1f1ea, 0x1f1fa),
            Emoji.fromCodePoints(0x1f1eb, 0x1f1ee),
            Emoji.fromCodePoints(0x1f1eb, 0x1f1ef),
            Emoji.fromCodePoints(0x1f1eb, 0x1f1f0),
            Emoji.fromCodePoints(0x1f1eb, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1eb, 0x1f1f4),
            Emoji.fromCodePoints(0x1f1eb, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1e7),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1e9),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1eb),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1ed),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1ee),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1f1),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1f3),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1f5),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1f6),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1f8),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1f9),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1fa),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1fc),
            Emoji.fromCodePoints(0x1f1ec, 0x1f1fe),
            Emoji.fromCodePoints(0x1f1ed, 0x1f1f0),
            Emoji.fromCodePoints(0x1f1ed, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1ed, 0x1f1f3),
            Emoji.fromCodePoints(0x1f1ed, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1ed, 0x1f1f9),
            Emoji.fromCodePoints(0x1f1ed, 0x1f1fa),
            Emoji.fromCodePoints(0x1f1ee, 0x1f1e8),
            Emoji.fromCodePoints(0x1f1ee, 0x1f1e9),
            Emoji.fromCodePoints(0x1f1ee, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1ee, 0x1f1f1),
            Emoji.fromCodePoints(0x1f1ee, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1ee, 0x1f1f3),
            Emoji.fromCodePoints(0x1f1ee, 0x1f1f4),
            Emoji.fromCodePoints(0x1f1ee, 0x1f1f6),
            Emoji.fromCodePoints(0x1f1ee, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1ee, 0x1f1f8),
            Emoji.fromCodePoints(0x1f1ee, 0x1f1f9),
            Emoji.fromCodePoints(0x1f1ef, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1ef, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1ef, 0x1f1f4),
            Emoji.fromCodePoints(0x1f1ef, 0x1f1f5),
            Emoji.fromCodePoints(0x1f1f0, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1f0, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1f0, 0x1f1ed),
            Emoji.fromCodePoints(0x1f1f0, 0x1f1ee),
            Emoji.fromCodePoints(0x1f1f0, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1f0, 0x1f1f3),
            Emoji.fromCodePoints(0x1f1f0, 0x1f1f5),
            Emoji.fromCodePoints(0x1f1f0, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1f0, 0x1f1fc),
            Emoji.fromCodePoints(0x1f1f0, 0x1f1fe),
            Emoji.fromCodePoints(0x1f1f0, 0x1f1ff),
            Emoji.fromCodePoints(0x1f1f1, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1f1, 0x1f1e7),
            Emoji.fromCodePoints(0x1f1f1, 0x1f1e8),
            Emoji.fromCodePoints(0x1f1f1, 0x1f1ee),
            Emoji.fromCodePoints(0x1f1f1, 0x1f1f0),
            Emoji.fromCodePoints(0x1f1f1, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1f1, 0x1f1f8),
            Emoji.fromCodePoints(0x1f1f1, 0x1f1f9),
            Emoji.fromCodePoints(0x1f1f1, 0x1f1fa),
            Emoji.fromCodePoints(0x1f1f1, 0x1f1fb),
            Emoji.fromCodePoints(0x1f1f1, 0x1f1fe),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1e8),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1e9),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1eb),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1ed),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1f0),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1f1),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1f3),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1f4),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1f5),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1f6),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1f8),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1f9),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1fa),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1fb),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1fc),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1fd),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1fe),
            Emoji.fromCodePoints(0x1f1f2, 0x1f1ff),
            Emoji.fromCodePoints(0x1f1f3, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1f3, 0x1f1e8),
            Emoji.fromCodePoints(0x1f1f3, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1f3, 0x1f1eb),
            Emoji.fromCodePoints(0x1f1f3, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1f3, 0x1f1ee),
            Emoji.fromCodePoints(0x1f1f3, 0x1f1f1),
            Emoji.fromCodePoints(0x1f1f3, 0x1f1f4),
            Emoji.fromCodePoints(0x1f1f3, 0x1f1f5),
            Emoji.fromCodePoints(0x1f1f3, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1f3, 0x1f1fa),
            Emoji.fromCodePoints(0x1f1f3, 0x1f1ff),
            Emoji.fromCodePoints(0x1f1f4, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1eb),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1ed),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1f0),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1f1),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1f3),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1f8),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1f9),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1fc),
            Emoji.fromCodePoints(0x1f1f5, 0x1f1fe),
            Emoji.fromCodePoints(0x1f1f6, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1f7, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1f7, 0x1f1f4),
            Emoji.fromCodePoints(0x1f1f7, 0x1f1f8),
            Emoji.fromCodePoints(0x1f1f7, 0x1f1fa),
            Emoji.fromCodePoints(0x1f1f7, 0x1f1fc),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1e7),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1e8),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1e9),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1ed),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1ee),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1ef),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1f0),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1f1),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1f3),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1f4),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1f8),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1f9),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1fb),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1fd),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1fe),
            Emoji.fromCodePoints(0x1f1f8, 0x1f1ff),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1e8),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1e9),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1eb),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1ed),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1ef),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1f0),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1f1),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1f3),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1f4),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1f7),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1f9),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1fb),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1fc),
            Emoji.fromCodePoints(0x1f1f9, 0x1f1ff),
            Emoji.fromCodePoints(0x1f1fa, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1fa, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1fa, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1fa, 0x1f1f8),
            Emoji.fromCodePoints(0x1f1fa, 0x1f1fe),
            Emoji.fromCodePoints(0x1f1fa, 0x1f1ff),
            Emoji.fromCodePoints(0x1f1fb, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1fb, 0x1f1e8),
            Emoji.fromCodePoints(0x1f1fb, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1fb, 0x1f1ec),
            Emoji.fromCodePoints(0x1f1fb, 0x1f1ee),
            Emoji.fromCodePoints(0x1f1fb, 0x1f1f3),
            Emoji.fromCodePoints(0x1f1fb, 0x1f1fa),
            Emoji.fromCodePoints(0x1f1fc, 0x1f1eb),
            Emoji.fromCodePoints(0x1f1fc, 0x1f1f8),
            Emoji.fromCodePoints(0x1f1fd, 0x1f1f0),
            Emoji.fromCodePoints(0x1f1fe, 0x1f1ea),
            Emoji.fromCodePoints(0x1f1fe, 0x1f1f9),
            Emoji.fromCodePoints(0x1f1ff, 0x1f1e6),
            Emoji.fromCodePoints(0x1f1ff, 0x1f1f2),
            Emoji.fromCodePoints(0x1f1ff, 0x1f1fc)
    };

    @Override
    public Emoji[] getData() {
        return DATA;
    }

    @Override
    @DrawableRes
    public int getIcon() {
        return R.drawable.emoji_category_flags;
    }
}
