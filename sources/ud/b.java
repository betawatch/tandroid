package ud;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        int i3;
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
                i3 = (charAt == '\r' && (i10 = i12 + 1) < charSequence.length() && charSequence.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.b = 1;
                this.e = i3;
                this.d = length;
                return true;
            }
        }
        i3 = -1;
        this.b = 1;
        this.e = i3;
        this.d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 0;
        int i3 = this.d;
        int i10 = this.c;
        this.c = this.e + i3;
        return this.a.subSequence(i10, i3).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
