package com.github.lit.util;

import java.util.UUID;

/**
 * User : liulu
 * Date : 2017-3-6 20:33
 * version $Id: UUIDUtils.java, v 0.1 Exp $
 */
public class UUIDUtils {

    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-","");
    }

}
