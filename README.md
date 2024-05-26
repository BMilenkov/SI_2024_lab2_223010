# Втора лабораториска вежба по Софтверско инженерство

## Бранко Миленков, 223010


###  Control Flow Graph
![CFG](https://private-user-images.githubusercontent.com/117124883/333871666-da213404-3dfc-4c96-b6ef-15a8c21146ef.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTY3MTk0NzMsIm5iZiI6MTcxNjcxOTE3MywicGF0aCI6Ii8xMTcxMjQ4ODMvMzMzODcxNjY2LWRhMjEzNDA0LTNkZmMtNGM5Ni1iNmVmLTE1YThjMjExNDZlZi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTI2JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUyNlQxMDI2MTNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1jZDNiMzg1ZmViZjJhODIwOTllMDMzOGMyN2RhNDA3MjhhOGM1NDA3MGU1NzZkMWMxZjc3YTI3ZTg0OGYxOTIxJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.dthKAussitsxUlRBcWEd3j6-D2LEk3eJSM2PT5JiPhI)
### Цикломатска комплексност

Цикломатската комплексност на овој код е 10. Истата ја имам добиено со формулата P+1, односно бројот на предикатни јазли, каде P=9 (9+1=10). Втор начин за проверка е да се избројат регионите во CFG, плус надворешниот регион со кој се добива цикломатската комплексност да биде повторно 10.

### Тест случаи според критериумот  Every branch
![EveryBranch](https://private-user-images.githubusercontent.com/117124883/333871531-f1e043f7-4ff5-4f2e-84d1-5feb051a1182.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTY3MTkzMzksIm5iZiI6MTcxNjcxOTAzOSwicGF0aCI6Ii8xMTcxMjQ4ODMvMzMzODcxNTMxLWYxZTA0M2Y3LTRmZjUtNGYyZS04NGQxLTVmZWIwNTFhMTE4Mi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTI2JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUyNlQxMDIzNTlaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0xZmU1YzBkNTkwODkwYjYxOWY0MDQ3ZDc5OWRlZDRlNzlmYzk3MTc0NjUzYzY2MTkyNDBiNjJjY2M0OTM3OGIyJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.bBdZ1XhnxZIV7jR01BIew94dpSsgQCHIX32_bPJBDGQ)

### Тест случаи според критериумот Multiple Condition
![MC1](https://private-user-images.githubusercontent.com/117124883/333871376-5c4f256f-f5f7-4d64-996a-34e430cc67a7.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTY3MTkxNTksIm5iZiI6MTcxNjcxODg1OSwicGF0aCI6Ii8xMTcxMjQ4ODMvMzMzODcxMzc2LTVjNGYyNTZmLWY1ZjctNGQ2NC05OTZhLTM0ZTQzMGNjNjdhNy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTI2JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUyNlQxMDIwNTlaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT00NWUwZmNiM2NjYjEyYmYyZjE2YjBmMTNlYTJjMmQ5OGI3YzNiODQ3Nzc4NDk4ZDk1ZDI5MjQxMzE0OGNkMDE2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.iuMWdJpqAu3mkH1xJsXuVPoo19nCtj2QDt5CKLfiel8)

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