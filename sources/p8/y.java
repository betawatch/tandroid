package p8;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y extends z {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ z e;

    public y(z zVar, int i10, int i11) {
        this.e = zVar;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        h7.f0.b(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // p8.z, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p8.z, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p8.u
    public final Object[] o() {
        return this.e.o();
    }

    @Override // p8.u
    public final int p() {
        return this.e.q() + this.c + this.d;
    }

    @Override // p8.u
    public final int q() {
        return this.e.q() + this.c;
    }

    @Override // p8.u
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // p8.z, java.util.List
    /* renamed from: z */
    public final z subList(int i10, int i11) {
        h7.f0.d(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // p8.z, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
