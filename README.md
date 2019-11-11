# java-ladder
+ ### 사다리 게임 1단계 기능 요구사항 
1. 사다리 게임에 참여하는 사람의 이름을 최대 5글자 까지 부여할 수 있다.
2. 사다리를 출력할 때 사람 이름도 같이 출력한다.
3. 사람 이름을 5자 기준으로 출력하기 때문에 사다리 폭도 넓어져야 한다.
4. 사다리 타기가 정상적으로 동작하려면 라인이 겹치지 않도록 해야한다.
---
+ ### 사다리 게임 1단계 구현 기능 목록 
1. 사다리 게임을 시작하면 참여자 이름들을 받아온다.
<br>&nbsp;&nbsp; - 예외처리_1 : 참여자 이름이 다섯글자 초과이거나 한글자 미만인 경우 예외처리
<br>&nbsp;&nbsp; - 예외처리_2 : 참여자가 두명 미만일 경우 예외처리
2. 최대 사다리 높이를 입력받아온다.
<br>&nbsp;&nbsp; - 예외처리_1 : 사다리의 높이가 1 미만일 경우 예외처리
3. 랜덤으로 사다리 가로 라인이 출력될 위치를 정하고, 겹치지 않도록 한다.
<br><pre><code>public void generatePoints(int countPerson, RandomLadderPoint point) {
                       boolean before = false;
                       for (int i = 0; i < countPerson - 1; i++) {
                           points.add(!before && point.isPoint());
                           before = points.get(i);
                       }
                       points.add(false);
                   }</code></pre>

4. 사용자의 이름을 출력해준다.
5. 사다리를 출력해준다.
<br>&nbsp;&nbsp;&nbsp;&nbsp; - 고려사항_1 : 3번의 내용
<br>&nbsp;&nbsp;&nbsp;&nbsp; - 고려사항_2 : 사용자의 이름이 각 사다리 세로 라인의 위치와 맞도록 출력해준다. <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;구현 방법 : 사용자 이름 사이마다  "6 - 사용자의 이름 길이" 만큼 띄어쓰기를 해주어 구현하였다. (최소 한칸은 띄어주어야 하므로 최대 이름 길이인 5가 아닌 6으로 설정해주었다.)
 