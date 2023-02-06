package com.soul.monitor.controller.unity;

import com.egova.model.PageResult;
import com.egova.model.QueryModel;
import com.egova.web.annotation.Api;
import com.soul.monitor.condition.NoticeCondition;
import com.soul.monitor.entity.Notice;
import com.soul.monitor.service.NoticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Song
 * @Date 2023/2/6 14:56
 */
@Slf4j
@RestController
@RequestMapping("/unity/notice")
@RequiredArgsConstructor
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @Api
    @PostMapping("/page")
    public PageResult<Notice> getPageNotice(@RequestBody QueryModel<NoticeCondition> queryModel){
        return noticeService.getPage(queryModel);
    }

    @Api
    @GetMapping("/{id}")
    public List<Notice> getNoticeById(@PathVariable String id){
        return noticeService.getNoticeById(id);
    }

    @Api
    @PostMapping
    public String insert(@RequestBody Notice entity){
        return noticeService.insert(entity);
    }

    @Api
    @PutMapping
    public void update(@RequestBody Notice entity){
        noticeService.update(entity);
    }

    @Api
    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable String id){
        return noticeService.deleteById(id);
    }

}
