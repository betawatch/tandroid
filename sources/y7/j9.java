package y7;

import c8.xd;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class j9 extends a8.i0 implements ListIterator {
    public final int b;
    public int c;
    public final l9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(l9 l9Var, int i7) {
        super(9);
        int size = l9Var.size();
        if (i7 < 0 || i7 > size) {
            throw new IndexOutOfBoundsException(xd.c(i7, size, "index"));
        }
        this.b = size;
        this.c = i7;
        this.d = l9Var;
    }

    public final Object a(int i7) {
        return this.d.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.c;
        this.c = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.c - 1;
        this.c = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
