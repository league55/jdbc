
# FIND null values
SELECT * FROM ORDERS WHERE ITEM IS NULL;

#SELECT TOP 1
SELECT ID FROM CUSTOMER LIMIT 1;

#MIN MAX
SELECT MAX(QUANTITY) FROM customers.ORDERS;

#COUNT, AVG, SUM
# AVARAGE QUANTITY:
SELECT AVG(QUANTITY) FROM customers.ORDERS;

#LIKE, - find string by regExp:
# song name starts with 'K':
SELECT * FROM MUSIC WHERE SONG_NAME LIKE 'K%';

# song name with only letters:
SELECT * FROM MUSIC WHERE SONG_NAME REGEXP '\D';

# INNER JOIN
SELECT MUSIC.SONG_NAME, ORDERS.QUANTITY, MUSIC.CREATED_DATE
FROM ORDERS
INNER JOIN MUSIC ON MUSIC.ID = ORDERS.SONG_ID;

# COMPLEX INNER JOIN TO BIND DATA VIA 3RD TABLE
# find all songs appear in movies
SELECT MOVIES.MOVIE_NAME, MUSIC.SONG_NAME
FROM (MOVIES_MUSIC
  INNER JOIN MOVIES ON MOVIES_MUSIC.MOVIE_ID = MOVIES.ID)
  INNER JOIN MUSIC ON MOVIES_MUSIC.SONG_ID = MUSIC.ID;

# COMPLEX INNER JOIN TO BIND DATA VIA 3RD TABLE
# find all songs appear in movies
SELECT MOVIES.MOVIE_NAME, MUSIC.SONG_NAME
FROM (MOVIES
  RIGHT JOIN MOVIES ON MOVIES_MUSIC.MOVIE_ID = MOVIES.ID)
  RIGHT JOIN MUSIC ON MOVIES_MUSIC.SONG_ID = MUSIC.ID;

