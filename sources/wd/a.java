package wd;

import java.util.Iterator;
import w7.i0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public abstract class a implements Iterable {
    public final char a;
    public final char b;
    public final int c = 1;

    public a(char c10, char c11) {
        this.a = c10;
        this.b = (char) i0.a(c10, c11, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.a, this.b, this.c);
    }
}
