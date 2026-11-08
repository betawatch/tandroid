package xd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public final CharSequence a;
    public int b;
    public int c;
    public int d;
    public int e;

    public b(CharSequence string) {
        kotlin.jvm.internal.j.e(string, "string");
        this.a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i10;
        int i11 = this.b;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.e < 0) {
            this.b = 2;
            return false;
        }
        CharSequence charSequence = this.a;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i12 = this.c; i12 < length2; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '\n' || charAt == '\r') {
                i7 = (charAt == '\r' && (i10 = i12 + 1) < charSequence.length() && charSequence.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.b = 1;
                this.e = i7;
                this.d = length;
                return true;
            }
        }
        i7 = -1;
        this.b = 1;
        this.e = i7;
        this.d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 0;
        int i7 = this.d;
        int i10 = this.c;
        this.c = this.e + i7;
        return this.a.subSequence(i10, i7).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
