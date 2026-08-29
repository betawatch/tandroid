package q8;

import i7.p6;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        p6.b(i10, this.d);
        return this.e.get(i10 + this.c);
    }

    @Override // q8.z, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // q8.z, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // q8.u
    public final Object[] o() {
        return this.e.o();
    }

    @Override // q8.u
    public final int p() {
        return this.e.q() + this.c + this.d;
    }

    @Override // q8.u
    public final int q() {
        return this.e.q() + this.c;
    }

    @Override // q8.u
    public final boolean r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // q8.z, java.util.List
    /* renamed from: z */
    public final z subList(int i10, int i11) {
        p6.d(i10, i11, this.d);
        int i12 = this.c;
        return this.e.subList(i10 + i12, i11 + i12);
    }

    @Override // q8.z, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
        return listIterator(i10);
    }
}
