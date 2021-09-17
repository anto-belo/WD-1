# WD-1: Program output
<pre>--- 1 ---
f(3, 5) = 3,395766

--- 2 ---
Point (3, 7) is in the specified area: false

--- 3 ---
 x | tan 
---------
| 5,000 | -3,381
| 5,200 | -1,886
| 5,400 | -1,218
| 5,600 | -0,814
| 5,800 | -0,525
| 6,000 | -0,291

--- 4 ---
In [1, 0, 3, 6, 5, 14] primary numbers are under indexes: 2 4 

--- 5 ---
For [1, 3, 2, 2, 3, 4, 2, 5, 4] K = 5

--- 6 ---
 1  2  3  4  5  6  7  8 
 2  3  4  5  6  7  8  1 
 3  4  5  6  7  8  1  2 
 4  5  6  7  8  1  2  3 
 5  6  7  8  1  2  3  4 
 6  7  8  1  2  3  4  5 
 7  8  1  2  3  4  5  6 
 8  1  2  3  4  5  6  7 

--- 7 ---
[4, 8, 2, 7, 6, 4, -1, 10] -> [-1, 2, 4, 4, 6, 7, 8, 10]

--- 8 ---
a = [1, 3, 6, 12, 14, 26, 27, 39]
b = [2, 4, 4, 6, 18, 19, 21, 26]
Places to insert b in a: 
b[0] = 2 after 0
b[1] = 4 after 1
b[2] = 4 after 1
b[3] = 6 after 2
b[4] = 18 after 4
b[5] = 19 after 4
b[6] = 21 after 4
b[7] = 26 after 5

--- 9 ---
Basket weight: 730.0
Quantity of blue balls: 2

--- 12 ---
1. title=A author=A.B. price=120 isbn=0-0000-0000-0 (hash: 61556479)
2. title=A author=A.B. price=120 isbn=0-0000-0000-0 (hash: 61556479)
3. title=B author=A.B. price=100 isbn=0-0000-0000-0 (hash: 61557420)

b1 == b2: false
b1.equals(b2): true
b1.equals(b3): false

--- 13 ---
1. title=A author=A.B. price=120 isbn=0-0000-0000-0 language=J+# level=1 (hash:-971489091)
2. title=A author=A.B. price=120 isbn=0-0000-0000-0 language=J+# level=1 (hash:-971489091)
3. title=B author=A.B. price=100 isbn=0-0000-0000-0 language=J+# level=1 (hash:-970584790)

b1 == b2: false
b1.equals(b2): true
b1.equals(b3): false

--- 14 ---
1. title=Book author=A.B. price=120 isbn=0-0000-0000-0
1-clone: title=Book author=A.B. price=120 isbn=0-0000-0000-0

b == b1: false
b.equals(b1): true

--- 15 ---
Before sorting by isbn:
title=AAA author=A.B. price=120 isbn=2-3556-3234-2
title=BBB author=A.B. price=130 isbn=1-3436-3753-7
title=CCC author=A.B. price=140 isbn=2-5743-6774-6
title=DDD author=A.B. price=150 isbn=7-2325-7543-5

After sorting by isbn:
title=BBB author=A.B. price=130 isbn=1-3436-3753-7
title=AAA author=A.B. price=120 isbn=2-3556-3234-2
title=CCC author=A.B. price=140 isbn=2-5743-6774-6
title=DDD author=A.B. price=150 isbn=7-2325-7543-5

--- 16 ---
Before sorting:
title=BB author=D price=142 isbn=3-4545-2345-5
title=A author=B price=120 isbn=2-3556-3234-2
title=F author=A price=154 isbn=3-5678-3334-6
title=G author=B price=123 isbn=5-6643-5665-7
title=C author=A price=154 isbn=2-5743-6774-6
title=D author=D price=153 isbn=7-2325-7543-5
title=BA author=C price=142 isbn=3-4545-2345-5
title=B author=C price=132 isbn=1-3436-3753-7
title=C author=A price=144 isbn=2-5743-6774-6
title=E author=C price=147 isbn=2-3434-6896-4

Sorted by title:
title=A author=B price=120 isbn=2-3556-3234-2
title=B author=C price=132 isbn=1-3436-3753-7
title=BA author=C price=142 isbn=3-4545-2345-5
title=BB author=D price=142 isbn=3-4545-2345-5
title=C author=A price=154 isbn=2-5743-6774-6
title=C author=A price=144 isbn=2-5743-6774-6
title=D author=D price=153 isbn=7-2325-7543-5
title=E author=C price=147 isbn=2-3434-6896-4
title=F author=A price=154 isbn=3-5678-3334-6
title=G author=B price=123 isbn=5-6643-5665-7

Sorted by title, then author:
title=A author=B price=120 isbn=2-3556-3234-2
title=B author=C price=132 isbn=1-3436-3753-7
title=BA author=C price=142 isbn=3-4545-2345-5
title=BB author=D price=142 isbn=3-4545-2345-5
title=C author=A price=154 isbn=2-5743-6774-6
title=C author=A price=144 isbn=2-5743-6774-6
title=D author=D price=153 isbn=7-2325-7543-5
title=E author=C price=147 isbn=2-3434-6896-4
title=F author=A price=154 isbn=3-5678-3334-6
title=G author=B price=123 isbn=5-6643-5665-7

Sorted by author, then title:
title=C author=A price=154 isbn=2-5743-6774-6
title=C author=A price=144 isbn=2-5743-6774-6
title=F author=A price=154 isbn=3-5678-3334-6
title=A author=B price=120 isbn=2-3556-3234-2
title=G author=B price=123 isbn=5-6643-5665-7
title=B author=C price=132 isbn=1-3436-3753-7
title=BA author=C price=142 isbn=3-4545-2345-5
title=E author=C price=147 isbn=2-3434-6896-4
title=BB author=D price=142 isbn=3-4545-2345-5
title=D author=D price=153 isbn=7-2325-7543-5

Sorted by author, then title, then price:
title=C author=A price=144 isbn=2-5743-6774-6
title=C author=A price=154 isbn=2-5743-6774-6
title=F author=A price=154 isbn=3-5678-3334-6
title=A author=B price=120 isbn=2-3556-3234-2
title=G author=B price=123 isbn=5-6643-5665-7
title=B author=C price=132 isbn=1-3436-3753-7
title=BA author=C price=142 isbn=3-4545-2345-5
title=E author=C price=147 isbn=2-3434-6896-4
title=BB author=D price=142 isbn=3-4545-2345-5
title=D author=D price=153 isbn=7-2325-7543-5</pre>
## Task 10
<i>The task files were moved to a new project and placed in the same directory.</i><br /><br />
To compile the task: `javac -d bin .\src\com\ab\labs\task12\*`<br />
To run the task: `java -classpath .\bin\ com.ab.labs.task12.Main`
## Task 11
To create jar-archive: `jar -cmf manifest.mf task12.jar -C bin .`<br />
To run jar-archive: `java -jar task12.jar`
