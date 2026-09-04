package ud;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    public b(char c10, char c11, int i10) {
        boolean z10 = false;
        this.b = i10;
        this.c = c11;
        if (i10 <= 0 ? c10 >= c11 : c10 < c11 || c10 == c11) {
            z10 = true;
        }
        this.d = z10;
        this.e = z10 ? c10 : c11;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                int i10 = this.e;
                if (i10 != this.c) {
                    this.e = this.b + i10;
                } else {
                    if (!this.d) {
                        throw new NoSuchElementException();
                    }
                    this.d = false;
                }
                return Character.valueOf((char) i10);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i10 = this.e;
        if (i10 != this.c) {
            this.e = this.b + i10;
            return i10;
        }
        if (!this.d) {
            throw new NoSuchElementException();
        }
        this.d = false;
        return i10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(int i10, int i11, int i12) {
        this.b = i12;
        this.c = i11;
        boolean z10 = false;
        if (i12 <= 0 ? i10 >= i11 : i10 <= i11) {
            z10 = true;
        }
        this.d = z10;
        this.e = z10 ? i10 : i11;
    }
}
