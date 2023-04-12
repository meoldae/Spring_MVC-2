# Spring_MVC-2 백엔드 웹 개발 활용기술
Inflearn - 스프링 MVC 2편 - 백엔드 웹 개발 활용 기술
---  

## 0x00. 타임리프
- `Text, uText` : [892efba](https://github.com/meoldae/Spring_MVC2/commit/892efbac8f32441c474af221ed7101ed74c900ca)
- `SpringEL` : [faeee69](https://github.com/meoldae/Spring_MVC-2/commit/faeee6993603b03720f2bb22f93e2ace4ecd6d8b)
- `기본 객체` : [160dcf6](https://github.com/meoldae/Spring_MVC-2/commit/160dcf6a8eb46482e065d66af92a052f3eeb163b)
- `유틸리티 객체` : [252c98f](https://github.com/meoldae/Spring_MVC-2/commit/252c98f1dfc83ecfaf6c64592d9b97da77fb87bc)
- `링크` : [cc3b6c7](https://github.com/meoldae/Spring_MVC-2/commit/cc3b6c796dec00ded67025602c362f684c2edd37)
- `리터럴 문법` : [8eb8a6e](https://github.com/meoldae/Spring_MVC-2/commit/8eb8a6e6101ed3e4e73ff7e2b2d27ce7495deaca)
- `연산` : [bc74c95](https://github.com/meoldae/Spring_MVC-2/commit/bc74c957e3273c47bb55cdb6619e9d6f823e1ac9)
- `속성 추가/수정` : [5336c4e](https://github.com/meoldae/Spring_MVC-2/commit/5336c4e11e4e89fdf22291253586ac66524929ab)
- `반복` : [7d0250f](https://github.com/meoldae/Spring_MVC-2/commit/7d0250f8daa3b0d642ec100b67ee0e4a1350c293)
- `조건문(If, Switch)` : [31f8600](https://github.com/meoldae/Spring_MVC-2/commit/31f86001c7177db4803c4a12dd48c0e078ddf9ad)
- `주석` : [5b1dd82](https://github.com/meoldae/Spring_MVC-2/commit/5b1dd825dfe24581d110d6a9b7261ae770c40a0b)
- `블록` : [f600f8d](https://github.com/meoldae/Spring_MVC-2/commit/f600f8ddb2c5278df6fa2b6902f5100c5443cd72)
- `자바스크립트 인라인` : [25f4fd6](https://github.com/meoldae/Spring_MVC-2/commit/25f4fd6638eaf5bc4fdfff9df38f50774e0714f6)
- `템플릿` : [bbf6876](https://github.com/meoldae/Spring_MVC-2/commit/bbf687681ec069338006e5229fcae10135cb0989)
- `템플릿 레이아웃` : [cd2f7aa](https://github.com/meoldae/Spring_MVC-2/commit/cd2f7aac15a499321876d774a694b3ab96b49780)


## 0x01. 타임리프 with Spring
- 입력 Form 처리 - `th:object` , `th:field`   
  ```commit``` : [3a7586c](https://github.com/meoldae/Spring_MVC-2/commit/3a7586c8d23c524b8e7e2521b70c4ac7237a67f1)   
- Checkbox   
  ```commit``` : [8fe4ea8](https://github.com/meoldae/Spring_MVC-2/commit/8fe4ea8be8541270b6e73d355865f00660918fd5), [fc1c7dd](https://github.com/meoldae/Spring_MVC-2/commit/fc1c7dd793e3d3b4fa7b1271cfcc82690325a09d)   
- Radio   
  ```commit``` : [354323c](https://github.com/meoldae/Spring_MVC-2/commit/354323c9f40f80b8694d9cfdf0673389ded102d6)   
- Select
  ```commit``` : [2f60026](https://github.com/meoldae/Spring_MVC-2/commit/2f60026a78a1021b68d8ddb5368074984ede13e1)   

## 0x02. 메시지, 국제화
- 메시지 소스 설정 - `messages.properties`   
  ```commit``` : [0c713d4](https://github.com/meoldae/Spring_MVC-2/commit/0c713d45a46b51e44eaf69003684a98ab743824d)   
- 국제화    
  ```commit``` : [036d7b3](https://github.com/meoldae/Spring_MVC-2/commit/036d7b391e820aa0499205139964717fa9e664c3)   

## 0x03. Validation (검증)
- 검증 로직 직접 구현 ( Java )   
  ```commit``` : [28cdbe3](https://github.com/meoldae/Spring_MVC-2/commit/28cdbe3b151a167fd396acf8b85c65d341dc7a74)   
- Binding Result   
  ```commit``` : [fb00798](https://github.com/meoldae/Spring_MVC-2/commit/fb007985b1b50e2053d58f5a0a66847742dddec7)   
- Binding Result2 - 오류 메시지를 위한 두 번째 생성자   
  ```commit``` : [bd54fe3](https://github.com/meoldae/Spring_MVC-2/commit/bd54fe33ec57d2a1f7e072e6cbb3eb093ae24c01)   
- Error 메시지 파일의 분리 - errors.properties   
  ```commit``` : [1997ca7](https://github.com/meoldae/Spring_MVC-2/commit/1997ca75af85a015a2ccfa2c2904cfc0dfcf568c)   
- `rejectValue()`를 통해 에러 생성 위임   
  ```commit``` : [6c30756](https://github.com/meoldae/Spring_MVC-2/commit/6c3075656f9bee3db83d41e3ad7a85eb61f7fb87)   
- Message Codes Resolver - 에러 코드 생성 규칙 확인   
  ```commit``` : [7506459](https://github.com/meoldae/Spring_MVC-2/commit/7506459e9dfcfd06391f092ef96eb5412f48f005)   
- 오류 코드 계층화   
  ```commit``` : [484bf6f](https://github.com/meoldae/Spring_MVC-2/commit/484bf6f3c37fb67fe1bec5d23dac82c9de65d686)   
- Binding Error ( Type Mismatch )   
  ```commit``` : [96ccdc1](https://github.com/meoldae/Spring_MVC-2/commit/96ccdc191ce4731c2325b3438011bea0bbc71c72)   
- Validator의 분리 - 직접 구현    
  ```commit``` : [720d82b](https://github.com/meoldae/Spring_MVC-2/commit/720d82b600da726b143f62c87041d369aec21799)   
- WebDataBinder, `@Validated` - 구현한 검증기 도입   
  ```commit``` : [361db22](https://github.com/meoldae/Spring_MVC-2/commit/361db22c43c79430521572c71222f9bed6f1f896)   

## 0x04. Bean Validation
- 순수한 Bean Validation - ValidatorFactory를 통한 객체 획득
