## Shell Scripting Tutorial

This tutorial covers the basics of shell scripting, focusing on common commands, syntax, and error handling. It's designed to help you create and understand shell scripts effectively.

### Table of Contents

1. [Introduction to Shell Scripting](#introduction-to-shell-scripting)
2. [Basic Commands](#basic-commands)
   - [Echo](#echo)
   - [Comments](#comments)
3. [Script Files and Execution](#script-files-and-execution)
   - [Creating a Script](#creating-a-script)
   - [Making the Script Executable](#making-the-script-executable)
   - [Running the Script](#running-the-script)
4. [Variables](#variables)
5. [Conditional Statements](#conditional-statements)
   - [If Statements](#if-statements)
   - [Comparison Operators](#comparison-operators)
6. [Loops](#loops)
   - [For Loop](#for-loop)
   - [While Loop](#while-loop)
7. [Common Errors and Troubleshooting](#common-errors-and-troubleshooting)
8. [Best Practices](#best-practices)

### Introduction to Shell Scripting

Shell scripting allows you to automate tasks in Unix-based operating systems. A shell script is a text file with a sequence of commands.

### Basic Commands

#### Echo

The `echo` command is used to print text to the screen.

```sh
echo "Hello, World!"
```

#### Comments

Use `#` to add comments in your script. Comments are ignored during execution.

```sh
# This is a comment
echo "This will be printed"
```

### Script Files and Execution

#### Creating a Script

Create a file with a `.sh` extension.

```sh
#!/bin/bash
# This is a simple script
echo "Hello, World!"
```

#### Making the Script Executable

Make the script executable with `chmod`.

```sh
chmod +x script.sh
```

#### Running the Script

Run the script using `./`.

```sh
./script.sh
```

### Variables

Assign values to variables without spaces around the `=` sign.

```sh
name="Alice"
echo "Hello, $name"
```

### Conditional Statements

#### If Statements

Use `if`, `then`, `else`, `elif`, and `fi` for conditional statements.

```sh
#!/bin/bash
count=10
if [ $count -gt 5 ]; then
  echo "Count is greater than 5"
else
  echo "Count is 5 or less"
fi
```

#### Comparison Operators

- `-eq`: Equal
- `-ne`: Not equal
- `-gt`: Greater than
- `-lt`: Less than
- `-ge`: Greater than or equal to
- `-le`: Less than or equal to

### Loops

#### For Loop

Iterate over a list of items.

```sh
#!/bin/bash
for i in 1 2 3 4 5; do
  echo "Number: $i"
done
```

#### While Loop

Repeat commands while a condition is true.

```sh
#!/bin/bash
count=1
while [ $count -le 5 ]; do
  echo "Count: $count"
  count=$((count + 1))
done
```

### Common Errors and Troubleshooting

1. **Syntax Errors:** 
   - Ensure no spaces around `=` when assigning variables.
   - Use proper spacing in `if` statements and loops.
   - End `if` statements with `fi` and loops with `done`.

2. **File Not Executable:** 
   - Ensure the script has execute permissions (`chmod +x script.sh`).

3. **Command Not Found:** 
   - Check for typos in command names.
   - Ensure the command is installed on your system.

4. **Variable Expansion Issues:** 
   - Use double quotes around variables to prevent word splitting.

### Best Practices

- **Use Comments:** Document your code for readability.
- **Consistent Naming:** Use meaningful and consistent variable names.
- **Error Handling:** Use `set -e` to exit on errors or handle errors with `trap`.
- **Indentation:** Use consistent indentation for readability.
- **Shebang:** Always start scripts with `#!/bin/bash` or the appropriate shell.

### Example Script

Here is an example script that combines several concepts:

```sh
#!/bin/bash
# Script to demonstrate basic shell scripting

# Variables
name="Alice"
count=1

# Function to print greeting
greet() {
  echo "Hello, $name!"
}

# Greet the user
greet

# Loop to print numbers
while [ $count -le 5 ]; do
  echo "Count: $count"
  count=$((count + 1))
done

# Check if a number is greater than 10
number=12
if [ $number -gt 10 ]; then
  echo "Number is greater than 10"
else
  echo "Number is 10 or less"
fi
```

This tutorial should help you get started with shell scripting and understand the basics. Happy scripting!
