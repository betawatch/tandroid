package ud;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class b implements Iterator {
    public final /* synthetic */ int a = 0;
    public final int b;
    public final int c;
    public boolean d;
    public int e;

    public b(char c10, char c11, int i7) {
        boolean z9 = false;
        this.b = i7;
        this.c = c11;
        if (i7 <= 0 ? j.f(c10, c11) >= 0 : j.f(c10, c11) <= 0) {
            z9 = true;
        }
        this.d = z9;
        this.e = z9 ? c10 : c11;
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
                int i7 = this.e;
                if (i7 != this.c) {
                    this.e = this.b + i7;
                } else {
                    if (!this.d) {
                        throw new NoSuchElementException();
                    }
                    this.d = false;
                }
                return Character.valueOf((char) i7);
            default:
                return Integer.valueOf(nextInt());
        }
    }

    public int nextInt() {
        int i7 = this.e;
        if (i7 != this.c) {
            this.e = this.b + i7;
            return i7;
        }
        if (!this.d) {
            throw new NoSuchElementException();
        }
        this.d = false;
        return i7;
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

    public b(int i7, int i10, int i11) {
        this.b = i11;
        this.c = i10;
        boolean z9 = false;
        if (i11 <= 0 ? i7 >= i10 : i7 <= i10) {
            z9 = true;
        }
        this.d = z9;
        this.e = z9 ? i7 : i10;
    }
}
