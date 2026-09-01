package s8;

import java.util.Iterator;
import java.util.ListIterator;
import k7.c7;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class u extends v {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ v e;

    public u(v vVar, int i10, int i11) {
        this.e = vVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c7.c(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // s8.v, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // s8.v, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // s8.q
    public final Object[] o() {
        return this.e.o();
    }

    @Override // s8.q
    public final int p() {
        return this.e.q() + this.c + this.d;
    }

    @Override // s8.q
    public final int q() {
        return this.e.q() + this.c;
    }

    @Override // s8.q
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // s8.v, java.util.List
    /* renamed from: y */
    public final v subList(int i10, int i11) {
        c7.e(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // s8.v, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
