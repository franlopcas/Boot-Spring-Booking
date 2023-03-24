INSERT INTO hotel(name,category) VALUES
('Playa Tropical', 4),
('Rapid inn', 3),
('Playa Victoria', 4),
('Adiafa', 3),
('Hotel Nuro', 1),
('La Fonda Antigua', 5),
('Hostal Trafalgar', 1),
('Hotel Casa Aura', 5),
('Hotel Alhambra', 2),
('La Casa del Califa', 3),
('Hostal Miramar', 1),
('Hotel Madreselva', 2),
('El escondite de Noah', 3),
('Iberostar Royal Andalus', 4),
('Hotel Puerto Sherry', 2);

INSERT INTO bookings(id_hotel,date_from,date_to,email) VALUES
(1,'2023-03-30', '2023-03-31', 'hinotama@gmail.com'),
(5,'2023-04-01', '2023-04-05', 'benito@gmail.com'),
(10,'2023-04-04', '2023-04-07', 'marvin@gmail.com'),
(6,'2023-08-04', '2023-08-08', 'mepiro@gmail.com'),
(3,'2023-10-21', '2023-10-28', 'bugs@outlook.com');

INSERT INTO availabilities(id_hotel,rooms,fecha) VALUES
(1,10,'2023-04-01'),
(1,10,'2023-04-01'),
(1,10,'2023-04-02'),
(1,10,'2023-04-03'),
(1,10,'2023-04-04'),
(1,10,'2023-04-05'),
(1,10,'2023-04-06'),
(1,10,'2023-04-07'),
(1,10,'2023-04-08'),
(1,10,'2023-04-09'),
(1,10,'2023-04-10'),
(2,5,'2023-04-07'),
(10,4,'2023-03-30'),
(6,7,'2023-10-28');
