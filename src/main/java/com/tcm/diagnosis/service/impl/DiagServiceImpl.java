package com.tcm.diagnosis.service.impl;

import com.tcm.diagnosis.mapper.DiagnosisMapper;
import com.tcm.diagnosis.model.Diagnosis;
import com.tcm.diagnosis.service.DiagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "diagService")
public class DiagServiceImpl implements DiagService{
    @Autowired
    private DiagnosisMapper diagDao;//这里会报错，但是并不会影响

    @Override
    public int addDiag(Diagnosis diag) {
        return diagDao.insert(diag);
    }
}
