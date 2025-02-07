INSERT INTO users (user_id, first_name, last_name, email, phone, password_hash, created_at) VALUES (1, 'John', 'Doe', 'john.doe@fakemail.com', '060606060606', '91388kkdjasjqizu', PARSEDATETIME('2014-07-02 06:14:00.742', 'yyyy-MM-dd HH:mm:ss.SSS'));

-- Insert 1: The Wealthy Professor
INSERT INTO users (user_id, first_name, last_name, email, phone, password_hash, created_at) 
VALUES (2, 'Cash', 'Moneybags', 'cash.moneybags@fakemail.com', '080808080808', 'b28a77jsksjsfG67', PARSEDATETIME('2015-11-11 09:22:00.123', 'yyyy-MM-dd HH:mm:ss.SSS'));

-- Insert 2: The Credit Card Enthusiast
INSERT INTO users (user_id, first_name, last_name, email, phone, password_hash, created_at) 
VALUES (3, 'Goldie', 'Platinum', 'goldie.platinum@fakemail.com', '091919191919', '22dks82sd82dksdi', PARSEDATETIME('2017-02-23 14:35:00.456', 'yyyy-MM-dd HH:mm:ss.SSS'));

-- Insert 3: The Overdraft Specialist
INSERT INTO users (user_id, first_name, last_name, email, phone, password_hash, created_at) 
VALUES (4, 'Over', 'Draft', 'over.draft@fakemail.com', '070707070707', 'adkjfh394k23sd9d', PARSEDATETIME('2016-05-30 16:45:10.789', 'yyyy-MM-dd HH:mm:ss.SSS'));

-- Insert 4: The Loan Shark
INSERT INTO users (user_id, first_name, last_name, email, phone, password_hash, created_at) 
VALUES (5, 'Shark', 'Loaner', 'shark.loaner@fakemail.com', '0689567458', 'skdljs93a8dkflsk', PARSEDATETIME('2018-08-15 12:50:00.321', 'yyyy-MM-dd HH:mm:ss.SSS'));

-- Insert 5: The Investment Guru
INSERT INTO users (user_id, first_name, last_name, email, phone, password_hash, created_at) 
VALUES (6, 'Bill', 'Stocks', 'bill.stocks@fakemail.com', '050505050505', 'sjhf82kds0s93d9a', PARSEDATETIME('2019-03-05 13:20:30.456', 'yyyy-MM-dd HH:mm:ss.SSS'));


-- Insert 1: The Wealthy Professor (Encouraging people to deposit more money)
INSERT INTO usercomments (comment_id, user_id, comment, created_at) 
VALUES (1, 2, 'Déposez votre argent à "Le Crédit Apicole" et regardez-le fleurir comme un arbre de dollars ! 🍯🌳', PARSEDATETIME('2015-11-11 09:22:00.123', 'yyyy-MM-dd HH:mm:ss.SSS'));

-- Insert 2: The Credit Card Enthusiast (A push for easy banking)
INSERT INTO usercomments (comment_id, user_id, comment, created_at) 
VALUES (2, 3, 'Avec "Le Crédit Apicole", vos cartes de crédit peuvent obtenir des ailes... et vos économies aussi ! 💳✈️', PARSEDATETIME('2017-02-23 14:35:00.456', 'yyyy-MM-dd HH:mm:ss.SSS'));

-- Insert 3: The Overdraft Specialist (A playful reminder about overdrafts)
INSERT INTO usercomments (comment_id, user_id, comment, created_at) 
VALUES (3, 4, 'Pas de découvert chez "Le Crédit Apicole" ! Venez faire pousser votre argent dans notre ruches d’opportunités. 🐝💰', PARSEDATETIME('2016-05-30 16:45:10.789', 'yyyy-MM-dd HH:mm:ss.SSS'));
