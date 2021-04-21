package com.example.androidunittest_cicd.functional_programing

/**
 * The term Functional programming is an umbrella
 * for a range of programming concepts which the moniker doesn’t
 * quite do justice to. At it’s core, It’s a style of programming
 * that treats programs as evaluation of mathematical functions and
 * avoids mutable
 */

 //MARK:- video Src https://www.youtube.com/watch?v=qGef3sFAIxU

/*
programmers should worry
 about the what
 and let the compiler
  and runtime worry about the how.
 */
class DeclarativeCode {
}

/*
 *Code should be as obvious
 * as possible. In particular, Side
 *  effects are to be isolated to avoid surprises.
 *  Data flow and error handling are explicitly
 * defined and constructs like GOTO statements and Exceptions are avoided
 * since they can put your application in unexpected states.
 */
class Explicitness {
}

/*
 * Most functional code is concurrent by
 * default because of a concept known as
 * functional purity. The general agreement
 * seems to be that this trait in particular is
 * causing functional programming to rise in popularity
 * since CPU cores aren’t getting faster every year like
 * they used to (see Moore’s law) and we have to make our programs more
 * concurrent to take advantage of multi-core architectures
 */
class Concurrency {

}

/*
 * Functions are first class members just like
 * all the other language primitives. You can pass
 * functions around just like you would a string or an int
 */
class HigherOrderFunctions {

}

/*
Variables are not to be modified once they’re
initialized. Once a thing is created, it is
that thing forever. If you want it to change,
you create a new thing. This is another aspect of
 explicitness and avoiding side effects. If you know
 that a thing cannot change,
you have much more confidence about its state when you use it
 */
class Immutability {

}