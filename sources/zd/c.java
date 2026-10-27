package zd;

import a8.jd;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ld.i;
import nd.h;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c implements Iterator, ld.c {
    public int a;
    public Object b;
    public ld.c c;

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

    public final void b(Object obj, h hVar) {
        this.b = obj;
        this.a = 3;
        this.c = hVar;
        md.a aVar = md.a.a;
    }

    @Override // ld.c
    public final ld.h getContext() {
        return i.a;
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
            ld.c cVar = this.c;
            kotlin.jvm.internal.i.b(cVar);
            this.c = null;
            cVar.resumeWith(jd.i.a);
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

    @Override // ld.c
    public final void resumeWith(Object obj) {
        jd.b(obj);
        this.a = 4;
    }
}
