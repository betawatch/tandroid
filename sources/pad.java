// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pad extends t9d {
    public final transient xad r;
    public final transient uad s;

    public pad(xad xadVar, uad uadVar) {
        super((byte) 2);
        this.r = xadVar;
        this.s = uadVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.r.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.s.listIterator(0);
    }

    @Override // l1d
    public final int p(Object[] objArr) {
        return this.s.p(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r.h;
    }
}
