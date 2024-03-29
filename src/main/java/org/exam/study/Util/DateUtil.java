package org.exam.study.Util;


// 날짜를 다양한 모양으로 처리

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Component
public class DateUtil {

    public String formatDate(LocalDateTime modDate) {
        LocalDateTime now = LocalDateTime.now();
        long minutes = ChronoUnit.MINUTES.between(modDate, now);
        long hour = ChronoUnit.HOURS.between(modDate, now);
        long days = ChronoUnit.DAYS.between(modDate, now);
        long months = ChronoUnit.MONTHS.between(modDate, now);
        long years = ChronoUnit.YEARS.between(modDate, now);

        if(minutes<60) {
            return minutes +"분전 등록";
        } else if(hour < 24) {
            return hour + "시간전 등록";
        } else if(days < 31) {
            return days + "일전 등록";
        } else if(months < 12) {
            return months + "달전 등록";
        } else {
            return years + "년전 등록";
        }

    }

}
