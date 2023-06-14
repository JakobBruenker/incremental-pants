# Incremental compilation test

To compile and run, use

```bash
pants run src/main/scala/foo:server
```

to check whether incremental compilation works properly, make a small change to `Baz` (e.g. change the number in the for loop slightly) and a change to `Main` that causes an error (e.g. change println to printlnx. Then run the above command again. It should take a few seconds. Now, fix the change in `Main` but don't touch `Baz`. The compilation should now be almost instantaneous.
