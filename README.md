# VoyagerTest

Jetpack Compose 앱 개발에서 공식 `Navigation` 라이브러리 대신, 더 간결하고 유연한 화면 전환 라이브러리인 **Voyager**를 사용해본 테스트 프로젝트입니다.

`Navigator`, `Screen`, 그리고 간단한 데이터 전달 방식을 실습했습니다.

## 프로젝트 설명

이 앱은 두 개의 주요 화면으로 구성되어 있습니다:

- **HomeScreen**: 사용자가 이름, 이메일, 비밀번호를 입력하는 화면
- **UserDataScreen**: 입력한 사용자 정보를 표시하는 화면

HomeScreen에서 정보를 입력한 후 버튼을 누르면, **User** 데이터 클래스를 Voyager `Screen`에 넘겨 UserDataScreen으로 이동합니다.

---

## 📚 Voyager를 사용하면서 알게 된 점

- `Screen` 자체를 **Composable** 객체처럼 다루기 때문에 Navigation Graph를 별도로 작성할 필요 없이 **화면 별로 모듈화**가 자연스럽게 됩니다.
- 화면 간 데이터 전달이 매우 간단합니다. (화면 클래스의 **생성자**를 이용해서 데이터 전달 가능)
- `Navigator.push()`, `Navigator.pop()`, `Navigator.replace()` 등의 메소드로 **직관적인 화면 이동**이 가능합니다.
- 기존 Navigation 라이브러리처럼 복잡한 route 이름 관리가 필요 없고, 코드가 훨씬 깔끔해집니다.
- Voyager는 메모리 기반이라 자유롭고 빠르지만 복구를 직접 관리해야 합니다.

Type Safe Navigation 과 닮아있지만, data class 같은 복잡한 데이터 타입도 간단하게 보낼 수 있다.

---

