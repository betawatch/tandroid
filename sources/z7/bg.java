package z7;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class bg extends e9.c implements ListIterator {
    public final /* synthetic */ e9.l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(e9.l lVar) {
        super(lVar, (char) 0);
        this.e = lVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        e9.l lVar = this.e;
        boolean isEmpty = lVar.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
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
    public bg(e9.l lVar, int i10) {
        super(lVar, ((List) lVar.c).listIterator(i10), (char) 0);
        this.e = lVar;
    }
}
