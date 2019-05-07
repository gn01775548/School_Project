
-- 1.get all the Twitter singers' name who are the typical singers the the all ompany data.

SELECT s.singer_name,c.Company_name
FROM (Twitter_singers s inner JOIN Company_data c ON c.Typical_singers = s.singer_name)
ORDER BY s.singer_name DESC
LIMIT 10;



-- 2.get the most popular post content for the Twitter singers
SELECT s.singer_name,p.most_popular_post_ID,p.post_content
FROM (Twitter_singers s left JOIN twitter_post p ON s.singer_name = p.singer_name)
ORDER BY p.most_popular_post_ID DESC
LIMIT 10;

-- 3.get the Twitter singers' recent post content in 24 hours 
SELECT s.singer_name,o.recnet_post_ID,o.recnet_post_content
FROM (Twitter_singers s left JOIN 24hr_twitter_post o ON s.singer_name = o.singer_name)
ORDER BY o.recnet_post_ID DESC
LIMIT 10;

-- 4.get all the albums name and id from the Spotify singers'

SELECT s.Spotify_singer_name,o.album_id,o.album_name 
FROM (Spotify_singer_Account s left JOIN Spotify_album o ON s.Spotify_singer_name = o.singer_name)
ORDER BY o.album_id DESC
LIMIT 10;

-- 5.get all the songs name and id from the Spotify singers'

SELECT s.Spotify_singer_name,o.song_id,o.song_name 
FROM (Spotify_singer_Account s inner JOIN Spotify_songs o ON s.Spotify_singer_name = o.singer_name)
ORDER BY o.song_id DESC
LIMIT 10;

-- 6.get all the songs name,id and popularity and from the typical singers of the companies 
SELECT o.song_popularity,o.song_id,o.song_name,c.Company_name,c.Typical_singers
FROM ( Company_data c inner JOIN Spotify_songs o ON o.singer_name = c.Typical_singers)
ORDER BY o.song_id DESC
LIMIT 10;

-- -- 7.get all the Spotify singers' total albums who are the typical singers the the all ompany data.

SELECT s.Spotify_singer_name,s.Spotify_singer_total_albums,c.Company_name
FROM (Spotify_singer_Account s inner JOIN Company_data c ON c.Typical_singers = s.Spotify_singer_name)
ORDER BY s.Spotify_singer_name DESC
LIMIT 10;


-- -- 8.get the Spotify singers' top 1 reliated artists'informatiob Twitter account in Twitter singers 

SELECT t.singer_name,t.singer_name,t.singer_url,t.singer_description,t.singer_followers_count
FROM (Twitter_singers t right JOIN Spotify_singer_Account s ON t.singer_name = s.Spotify_singer_top_1_related_artist)
ORDER BY  t.singer_name DESC
LIMIT 5;


-- 9.get Twitter singers' spotify popularity from Spotify data
SELECT ts.singer_name, ts.singer_id, ss.singer_spotify_popularity  
FROM  (Twitter_singers ts INNER JOIN Spotify_singer_Account ss ON ss.Spotify_singer_name = ts.singer_name)  
ORDER BY ss.singer_spotify_popularity  DESC 
LIMIT 15;

-- 10.Get all song' names and popularity from the album
SELECT S.song_name, S.singer_name, S.song_popularity, A.album_name
FROM (Spotify_songs S INNER JOIN Spotify_album A ON S.album_name = A.album_name)
ORDER BY S.song_popularity  DESC 
LIMIT 10;