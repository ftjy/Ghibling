package com.mine.ghibling.utils;

import java.util.Locale;

public class ProjectConstants {
    // FIXME : Customize project constants for your application.

    public static final String DEFAULT_ENCODING = "UTF-8";

    public static final String PROJECT_BASE_PACKAGE = "com.mine.ghibling";

    public static final Locale SINGAPORE_ENGLISH_LOCALE = new Locale.Builder().setLanguage("en").setRegion("SG").build();

    private ProjectConstants() {

        throw new UnsupportedOperationException();
    }
}
