# Movie Info Web Site


### 개요
영화 정보, 영화에 대한 평점과 리뷰, 일상 등을 남기고 공유할 수 있는 사이트 개발

### 개발환경
* 개발 언어 : Java 1.8
* Spring Boot 2.3.4.RELEASE
* Gradle 버전 : 6.6.1
* 템플릿 엔진 : Thymeleaf 3.0.11.RELEASE
* 데이터베이스 : MariaDB
* 운영체제 : Window 10
* 사용된 프레임워크 : Spring MVC, Spring Web, Spring Security, JPA, Bootstrap 4
* 사용된 외부 라이브러리 : Lombok, Gson, FontAwesome, WebJar 
* 사용된 외부 API
   - 네아로(네이버 아이디로 로그인) API, 카카오 로그인 API
   - 영화진흥위원회 박스오피스 API, 영화 상세 정보 API
   - 네이버 영화 검색 API
   - Vonage sms Message API
   - Summernote(게시판 에디터)

### 배포 환경
+ Amazon EC2 인스턴스
   - 운영체제 : Amazon Linux 2
   - 인스턴스 유형 : t2.micro

### 주요 기능
  + 회원가입
      - 입력된 정보는 Ajax 비동기 통신을 통해 정규표현식(regular expression)을 사용한 유효성검사와 중복 여부 검사를 거쳐 저장.
      - 문자 API를 사용해 연락처 인증
      - 소셜 로그인 API를 사용한 회원가입
      - 아이디 및 비밀번호 찾기
      - 기존 방식의 회원가입시 등록한 이메일에 인증 링크를 포함한 메일을 Google SMTP를 통해 발송

 + 로그인
      - 스프링시큐리티를 이용해 사용자 인증 및 권한 부여
      - 네아로(네이버 아이디로 로그인), 카카오 로그인과 같은 소셜 로그인 API를 사용한 로그인 가능
      - 세션에 저장된 로그인 정보를 이용해 추가적인 로그인 방지, 로그아웃시 세션 제거
      - 스프링 시큐리티의 Remember Me 기능과 Intercepter를 이용한 자동 로그인 기능

 + 게시글과 댓글
      - 로그인 여부에 따라 게시판 접근에 차별을 둠 + 회원의 권한에 따라 글쓰기 및 수정 삭제 가능
      - 게시글 작성할 때 이미지파일 업로드시 서버에 해당 파일을 저장한 후 이 파일을 보여주는 방식
      - 게시글에 댓글 입력/수정/삭제 가능
      - 사용자가 탈퇴하여 회원정보 삭제 시 사용자가 입력한 게시글과 게시글의 댓글 삭제

 + 주제별 검색
      - 사용자는 게시판에서 원하는 정보를 검색하여 정보를 받음
      - 사용자는 제목 또는 내용, 작성자 등을 직접 선택하여 검색



