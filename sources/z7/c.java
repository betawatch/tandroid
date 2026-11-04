package z7;

import b8.ah;
import b8.ra;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends ra implements ListIterator {
    public final /* synthetic */ ah e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ah ahVar) {
        super(ahVar, (char) 0);
        this.e = ahVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ah ahVar = this.e;
        boolean isEmpty = ahVar.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        ((e) ahVar.h).d++;
        if (isEmpty) {
            ahVar.k();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ah ahVar, int i3) {
        super(ahVar, ((List) ahVar.c).listIterator(i3), (char) 0);
        this.e = ahVar;
    }
}
