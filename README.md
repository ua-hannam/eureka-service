# **UaHan Eureka Demo Application**

이 프로젝트는 로컬 환경에서 Eureka 서버를 테스트하기 위한 Java 기반의 데모 애플리케이션입니다. Eureka 서버는 마이크로서비스 아키텍처에서 서비스 발견과 등록을 용이하게 하는 중요한 구성 요소입니다. 이 프로젝트는 Eureka 클라이언트 기능을 통합하고, 기본적인 서비스 등록 및 발견 시나리오를 실험할 수 있도록 설계되었습니다.

## **시작하기**

### **필수 조건**

- Java 8 이상
- Gradle (빌드 도구)

### **설치 및 실행 방법**

1. 저장소 복제:

    ```bash
    git clone [이 프로젝트의 Git URL]
    ```

2. 프로젝트 디렉토리로 이동:

    ```bash
    cd [프로젝트 디렉토리]
    ```

3. 빌드:

    ```bash
    ./gradlew build
    ```

4. 애플리케이션 실행:

    ```bash
    ./gradlew bootRun
    ```


### **구조**

프로젝트의 주요 디렉토리 및 파일은 다음과 같습니다:

- **`src/main/java/com/example/uahaneurekademo`**: 애플리케이션의 주요 소스 코드가 위치한 디렉토리.
- **`src/main/resources/application.yml`**: 애플리케이션의 설정 파일.
- **`build.gradle`**: Gradle을 이용한 프로젝트 빌드 및 의존성 관리 파일.

### **기능**

- **Eureka 클라이언트 통합**: Eureka 서버에 서비스를 자동 등록하고 관리합니다.
- **서비스 발견**: Eureka 서버를 통해 다른 서비스를 찾고 상호작용합니다.