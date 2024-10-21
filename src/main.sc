require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /привет
        a: Привет привет

    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}
        
    state: GetLectureInfo
    intent!: /лекция (.*)
    a: Лекция по теме {{request.query}} охватывает следующие темы: инкапсуляция, наследование и полиморфизм.
    
    state: GetAllLectures
    intent!: /какие лекции доступны
    a: Доступные лекции: ООП, Алгоритмы, Структуры данных, Компьютерные сети. По какой лекции хотите узнать больше?

