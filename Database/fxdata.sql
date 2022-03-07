-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 06, 2022 at 03:01 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fxdata`
--

-- --------------------------------------------------------

--
-- Table structure for table `admins`
--

CREATE TABLE `admins` (
  `id` varchar(20) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admins`
--

INSERT INTO `admins` (`id`, `username`, `password`) VALUES
('', '', ''),
('190426', '7egz', '123'),
('1', 'm', 'm');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` varchar(14) NOT NULL,
  `firstName` varchar(20) NOT NULL,
  `lastName` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` varchar(13) NOT NULL,
  `academicEmail` varchar(50) NOT NULL,
  `level` varchar(10) NOT NULL,
  `course1` varchar(20) NOT NULL,
  `course2` varchar(20) NOT NULL,
  `course3` varchar(20) NOT NULL,
  `course4` varchar(20) NOT NULL,
  `course5` varchar(20) NOT NULL,
  `course6` varchar(20) NOT NULL,
  `mainGpa` varchar(10) DEFAULT NULL,
  `department` varchar(20) NOT NULL,
  `course1Grade` varchar(3) DEFAULT NULL,
  `course2Grade` varchar(3) DEFAULT NULL,
  `course3Grade` varchar(3) DEFAULT NULL,
  `course4Grade` varchar(3) DEFAULT NULL,
  `course5Grade` varchar(3) DEFAULT NULL,
  `course6Grade` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `firstName`, `lastName`, `address`, `phone`, `academicEmail`, `level`, `course1`, `course2`, `course3`, `course4`, `course5`, `course6`, `mainGpa`, `department`, `course1Grade`, `course2Grade`, `course3Grade`, `course4Grade`, `course5Grade`, `course6Grade`) VALUES
('1', 'Mustafa', 'Hgazy', 'menoifa', '02154', '7egz.com', '3', 'ML', 'SWE2', 'Security', 'Algo', 'Mobile', 'KBS', '3.4500', 'CS', '91', '94', '95', '74', '80', '76');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
