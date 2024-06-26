Втора лабораториска вежба по Софтверско инженерство

Сандра Јованчева 223111

# Control Flow Graph

![CFG](https://github.com/sandrajovanceva/SI_2024_lab2_223111/assets/165153015/98909d27-d971-4dbc-b35f-b79dc86ca4c9)

# Цикломатска Комплексност
Цикломатската комплексност на овој код е 10. Истата ја добив со формулата E-N+2(број на ребра-број на јазли+2) или 36-28+2=10.

# Тест случаи според критериумот Every branch

![everybranch](https://github.com/sandrajovanceva/SI_2024_lab2_223111/assets/165153015/0011fc41-39e9-4617-ae08-62bb4dcabdef)

1. Првиот тест случај е кога листата ни е празна и го фрла исклучокот што пишува "allItems list can't be null!"
2. Вториот тест случај е кога не фрламе исклучок и ги поминуваме сите линии од кодот.
3. Третиот тест случај е кога името на item не null.
4. Четвртиот случај е кога баркодот е null и се фрла исклучокот "No barcode!".
5. Петиот случај е кога во баркодот имаме и карактери и се фрла исклучок "Invalid character in item barcode!".

# Тест случаи според критериумот Multiple conditions

![MultipleCond](https://github.com/sandrajovanceva/SI_2024_lab2_223111/assets/165153015/9d0d3ef1-e969-4dde-9cb7-3e4dee7c9f59)

1. Првиот тест случај е кога првиот услов не е исполнет (кога цената на item е помала од 300) и со тоа целиот statement е false.
2. Вториот тест случај е кога првиот услов е исполнет, но вториот не (попустот да е поголем од 0) и со тоа целиот statement е false.
3. Третиот случај е кога и првиот и вториот се исполнети, но третиот не (баркодот да почнува со 0) и со тоа целиот statement е false.
4. Четвртиот случај е кога сите услови се исполнети.

# Објаснување на напишаните unit tests

Првиот тест е наречен testEveryBranch и во него има пет тест случаи:

Во првиот, четвртиот и петиот тест случај користиме RuntimeException ex, каде ex = assertThrows со што потоа ја проверуваме пораката на исклучокот со assertTrue за да се осигураме дека се работи за истиот исклучок. 
Во вториот и третиот тест случај креираме List test, каде test ќе биде еднаква на точните одговори кој ги очекуваме како резултат, а за да ги провериме користиме assertEqual.

Вториот тест е наречен multipleConditions и во него има четири тест случаи:

Во сите тест случаи креираме List test, каде test ќе биде еднаква на точните одговори кој ги очекуваме како резултат, а за да ги провериме користиме assertFalse во првите три и assertTrue во последниот случај.



