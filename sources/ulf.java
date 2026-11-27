// default package

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ulf extends AbstractList implements RandomAccess, ikf {
    public final gkf a;

    public ulf(gkf gkfVar) {
        this.a = gkfVar;
    }

    @Override // ikf
    public final Object b(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new wgd(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new v3e(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b.size();
    }

    @Override // ikf
    public final List zzh() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // ikf
    public final ikf zzd() {
        return this;
    }
}
