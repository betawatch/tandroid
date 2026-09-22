package x7;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class c extends e9.c implements ListIterator {
    public final /* synthetic */ e9.l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e9.l lVar) {
        super(lVar, (byte) 0);
        this.e = lVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        e9.l lVar = this.e;
        boolean isEmpty = lVar.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        ((f) lVar.h).d++;
        if (isEmpty) {
            lVar.p();
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
    public c(e9.l lVar, int i10) {
        super(lVar, ((List) lVar.c).listIterator(i10), (byte) 0);
        this.e = lVar;
    }
}
