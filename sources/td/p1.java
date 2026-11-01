package td;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class p1 extends yd.b {
    public final k1 b;
    public v1 c;
    public final /* synthetic */ u1 d;
    public final /* synthetic */ a1 e;

    public p1(k1 k1Var, u1 u1Var, a1 a1Var) {
        this.d = u1Var;
        this.e = a1Var;
        this.b = k1Var;
    }

    @Override // yd.b
    public final void b(Object obj, Object obj2) {
        yd.k kVar = (yd.k) obj;
        boolean z10 = obj2 == null;
        yd.k kVar2 = this.b;
        yd.k kVar3 = z10 ? kVar2 : this.c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yd.k.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z10) {
                yd.k kVar4 = this.c;
                kotlin.jvm.internal.i.b(kVar4);
                kVar2.e(kVar4);
            }
        }
    }

    @Override // yd.b
    public final ea.a c(Object obj) {
        if (this.d.u() == this.e) {
            return null;
        }
        return yd.a.e;
    }
}
