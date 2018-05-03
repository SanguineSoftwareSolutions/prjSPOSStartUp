@echo off 
for /f "tokens=1" %%i in ('date /t') do set DATE_DOW=%%i
for /f "tokens=2" %%i in ('date /t') do set DATE_DAY=%%i
for /f %%i in ('echo %date_day:/=-%') do set DATE_DAY=%%i
for /f %%i in ('time /t') do set DATE_TIME=%%i
for /f %%i in ('echo %date_time::=-%') do set DATE_TIME=%%i
set mydate=!date:~10,4!!date:~6,2!/!date:~4,2!

mysqldump -uroot -proot jpos > D:\test\backup\31-8-2016_12-3_JPOS.sql
echo Done!
exit