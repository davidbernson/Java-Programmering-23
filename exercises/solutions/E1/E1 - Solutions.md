# Solutions to Exercises - Lecture 1 - The Java Language

<b>1.1</b>
<ol type="a">
<li><code>int myAge;</code></li>
<li><code>myAge = 37;</code></li>
<li><code>int myAge = 37;</code></li>
</ol>

<b>1.2</b>
<ol type="a">
<li><code>String myFirstName;</code></li>
<li><code>myFirstName = "David";</code></li>
<li><code>String myFirstName = "David";</code></li>
</ol>

<b>1.3</b>
<ol type="a">
<li><code>System.out.println("My name is " + myFirstName + " and I am " + myAge + " years old.");</code></li>
</ol>

<b>1.4</b>
<ol type="a">
<li><code>boolean myBool = false;</code></li>
</ol>

<b>1.5</b>
<ol type="a">
<li>Yes, since the primitive type <i>integer</i> stores as a 32-bit signed integer, then we it can also hold the value of a byte-type integer (8-bit).</li>
<li> No, since the primitive type <i>byte</i> stores as an 8-bit signed integer. By assigning a 32-bit integer to it, you risk loss of information by converting to a lower memory data type.</li>
</ol>

<b>1.6</b>
<ol type="a">

<li>Allowed.</li>
<li>Allowed.</li>
<li>Not allowed. A variable of type <i>integer</i> cannot hold a String-type value.</li>
<li>Not allowed. A variable name may never contain non-alphanumerical characters, apart from <code>$</code> and <code>_</code>. This one contains the percentage sign.</li>
<li>Not allowed. The only accepted values for a boolean type variable are <code>true</code> or <code>false</code></li>
<li>Allowed.</li>
<li>Not allowed. An integer type variable cannot hold decimal values. Conversion from double to int might result in information loss.</li>
<li>Allowed.</li>
<li>Not allowed. 1024 lies out of the range of byte (-128 to 127), which is an 8-bit signed integer</li>
<li>Allowed. Unicode-encoded characters are accepted as values for char-type variables. This particular one actually produces a smiley face if your terminal output can decode it (VSCode cannot).</li>
</ol>

<b>1.7</b>
<ol type="a">
<li>The <code>calypso</code> variable is of type <code>Ship</code>.</li>
<li>It is a two-part statement. The left-hand side of the <code>@</code> designates the type of the object that is referenced. The right-hand side contains the reference itself, a series of 8 alpha-numerical characters.</li>
<li>The printout will be identical to the printout in (b).</li>
<li>The new variable <code>saoGabriel</code> will be assigned the value of the previous variable <code>calypso</code>. <code>calypso</code> does not contain the <code>Ship</code> object itself, but rather a reference to it. Thus, <code>saoGabriel</code> will contain an identical reference to the same object (<code>Ship@4926097b</code>). </li>
</ol>

<b>1.8</b>
<ol type="a">
<li><code>int x = 8, y = 24;</code></li>
<li>No. A multiple-variable declaration is only valid if the variables are of the same type. Note that the statement is valid with the same types, e.g. <code>short x = 4, y = 12;</code></li>
</ol>

<b>1.9</b>
<ol type="a">
<li> <code>17</code> </li>
<li> <code>11</code> </li>
<li> <code>56</code> </li>
<li> <code>90</code> </li>
<li> <code>true</code> </li>
<li> <code>false</code> </li>
<li> <code>true</code> </li>
<li> <code>true</code> </li>
<li> <code>false</code> </li>
<li> <code>true</code> </li>
<li> <code>false</code> </li>
<li> <code>true</code> </li> 
<li> <code>false</code> </li>
</ol>

<b>1.10</b>
<ol type="a">
<li>11</li>
<li>12</li>
<li>1</li>
</ol>

<b>1.11</b>
<ol type="a">
<li>10</li>
<li>50</li>
<li>80</li>
<li>112</li>
<li>18</li>
</ol>

<b>1.12</b>
<ol type="a">
<li>30</li>
<li>45</li>
</ol>

## Additional Exercises

<b>1.6 Extra</b>
<ol type="a">
<li>Not allowed. Variable studentCount is declared as an int but assigned a String value ("twenty").</li>
<li>Allowed. boolean type can only have values true or false.</li>
<li>Allowed. double type can store floating-point values.</li>
<li>Allowed. char type can store Unicode characters, and 1024 is a valid Unicode value.</li>
<li>Allowed. myAge is declared as a String and "25" is a valid string literal.</li>
<li>Not allowed. roomNumber is declared as an int but assigned a char value.</li>
<li>Not allowed. hasPassed is declared as a boolean but assigned a String value ("yes").</li>
<li>Allowed. float type can store floating-point values.</li>
<li>Not allowed. byte type can store integer values, but 200 is outside of the range of a byte.</li>
<li>Allowed. char type can store Unicode characters, and 65 is the Unicode value for 'A'.</li>
<li>Not allowed. userName is declared as a String but assigned a char value ('John').</li>
<li>Not allowed. boolean types can only be assigned true or false.</li>
<li>Not allowed. employeeSalary is declared as an int but assigned a double value.</li>
<li>Allowed. double type can store floating-point values.</li>
<li>Not allowed. initial is declared as a char but assigned a String value ("M").</li>
<li>Allowed. boolean type can only have values true or false.</li>
<li>Not allowed. numberOfPages is declared as a byte but assigned a long value.</li>
<li>Allowed. float type can store floating-point values.</li>
<li>Allowed. firstName is a valid String concatenation.</li>
<li>Allowed. lastCharacter is assigned the value of the last character of the string "Hello".</li>
</ol>

<b>1.9 Extra</b>
<ol type="a">
<li>5</li>
<li>1</li>
<li>12</li>
<li>12</li>
<li>17</li>
<li>1</li>
<li>4</li>
<li>4</li>
<li>false</li>
<li>true</li>
<li>false</li>
<li>false</li>
<li>true</li>
<li>true</li>
<li>true</li>
<li>true</li>
<li>true</li>
<li>true</li>
<li>true</li>
<li>false</li>
</ol>