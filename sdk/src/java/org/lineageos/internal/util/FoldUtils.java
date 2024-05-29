package org.lineageos.internal.util;

import java.lang.System;

public enum FoldVariant {
    VARIANT_FLAT,
    VARIANT_FLIP,
    VARIANT_FOLD;

    private static final String FOLD_VARIANT_SYSTEM_PROPERTY = "ro.lineageos.foldvariant"

    public static FoldVariant getFoldVariant {
        switch ((int) System.getProperty(FOLD_VARIANT_SYSTEM_PROPERTY)
                case 0:
                    return VARIANT_FLAT;
                case 1:
                    return VARIANT_FLIP;
                case 2: 
                    return VARIANT_FOLD;
    }
}
