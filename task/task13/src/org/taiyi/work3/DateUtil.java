package org.taiyi.work3;

import java.util.Calendar;

/**
 * @description:
 * @author: taiyi
 * @date: 2023-10-30 21:53
 */
public class DateUtil {

    private static final Calendar calendar = Calendar.getInstance();

    public static int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    public static int getMonth() {
        // 从 0 开始
        return calendar.get(Calendar.MONTH) + 1;
    }

}
