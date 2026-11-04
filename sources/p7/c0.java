package p7;

import java.util.Iterator;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c0 extends p {
    public final transient Object d;

    public c0(Object obj) {
        this.d = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // p7.i
    public final int h(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // p7.p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new u(this.d);
    }

    @Override // p7.i
    public final e0 k() {
        return new u(this.d);
    }

    @Override // p7.p
    public final n o() {
        Object[] objArr = {this.d};
        for (int i3 = 0; i3 < 1; i3++) {
            j jVar = n.b;
            if (objArr[i3] == null) {
                throw new NullPointerException(p1.i(i3, "at index "));
            }
        }
        return n.o(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a1.g.q("[", this.d.toString(), "]");
    }
}
