package z7;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class cg extends e9.d implements ListIterator {
    public final /* synthetic */ e9.m e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(e9.m mVar) {
        super(mVar, (char) 0);
        this.e = mVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        e9.m mVar = this.e;
        boolean isEmpty = mVar.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        if (isEmpty) {
            mVar.o();
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
    public cg(e9.m mVar, int i10) {
        super(mVar, ((List) mVar.c).listIterator(i10), (char) 0);
        this.e = mVar;
    }
}
