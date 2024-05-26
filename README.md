# Втора лабораториска вежба по Софтверско инженерство

## Бранко Миленков, 223010


###  Control Flow Graph
![CFG](https://private-user-images.githubusercontent.com/117124883/333870770-b1d163d3-1c6c-4079-ace8-5ded739b300a.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTY3MTg2NzQsIm5iZiI6MTcxNjcxODM3NCwicGF0aCI6Ii8xMTcxMjQ4ODMvMzMzODcwNzcwLWIxZDE2M2QzLTFjNmMtNDA3OS1hY2U4LTVkZWQ3MzliMzAwYS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTI2JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUyNlQxMDEyNTRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00MzMwNzBkYzY3ODBkNmM5YTJkMGJmOWFmMmRiNWMyZDJkODc5ZWU0ZDRiNmE3ODE2NDE3YzE5Y2Y0NzZmNDBlJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.VUkE84M74tRnTTa8kdeCC6IjsIlodyN8SoQ0vxz-s1I)
### Цикломатска комплексност

Цикломатската комплексност на овој код е 10. Истата ја имам добиено со формулата P+1, односно бројот на предикатни јазли, каде P=9 (9+1=10). Втор начин за проверка е да се избројат регионите во CFG, плус надворешниот регион со кој се добива цикломатската комплексност да биде повторно 10.

### Тест случаи според критериумот  Every branch
![EveryBranch](https://private-user-images.githubusercontent.com/117124883/333870827-1cbf8ec1-95c6-4592-9378-844e7ba660a0.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTY3MTg2NzQsIm5iZiI6MTcxNjcxODM3NCwicGF0aCI6Ii8xMTcxMjQ4ODMvMzMzODcwODI3LTFjYmY4ZWMxLTk1YzYtNDU5Mi05Mzc4LTg0NGU3YmE2NjBhMC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTI2JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUyNlQxMDEyNTRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00ZDRiNWU1ZTI0OTYzZmQ3NTQ2ZDQ3ZjJjYTI0N2IxODFmNTk4YzExNDlkOTUxMDg4OWNlODVjZTUyMDY1N2I0JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.Gje0t5YPWMOWHT2VVgEK_tURKhItCUJ3US4soFp1bEQ)

### Тест случаи според критериумот Multiple Condition
![MC1](https://private-user-images.githubusercontent.com/117124883/333870796-8d5456ff-46d0-4fa6-ad74-9b3fe7681664.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTY3MTg2NzQsIm5iZiI6MTcxNjcxODM3NCwicGF0aCI6Ii8xMTcxMjQ4ODMvMzMzODcwNzk2LThkNTQ1NmZmLTQ2ZDAtNGZhNi1hZDc0LTliM2ZlNzY4MTY2NC5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTI2JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUyNlQxMDEyNTRaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1iMTUzMjQzZGE4ZThjOWVjZDhiNmMyNzRiMTAxNjUwNzQ2YTRjOGZmOGY0YmE3Mzk4MTM2MWE0NWFhYzQ4ZWYyJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.mKhmPfYYz_ua2Myss3EXtMpf8x7_hfnvHFwzvMvCGn4)

![MC2](https://private-user-images.githubusercontent.com/117124883/333869092-9419ad75-79d0-4a97-ba4d-08d11cd62b33.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTY3MTg4ODIsIm5iZiI6MTcxNjcxODU4MiwicGF0aCI6Ii8xMTcxMjQ4ODMvMzMzODY5MDkyLTk0MTlhZDc1LTc5ZDAtNGE5Ny1iYTRkLTA4ZDExY2Q2MmIzMy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTI2JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUyNlQxMDE2MjJaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1iYWYyYjU2ZGViNzI3YTE0NzY0MzMyM2YzZGZlMmM5NjQxMWM4ZDNjODFiMjIyNTliNjY5NTBjZTRkNWZiZDZjJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.-nhXVpmTtzKi1KsF3Qg1xixrurygmjOuVNrpo74-Q-g)
*X = anything (било што T,F)
### Објаснување на напишаните unit tests
1.
- Првиот тест во EveryBranchStatementTest е тест за фрлање исклучок (RuntimeException) при внес на празна листа од Items. 
- Вториот тест во EveryBranchStatementTest е тест за тестирање излез кога уплатата е помала од вкупната сума на ставките во листата, односно НЕ е доволна.
- Третиот тест во EveryBranchStatementTest е тест за фрлање исклучок (RuntimeException) при внес на Item во листата со неправилен Barcode.
- Четвртиот тест во EveryBranchStatementTest е тест за фрлање исклучок (RuntimeException) при внес на Item во листата без Barcode.
- Петтиот тест во EveryBranchStatementTest е тест за тестирање излез кога уплатата е поголема од вкупната сума на ставките во листата, односно Е доволна.

2.
##### item.getName() == null || item.getName().length() == 0
- Првиот тест во MultipleConditionTest е тест за исполнување на условот(сетирање на името на ставката) кога првиот израз е Т, а вториот е било што.
- Вториот тест во MultipleConditionTest е тест за исполнување на условот(сетирање на името на ставката) кога првиот израз е F, а вториот е T.
- Третиот тест во MultipleConditionTest е тест за НЕисполнетост на условот(сетирање на името на ставката) кога и дватта логички изрази се F, односно ставката има име.

#### item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'
- Четвртиот тест во MultipleConditionTest е тест за исполнување на условот(намалување на вк.сума за 30) кога цената на ставката е поголема од 300, има попуст и баркодот на ставката започнува на 0.
- Петтиот тест во MultipleConditionTest е тест за НЕисполнетост на условот(намалување на вк.сума за 30) кога цената на ставката е поголема од 300, има попуст и баркодот на ставката не започнува на 0.
- Шестиот тест во MultipleConditionTest е тест за НЕисполнетост на условот(намалување на вк.сума за 30) кога цената на ставката е поголема од 300 и нема попуст без разлика на баркодот. 
- Седмиот тест во MultipleConditionTest е тест за НЕисполнетост на условот(намалување на вк.сума за 30) кога цената на ставката е помала од 300, без разлика на попустот и името на баркодот.