insert into club (name, city, average_points_received, club_defense) values ('MIAMI HEAT','Miami',100.0,'NA');
insert into club (name, city, average_points_received, club_defense) values ('DENVER NUGGETS','Denver',80.0,'NA');

insert into player(name,surname,club_id,injury,player_form) values ('Jimmy','Butler',1,false,'NA');

insert into score(points_scored,points_received) values (100,95);

insert into game (date_played, player_id, played, points, opposing_club_id, court_type, season_part, score_id) values ('2022-05-30 12:00:00', 1, true, 25, 2, 'HOME_COURT', 'REGULAR', 1);
