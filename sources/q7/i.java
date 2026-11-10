package q7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class i extends d0 implements ListIterator {
    public final int a;
    public int b;
    public final m c;

    public i(m mVar, int i7) {
        int size = mVar.size();
        if (i7 < 0 || i7 > size) {
            throw new IndexOutOfBoundsException(a.n(i7, size, "index"));
        }
        this.a = size;
        this.b = i7;
        this.c = mVar;
    }

    public final Object a(int i7) {
        return this.c.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.b;
        this.b = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.b - 1;
        this.b = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
