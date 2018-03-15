# AndroidFinalVariable

###  Variable is accessed within inner class. Needs to be declared final
From: https://stackoverflow.com/a/4732638/5381331
Short understand:
First, basically normal local variable (example variable inside method) will release after function finished,
so when we access this variable in side inner class (example asynchronous method) compiler may not know when release it.

When define final variable,  this allows the Java compiler to "capture" the value of the variable at run-time
and store a copy as a field in the inner class. Once the outer method has terminated and its stack frame has been removed,
the original variable is gone but the inner class's private copy persists in the class's own memory.