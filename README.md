Use your group name to create the file in this repository.

**User 1:** Create the new file with below content    @ 9AM IST
```
{
  A() {}
  B() {}
}
```

**User 2:** Updates the file with C and D    @ 10AM IST
```
{
  A() {}
  B() {}

  C() {}
  D() {}
}
```


**User 3 & 4** takes the code from User 2 at the same time - parallel change
**User 3:** Updates function C as below    @ 11AM IST
```
{
  A() {}
  B() {}

  C() { A() }
  D() {}
}
```


**User 4:**  Updates function D as below   @ 11AM IST
```
{
  A() {}
  B() {}

  C() { A() }
  D() { B() }
}
```

