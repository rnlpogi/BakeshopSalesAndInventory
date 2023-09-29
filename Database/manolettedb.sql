-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2023 at 05:03 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `manolettedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `cashout`
--

CREATE TABLE `cashout` (
  `cashout_id` int(255) NOT NULL,
  `date` date NOT NULL DEFAULT current_timestamp(),
  `time` time NOT NULL DEFAULT current_timestamp(),
  `total_income` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cashout`
--

INSERT INTO `cashout` (`cashout_id`, `date`, `time`, `total_income`) VALUES
(1, '2023-05-23', '21:40:07', 1200),
(2, '2023-05-23', '22:35:25', 1800);

-- --------------------------------------------------------

--
-- Table structure for table `product_details`
--

CREATE TABLE `product_details` (
  `product_id` int(255) NOT NULL,
  `p_name` varchar(255) NOT NULL,
  `p_category` varchar(255) NOT NULL,
  `p_expenses` int(255) NOT NULL,
  `p_prices` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product_details`
--

INSERT INTO `product_details` (`product_id`, `p_name`, `p_category`, `p_expenses`, `p_prices`) VALUES
(2, 'RedVelvet', 'CAKE', 39, 70),
(3, 'BiscuitCake', 'CAKE', 55, 80),
(4, 'ChiffonCake', 'CAKE', 59, 150),
(5, 'PoundCake', 'CAKE', 57, 145),
(6, 'ButterCake', 'CAKE', 36, 78);

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `transaction_ID` int(255) NOT NULL,
  `p_name` varchar(255) NOT NULL,
  `p_category` varchar(11) NOT NULL,
  `p_prices` int(11) NOT NULL,
  `p_expenses` int(11) NOT NULL,
  `p_netincome` int(11) NOT NULL,
  `p_quantity` int(11) NOT NULL,
  `totalcost` int(255) NOT NULL,
  `date` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`transaction_ID`, `p_name`, `p_category`, `p_prices`, `p_expenses`, `p_netincome`, `p_quantity`, `totalcost`, `date`) VALUES
(1, 'creme', 'CAKE', 150, 100, 50, 2, 300, '2023-05-23'),
(2, 'creme', 'CAKE', 150, 100, 50, 2, 300, '2023-05-23'),
(3, 'creme', 'CAKE', 300, 200, 100, 2, 600, '2023-05-23'),
(4, 'creme', 'CAKE', 300, 200, 100, 2, 600, '2023-05-23'),
(5, 'ButterCake', 'CAKE', 156, 72, 84, 2, 312, '2023-05-24'),
(6, 'ButterCake', 'CAKE', 156, 72, 84, 2, 312, '2023-05-24'),
(7, 'ButterCake', 'CAKE', 234, 108, 126, 3, 702, '2023-05-24'),
(8, 'ChiffonCake', 'CAKE', 300, 118, 182, 2, 600, '2023-05-24'),
(9, 'PoundCake', 'CAKE', 290, 114, 176, 2, 580, '2023-05-24');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `account_type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `name`, `username`, `password`, `account_type`) VALUES
(2, 'Admin', 'Admin', 'Admin', 'ADMIN'),
(4, 'Cashier', 'Cashier', 'Cashier', 'CASHIER');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cashout`
--
ALTER TABLE `cashout`
  ADD PRIMARY KEY (`cashout_id`);

--
-- Indexes for table `product_details`
--
ALTER TABLE `product_details`
  ADD PRIMARY KEY (`product_id`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`transaction_ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cashout`
--
ALTER TABLE `cashout`
  MODIFY `cashout_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `product_details`
--
ALTER TABLE `product_details`
  MODIFY `product_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `transaction_ID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
