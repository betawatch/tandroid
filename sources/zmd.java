// default package

import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zmd extends mid {
    public final transient Object s;

    public zmd(Object obj) {
        super((byte) 4);
        this.s = obj;
    }

    @Override // mid
    public final xhd A() {
        Object[] objArr = {this.s};
        for (int i = 0; i < 1; i++) {
            dgd dgdVar = xhd.n;
            if (objArr[i] == null) {
                fvc.f(de9.k(i, "at index "));
                return null;
            }
        }
        return xhd.A(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.s.equals(obj);
    }

    @Override // mid, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.s.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new gkd(this.s);
    }

    @Override // kzc
    public final int p(Object[] objArr) {
        objArr[0] = this.s;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return tb4.y("[", this.s.toString(), "]");
    }

    @Override // kzc
    public final v5c u() {
        return new gkd(this.s);
    }
}
