-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 15, 2018 at 10:57 PM
-- Server version: 10.1.32-MariaDB
-- PHP Version: 7.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tracsales`
--

-- --------------------------------------------------------

--
-- Table structure for table `capital`
--

CREATE TABLE `capital` (
  `id` int(11) NOT NULL,
  `amount` varchar(200) NOT NULL,
  `dated_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `capital`
--

INSERT INTO `capital` (`id`, `amount`, `dated_on`) VALUES
(4, '400000', '0000-00-00 00:00:00'),
(5, '330000.0', '2018-06-24 16:31:22'),
(6, '674444.0', '2018-06-24 16:48:40'),
(7, '694444.0', '2018-06-24 16:48:56'),
(8, '794444.0', '2018-06-24 16:49:21'),
(9, '1794444.0', '2018-06-24 21:24:09'),
(10, '1804444.0', '2018-06-24 22:13:29'),
(11, '3026666.0', '2018-06-25 00:24:54'),
(12, '4026666.0', '2018-06-25 13:03:53'),
(13, '6359999.0', '2018-06-25 13:17:40'),
(14, '4359999.0', '2018-06-25 15:00:06'),
(15, '4369999.0', '2018-06-25 16:34:13'),
(16, '4382120.0', '2018-06-25 18:25:42');

-- --------------------------------------------------------

--
-- Table structure for table `expense`
--

CREATE TABLE `expense` (
  `id` int(11) NOT NULL,
  `description` varchar(1000) NOT NULL,
  `amount` varchar(200) NOT NULL,
  `dated_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expense`
--

INSERT INTO `expense` (`id`, `description`, `amount`, `dated_on`) VALUES
(1, 'Lunch For John', '2000', '2018-06-24 23:21:27'),
(2, 'Natural Food', '200', '2018-06-25 00:33:42'),
(3, 'Cooking Stick ', '100', '2018-06-25 00:34:05'),
(4, 'Get Chapo', '20', '2018-06-25 04:46:51'),
(5, '', '', '2018-06-25 06:30:52'),
(6, '', '', '2018-06-25 16:49:01'),
(7, 'BY food', '4000', '2018-08-15 22:56:28');

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `nationalid` varchar(200) NOT NULL,
  `weight` varchar(100) NOT NULL,
  `customer` varchar(20) NOT NULL,
  `cerial_type` varchar(100) NOT NULL,
  `cost` varchar(200) NOT NULL,
  `purchased_on` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`id`, `name`, `nationalid`, `weight`, `customer`, `cerial_type`, `cost`, `purchased_on`) VALUES
(10, 'Ommabia Kefa', '323232', '40000.0', 'Broker', '', '1200000.0', '2018-06-24 13:20:20'),
(11, 'Mark Brian', '423232', '3000.0', 'Regular', 'beans', '90000.0', '2018-06-24 13:22:24'),
(12, 'omkambia', '787878', '4000.0', 'Regular', '', '120000.0', '2018-06-24 15:49:28'),
(13, 'Kevo Meru', '23232323', '3400.0', 'Regular', '', '102000.0', '2018-06-24 21:24:37'),
(14, 'Manu', '1111212', '1000.0', 'Regular', '', '30000.0', '2018-06-25 00:23:48'),
(15, 'Jkada', '2312', '1212.0', 'Broker', '', '36360.0', '2018-06-25 00:24:12'),
(16, 'Jkada', '2312', '1212.0', 'Broker', '', '36360.0', '2018-06-25 00:24:25'),
(17, 'Manu', '1111212', '1000.0', 'Regular', '', '30000.0', '2018-06-25 00:24:27'),
(18, 'Jkada', '2312', '1212.0', 'Broker', '', '36360.0', '2018-06-25 00:24:29'),
(19, 'Manu', '1111212', '1000.0', 'Regular', '', '30000.0', '2018-06-25 00:24:30'),
(20, 'Jkada', '2312', '1212.0', 'Broker', '', '36360.0', '2018-06-25 00:24:33'),
(21, 'Manu', '1111212', '1000.0', 'Regular', '', '30000.0', '2018-06-25 00:24:34'),
(22, 'Manu', '1111212', '1000.0', 'Regular', '', '30000.0', '2018-06-25 00:24:34'),
(23, 'Manu', '1111212', '1000.0', 'Regular', '', '30000.0', '2018-06-25 00:24:34'),
(24, 'Manu', '1111212', '1000.0', 'Regular', '', '30000.0', '2018-06-25 00:24:35'),
(25, 'Deno Chirchir', '121312312', '1000.0', 'Regular', '', '30000.0', '2018-06-25 15:00:54'),
(26, 'Omannaaa', '1321', '20000.0', 'Regular', '', '600000.0', '2018-06-25 16:34:31'),
(27, 'omambia', '3212123', '23.0', 'Regular', 'beans', '690.0', '2018-07-30 19:47:08'),
(28, 'Kenya Kenya ', '3232423', '45.0', 'Broker', 'beans', '1350.0', '2018-07-30 19:47:23'),
(29, 'Mark O.Brian', '221331', '100.0', 'Regular', 'beans', '3000.0', '2018-07-30 19:47:42'),
(30, 'Clare LImo', '4232231232', '3434.0', 'Broker', 'beans', '103020.0', '2018-07-30 19:48:00'),
(31, 'Clare LImo', '4232231232', '3434.0', 'Broker', 'beans', '103020.0', '2018-07-30 19:48:05'),
(32, 'omama', '1213', '23.0', 'Regular', 'millet', '690.0', '2018-07-30 20:23:36'),
(33, 'wqweower', '121312', '129.0', 'Broker', 'millet', '3870.0', '2018-07-30 20:23:46'),
(34, 'Omadsad', '2212131', '121.0', 'Regular', 'wheat', '3630.0', '2018-07-30 20:25:10'),
(35, 'Kenua42', '24322', '199.0', 'Broker', 'wheat', '5970.0', '2018-07-30 20:25:27'),
(36, 'omada', 'adads', '121.0', 'Regular', 'greenGrams', '3630.0', '2018-07-30 20:36:47'),
(37, 'Omambia', '311131', '12.0', 'Regular', 'maize', '360.0', '2018-08-15 22:44:52'),
(38, 'Omambia', '311131', '12.0', 'Regular', 'maize', '360.0', '2018-08-15 22:44:55'),
(39, 'Omambia', '311131', '12.0', 'Regular', 'maize', '360.0', '2018-08-15 22:44:56'),
(40, 'Kenya One', '311131', '100.0', 'Regular', 'maize', '3000.0', '2018-08-15 22:45:16'),
(41, 'Clare Limo', '31231', '123.0', 'Broker', 'maize', '3690.0', '2018-08-15 22:45:29'),
(42, 'Beans One ', '1231', '124.0', 'Regular', 'beans', '3720.0', '2018-08-15 22:46:02'),
(43, 'Kepkemoi Dennis', '423121', '230.0', 'Broker', 'beans', '6900.0', '2018-08-15 22:46:29'),
(44, 'Clare Limo', '1000823', '123.0', 'Regular', 'greenGrams', '3690.0', '2018-08-15 22:47:47'),
(45, 'Clare Friends', '1231312', '230.0', 'Broker', 'greenGrams', '6900.0', '2018-08-15 22:48:16'),
(46, 'ADd One ONe', '12132', '200.0', 'Regular', 'millet', '6000.0', '2018-08-15 22:48:45'),
(47, 'ONe ONe', '321211', '300.0', 'Broker', 'millet', '9000.0', '2018-08-15 22:49:00'),
(48, 'Wwew', '132121', '300.0', 'Regular', 'wheat', '9000.0', '2018-08-15 22:49:23'),
(49, '121321', '1213', '1212.0', 'Broker', 'wheat', '36360.0', '2018-08-15 22:49:32');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `weight` varchar(200) NOT NULL,
  `type` varchar(200) NOT NULL,
  `cost` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`id`, `name`, `weight`, `type`, `cost`) VALUES
(5, 'Clare Limo', '1000.0', 'beans', '40000.0'),
(6, 'Clare Limo', '1000.0', 'maize', '40000.0'),
(7, 'Clare Limo', '1000.0', 'millet', '40000.0'),
(8, 'clare Me ', '232.0', 'wheat', '9280.0'),
(9, 'clare Me ', '232.0', 'green', '9280.0');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(200) NOT NULL,
  `nationalid` varchar(12) NOT NULL,
  `username` varchar(40) NOT NULL,
  `email` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `is_admin` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `nationalid`, `username`, `email`, `password`, `is_admin`) VALUES
(1, 'OMambia', '312121', 'pyther', 'omambia@brug.africa', '12345', 1),
(2, 'OMambia', '312121', 'pyther', 'omambia@brug.africa', '12345', 0),
(3, 'OMambia', '312121', 'pyther', 'omambia@brug.africa', '12345', 0),
(4, 'OMambia', '312121', 'pyther', 'omambia@brug.africa', '12345', 0),
(5, 'Joshua Omambia', '32134221', 'joshua', 'jomambia@gmail.com', '1234', 0),
(6, 'Ouma Kenya', '321213131', 'Uname', 'uname@gmail.com', '1234', 0),
(7, 'Clare LImo ', '312121', 'limclare', 'limoclare@gmail.com', '12123', 0),
(8, 'Nderitu Dennis', '23233', 'dknderitu', 'dknderitu@kenya.com', 'kenya.com', 0),
(9, 'Kemunto ', '231231', 'userna', 'kemu@gmail.com', '1232', 0),
(10, 'ChirChir Deno', '12131213', 'denno', 'denno@gmail.com', '12345', 0),
(11, 'ManotiK ', '343232212', 'manoti', 'geomanoti@gmail.com', 'manoti', 0),
(12, 'mairura', '26553141', 'mairura', 'mairura@gma.com', '12233', 0),
(13, 'Omambia Dauglous', '1231312', 'pytherKe', 'omambia@gmail.com', '12345', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `capital`
--
ALTER TABLE `capital`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `expense`
--
ALTER TABLE `expense`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `capital`
--
ALTER TABLE `capital`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `expense`
--
ALTER TABLE `expense`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `purchase`
--
ALTER TABLE `purchase`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT for table `sales`
--
ALTER TABLE `sales`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
