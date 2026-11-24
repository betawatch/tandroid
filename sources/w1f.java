// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w1f extends AbstractList implements hte, RandomAccess {
    public final sse a;

    public w1f(sse sseVar) {
        this.a = sseVar;
    }

    @Override // hte
    public final Object d(int i) {
        return this.a.b.get(i);
    }

    @Override // hte
    public final void e(tke tkeVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        fed fedVar = new fed((byte) 3);
        fedVar.b = this.a.iterator();
        return fedVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        i1e i1eVar = new i1e((byte) 1);
        i1eVar.b = this.a.listIterator(i);
        return i1eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // hte
    public final List zzd() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // hte
    public final hte zze() {
        return this;
    }
}
