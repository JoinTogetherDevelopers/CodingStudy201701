# Flatland Space Stations - 2017/02/05

Original link on [Hackerrank](https://www.hackerrank.com/challenges/flatland-space-stations)


평지는 n 개의 도시가 있고 그 중 m 개에는 우주 정거장이 있습니다. 각 도시 c<sub>i</sub>는 0에서 n-1까지의 고유 색인으로 번호가 매겨져 있으며 각 도시 ci는 1km 길이의 양방향 도로로 도시 c<sub>i+1</sub>에 연결됩니다.

예를 들어, n = 5이고 도시 c<sub>0</sub> 및 c<sub>4</sub>에 우주 정거장이있는 경우 Flatland는 다음과 같습니다.

**0** - 1 - 2 - 3 - **4**

각 도시에 대해 가장 가까운 우주 정거장까지의 거리를 결정하 고이 거리의 최대 값을 인쇄하십시오.


### Input Format
첫 번째 행은 두 개의 공백으로 구분 된 정수로 구성됩니다.
두 번째 행에는 우주 정거장이있는 각 도시의 각 색인을 설명하는 공백으로 구분 된 정수가 들어 있습니다. 이 값들은 순서가없고 고유합니다.

### Constraints(제약 조건)
최소한 우주 정거장을 갖춘 도시가있을 것이며 도시에는 하나 이상의 도시가 없다는 것을 보장합니다.

### Output Format
평지 도시의 우주인이 가장 가까운 우주 정거장에 도착하기 위해 여행해야하는 최대 거리를 나타내는 정수를 인쇄하십시오.

#### Sample Input 0
```
5 2
0 4
```

#### Sample Output 0
```
2
```


#### Sample Input 1
```
6 6
0 1 2 4 3 5
```

#### Sample Output 1
```
0
```
<br/>


# Jumping on the Cloud - 2017/01/22

Original link on [Hackerrank](https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited)


Aerith가 클라우드 게임을하고 있습니다! 이 게임에는 0부터 n-1까지 순차적으로 번호가 매겨진 n 개의 구름이 있습니다. 각 클라우드는 일반 클라우드 또는 뇌운입니다.

Aerith는 구름 0에서 에너지 레벨 E = 100으로 시작합니다. 그녀는 1 단위의 에너지를 사용하여 k를 구름 (i + k) % n으로 점프하고 구름이 0이 될 때까지 점프합니다. Aerith가 뇌우에 상륙하면 에너지 (E)가 2 감소합니다 추가 단위. Aerith가 구름 0으로 돌아 왔을 때 게임이 끝납니다.

n, k의 값과 구름의 구성이 주어지면 게임이 끝난 후 E의 최종 값을 결정할 수 있습니까?

*참고* : %는 나머지연산을 나타냅니다.

### Input Format
첫 번째 행에는 공백으로 구분 된 두 개의 정수 n (구름 수)과 k (점프 거리)가 있습니다.
두 번째 행은 구름 c<sub>0</sub>, c<sub>1</sub>, ..., c<sub>n</sub>-1의 각 값을 설명하는 n 개의 공백으로 구분 된 정수를 포함합니다. 각 클라우드는 다음과 같이 설명됩니다.

* c<sub>i</sub> = 0이면 구름 i는 보통 구름입니다.
* c<sub>i</sub> = 1이면 구름 i는 뇌운이다.

### Constraints(제약 조건)
* 2 <= n <= 25
* 1 <= k <= n
* n % k = 0
* c<sub>i</sub> = 0 또는 1

### Output Format

새 행에 E의 최종 값을 인쇄하십시오.

#### Sample Input
```
8 2
0 0 1 0 0 1 1 0
```

#### Sample Output
```
92
```
