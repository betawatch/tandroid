package q7;

import java.util.Iterator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    @Override // q7.h
    public final int f(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    @Override // q7.o, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new t(this.d);
    }

    @Override // q7.h
    public final d0 k() {
        return new t(this.d);
    }

    @Override // q7.o
    public final m o() {
        Object[] objArr = {this.d};
        for (int i7 = 0; i7 < 1; i7++) {
            i iVar = m.b;
            if (objArr[i7] == null) {
                throw new NullPointerException(jg.g.j(i7, "at index "));
            }
        }
        return m.o(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a8.p0.p("[", this.d.toString(), "]");
    }
}
