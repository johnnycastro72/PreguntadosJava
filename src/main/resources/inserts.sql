USE preguntados;

-- The prize table is filled
INSERT INTO prize (pri_value) VALUES (100000);
INSERT INTO prize (pri_value) VALUES (200000);
INSERT INTO prize (pri_value) VALUES (300000);
INSERT INTO prize (pri_value) VALUES (400000);
INSERT INTO prize (pri_value) VALUES (1000000);

-- The category table is filled
INSERT INTO category (cat_level) VALUES ("Nivel 1");
INSERT INTO category (cat_level) VALUES ("Nivel 2");
INSERT INTO category (cat_level) VALUES ("Nivel 3");
INSERT INTO category (cat_level) VALUES ("Nivel 4");
INSERT INTO category (cat_level) VALUES ("Nivel 5");

-- The round table is filled
INSERT INTO round (rou_prize_id, rou_category_id) VALUES (1, 1);
INSERT INTO round (rou_prize_id, rou_category_id) VALUES (2, 2);
INSERT INTO round (rou_prize_id, rou_category_id) VALUES (3, 3);
INSERT INTO round (rou_prize_id, rou_category_id) VALUES (4, 4);
INSERT INTO round (rou_prize_id, rou_category_id) VALUES (5, 5);

INSERT INTO question (que_category_id, que_text) VALUES (1, "¿Cuál de los siguientes sería atraído por un imán?");
INSERT INTO question (que_category_id, que_text) VALUES (1, "¿Qué nombre tiene tradicionalmente la fiesta que se hace a una mujer que espera un bebé?");
INSERT INTO question (que_category_id, que_text) VALUES (1, "¿En dónde es más probable que escuches la orden \"Limpieza en el pasillo 5\"?");
INSERT INTO question (que_category_id, que_text) VALUES (1, "Una canción de cuna se canta para ayudar a los bebés a...");
INSERT INTO question (que_category_id, que_text) VALUES (1, "¿Cuál de estos es un instrumento musical?");
INSERT INTO question (que_category_id, que_text) VALUES (2, "¿De qué país son nativos los canguros?");
INSERT INTO question (que_category_id, que_text) VALUES (2, "¿Cuántos años tiene un siglo?");
INSERT INTO question (que_category_id, que_text) VALUES (2, "¿Cuántos lados iguales tiene un triangulo isósceles?");
INSERT INTO question (que_category_id, que_text) VALUES (2, "¿Cuál de los siguientes es un continente?");
INSERT INTO question (que_category_id, que_text) VALUES (2, "¿Cuál de los siguientes es un estado de la materia?");
INSERT INTO question (que_category_id, que_text) VALUES (3, "¿Qué usamos para diluir los colores de las acuarelas?");
INSERT INTO question (que_category_id, que_text) VALUES (3, "¿Cuál de estos pintores hace pinturas con forma geométricas?");
INSERT INTO question (que_category_id, que_text) VALUES (3, "¿Qué parte del cuerpo se cortó Vicent Van Gogh?");
INSERT INTO question (que_category_id, que_text) VALUES (3, "¿Qué país es el que ha ganado más mundiales?");
INSERT INTO question (que_category_id, que_text) VALUES (3, "¿Qué significan las siglas ADN?");
INSERT INTO question (que_category_id, que_text) VALUES (4, "¿Cuál es el elemento más abundante de la Tierra?");
INSERT INTO question (que_category_id, que_text) VALUES (4, "¿Cómo se llama el protagonista de la saga de videojuegos \"La Leyenda de Zelda\"?");
INSERT INTO question (que_category_id, que_text) VALUES (4, "¿Dónde se inventó el Ping-Pong?");
INSERT INTO question (que_category_id, que_text) VALUES (4, "¿Cuántos elementos tiene la tabla periódica?");
INSERT INTO question (que_category_id, que_text) VALUES (4, "¿Cuál es la velocidad de la luz?");
INSERT INTO question (que_category_id, que_text) VALUES (5, "¿En qué ciudad se entrevistaron Hitler y Franco?");
INSERT INTO question (que_category_id, que_text) VALUES (5, "¿Qué ciencia estudia la sangre?");
INSERT INTO question (que_category_id, que_text) VALUES (5, "¿Cuál fue la primera película de Disney?");
INSERT INTO question (que_category_id, que_text) VALUES (5, "¿Cuál fue la primera película en ganar el Óscar a \"Mejor película\"?");
INSERT INTO question (que_category_id, que_text) VALUES (5, "¿Cuántos jugadores hay en un equipo de voleibol?");

-- The answer table is filled
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (1, "Metal", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (1, "Madera", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (1, "Plástico", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (1, "Papel", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (2, "Baby drizzle", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (2, "Baby downpour", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (2, "Baby deluge", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (2, "Baby shower", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (3, "En un banco", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (3, "En un supermercado", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (3, "En un jardín infantil", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (3, "En una montaña rusa", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (4, "Despertar", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (4, "Comer", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (4, "Dormir", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (4, "Llorar", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (5, "Silla", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (5, "Corbata", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (5, "Bolso", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (5, "Guitarra", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (6, "Perú", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (6, "Kenia", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (6, "Australia", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (6, "Irlanda", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (7, "10 años", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (7, "100 años", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (7, "1000 años", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (7, "1 año", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (8, "2", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (8, "3", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (8, "0", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (8, "4", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (9, "Alemania", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (9, "Europa", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (9, "Medellín", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (9, "Qatar", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (10, "Suave", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (10, "Rígido", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (10, "Sólido", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (10, "Transparente", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (11, "Agua", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (11, "Aceite", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (11, "Varsol", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (11, "Thinner", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (12, "Leonardo da Vinci", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (12, "Salvador Dalí", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (12, "Pablo Picasso", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (12, "Vicent van Gogh", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (13, "Labios", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (13, "Mano", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (13, "Nariz", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (13, "Oreja", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (14, "Italia", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (14, "Rusia", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (14, "Brasil", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (14, "Argentina", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (15, "Ácido deoxicólico", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (15, "Ácido ribonucleico", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (15, "Ácido desmineralizante", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (15, "Ácido desoxirribonucleico", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (16, "Hidrógeno", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (16, "Oxigeno", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (16, "Helio", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (16, "Litio", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (17, "Zelda", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (17, "Navi", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (17, "Impa", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (17, "Link", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (18, "China", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (18, "Inglaterra", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (18, "Alemania", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (18, "Perú", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (19, "118", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (19, "350", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (19, "50", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (19, "101", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (20, "200 km/s", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (20, "300.000 km/s", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (20, "38.000 km/s", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (20, "100.000 km/s", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (21, "Hendaya", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (21, "Lyon", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (21, "Niza", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (21, "Marsella", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (22, "La anatomía", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (22, "La hematología", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (22, "La neurociencia", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (22, "La hemología", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (23, "Dumbo", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (23, "Fantasía", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (23, "Blancanieves", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (23, "Pinocho", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (24, "Sin novedad en el frente", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (24, "¡Qué verde era mi valle!", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (24, "Un americano en París", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (24, "Alas", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (25, "6", true);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (25, "2", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (25, "11", false);
INSERT INTO answer (ans_question_id, ans_text, ans_correct) VALUES (25, "5", false);

-- select question.que_text as "pregunta", ans_text as "opcion", ans_correct as "calificación"  from answer join question ON ans_question_id = que_id where ans_correct = 1 order by que_id;
