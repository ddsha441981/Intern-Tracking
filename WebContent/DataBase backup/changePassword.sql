open CMD As Run Admins

Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Windows\system32>C:\oraclexe\app\oracle\product\11.2.0\server\bin
'C:\oraclexe\app\oracle\product\11.2.0\server\bin' is not recognized as an internal or external command,
operable program or batch file.

C:\Windows\system32>cd C:\oraclexe\app\oracle\product\11.2.0\server\bin

C:\oraclexe\app\oracle\product\11.2.0\server\bin>sqlplus

SQL*Plus: Release 11.2.0.2.0 Production on Thu Jan 5 09:54:54 2017

Copyright (c) 1982, 2014, Oracle.  All rights reserved.

Enter user-name: conn/as sysdba
Enter password:

Connected to:
Oracle Database 11g Express Edition Release 11.2.0.2.0 - 64bit Production

SQL> alter user HR identified by password;

User altered.

SQL> commit;

Commit complete.

SQL>

