# Jumping on the Cloud

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
