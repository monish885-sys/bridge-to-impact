# Bridge to Impact

Early community / peer-learning prototype: static web pages plus a **Java student matcher** that pairs learners by academic strengths and gaps.

## What’s inside

- `index.html` / `landing.html` / `registration.html` — public pages
- `Main.java`, `StudentMatcher.java`, `student.java` — matching prototype
- Assets from campus CSP / EduMate experiments

## Run web

```bash
python3 -m http.server 8080
```

## Run matcher

```bash
javac *.java && java Main
```

## Portfolio note

Spiritual predecessor to `edumate-peer-matcher` (Node/EJS). Kept as the original Bridge-to-Impact artifact.
