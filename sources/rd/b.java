package rd;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    public b(char c2, char c10, int i3) {
        boolean z10 = false;
        this.b = i3;
        this.c = c10;
        if (i3 <= 0 ? j.f(c2, c10) >= 0 : j.f(c2, c10) <= 0) {
            z10 = true;
        }
        this.d = z10;
        this.e = z10 ? c2 : c10;
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
                int i3 = this.e;
                if (i3 != this.c) {
                    this.e = this.b + i3;
                } else {
                    if (!this.d) {
                        throw new NoSuchElementException();
                    }
                    this.d = false;
                }
                return Character.valueOf((char) i3);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i3 = this.e;
        if (i3 != this.c) {
            this.e = this.b + i3;
            return i3;
        }
        if (!this.d) {
            throw new NoSuchElementException();
        }
        this.d = false;
        return i3;
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

    public b(int i3, int i10, int i11) {
        this.b = i11;
        this.c = i10;
        boolean z10 = false;
        if (i11 <= 0 ? i3 >= i10 : i3 <= i10) {
            z10 = true;
        }
        this.d = z10;
        this.e = z10 ? i3 : i10;
    }
}
