package td;

import b8.ib;
import dd.k;
import fd.h;
import hd.i;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements Iterator, fd.c {
    public int a;
    public Object b;
    public fd.c c;

    public final RuntimeException a() {
        int i3 = this.a;
        if (i3 == 4) {
            return new NoSuchElementException();
        }
        if (i3 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    public final void b(Object obj, i iVar) {
        this.b = obj;
        this.a = 3;
        this.c = iVar;
        gd.a aVar = gd.a.a;
    }

    @Override // fd.c
    public final h getContext() {
        return fd.i.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3;
        while (true) {
            i3 = this.a;
            if (i3 != 0) {
                break;
            }
            this.a = 5;
            fd.c cVar = this.c;
            j.b(cVar);
            this.c = null;
            cVar.resumeWith(k.a);
        }
        if (i3 == 1) {
            j.b(null);
            throw null;
        }
        if (i3 == 2 || i3 == 3) {
            return true;
        }
        if (i3 == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i3 = this.a;
        if (i3 == 0 || i3 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i3 == 2) {
            this.a = 1;
            j.b(null);
            throw null;
        }
        if (i3 != 3) {
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

    @Override // fd.c
    public final void resumeWith(Object obj) {
        ib.b(obj);
        this.a = 4;
    }
}
