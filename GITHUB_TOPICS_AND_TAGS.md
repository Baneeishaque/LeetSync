# GitHub Topics and Tags for LeetSync Repository

## Repository Analysis

This repository contains **LeetCode problem solutions** synced using the LeetSync tool. The solutions are written in **Java** and cover various algorithmic topics including:

- **Binary Search** (e.g., Kth Missing Positive Number, Sqrt(x))
- **Array Manipulation** (e.g., Concatenation of Array, Check if Two String Arrays are Equivalent)
- **Math** (e.g., Smallest Even Multiple, Divisible and Non-divisible Sums Difference)
- **Easy difficulty problems**

---

## Recommended GitHub Topics

Based on the repository analysis, the following topics are recommended:

### Primary Topics (Essential)
| Topic | Description |
|-------|-------------|
| `leetcode` | LeetCode problem solutions repository |
| `leetcode-solutions` | Collection of LeetCode solutions |
| `leetcode-java` | LeetCode solutions in Java |
| `java` | Primary programming language |
| `algorithms` | Algorithmic problem solving |
| `data-structures` | Data structures implementation |

### Secondary Topics (Recommended)
| Topic | Description |
|-------|-------------|
| `leetsync` | Synced using LeetSync Chrome extension |
| `coding-interview` | Interview preparation material |
| `competitive-programming` | Competitive programming practice |
| `problem-solving` | Problem-solving skills |
| `dsa` | Data Structures and Algorithms |
| `coding-practice` | Coding practice solutions |

### Algorithm-Specific Topics
| Topic | Description |
|-------|-------------|
| `binary-search` | Binary search algorithm solutions |
| `array` | Array manipulation problems |
| `math` | Mathematical problems |

---

## Methods to Add GitHub Topics

### Method 1: GitHub CLI (gh)

The GitHub CLI provides the easiest way to manage repository topics programmatically.

#### Install GitHub CLI
```bash
# macOS
brew install gh

# Windows
winget install --id GitHub.cli

# Ubuntu/Debian
sudo apt install gh

# Or via conda
conda install gh --channel conda-forge
```

#### Authenticate
```bash
gh auth login
```

#### Add Topics Using GitHub CLI

```bash
# Set all topics at once (this replaces existing topics)
gh repo edit Baneeishaque/LeetSync --add-topic leetcode --add-topic leetcode-solutions --add-topic leetcode-java --add-topic java --add-topic algorithms --add-topic data-structures --add-topic leetsync --add-topic coding-interview --add-topic competitive-programming --add-topic problem-solving --add-topic dsa --add-topic binary-search --add-topic array --add-topic math --add-topic coding-practice

# Or add topics one by one
gh repo edit Baneeishaque/LeetSync --add-topic leetcode
gh repo edit Baneeishaque/LeetSync --add-topic leetcode-solutions
gh repo edit Baneeishaque/LeetSync --add-topic leetcode-java
gh repo edit Baneeishaque/LeetSync --add-topic java
gh repo edit Baneeishaque/LeetSync --add-topic algorithms
gh repo edit Baneeishaque/LeetSync --add-topic data-structures
gh repo edit Baneeishaque/LeetSync --add-topic leetsync
gh repo edit Baneeishaque/LeetSync --add-topic coding-interview
gh repo edit Baneeishaque/LeetSync --add-topic competitive-programming
gh repo edit Baneeishaque/LeetSync --add-topic problem-solving
gh repo edit Baneeishaque/LeetSync --add-topic dsa
gh repo edit Baneeishaque/LeetSync --add-topic binary-search
gh repo edit Baneeishaque/LeetSync --add-topic array
gh repo edit Baneeishaque/LeetSync --add-topic math
gh repo edit Baneeishaque/LeetSync --add-topic coding-practice
```

#### View Current Topics
```bash
gh repo view Baneeishaque/LeetSync --json repositoryTopics
```

#### Remove a Topic
```bash
gh repo edit Baneeishaque/LeetSync --remove-topic topic-name
```

---

### Method 2: GitHub Web Interface

1. Navigate to your repository: https://github.com/Baneeishaque/LeetSync
2. Click on the ⚙️ (gear icon) next to "About" on the right sidebar
3. In the "Topics" field, enter topics separated by spaces or commas
4. Click "Save changes"

---

### Method 3: GitHub REST API

#### Using cURL

```bash
# Set topics using REST API
curl -X PUT \
  -H "Accept: application/vnd.github+json" \
  -H "Authorization: Bearer YOUR_GITHUB_TOKEN" \
  -H "X-GitHub-Api-Version: 2022-11-28" \
  https://api.github.com/repos/Baneeishaque/LeetSync/topics \
  -d '{"names":["leetcode","leetcode-solutions","leetcode-java","java","algorithms","data-structures","leetsync","coding-interview","competitive-programming","problem-solving","dsa","binary-search","array","math","coding-practice"]}'
```

#### Using Python

```python
import requests

# Your GitHub personal access token
token = "YOUR_GITHUB_TOKEN"
repo = "Baneeishaque/LeetSync"

headers = {
    "Accept": "application/vnd.github+json",
    "Authorization": f"Bearer {token}",
    "X-GitHub-Api-Version": "2022-11-28"
}

topics = {
    "names": [
        "leetcode",
        "leetcode-solutions", 
        "leetcode-java",
        "java",
        "algorithms",
        "data-structures",
        "leetsync",
        "coding-interview",
        "competitive-programming",
        "problem-solving",
        "dsa",
        "binary-search",
        "array",
        "math",
        "coding-practice"
    ]
}

response = requests.put(
    f"https://api.github.com/repos/{repo}/topics",
    headers=headers,
    json=topics
)

print(response.status_code)
print(response.json())
```

#### Using JavaScript (Node.js with Octokit)

```javascript
const { Octokit } = require("@octokit/rest");

const octokit = new Octokit({
  auth: "YOUR_GITHUB_TOKEN"
});

async function setTopics() {
  const response = await octokit.rest.repos.replaceAllTopics({
    owner: "Baneeishaque",
    repo: "LeetSync",
    names: [
      "leetcode",
      "leetcode-solutions",
      "leetcode-java",
      "java",
      "algorithms",
      "data-structures",
      "leetsync",
      "coding-interview",
      "competitive-programming",
      "problem-solving",
      "dsa",
      "binary-search",
      "array",
      "math",
      "coding-practice"
    ]
  });
  
  console.log(response.data);
}

setTopics();
```

---

### Method 4: GitHub GraphQL API

```graphql
mutation {
  updateTopics(input: {
    repositoryId: "YOUR_REPO_NODE_ID"
    topicNames: [
      "leetcode",
      "leetcode-solutions",
      "leetcode-java",
      "java",
      "algorithms",
      "data-structures",
      "leetsync",
      "coding-interview",
      "competitive-programming",
      "problem-solving",
      "dsa",
      "binary-search",
      "array",
      "math",
      "coding-practice"
    ]
  }) {
    repository {
      repositoryTopics(first: 20) {
        nodes {
          topic {
            name
          }
        }
      }
    }
  }
}
```

To get the repository Node ID:
```graphql
query {
  repository(owner: "Baneeishaque", name: "LeetSync") {
    id
  }
}
```

---

### Method 5: GitHub Actions (Automated)

Create a workflow file `.github/workflows/update-topics.yml`:

```yaml
name: Update Repository Topics

on:
  workflow_dispatch:

jobs:
  update-topics:
    runs-on: ubuntu-latest
    steps:
      - name: Update topics
        uses: actions/github-script@v7
        with:
          script: |
            await github.rest.repos.replaceAllTopics({
              owner: context.repo.owner,
              repo: context.repo.repo,
              names: [
                'leetcode',
                'leetcode-solutions',
                'leetcode-java',
                'java',
                'algorithms',
                'data-structures',
                'leetsync',
                'coding-interview',
                'competitive-programming',
                'problem-solving',
                'dsa',
                'binary-search',
                'array',
                'math',
                'coding-practice'
              ]
            });
            console.log('Topics updated successfully!');
```

---

## Quick Copy: All Topics

Here are all the recommended topics in a comma-separated format for easy copying:

```
leetcode, leetcode-solutions, leetcode-java, java, algorithms, data-structures, leetsync, coding-interview, competitive-programming, problem-solving, dsa, binary-search, array, math, coding-practice
```

---

## Repository Description Suggestion

You can also update your repository description to improve discoverability:

```
🧩 My LeetCode solutions synced with LeetSync | Java implementations for coding interviews and competitive programming practice
```

### Update Description via GitHub CLI

```bash
gh repo edit Baneeishaque/LeetSync --description "🧩 My LeetCode solutions synced with LeetSync | Java implementations for coding interviews and competitive programming practice"
```

---

## Note on GitHub Topics vs Tags

- **GitHub Topics** are labels applied at the repository level to help categorize and discover repositories. They appear below the repository description.

- **Git Tags** are references to specific points in Git history, typically used for marking release points (e.g., v1.0.0). For a LeetCode solutions repository, Git tags are typically not needed unless you want to mark milestones.

If you want to add Git tags for milestones, use:
```bash
# Create a tag
git tag -a v1.0.0 -m "First 10 LeetCode problems solved"
git push origin v1.0.0

# List all tags
git tag -l
```

---

## Summary

The recommended topics will help your repository:
- ✅ Appear in LeetCode-related searches
- ✅ Be discoverable by other programmers looking for Java solutions
- ✅ Showcase your algorithmic problem-solving skills
- ✅ Connect with the competitive programming community
