# DocAdvisor Website (Frontend) — Product Landing Site for an AI Healthcare Platform Concept

> **DocAdvisor (询医)** is a product concept exploring how **AI-driven medical consultation** and **digital healthcare experiences** can improve public health awareness and accessibility.  
> This repository focuses on the **DocAdvisor official website frontend** — a polished, responsive, media-rich landing site built with **HTML, CSS, and JavaScript** to showcase my **frontend engineering** and **product storytelling** capabilities.  
> [oai_citation:0‡23011008-索行疾探者实践团-实践报告.docx](sediment://file_000000003fc47208a614f0b14fabe37e)

---

## Table of Contents

- [Project Overview](#project-overview)
- [Why This Website Matters (Business Value)](#why-this-website-matters-business-value)
- [What This Repository Contains](#what-this-repository-contains)
- [Key Website Sections](#key-website-sections)
- [Tech Stack](#tech-stack)
- [Project Structure](#project-structure)
- [Screenshots](#screenshots)
- [App Demo Video](#app-demo-video)
- [How to Run Locally](#how-to-run-locally)
- [Deploy as a Live Demo (GitHub Pages)](#deploy-as-a-live-demo-github-pages)
- [Roadmap (Optional Enhancements)](#roadmap-optional-enhancements)
- [License](#license)

---

## Project Overview

**DocAdvisor Website** is a product-oriented landing site designed to introduce the DocAdvisor concept in a credible, structured, and recruiter-friendly way.

This site is built to:

- present a clear product value proposition
- communicate features visually and quickly
- build trust through real-world activities/news-style sections
- demonstrate a modern frontend codebase (HTML/CSS/JS)
- support a “click-and-understand” experience for HR / interviewers

While DocAdvisor as a broader concept includes AI + mobile app + smart hardware scenarios, this repository is **primarily the frontend website implementation** that showcases my web development ability and product thinking.  
[oai_citation:1‡23011008-索行疾探者实践团-实践报告.docx](sediment://file_000000003fc47208a614f0b14fabe37e)

---

## Why This Website Matters (Business Value)

Healthcare and wellness face persistent challenges:

- **Overwork-related health risks** are increasingly common and often ignored until severe outcomes occur.  
  [oai_citation:2‡23011008-索行疾探者实践团-实践报告.docx](sediment://file_000000003fc47208a614f0b14fabe37e)
- **Medical resources are scarce and unevenly distributed**, creating congestion in major hospitals and under-utilization elsewhere.  
  [oai_citation:3‡23011008-索行疾探者实践团-实践报告.docx](sediment://file_000000003fc47208a614f0b14fabe37e)
- **Low adoption of health apps** is driven by concerns about professionalism, usability, and privacy.  
  [oai_citation:4‡23011008-索行疾探者实践团-实践报告.docx](sediment://file_000000003fc47208a614f0b14fabe37e)

A well-designed product website plays a real commercial role:

- **User acquisition:** first-touch conversion for new users
- **Trust building:** credibility through structured explanations and visual evidence
- **Partner communication:** easier storytelling for stakeholders (hospitals, enterprises, communities)
- **Recruiter evaluation:** immediate proof of frontend + product capabilities

This repository therefore demonstrates not only coding, but also **how to present a tech product professionally** — the same skill used in real companies shipping real products.

---

## What This Repository Contains

This repo is a **frontend-only** website codebase, focusing on:

- **Semantic HTML5 structure**
- **Modular CSS (layout + responsive + third-party styles)**
- **JavaScript-driven UI behaviors**
- **Responsive layout and modern UI composition**
- **Media content integration** (screenshots + demo video)
- **Product storytelling flow** (hero → features → scenarios → team → CTA)

If you are a recruiter or interviewer, this project is intentionally designed to be:

- **easy to review**
- **quick to understand**
- **visually convincing**
- **technically clear**

---

## Key Website Sections

Typical sections included in the DocAdvisor website:

1. **Hero / Product Positioning**
   - clear headline and product concept
   - CTA buttons to guide exploration

2. **Feature Highlights**
   - structured presentation of key modules
   - icon-driven explanations for quick reading

3. **News / Updates**
   - credibility section showing activities, interviews, and project progress

4. **Application Scenarios**
   - user-centric scene-based storytelling
   - demonstrates real-world usage contexts

5. **App Introduction**
   - bridges website to mobile product vision
   - supports cross-platform product narrative

6. **Team Introduction**
   - adds authenticity and “startup product” feel
   - communicates collaborative project identity

---

## Tech Stack

### Core

- **HTML5** — semantic layout & structure
- **CSS3** — styling, layout, animation, responsiveness
- **JavaScript (ES6)** — interactions and UI behaviors

### Frontend Engineering Focus

- responsive design & layout organization
- readable and maintainable stylesheet structure
- consistent UI spacing and visual hierarchy
- scalable asset management

---

## Project Structure

Recommended / clean structure (HR-friendly):

```text
docadvisor-web/
├── index.html                  # Main entry (recommended for GitHub Pages)
├── README.md
├── LICENSE
├── css/
│   ├── style.css
│   ├── responsive.css
│   ├── animate.css
│   ├── bootstrap.min.css
│   ├── font-awesome.min.css
│   ├── owl.carousel.min.css
│   ├── owl.theme.default.min.css
│   └── themify-icons.css
├── js/
│   └── main.js                 # Main JS logic (rename if needed)
└── assets/
    ├── images/
    │   ├── Web-mainpage01.png
    │   ├── Web-mainpage03.png
    │   ├── Web-News.png
    │   ├── Web-ScenarioCase.png
    │   ├── Web-mianpae-02.png
    │   └── Web-TeamIntro.png
    └── video/
        └── docadvisor-app-demo.mp4
```

**Important:** If your entry file is currently `mainpage.html`, you can either:

- rename it to `index.html` (recommended), or
- keep it and configure GitHub Pages accordingly.

Also ensure your HTML uses correct paths after organizing folders:

- CSS: `href="css/style.css"`
- JS: `src="js/main.js"`

---

## Screenshots

Place the 6 screenshots into: `assets/images/`

Use the following exact filenames to match the README references:

1. **Homepage — Intelligent Healthcare Solution**
2. **Feature Overview**
3. **News / Updates**
4. **Application Scenarios**
5. **App Introduction Page**
6. **Team Introduction**

---

## App Demo Video

This repository supports including a product demo video (recommended for fast reviewer understanding).

### Option A (Recommended): Store video inside the repo

1. Put your video file here:
   - `assets/video/docadvisor-app-demo.mp4`

2. Add a link in README:

- ▶ Watch the App Demo Video

---

### Option B: Embed the video (works in some Markdown renderers)

```html
<video src="assets/video/docadvisor-app-demo.mp4" controls width="100%"></video>
```

---

### Option C: External hosting (best playback)

- ▶ Watch Demo on YouTube  
- ▶ Watch Demo on Bilibili  

---

## How to Run Locally

### Method 1 — Open directly (fastest)

If the website does not rely on API fetch calls:

1. Open `index.html` directly in your browser (double-click)

✅ fastest  
⚠️ some JS features can be restricted by browser security policies

---

### Method 2 — Run a local static server (recommended)

Running a local server is more professional and avoids file-security issues.

#### Option A — VS Code Live Server (best for beginners)

1. Open the project folder in VS Code  
2. Install extension: **Live Server**  
3. Right-click `index.html`  
4. Select **Open with Live Server**

---

#### Option B — Python built-in server

From the project root directory:

```bash
python -m http.server 8000
```

Then open:

- http://localhost:8000

---

#### Option C — Node static server

If you have Node installed:

```bash
npx serve .
```

Open the URL printed in the terminal.

---

## Deploy as a Live Demo (GitHub Pages)

Publishing a live demo significantly increases recruiter confidence.

1. Go to your repository → **Settings**
2. Find **Pages**
3. Under **Build and deployment**:
   - Source: Deploy from a branch
   - Branch: `main`
   - Folder: `/(root)`
4. Save

Your live site will be available at:

```text
https://<your-username>.github.io/<your-repo-name>/
```

---

## Roadmap (Optional Enhancements)

If I continue iterating this website, I will consider:

- Accessibility improvements (ARIA labels, keyboard navigation)
- Performance optimization (image compression, CSS minification)
- Better asset pipeline (optional npm scripts)
- CI checks (HTML/CSS linting)
- Multi-language support (EN / 中文)
- “Metrics & Feedback” section for validation storytelling

---

## License

MIT License

---

## Recruiter / Interviewer Notes (Optional)

This repository is built as a portfolio-grade frontend project with a product mindset:

- structured, easy to review
- visual evidence (screenshots + demo video)
- scalable folder organization
- clean and maintainable front-end codebase
- focuses on both engineering and product communication

Thank you for reviewing!
