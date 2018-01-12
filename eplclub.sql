-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 12, 2018 at 09:55 AM
-- Server version: 10.1.29-MariaDB
-- PHP Version: 7.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `waramundb`
--

-- --------------------------------------------------------

--
-- Table structure for table `eplclub`
--

CREATE TABLE `eplclub` (
  `id` int(11) NOT NULL,
  `clubname` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `stadium` varchar(250) COLLATE utf8_unicode_ci NOT NULL,
  `capacity` int(11) NOT NULL,
  `lastedeplchamp` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `eplclub`
--

INSERT INTO `eplclub` (`id`, `clubname`, `stadium`, `capacity`, `lastedeplchamp`) VALUES
(1, 'Manchester United', 'Old Trafford', 75643, 2013),
(2, 'Arsenal', 'Emirates Stadium', 60432, 2004);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `eplclub`
--
ALTER TABLE `eplclub`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
