package com.srms.services.serviceImpl;

import com.srms.entity.Notice;
import com.srms.repository.NoticeRepository;
import com.srms.services.NoticeService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
   @Autowired
    private NoticeRepository noticeRepository;

    @Override
    public List<Notice> getAllNotice() {
        return noticeRepository.findAll();
    }

    @Override
    public Notice saveNotice(Notice notice) {
        notice.setCreatedAt(LocalDateTime.now());
        return noticeRepository.save(notice);
    }

    @Override
    public void DeleteNotice(Long noticeId) {
        if (!noticeRepository.existsById(noticeId)){
            throw new RuntimeException("Notice id is not present "+noticeId);
        }
        noticeRepository.deleteById(noticeId);
    }
}
