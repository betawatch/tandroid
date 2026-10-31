package qd;

import ad.j;
import cd.h;
import ed.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements Iterator, cd.c {
    public int a;
    public Object b;
    public cd.c c;

    public final RuntimeException a() {
        int i10 = this.a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    public final void b(Object obj, i iVar) {
        this.b = obj;
        this.a = 3;
        this.c = iVar;
        dd.a aVar = dd.a.a;
    }

    @Override // cd.c
    public final h getContext() {
        return cd.i.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        while (true) {
            i10 = this.a;
            if (i10 != 0) {
                break;
            }
            this.a = 5;
            cd.c cVar = this.c;
            kotlin.jvm.internal.i.b(cVar);
            this.c = null;
            cVar.resumeWith(j.a);
        }
        if (i10 == 1) {
            kotlin.jvm.internal.i.b(null);
            throw null;
        }
        if (i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.a;
        if (i10 == 0 || i10 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i10 == 2) {
            this.a = 1;
            kotlin.jvm.internal.i.b(null);
            throw null;
        }
        if (i10 != 3) {
            throw a();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // cd.c
    public final void resumeWith(Object obj) {
        l9.b.b(obj);
        this.a = 4;
    }
}
