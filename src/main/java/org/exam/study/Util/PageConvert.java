package org.exam.study.Util;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PageConvert {

    public static Map<String, Integer> Pagination(Page<?> page) {
        int curPage = page.getNumber() + 1;
        int totPage = page.getTotalPages();
        int blockLimit = 5;

        Map<String, Integer> pageInfo = new HashMap<>();
        int startPage = Math.max(1, curPage-blockLimit/2);
        int endPage = Math.min(startPage + curPage - 1, totPage);
        int pervPage = Math.max(1, curPage-1);
        int nextPage = Math.min(curPage-1, totPage);
        int lastPage = totPage;

        //보낼값 map에 저장
        pageInfo.put("startPage" , startPage);
        pageInfo.put("endPage" , endPage);
        pageInfo.put("pervPage" , pervPage);
        pageInfo.put("nextPage" , nextPage);
        pageInfo.put("lastPage" , lastPage);
        pageInfo.put("currentPage" , curPage);

        return pageInfo;

    }

}
//프로그램 개발
//1. CRUD를 구현하도록 프로그램
//2. 기능적 추가작업 후반

