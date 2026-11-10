package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class c1 extends n1 {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1() {
        super(true);
        boolean z9 = true;
        y(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n1.b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        q qVar = pVar instanceof q ? (q) pVar : null;
        if (qVar != null) {
            n1 h = qVar.h();
            while (!h.t()) {
                p pVar2 = (p) atomicReferenceFieldUpdater.get(h);
                q qVar2 = pVar2 instanceof q ? (q) pVar2 : null;
                if (qVar2 != null) {
                    h = qVar2.h();
                }
            }
            this.c = z9;
        }
        z9 = false;
        this.c = z9;
    }

    @Override // zd.n1
    public final boolean t() {
        return this.c;
    }

    @Override // zd.n1
    public final boolean u() {
        return true;
    }
}
