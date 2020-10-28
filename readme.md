# Team Logo
![Github logo](https://github.com/osamhack2020/WEB_AI-based-3D-and-AR-Fitting-Fitter_ARmyFitter/blob/master/folder/1602808000338.jpg?raw=true)

육군을 상징하고 프로젝트의 성격과 연관된 어휘를 종합하여 로고를 제작하였음
* Army(육군), AR(Augmented Reality), My(나의), Fitting → Army → "AR"my → ARmyFitter
--- 
개인의 신체 치수를 입력하면 AI가 분석하여 개인 맞춤형 피복을 추천해 주고, 추천된 피복은 3D 기반 가상착용이 가능하며, AI가 추천해 주는 피복을 스마트폰을 활용하여 AR을 통해 착용 해 볼 수 있는 서비스
***


## 팀소개
* ARmyFitter란 팀명을 사용하였으며
* 팀원은 4명(개발관리장교, 빅데이터기술담당, VR기술/개발담당, 정보작전SW개발장교)으로 구성하였음.
* 팀원 별 기획 및 계획, 시스템 설계 및 분석, 구현 및 프로젝트 개발 관리, 영상제작 등의 임무 분장을 통해 과업을 수행 함

## 프로젝트 아이템 선정 배경
* 코로나19로 인한 언택트 서비스가 강조되고 있고
* 입대 시 병사들의 경우 샘플 피복 착용 후 희망 치수를 분배 또는 본인이 입던 치수나
  신체 측정 치수를 바탕으로 교관 경험에 의해 피복류가 추천(지급)됨에 따라
  추천 된 치수의 피복류 착용 후 사이즈가 맞지 않는 불편 호소와 교환이 빈번하게 발생하고,
  변화된 입대 장병들의 신체 치수에 유연하게 적용 가능한 치수체계 미정립으로
  입대 장병들의 희망치수 사전 확보 부족 및 불출 지연이 발생과 
  특정치수의 재고 누적 현상이 발생함에 따라 
* 위와 같은 문제점을 해결하기 위한 방안으로
* 빅데이터 분석&AI 기반의 개인 맞춤형 피복추천 + 3D&AR 체험 서비스를 제안함

## 프로젝트 아이템의 가치
* 변화하는 신체 특성 분석
* 병사(소비자) 맞춤형 진화
* 신체 정보에 따른 맞춤형 피복을 가상의 세계에서 입대 前/後 선착용 경험 가능
* 코로나19 상황 등에 따른 언택트 서비스 지원(소비)에 적합

## 프로젝트 기대효과
* 개인체형에 가장 적합한 치수 지급 가능
* 신교대별 재고 보유수준 감소 → 저장관리 용이
* 치수별 소요예측 적중률 향상 → 조달소요량 판단에 기여 
* 장병 신체변화를 고려한 미래 치수체계 재정립에 단초 제공
* 구축된 신체 빅데이터 → 표준체형 분석, 민간 피복 제조업계 도움
* 3D 모델링을 통한 피복 추천값의 가시화롤 신체 치수에 맞는 모델을 3D 360º 회전으로 가상 확인 가능
* AR을 통해 머리 사이즈별 최적의 베레모 추천으로 직접 현장에서 착용해 보지 않아도 선체험을 통한 언택트 환경에 부합 

## 3D 가상피팅 모델(피터 상병) 소개
* ① 동영상(유투브 링크)
[https://youtu.be/JauKatovPbU](https://youtu.be/JauKatovPbU)

* ② 이미지

![Github logo](https://github.com/osamhack2020/WEB_AI-based-3D-and-AR-Fitting-Fitter_ARmyFitter/blob/master/folder/fitter(one).jpg?raw=true)

* ③ 체형별 9가지 타입

![Github logo](https://github.com/osamhack2020/WEB_AI-based-3D-and-AR-Fitting-Fitter_ARmyFitter/blob/master/folder/fitter(9).jpg?raw=true)


## 프로젝트 동영상
* ① 홍보 동영상(스토리텔링 반영) : 제작중
* ② 기능 시연 동영상 : ARmy Fitter 실행(신체치수 입력) + AI 추천결과 3D확인
* ③ 기능 시연 동영상 : AI 추천결과 3D 확인 + AR(증강현실) 체험


## 프로젝트 세부 내용설명
빅데이터 분석&AI 기반 피복류 추천

➀ 최적의 치수 추천을 위해 Python 기반 Contents base Filter 알고리즘 사용
② 빅데이터 분석을 통해 비정형화된 치수 테이터를 가공하여 표준 데이터를 산정하고 가시화할 수 있는 데이터 제공
![Github logo](https://github.com/osamhack2020/WEB_AI-based-3D-and-AR-Fitting-Fitter_ARmyFitter/blob/master/folder/recommendation1.jpg?raw=true)

➂ 표준 데이터를 통한 군복추천 시 가중치 분석
![Github logo](https://github.com/osamhack2020/WEB_AI-based-3D-and-AR-Fitting-Fitter_ARmyFitter/blob/master/folder/recommendation2.jpg?raw=true)

➃ AI 머신러닝을 통해 개개인의 신체 치수를 입력받아 개개인별 군복(피복)추천
![Github logo](https://github.com/osamhack2020/WEB_AI-based-3D-and-AR-Fitting-Fitter_ARmyFitter/blob/master/folder/recommendation3.jpg?raw=true)

  ● 전투복 상의, 하의, 베레모 , 전투화에 대한 추천 결과(사이즈) 및 정확률 제시

3D 가상 피팅

➀ 추천 치수에 따른 3D 군복 가상 피팅

  ● 3D SW(Maya)의 모델링을 통한 피복 추천 결과값의 가시화 제공
  ● 내 신체 치수에 맞는 피복 착용 모델을 3D 360도 회전으로 웹상에서 확인 가능 
  ● Python 데이터와 3D 모델 간 데이터 연동을 통해 정확하고 다양한 결과 제시
  ● Pixologic zBrush, Marvelous Designer SW 활용해 사실적인 Cloth 구현
  ● 직접 가서 입어보지 않아도 가상 착용 모델 확인을 통한 언택트 구현
![Github logo](https://github.com/osamhack2020/WEB_AI-based-3D-and-AR-Fitting-Fitter_ARmyFitter/blob/master/folder/recommendation4.jpg?raw=true)

AR(증강현실) 체험

➀ AI + AR 기술 융합 기반의 베레모 치수 추천받기 앱 개발 / 적용

  ● AI 기반의 ‘Facial Tracking Algorithm’ 을 AR에 적용하는 아이디어를 통해 얼굴의 윤곽 및 곡면을 실시간 Tracking하고 그 결과를 스마트폰의 카메라 뷰를 통해 보여줌 

  ● 트랙킹 된 가상 얼굴의 468개의 메시 특정 지점 간의 거리값 측정 코드 구현 / 적용
![Github logo](https://github.com/osamhack2020/WEB_AI-based-3D-and-AR-Fitting-Fitter_ARmyFitter/blob/master/folder/recommendation5.jpg?raw=true)
  ● 사람마다 얼굴의 크기, 이마의 너비 등 수치가 다른 점을 착안해 자체개발 프로그래밍을 통해 얼굴의 특정지점 간 거리값을 실시간 측정하고 반환값에 따른 베레모 치수 추천
  ● 소수점 이하 8자리까지의 초정밀 정확도를 제시
  ● 직접 모델링한 3D 베레모를 AR(증강현실)과 접목해 사용자별 서로 다른 크기의 베레모 착용모습을 카메라로 제시 (이마의 너비에 따라 베레모 사이즈 자동변환)

  ● 데모 시연
![Github logo](https://github.com/osamhack2020/WEB_AI-based-3D-and-AR-Fitting-Fitter_ARmyFitter/blob/master/folder/recommendation6.jpg?raw=true)
  ● 스마트폰(안드로이드, iOS) 모든 기종 Build 및 실행 가능하며 프로그램 고도화를 통해 데이터의 정확도 향상 목표
  ● 병사들도 스마트폰을 가지고 있기 때문에 언제 어디서든 자신의 베레모 추천치수와 착용샷 확인가능

##  기능 설계(화면 구성)
* 내용작성 예정

##  컴퓨터 구성 / 필수 조건 안내 (Prerequisites)
* 내용작성 예정

##  기술 스택 (Technique Used)
### Server(back-end)
 -  내용 작성 예정
 
### front-end
 -  내용 작성 예정

## 공개SW 해커톤 경연대회 SW 및 오픈소스 사용목록
 -  내용 작성 예정

## 설치 안내 (Installation Process)
 -  내용 수정 예정
```bash
$ git clone git주소
$ yarn or npm install
$ yarn start or npm run start
```

## 프로젝트 사용법 (Getting Started)
 -  내용 수정 예정

**마크다운 문법을 이용하여 자유롭게 기재**

잘 모를 경우
구글 검색 - 마크다운 문법
[https://post.naver.com/viewer/postView.nhn?volumeNo=24627214&memberNo=42458017](https://post.naver.com/viewer/postView.nhn?volumeNo=24627214&memberNo=42458017)

 편한 마크다운 에디터를 찾아서 사용
 샘플 에디터 [https://stackedit.io/app#](https://stackedit.io/app#)
 
## 팀 정보 (Team Information)
- Park GunWoo(biybab@nate.com), Github ID : park-gunwoo
- Park InYeong(piy01@naver.com), Github ID : Park-inyeong
- Park KyungMin(suguys@naver.com), Github ID : suguys
- Ahn HyeongJin(mindofthesky@naver.com), Github ID : mindofthesky

## 저작권 및 사용권 정보 (Copyleft / End User License)
 * [MIT](https://github.com/osam2020-WEB/Sample-ProjectName-TeamName/blob/master/license.md)
