theme:

state: Start
    q!: $regex</start>
    a: Начнем.

state: GetLectureInfo
    intent!: /лекция|тема (.*)
    a: Лекция по теме "{{request.query}}" охватывает следующие темы: инкапсуляция, наследование и полиморфизм.

state: GetAllLectures
    intent!: /какие лекции доступны
    a: Доступные лекции: ООП, Алгоритмы, Структуры данных, Компьютерные сети. По какой лекции хотите узнать больше?

state: NoMatch
    event!: noMatch
    a: Я не понял. Вы сказали: {{request.query}}
