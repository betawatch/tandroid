package q8;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i extends j7.c implements ListIterator {
    public final /* synthetic */ j7.e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j7.e eVar) {
        super(eVar, (char) 0);
        this.e = eVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        j7.e eVar = this.e;
        boolean isEmpty = eVar.isEmpty();
        c().add(obj);
        ((h0) eVar.h).e++;
        if (isEmpty) {
            eVar.i();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j7.e eVar, int i10) {
        super(eVar, ((List) eVar.c).listIterator(i10), (char) 0);
        this.e = eVar;
    }
}
