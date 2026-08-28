package x6;

import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b0 extends o {
    public final transient Object d;

    public b0(Object obj) {
        this.d = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // x6.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // x6.h
    public final int i(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new t(this.d);
    }

    @Override // x6.h
    public final d0 p() {
        return new t(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // x6.o
    public final m t() {
        Object[] objArr = {this.d};
        for (int i9 = 0; i9 < 1; i9++) {
            i iVar = m.b;
            if (objArr[i9] == null) {
                throw new NullPointerException(j3.r0.l(i9, "at index "));
            }
        }
        return m.t(1, objArr);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return aa.d.o("[", this.d.toString(), "]");
    }
}
