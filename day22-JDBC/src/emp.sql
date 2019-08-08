--INSERT PreparedStatemnet
INSERT INTO EMP e(e.empno, e.ename) VALUES (9999, '홍길동');

--UPdate PreparedStatemnet
UPDATE EMP e
   SET e.job = ?
     , e.hiredate = sysdate
     , e.sal = ?
     , e.deptno = ?
     ;
    --DELETE PreparedStatemnet
    DELETE EMP e
    WHERE e.empno = ?
    ;