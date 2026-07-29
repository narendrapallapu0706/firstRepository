# 🎯 Number Guessing Game
A simple and interactive **Number Guessing Game** built using **Java**. The game generates a secret number within a specified range, and the player must guess it within a limited number of attempts. After each guess, the game provides hints to help the player find the correct number.
---
## 📌 About the Project
The **Number Guessing Game** is a beginner-friendly Java project that demonstrates the use of:
- User input handling
- Conditional statements
- Loops
- Random number generation
- Basic game logic
The system randomly selects a number within a predefined range (for example, **1 to 100**). The player has a limited number of attempts to guess the correct number. After every guess, the program tells the player whether the guessed number is **too high** or **too low** until the correct number is found or the attempts run out.
---
## ✨ Features

- 🎲 Random number generation
- 🔢 Configurable number range (e.g., 1–100)
- 🎯 Limited number of guessing attempts
- 📉 Hint if the guess is too low
- 📈 Hint if the guess is too high
- 🏆 Success message when the correct number is guessed
- ❌ Game over message when all attempts are used

---

## 🛠️ Technologies Used

- Java
- VS Code / IntelliJ IDEA / Eclipse
- Java Scanner Class

---

## 📂 Project Structure

```
firstRepository/
│
├── NumberGuessingGame.java
└── README.md
```

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or later
- Any Java IDE (VS Code, IntelliJ IDEA, Eclipse)

### Clone the Repository

```bash
git clone https://github.com/your-username/firstRepository.git
```

### Navigate to the Project

```bash
cd firstRepository
```

### Compile the Program

```bash
javac NumberGuessingGame.java
```

### Run the Program

```bash
java NumberGuessingGame
```
---

## 🎮 How to Play
1. Start the program.
2. The system randomly selects a secret number within the specified range.
3. Enter your guess.
4. The game will respond with:
   - 📉 **Too Low** – Guess a higher number.
   - 📈 **Too High** – Guess a lower number.
   - ✅ **Correct!** – You guessed the secret number.
5. Continue guessing until:
   - You find the correct number, or
   - You run out of attempts.
---
## 💻 Example Output

```text
Welcome to the Number Guessing Game!

Guess a number between 1 and 100
You have 7 attempts.

Enter your guess: 40
Too Low!

Enter your guess: 75
Too High!

Enter your guess: 62
Too Low!

Enter your guess: 68
Congratulations! You guessed the correct number.

```

### Game Over Example

```text
Guess a number between 1 and 100

Enter your guess: 20
Too Low!

Enter your guess: 85
Too High!

...

Sorry! You have used all your attempts.

The correct number was: 68
```

---

## 📚 Concepts Covered

- Variables and Data Types
- User Input using Scanner
- Random Number Generation
- Loops
- If-Else Statements
- Conditional Logic
- Exception-Free Console Programming
---
## 🚀 Future Improvements

- 🎮 Multiple difficulty levels (Easy, Medium, Hard)
- 🔁 Play Again option
- 📊 Score tracking
- ⏱️ Timer mode
- 🏅 High score system
- 🎨 GUI version using Java Swing or JavaFX

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository.
2. Create a new branch.

```bash
git checkout -b feature-name
```

3. Commit your changes.

```bash
git commit -m "Add new feature"
```

4. Push to your branch.

```bash
git push origin feature-name
```

5. Open a Pull Request.
---
## 📄 License

This project is open-source and available under the **MIT License**.
---
## 👨‍💻 Author
**Narendra**
GitHub: https://github.com/narendrapallapu0706
---
