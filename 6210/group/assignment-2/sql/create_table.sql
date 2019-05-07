create table Twitter_singers (
singer_id varchar(50) primary key,
singer_name varchar(50),
singer_url varchar(2000),
singer_description varchar(1000),
singer_followers_count varchar(50)
);

drop table Twitter_singers;
SHOW VARIABLES LIKE "secure_file_priv";

sHOW GLOBAL VARIABLES LIKE 'local_infile';
SET GLOBAL local_infile = 'ON';
SHOW GLOBAL VARIABLES LIKE 'local_infile';

LOAD DATA local INFILE '/Users/cyyo/Desktop/twitter_singers.csv'
INTO TABLE Twitter_singers
CHARACTER SET latin1
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"' 
LINES TERMINATED BY '\r\n'
IGNORE 1 LINES;

SELECT * FROM Twitter_singers;

create table Company_data (
Company_name varchar(50) primary key,
Date_of_establishment varchar(50),
Artists_number INTEGER,
Typical_singers varchar(100)
);

LOAD DATA local INFILE '/Users/cyyo/Desktop/company_data.csv'
INTO TABLE Company_data
CHARACTER SET latin1
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"' 
LINES TERMINATED BY '\r\n'
IGNORE 1 LINES;


SELECT * FROM Company_data;

create table Spotify_singer_Account (
Spotify_singer_name varchar(50),
Spotify_singer_ID varchar(50) primary key,
Spotify_singer_followers INTEGER,
singer_spotify_popularity integer,
Spotify_singer_total_albums INTEGER,
Spotify_singer_top_1_related_artist varchar(50),
Spotify_singer_top_2_related_artist varchar(50),
Spotify_singer_top_3_related_artist varchar(50)
);
drop table Spotify_singer_Account;
LOAD DATA local INFILE '/Users/cyyo/Desktop/spotify_artist.csv'
INTO TABLE Spotify_singer_Account
CHARACTER SET latin1
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"' 
LINES TERMINATED BY '\r\n'
IGNORE 1 LINES;


SELECT * FROM Spotify_singer_Account;


create table Spotify_album (
singer_name varchar(50) ,
singer_id varchar(50),
album_name varchar(50),
album_id varchar(50) primary key,
album_relase_date varchar(100),
total_tracks Integer
);
drop table Spotify_album;
LOAD DATA local INFILE '/Users/cyyo/Desktop/spotify_album.csv'
INTO TABLE Spotify_album
CHARACTER SET latin1
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"' 
LINES TERMINATED BY '\r\n'
IGNORE 1 LINES;


SELECT * FROM Spotify_album;

create table Spotify_songs (
singer_name varchar(50) ,
singer_id varchar(50),
song_name varchar(50),
song_id varchar(100) primary key,
duration_ms Integer,
song_popularity integer,
album_name varchar(50),
album_id varchar(50)

);
drop table Spotify_songs;
LOAD DATA local INFILE '/Users/cyyo/Desktop/spotify_song.csv'
INTO TABLE Spotify_songs
CHARACTER SET latin1
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"' 
LINES TERMINATED BY '\r\n'
IGNORE 1 LINES;


SELECT * FROM Spotify_songs;

create table twitter_post (
singer_name varchar(50),
most_popular_post_ID varchar(50) primary key,
post_content varchar(200),
post_time varchar(100),
post_retweet_count Integer
);
drop table twitter_post;
LOAD DATA local INFILE '/Users/cyyo/Desktop/twitter_post.csv'
INTO TABLE twitter_post
CHARACTER SET latin1
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"' 
LINES TERMINATED BY '\r\n'
IGNORE 1 LINES;


SELECT * FROM twitter_post;


create table 24hr_twitter_post (
singer_name varchar(50),
recnet_post_ID varchar(50) primary key,
recnet_post_content varchar(200),
recnet_post_time varchar(100),
recnet_post_retweet_count Integer
);
drop table 24hr_twitter_post;
LOAD DATA local INFILE '/Users/cyyo/Desktop/recent_24hr.csv'
INTO TABLE 24hr_twitter_post
CHARACTER SET latin1
FIELDS TERMINATED BY ',' 
ENCLOSED BY '"' 
LINES TERMINATED BY '\r\n'
IGNORE 1 LINES;


SELECT * FROM 24hr_twitter_post;


