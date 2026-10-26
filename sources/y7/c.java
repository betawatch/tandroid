package y7;

import a8.dh;
import a8.ta;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c extends ta implements ListIterator {
    public final /* synthetic */ dh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dh dhVar) {
        super(dhVar, (char) 0);
        this.e = dhVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        dh dhVar = this.e;
        boolean isEmpty = dhVar.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        ((e) dhVar.h).d++;
        if (isEmpty) {
            dhVar.o();
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
    public c(dh dhVar, int i10) {
        super(dhVar, ((List) dhVar.c).listIterator(i10), (char) 0);
        this.e = dhVar;
    }
}
