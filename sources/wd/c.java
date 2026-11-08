package wd;

import gd.k;
import id.h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kd.i;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class c implements Iterator, id.c {
    public int a;
    public Object b;
    public id.c c;

    public final RuntimeException a() {
        int i7 = this.a;
        if (i7 == 4) {
            return new NoSuchElementException();
        }
        if (i7 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    public final void b(Object obj, i iVar) {
        this.b = obj;
        this.a = 3;
        this.c = iVar;
        jd.a aVar = jd.a.a;
    }

    @Override // id.c
    public final h getContext() {
        return id.i.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        while (true) {
            i7 = this.a;
            if (i7 != 0) {
                break;
            }
            this.a = 5;
            id.c cVar = this.c;
            j.b(cVar);
            this.c = null;
            cVar.resumeWith(k.a);
        }
        if (i7 == 1) {
            j.b(null);
            throw null;
        }
        if (i7 == 2 || i7 == 3) {
            return true;
        }
        if (i7 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.a;
        if (i7 == 0 || i7 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i7 == 2) {
            this.a = 1;
            j.b(null);
            throw null;
        }
        if (i7 != 3) {
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

    @Override // id.c
    public final void resumeWith(Object obj) {
        af.b.c(obj);
        this.a = 4;
    }
}
