# Restaurant Review Platform

A full-stack restaurant review platform project that provides users with the ability to discover, comment on, rate restaurants, while providing access to coupons and encouraging interactions. This project is designed with a front-end and back-end separation architecture.

## Key Features:

- 📝 User registration and login
- 📍 Browse restaurants by category and distance
- 🍽️ View detailed restaurant information
- ⚡ Flash sale functionality for limited-time coupons
- ⭐ Submit reviews and ratings for restaurants
- 🤝 Follow and interact with other users

## Tech Stack:

- **Backend:** Java, Spring Boot, MyBatis-plus, RabbitMQ, Redis, MySQL
- **Frontend:** Vue.js
- **Other:** Nginx

## Technical Highlights:

- 🔑 Session Sharing in Cluster Mode: Utilized Redis to address session sharing challenges in a clustered environment.
- 🛡️ Login Validation & Permission Refresh: Implemented user login validation and permission updates through interceptors.
- 🔄 Cache Consistency: Applied the Cache Aside pattern to maintain consistency between the database and cache.
- 🚀 Hot Data Caching and Optimization: Leveraged Redis to cache hotspot data characterized by extremely high read/write frequency.
- 🎯 Coupon Overselling Prevention: Performed eligibility checks in Redis using Lua scripts and employed optimistic locking.
- 🔒 Distributed Locking: Leveraged Redis distributed locks to safely manage coupon claims in a clustered setup.
- 📩 Asynchronous Flash Sale Ordering: Used RabbitMQ to enable asynchronous processing of flash sale orders.
- 📬 Real-Time Feed Push: Used Redis to deliver posts from followed users with low latency to followers.
- 🤝 Follow & Mutual Follow: Used Redis Set data structure to manage user following and mutual following relationships.
