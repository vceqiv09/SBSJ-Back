package com.example.sbsj_process.board.service;

import com.example.sbsj_process.board.entity.QnaBoard;
import com.example.sbsj_process.board.service.response.QnaBoardListResponse;

import java.util.List;

public interface QnaBoardService {


    List<QnaBoardListResponse> list();

}
