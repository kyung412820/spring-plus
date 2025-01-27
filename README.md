### 📘 프로젝트 README

---

# **Spring 프로젝트 - 코드 개선 및 기능 구현 과제**

## **📋 프로젝트 설명**
Spring Boot를 활용하여 코드 개선 및 다양한 기능 구현을 목표로 하는 프로젝트입니다.  
주요 학습 내용은 다음과 같습니다:
- Spring AOP
- Spring Security
- JWT 인증
- JPA 및 QueryDSL
- 테스트 코드 작성

---

## **🗂️ 과제 구조**

### **Level 1: 기본 기능 구현 및 코드 개선**

#### **1. 코드 개선 퀴즈 - @Transactional의 이해**
- 할 일을 저장하는 API(`/todos`) 호출 시 `Connection is read-only` 에러가 발생.
- 정상적으로 할 일을 저장할 수 있도록 `@Transactional` 설정을 수정.

#### **2. 코드 추가 퀴즈 - JWT의 이해**
- 요구사항:
  - `User` 테이블에 `nickname` 컬럼 추가 (중복 가능).
  - JWT에서 `nickname`을 꺼내 프론트엔드에 전달.

#### **3. 코드 개선 퀴즈 - AOP의 이해**
- `changeUserRole()` 메서드 실행 전에 로그를 남기는 AOP 구현.
- AOP 클래스 `AdminAccessLoggingAspect` 수정 필요.

#### **4. 테스트 코드 퀴즈 - 컨트롤러 테스트의 이해**
- `todo_단건_조회_시_todo가_존재하지_않아_예외가_발생한다()` 테스트 실패.
- 테스트가 정상적으로 통과하도록 수정.

#### **5. 코드 개선 퀴즈 - JPA의 이해**
- 할 일 검색 기능 확장:
  - `weather` 조건으로 검색 (조건은 선택적).
  - 수정일 기준으로 기간 검색 (기간 조건도 선택적).
- JPQL을 활용해 조건 처리.

---

### **Level 2: 고급 JPA 기능 구현**

#### **6. JPA Cascade**
- 할 일을 생성한 사용자가 자동으로 담당자로 등록되도록 `cascade` 설정.

#### **7. N+1 문제 해결**
- `CommentController`의 `getComments()` API에서 N+1 문제 발생.
- JPA fetch join을 사용하여 문제 해결.

#### **8. QueryDSL**
- JPQL로 작성된 `findByIdWithUser` 메서드를 QueryDSL로 변경.
- N+1 문제 없이 데이터 조회 구현.

#### **9. Spring Security**
- 기존 `Filter`와 `Argument Resolver` 코드를 Spring Security로 변경.
- 기존 권한 및 접근 제어 로직 유지.
- JWT 기반 인증 방식 유지.

---

### **Level 3: 도전 과제**

#### **10. QueryDSL을 사용한 검색 기능 구현**
- **검색 조건:**
  - 제목 키워드 검색 (부분 일치).
  - 생성일 범위 검색 (최신순 정렬).
  - 담당자 닉네임 검색 (부분 일치).
- **검색 결과:**
  - 일정의 제목만 반환.
  - 일정의 담당자 수와 댓글 개수 포함.
- **기능 요구사항:**
  - Projections를 사용해 필요한 데이터만 반환.
  - 페이징 처리된 결과 반환.

---

## **⚙️ 실행 방법**

1. **환경 설정**
   - JDK 17+
   - Gradle 7.x
   - Spring Boot 3.x

2. **프로젝트 빌드**
   ```bash
   ./gradlew build
   ```

3. **애플리케이션 실행**
   ```bash
   ./gradlew bootRun
   ```

4. **테스트 실행**
   ```bash
   ./gradlew test
   ```

---

## **📌 주요 학습 포인트**

1. **@Transactional 에러 처리**
   - 읽기 전용 트랜잭션과 쓰기 트랜잭션의 차이점 이해.
   
2. **JWT**
   - 토큰에서 유저 정보를 안전하게 추출하고 사용하는 방법.

3. **Spring AOP**
   - 비즈니스 로직 전후로 공통 기능을 적용하는 방법.

4. **N+1 문제 해결**
   - Fetch join과 QueryDSL을 사용한 성능 최적화.

5. **Spring Security**
   - 인증 및 권한 관리에서의 유연한 설계 방법.

6. **QueryDSL**
   - 복잡한 동적 쿼리를 효율적으로 작성하고 최적화.

---

## **✅ 주요 사용 기술**

- **Spring Boot**: 애플리케이션 개발
- **JPA (Hibernate)**: 데이터베이스 ORM
- **QueryDSL**: 동적 쿼리 작성
- **JWT**: 인증 및 권한 관리
- **Spring Security**: 접근 제어 및 권한 관리
- **H2 Database**: 테스트용 인메모리 DB
- **JUnit 5**: 테스트 코드 작성

---

## **🔧 작업 예정**

1. 에러 로그 분석 및 추가 기능 구현.
2. 성능 최적화 및 확장 가능한 구조 설계.
3. 프론트엔드와의 원활한 통신을 위한 API 문서화.

---



