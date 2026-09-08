package xd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public final String a;
    public int b;
    public int c;
    public int d;
    public int e;

    public b(String str) {
        this.a = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.e < 0) {
            this.b = 2;
            return false;
        }
        String str = this.a;
        int length = str.length();
        int length2 = str.length();
        for (int i13 = this.c; i13 < length2; i13++) {
            char charAt = str.charAt(i13);
            if (charAt == '\n' || charAt == '\r') {
                i10 = (charAt == '\r' && (i11 = i13 + 1) < str.length() && str.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.b = 1;
                this.e = i10;
                this.d = length;
                return true;
            }
        }
        i10 = -1;
        this.b = 1;
        this.e = i10;
        this.d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 0;
        int i10 = this.d;
        int i11 = this.c;
        this.c = this.e + i10;
        return this.a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
