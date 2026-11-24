// default package

import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p8e extends t6e {
    public final transient b9e s;
    public final transient v8e w;

    public p8e(b9e b9eVar, v8e v8eVar) {
        super((byte) 5);
        this.s = b9eVar;
        this.w = v8eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.s.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.w.listIterator(0);
    }

    @Override // l1d
    public final int p(Object[] objArr) {
        return this.w.p(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.s.h;
    }
}
