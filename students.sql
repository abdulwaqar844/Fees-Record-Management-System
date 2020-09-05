-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 05, 2020 at 07:14 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `students`
--

-- --------------------------------------------------------

--
-- Table structure for table `feesdetails`
--

CREATE TABLE `feesdetails` (
  `id` int(11) NOT NULL,
  `month` varchar(20) NOT NULL,
  `amount` int(20) NOT NULL,
  `paiddate` date NOT NULL,
  `stid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feesdetails`
--

INSERT INTO `feesdetails` (`id`, `month`, `amount`, `paiddate`, `stid`) VALUES
(1, 'July', 2500, '2020-07-01', 14),
(2, 'August', 2300, '2020-08-01', 16),
(3, 'July', 2500, '2020-07-02', 14),
(4, 'aug', 2500, '2020-08-02', 16),
(5, 'September', 1950, '2020-09-01', 14),
(6, 'September', 1999, '2020-09-03', 16),
(7, 'September', 2750, '2020-09-04', 18),
(8, 'September', 1500, '2020-09-01', 18),
(9, 'September', 2300, '2020-08-31', 19);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(11) NOT NULL,
  `stname` varchar(20) NOT NULL,
  `fname` varchar(20) NOT NULL,
  `rollno` varchar(10) NOT NULL,
  `sclass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `stname`, `fname`, `rollno`, `sclass`) VALUES
(16, 'waqar', 'Ilyas Khan', 'mc1704039', 'mcs'),
(18, 'Fayaz Ahmad', 'akbar', 'mc1704039', 'MIT'),
(19, 'Abdul Waqar', 'M Ilyas', 'BO320052', 'asdf');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `feesdetails`
--
ALTER TABLE `feesdetails`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `feesdetails`
--
ALTER TABLE `feesdetails`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
