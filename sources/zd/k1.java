package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class k1 extends ee.k implements d1, o0, a1 {
    public u1 d;

    @Override // zd.a1
    public final v1 c() {
        return null;
    }

    @Override // zd.o0
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        u1 i10 = i();
        while (true) {
            Object u10 = i10.u();
            if (u10 instanceof k1) {
                if (u10 != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u1.a;
                q0 q0Var = e0.j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(i10, u10, q0Var)) {
                    if (atomicReferenceFieldUpdater2.get(i10) != u10) {
                        break;
                    }
                }
                return;
            }
            if (!(u10 instanceof a1) || ((a1) u10).c() == null) {
                return;
            }
            while (true) {
                Object f7 = f();
                if (f7 instanceof ee.q) {
                    return;
                }
                if (f7 == this) {
                    return;
                }
                kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                ee.k kVar = (ee.k) f7;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = ee.k.c;
                ee.q qVar = (ee.q) atomicReferenceFieldUpdater3.get(kVar);
                if (qVar == null) {
                    qVar = new ee.q(kVar);
                    atomicReferenceFieldUpdater3.set(kVar, qVar);
                }
                do {
                    atomicReferenceFieldUpdater = ee.k.a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, f7, qVar)) {
                        kVar.d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == f7);
            }
        }
    }

    public f1 getParent() {
        return i();
    }

    public final u1 i() {
        u1 u1Var = this.d;
        if (u1Var != null) {
            return u1Var;
        }
        kotlin.jvm.internal.i.h("job");
        throw null;
    }

    @Override // zd.a1
    public final boolean isActive() {
        return true;
    }

    @Override // ee.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + e0.k(this) + "[job@" + e0.k(i()) + ']';
    }
}
