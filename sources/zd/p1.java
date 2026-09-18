package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class p1 extends ee.b {
    public final k1 b;
    public v1 c;
    public final /* synthetic */ u1 d;
    public final /* synthetic */ a1 e;

    public p1(k1 k1Var, u1 u1Var, a1 a1Var) {
        this.d = u1Var;
        this.e = a1Var;
        this.b = k1Var;
    }

    @Override // ee.b
    public final void b(Object obj, Object obj2) {
        ee.k kVar = (ee.k) obj;
        boolean z10 = obj2 == null;
        k1 k1Var = this.b;
        a1 a1Var = z10 ? k1Var : this.c;
        if (a1Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.k.a;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, a1Var)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z10) {
                v1 v1Var = this.c;
                kotlin.jvm.internal.i.b(v1Var);
                k1Var.e(v1Var);
            }
        }
    }

    @Override // ee.b
    public final ee.v c(Object obj) {
        if (this.d.u() == this.e) {
            return null;
        }
        return ee.a.e;
    }
}
