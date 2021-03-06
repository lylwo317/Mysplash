package com.wangdaye.mysplash.about.model;

import com.wangdaye.mysplash._common.i.model.AboutModel;

/**
 * Library object.
 * */

public class LibraryObject
        implements AboutModel {
    // data
    public int type = AboutModel.TYPE_LIBRARY;
    public String title;
    public String subtitle;
    public String uri;

    /** <br> life cycle. */

    public LibraryObject(String title, String subtitle, String uri) {
        this.title = title;
        this.subtitle = subtitle;
        this.uri = uri;
    }

    /** <br> model. */

    @Override
    public int getType() {
        return type;
    }
}
