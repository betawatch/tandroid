// default package

import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class pzc extends kzc implements Set, j$.util.Set {
    public static final Object[] w;
    public static final pzc x;
    public transient ozc n;
    public final transient Object[] r;
    public final transient Object[] s;

    static {
        Object[] objArr = new Object[0];
        w = objArr;
        x = new pzc(objArr, objArr);
    }

    public pzc(Object[] objArr, Object[] objArr2) {
        super((byte) 0);
        this.r = objArr;
        this.s = objArr2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.s.length;
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (set.size() == 0) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // kzc
    public final int h(Object[] objArr) {
        System.arraycopy(this.r, 0, objArr, 0, 0);
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // kzc
    public final int i() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ozc ozcVar = this.n;
        if (ozcVar == null) {
            lzc lzcVar = nzc.n;
            ozcVar = ozc.s;
            this.n = ozcVar;
        }
        return ozcVar.listIterator(0);
    }

    @Override // kzc
    public final int j() {
        return 0;
    }

    @Override // kzc
    public final Object[] k() {
        return this.r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
