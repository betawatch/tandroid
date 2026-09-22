package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public class i1 extends u1 {
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1() {
        super(true);
        boolean z10 = true;
        x(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u1.b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        q qVar = pVar instanceof q ? (q) pVar : null;
        if (qVar != null) {
            u1 i10 = qVar.i();
            while (!i10.r()) {
                p pVar2 = (p) atomicReferenceFieldUpdater.get(i10);
                q qVar2 = pVar2 instanceof q ? (q) pVar2 : null;
                if (qVar2 != null) {
                    i10 = qVar2.i();
                }
            }
            this.c = z10;
        }
        z10 = false;
        this.c = z10;
    }

    @Override // zd.u1
    public final boolean r() {
        return this.c;
    }

    @Override // zd.u1
    public final boolean s() {
        return true;
    }
}
