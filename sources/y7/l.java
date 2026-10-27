package y7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l extends a8.y implements ListIterator {
    public final int b;
    public int c;
    public final n d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, int i10) {
        super(9);
        int size = nVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(w7.i5.c(i10, size, "index"));
        }
        this.b = size;
        this.c = i10;
        this.d = nVar;
    }

    public final Object a(int i10) {
        return this.d.get(i10);
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
        int i10 = this.c;
        this.c = i10 + 1;
        return a(i10);
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
        int i10 = this.c - 1;
        this.c = i10;
        return a(i10);
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
