<div align="center">

<img src="https://img.icons8.com/fluency/96/checked-checkbox.png" width="72" alt="Listify Logo"/>

# LISTIFY

### PLAN &nbsp;·&nbsp; ORGANIZE &nbsp;·&nbsp; ACHIEVE

*A clean, modern productivity app for organizing everyday tasks and lists — built natively for Android.*

<br/>

![Kotlin](https://img.shields.io/badge/Kotlin-0D0D0D?style=for-the-badge&logo=kotlin&logoColor=D4AF37)
![Android](https://img.shields.io/badge/Android-0D0D0D?style=for-the-badge&logo=android&logoColor=D4AF37)
![XML](https://img.shields.io/badge/XML-0D0D0D?style=for-the-badge&logo=xml&logoColor=D4AF37)
![Material Design](https://img.shields.io/badge/Material%20Design-0D0D0D?style=for-the-badge&logo=materialdesign&logoColor=D4AF37)

<br/>

![Status](https://img.shields.io/badge/STATUS-IN%20DEVELOPMENT-0D0D0D?style=flat-square&labelColor=D4AF37)
![License](https://img.shields.io/badge/LICENSE-MIT-0D0D0D?style=flat-square&labelColor=D4AF37)
![Platform](https://img.shields.io/badge/PLATFORM-ANDROID-0D0D0D?style=flat-square&labelColor=D4AF37)
![Maintained](https://img.shields.io/badge/MAINTAINED-YES-0D0D0D?style=flat-square&labelColor=D4AF37)

<br/>

<img src="https://img.shields.io/badge/-%20-D4AF37?style=flat-square&labelColor=D4AF37" width="600" height="3" alt=""/>

<br/><br/>

**[ Overview ](#overview)** &nbsp;&nbsp;|&nbsp;&nbsp;
**[ Features ](#features)** &nbsp;&nbsp;|&nbsp;&nbsp;
**[ Screenshots ](#screenshots)** &nbsp;&nbsp;|&nbsp;&nbsp;
**[ Tech Stack ](#tech-stack)** &nbsp;&nbsp;|&nbsp;&nbsp;
**[ Architecture ](#app-architecture)** &nbsp;&nbsp;|&nbsp;&nbsp;
**[ Getting Started ](#getting-started)** &nbsp;&nbsp;|&nbsp;&nbsp;
**[ Roadmap ](#roadmap)** &nbsp;&nbsp;|&nbsp;&nbsp;
**[ Developer ](#developer)**

</div>

<br/>

## Overview

**Listify** is a simple and user-friendly Android productivity app designed to help users organize their everyday tasks and lists in one place. Built with **Kotlin and XML** using modern Android development practices, Listify focuses on clean UI, intuitive navigation, and reusable components — with full support for both **Light** and **Dark** themes, styled around a signature **black, gold, and blush-cream** palette.

<br/>

## Features

<table width="100%">
<tr>
<td width="50%" valign="top">

### Home Screen
- Personalized greeting for the user
- Daily progress tracker with completion count
- Quick-access shortcuts to key list categories
- Study, Buy, Read, Watch, and custom list cards

</td>
<td width="50%" valign="top">

### Lists
- Organized, category-based list management
- RecyclerView-powered list presentation
- Reusable CardView components
- Item counts displayed per list

</td>
</tr>
<tr>
<td width="50%" valign="top">

### Profile
- Dedicated profile and account section
- RecyclerView-based settings menu
- Activity, Favorites, and Notifications access
- Clean, structured layout

</td>
<td width="50%" valign="top">

### Navigation
- Bottom Navigation across major sections
- Fragment-based screen architecture
- Smooth, consistent transitions between screens

</td>
</tr>
</table>

### Theming

<div align="center">

| ![Light](https://img.shields.io/badge/LIGHT-THEME-D4AF37?style=for-the-badge&labelColor=F7E9E3&color=0D0D0D) | ![Dark](https://img.shields.io/badge/DARK-THEME-D4AF37?style=for-the-badge&labelColor=0D0D0D&color=D4AF37) |
|:---:|:---:|
| Soft blush-cream palette with charcoal text | Deep charcoal palette with warm gold accents |
| Optimized for daytime use | Optimized for low-light environments |

</div>

<br/>

## Screenshots

<div align="center">

**Light Mode**

<img src="ScreenShots/lighttheme.jpeg" width="420" alt="Listify Light Mode Screens"/>

<br/><br/>

**Dark Mode**

<img src="ScreenShots/darktheme.jpeg" width="420" alt="Listify Dark Mode Screens"/>

</div>
<br/>

## Tech Stack

<div align="center">

| Technology | Purpose |
|---|---|
| ![Kotlin](https://img.shields.io/badge/Kotlin-0D0D0D?style=flat-square&logo=kotlin&logoColor=D4AF37) | Core application development |
| ![XML](https://img.shields.io/badge/XML-0D0D0D?style=flat-square&logo=xml&logoColor=D4AF37) | UI layout definitions |
| ![Android Studio](https://img.shields.io/badge/Android%20Studio-0D0D0D?style=flat-square&logo=androidstudio&logoColor=D4AF37) | Development environment |
| ![Material Design](https://img.shields.io/badge/Material%20Components-0D0D0D?style=flat-square&logo=materialdesign&logoColor=D4AF37) | UI component library |
| ![Git](https://img.shields.io/badge/Git-0D0D0D?style=flat-square&logo=git&logoColor=D4AF37) | Version control |
| ![GitHub](https://img.shields.io/badge/GitHub-0D0D0D?style=flat-square&logo=github&logoColor=D4AF37) | Source hosting & collaboration |

</div>

**Core Android components used:** RecyclerView · CardView · Fragments · BottomNavigationView · DrawerLayout · Custom Drawables

<br/>

## App Architecture

```
Listify
│
├── Home
│   ├── Greeting & Progress Tracker
│   ├── Study List
│   ├── Buy List
│   ├── Read List
│   ├── Watch List
│   └── Custom Lists
│
├── Lists
│   ├── List Overview (RecyclerView)
│   └── List Items
│
└── Profile
    ├── Account Info
    └── Settings & Preferences
```

<br/>

## Getting Started

<table width="100%">
<tr><td>

**1. Clone the repository**
```bash
git clone https://github.com/<your-username>/Listify.git
```

**2. Open in Android Studio**
```
File → Open → Select the cloned Listify folder
```

**3. Sync Gradle and run**
```
Build → Sync Project with Gradle Files
Run ▶ on an emulator or physical device
```

</td></tr>
</table>

<div align="center">

| Requirement | Version |
|---|---|
| Android Studio | Giraffe or newer |
| Minimum SDK | 21 (Android 5.0) |
| Kotlin | 1.9+ |
| Gradle | 8.0+ |

</div>

<br/>

## Concepts Practiced

This project also serves as a hands-on exploration of core Android development concepts:

- Activity and Fragment lifecycle management
- XML layout design and constraint-based UI
- RecyclerView with custom Adapters and ViewHolders
- CardView-based UI composition
- Fragment-based navigation
- Bottom Navigation and Navigation Drawer implementation
- Custom drawables and resource management
- Light/Dark theme resource switching
- Kotlin data classes
- Git branching and version control workflows

<br/>

## Project Goal

The goal of Listify is to build a practical, polished Android application while strengthening core Android development skills — and to understand how different UI components work together within a real, structured project.

<br/>

## Developer

<div align="center">

<img src="https://img.icons8.com/fluency/96/checked-checkbox.png" width="48" alt=""/>

**Hibba Hanif**

Computer Science Student · Android Developer

<br/>

[![GitHub](https://img.shields.io/badge/GitHub-0D0D0D?style=for-the-badge&logo=github&logoColor=D4AF37)](https://github.com/<h-hibaaah>)
[![Email](https://img.shields.io/badge/Email-0D0D0D?style=for-the-badge&logo=gmail&logoColor=D4AF37)](mailto:hibba5825@gmail.com)

<br/>

*Built with Kotlin and XML*

</div>

---

<div align="center">

<sub>If you found this project useful, consider giving it a star.</sub>

<br/>

![Stars](https://img.shields.io/github/stars/<h-hibaaah>/Listify?style=for-the-badge&labelColor=0D0D0D&color=D4AF37)

</div>
