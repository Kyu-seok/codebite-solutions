# CodeBite Solutions

My accepted solutions to problems on [CodeBite](https://code-bite.com), committed here automatically.

Every time a submission of mine is **Accepted** on CodeBite, it lands in this repository as its own commit, dated the moment it was Accepted. Solving a problem on CodeBite shows up on my GitHub contribution graph too.

## Layout

```
<problem>/
├── README.md                     # problem title, difficulty and a link to it on CodeBite
└── <language>/
    └── <yyyy-MM-ddTHHmmssZ>.<ext>  # one file per Accepted submission
```

- **One folder per problem**, named after the problem's slug on CodeBite (for example `two-sum/`).
- **One subfolder per language**: `java`, `python`, `cpp` or `javascript`.
- **One file per Accepted submission**, named by when it was Accepted, in UTC. Solving the same problem again adds a new file. Nothing is ever overwritten.

## How it works

This repository is linked to my CodeBite account through the CodeBite GitHub App, which can only read and write the contents of this one repository. CodeBite only ever **adds** files here and never edits or deletes anything.

To stop new commits, unlink GitHub from the CodeBite profile page. Everything already here stays.

---

Created from the [CodeBite solutions template](https://github.com/Kyu-seok/codebite-solutions-template).
