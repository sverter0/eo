/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016-2020 Yegor Bugayenko
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

package org.eolang.phi;

/**
 * Default attribute.
 *
 * @since 0.1
 */
public final class AtDefault implements Attr {

    private Env<Phi> env;

    public AtDefault() {
        this(Phi.ETA);
    }

    public AtDefault(final Phi phi) {
        this(new Env.Simple(phi));
    }

    public AtDefault(final Env<Phi> phi) {
        this.env = phi;
    }

    @Override
    public String toString() {
        return this.env.toString();
    }

    @Override
    public Attr copy() {
        return new AtDefault(this.env);
    }

    @Override
    public Phi get() {
        return this.env.get();
    }

    @Override
    public void put(final Phi phi) {
        this.env = new Env.Simple(phi);
    }

}