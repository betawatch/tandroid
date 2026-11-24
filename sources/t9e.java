// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class t9e extends t6e {
    public final transient Object s;

    public t9e(Object obj) {
        super((byte) 5);
        this.s = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.s.equals(obj);
    }

    @Override // t6e, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.s.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new y6e(this.s);
    }

    @Override // l1d
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
        return kt6.o("[", this.s.toString(), "]");
    }
}
