/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 eolang.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.eolang.compiler;

import java.io.PrintStream;

/**
 * Main.
 *
 * @since 0.1
 */
public final class Main {

    /**
     * Print stream for the output.
     */
    private final PrintStream stdout;

    /**
     * Arguments.
     */
    private final String[] args;

    /**
     * Ctor.
     * @param out Output stream
     * @param input Input args
     */
    public Main(final PrintStream out, final String... input) {
        this.stdout = out;
        this.args = input;
    }

    /**
     * Entry point.
     * @param input Command line arguments
     * @checkstyle ProhibitPublicStaticMethods (3 lines)
     */
    public static void main(final String... input) {
        new Main(System.out, input).exec();
    }

    /**
     * Entry point.
     */
    public void exec() {
        if ("--help".equals(this.args[0])) {
            this.stdout.append("It is just a skeleton");
        } else {
            this.stdout.append("Usage: --help");
        }
    }

}