# Втора лабораториска вежба по Софтверско инженерство

## Бранко Миленков, 223010


###  Control Flow Graph

![CFG](https://private-user-images.githubusercontent.com/117124883/333868976-4c529844-6aa6-4c61-bb6e-d88b27d24af2.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTY3MTY5MDMsIm5iZiI6MTcxNjcxNjYwMywicGF0aCI6Ii8xMTcxMjQ4ODMvMzMzODY4OTc2LTRjNTI5ODQ0LTZhYTYtNGM2MS1iYjZlLWQ4OGIyN2QyNGFmMi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTI2JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUyNlQwOTQzMjNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT03ZmM4MTFhYjkyMGM0ZTM2NTg3ZGNiM2VhMWU5NDcxY2Y5YmY3OTIxMDNhOWRmYmM0NDc0NjQxOWMyMzg0NGFlJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.25zboDjpEnVkkMGEt09L_LRJSdM2H4Lj8DqetaYifus)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 10. Истата ја имам добиено со формулата P+1, односно бројот на предикатни јазли, каде P=9 (9+1=10). Втор начин за проверка е да се избројат регионите во CFG, плус надворешниот регион со кој се добива цикломатската комплексност да биде повторно 10.

### Тест случаи според критериумот  Every branch

![EveryBranch](https://private-user-images.githubusercontent.com/117124883/333869028-22825e21-7309-4bac-958e-6dd892102f4b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTY3MTY5MDMsIm5iZiI6MTcxNjcxNjYwMywicGF0aCI6Ii8xMTcxMjQ4ODMvMzMzODY5MDI4LTIyODI1ZTIxLTczMDktNGJhYy05NThlLTZkZDg5MjEwMmY0Yi5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTI2JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUyNlQwOTQzMjNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT05NjdkMDNmNDE0ZjFjNWM2MTgxYzBhNGIzMDhkODg3ZjEyNTgxMDkzNWFkY2VjNDNmNmQwMjNlNGM5ZTUyMDBiJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.texcBJ7N361Wr8y1Sf90NYRpBmEvCNsM9FmoHiEnhp0)
### Тест случаи според критериумот Multiple Condition
![MC1](https://private-user-images.githubusercontent.com/117124883/333869065-53c064f0-4a72-47a4-aacd-97d763bfbd57.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTY3MTY5MDMsIm5iZiI6MTcxNjcxNjYwMywicGF0aCI6Ii8xMTcxMjQ4ODMvMzMzODY5MDY1LTUzYzA2NGYwLTRhNzItNDdhNC1hYWNkLTk3ZDc2M2JmYmQ1Ny5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTI2JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUyNlQwOTQzMjNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT05OTU2Y2RhNWRmNjdkM2M4MzE0YWRjNjI4NjRiOGZhNDY2MDZmOGVjNWVlNjIwZmEyMmY2ODdiN2Q5MjE2NjZlJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.-Awv2rbk7SjsOq8YZXrojRHgNIXwjniydo_BeYDBWJc)

![MC2](https://private-user-images.githubusercontent.com/117124883/333869092-9419ad75-79d0-4a97-ba4d-08d11cd62b33.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MTY3MTY5MDMsIm5iZiI6MTcxNjcxNjYwMywicGF0aCI6Ii8xMTcxMjQ4ODMvMzMzODY5MDkyLTk0MTlhZDc1LTc5ZDAtNGE5Ny1iYTRkLTA4ZDExY2Q2MmIzMy5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQwNTI2JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MDUyNlQwOTQzMjNaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT1kMzU3NWNlYmMxODRhMTU0MzhhODhiYjE5ODdmYjRmYjc1MGJhYWYwNWFhYzMxZmU4OTEyYzMxOTc1MTFlMWU2JlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCZhY3Rvcl9pZD0wJmtleV9pZD0wJnJlcG9faWQ9MCJ9.9_8Uo8IZ1jyox__8DHKJzqUgdVWCfbez8S9t_DdpLlI)
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