package com.srms.services;

import com.srms.entity.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> getAllNotice ();

    Notice updateNotice (Notice notice);

    Notice saveNotice (Notice notice);

    void DeleteNotice (Long NoticeId);
}
