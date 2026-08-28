package pc;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s implements Iterator {
    public int a;
    public Object b;
    public int c;
    public int d;
    public final /* synthetic */ t e;

    public s(t tVar) {
        this.e = tVar;
        this.c = tVar.d;
        this.d = tVar.c;
    }

    public final boolean a() {
        this.a = 3;
        int i9 = this.c;
        if (i9 == 0) {
            this.a = 2;
        } else {
            t tVar = this.e;
            Object[] objArr = tVar.a;
            int i10 = this.d;
            this.b = objArr[i10];
            this.a = 1;
            this.d = (i10 + 1) % tVar.b;
            this.c = i9 - 1;
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i9 = this.a;
        if (i9 == 0) {
            return a();
        }
        if (i9 == 1) {
            return true;
        }
        if (i9 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i9 = this.a;
        if (i9 == 1) {
            this.a = 0;
            return this.b;
        }
        if (i9 == 2 || !a()) {
            throw new NoSuchElementException();
        }
        this.a = 0;
        return this.b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
