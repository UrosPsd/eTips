insert into club (name, city, average_points_received, club_defense) values ('MIAMI_HEAT','Miami',100.0,'NA');
insert into club (name, city, average_points_received, club_defense) values ('DENVER_NUGGETS','Denver',80.0,'NA');
insert into club (name, city, average_points_received, club_defense) values ('BOSTON_CELTICS','Boston',80.0,'NA');
insert into club (name, city, average_points_received, club_defense) values ('ATLANTA_HAWKS','Atlanta',100.0,'NA');
insert into club (name, city, average_points_received, club_defense) values ('BROOKLYN_NETS','Brooklyn',100.0,'NA');
insert into club (name, city, average_points_received, club_defense) values ('LOS_ANGELES_LAKERS','Los Angeles',100.0,'NA');
insert into club (name, city, average_points_received, club_defense) values ('DALLAS_MAVERICKS','Dallas',100.0,'NA');
insert into club (name, city, average_points_received, club_defense) values ('CHICAGO_BULLS','Chicago',100.0,'NA');

insert into player(name,surname,club_id,injury,player_form) values ('Jimmy','Butler',1,false,'NA');
insert into player(name,surname,club_id,injury,player_form) values ('Nikola','Jokic',2,false,'NA');
insert into player(name,surname,club_id,injury,player_form) values ('Jayson','Tatum',3,false,'NA');
insert into player(name,surname,club_id,injury,player_form) values ('Bogdan','Bogdanovic',4,false,'NA');
insert into player(name,surname,club_id,injury,player_form) values ('Kevin','Durant',5,false,'NA');
insert into player(name,surname,club_id,injury,player_form) values ('LeBron','James',6,false,'NA');
insert into player(name,surname,club_id,injury,player_form) values ('Luka','Doncic',7,false,'NA');
insert into player(name,surname,club_id,injury,player_form) values ('Nikola','Vucevic',8,false,'NA');

insert into score(points_scored,points_received) values (100,95);
insert into score(points_scored,points_received) values (150,105);
insert into score(points_scored,points_received) values (130,105);

-- Miami Heat vs Denver Nuggets - Heat - 100:95 - Regular
-- Butler 25 - Jokic 30
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-02T18:34:43.261558', 1, true, 25, 2, 'HOME_COURT', 'REGULAR', 1);
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-02T18:34:43.261558', 2, true, 30, 1, 'AWAY_COURT', 'REGULAR', 1);

-- Boston Celtics vs Atlanta Hawks - Boston - 150:105 - Regular
-- Tatum 31 - Bogdanovic 40
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-02T18:34:43.261558', 3, true, 31, 4, 'HOME_COURT', 'REGULAR', 2);
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-02T18:34:43.261558', 4, true, 40, 3, 'AWAY_COURT', 'REGULAR', 2);

-- Kevin Durant injury simulation
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-04T18:34:18.375283', 5, false, 0, 1, 'AWAY_COURT', 'REGULAR', 1);
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-03T18:34:34.138306', 5, false, 0, 2, 'HOME_COURT', 'REGULAR', 2);
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-02T18:34:43.261558', 5, false, 0, 3, 'HOME_COURT', 'REGULAR', 3);

-- LeBron James in form simulation
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-05-01T19:20:01.467245', 6, true, 5, 1, 'AWAY_COURT', 'REGULAR', 1);
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-04T18:34:18.375283', 6, true, 50, 2, 'HOME_COURT', 'REGULAR', 1);
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-03T18:34:18.375283', 6, true, 42, 3, 'AWAY_COURT', 'REGULAR', 1);

-- Luka Doncic out of form simulation
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-05-01T19:20:01.467245', 7, true, 50, 1, 'AWAY_COURT', 'REGULAR', 1);
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-04T18:34:18.375283', 7, true, 5, 2, 'HOME_COURT', 'REGULAR', 1);
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-03T18:34:18.375283', 7, true, 2, 3, 'AWAY_COURT', 'REGULAR', 1);

-- Nikola Vucevic out of form and injury simulation
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-05-01T19:20:01.467245', 8, true, 50, 1, 'AWAY_COURT', 'REGULAR', 1);
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-01T19:20:01.467245', 8, true, 2, 1, 'AWAY_COURT', 'REGULAR', 1);
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-04T18:34:18.375283', 8, false, 0, 1, 'AWAY_COURT', 'REGULAR', 1);
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-03T18:34:34.138306', 8, false, 0, 2, 'HOME_COURT', 'REGULAR', 2);
insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-06-02T18:34:43.261558', 8, false, 0, 3, 'HOME_COURT', 'REGULAR', 3);