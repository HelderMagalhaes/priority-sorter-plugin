/*
 * The MIT License
 *
 * Copyright 2013 Magnus Sandberg, Oleg Nenashev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package jenkins.advancedqueue;

public enum SorterStrategy {

        /**First In First Out*/
	FIFO,
        /**Absolute*/
	ABSOLUTE,
        /**Fair Queueing*/
	FQ,
        /**Weighted Fair Queueing*/
	WFQ;

	public String getDisplayValue() {
            switch(this) {
                case FIFO:
                    return Messages.SorterStrategy_FIFO_displayName();
                case ABSOLUTE:
                    return Messages.SorterStrategy_ABSOLUTE_displayName();
                case FQ:
                    return Messages.SorterStrategy_FQ_displayName();
                case WFQ:
                    return Messages.SorterStrategy_WFQ_displayName();
                default:
                    throw new IllegalArgumentException("Sorter strategy "+this+" is not supported");
            }
	}
	
}
