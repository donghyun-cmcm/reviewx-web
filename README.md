# VX 플랫폼 (리뷰X)

참여 기반 캠페인 플랫폼 - 브랜드와 참여자를 연결하는 신뢰할 수 있는 리뷰 캠페인 서비스

## 기술 스택
- **Backend**: Spring Boot 3.2.1, Spring Security, JPA/Hibernate
- **Frontend**: Thymeleaf, Bootstrap 5
- **Database**: MySQL 8.0
- **Build Tool**: Gradle 8.5

## 실행 방법
```bash
./gradlew bootRun
```

## 주요 기능
- 5가지 캠페인 유형 지원 (배송형, 구매평, 방문형, 체험단, 기자단)
- 사용자 역할별 권한 관리 (참여자/파트너/관리자)
- 카카오 소셜 로그인 지원
- 정산 및 포인트 관리 시스템