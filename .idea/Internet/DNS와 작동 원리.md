#DNS의 작동 원리

### DNS
<p>인터넷 상에서 모든 서버는 IP 주소로 위치가 정해져 있다. 하지만 사용자의
눈에는 www.naver.com 과 같이 외우기 쉬운 형태로 도메인 주소가 보인다. 도메인을
IP 주소로 바꾸기 위해서는 DNS 서버를 사용한다. </p>

### DNS 로부터 ip 주소를 얻어오는 과정
<p>Local DNS 에 ip 주소를 문의한다. Local DNS 에 해당 도메인의 IP 주소가
없다면 Root DNS 와 같은 다른 DNS 서버 정보를 받는다.
<br>
Root DNS 서버에 도메인 주소를 질의한다. Root DNS 서버로부터 com 도메인을 관리하는 
DNS 서버의 주소를 받는다. (.com 도메인의 경우) 해당 도메인을 관리하는 더 구체적은 DNS 로
연결된다. 이후 IP 주소를 받는다.</p>

### 도메인이름
<p> 모든 도메인 이름은 ICANN 에서 감독된다. 정해진 규정에 따라 도메인을
생성할 수 있도록 한다. 
<br>
TLD는 도메인 확장자를 뜻하며 도메인 가장 오른쪽 부분에 위치하는 .com
과 같은 것들이다. </p>

### 호스팅이란
<p>호스팅은 대형 서버의 기능을 빌려서 웹 서비스를 제공하는 것을 말한다.
</p>
<p>
* 웹 호스팅은 하나의 서버 장비를 여러명이 나눠서 공유하는 것을 뜻한다.
<br>
* 서버 호스팅은 한 명이 하나의 서버 전체를 임대하는 것이다.
<br>
* 클라우드 호스팅은 물리적 서버가 아닌 가상의 서버를 임대하는 것이다.
