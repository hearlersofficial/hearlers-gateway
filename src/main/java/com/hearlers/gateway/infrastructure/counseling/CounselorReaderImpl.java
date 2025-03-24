package com.hearlers.gateway.infrastructure.counseling;

import java.util.List;

import org.springframework.stereotype.Component;

import com.hearlers.api.proto.v1.model.Counselor;
import com.hearlers.api.proto.v1.service.CounselorServiceGrpc.CounselorServiceBlockingStub;
import com.hearlers.api.proto.v1.service.FindCounselorsRequest;
import com.hearlers.gateway.application.counseling.CounselorReader;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CounselorReaderImpl implements CounselorReader {
    private final CounselorServiceBlockingStub counselorServiceBlockingStub;

        @Override
        public List<Counselor> findCounselors(FindCounselorsRequest request) {
        return counselorServiceBlockingStub.findCounselors(request).getCounselorsList();
    }
    
}
