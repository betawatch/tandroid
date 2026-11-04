package wd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class e1 extends be.j implements l0, x0 {
    public n1 d;

    @Override // wd.x0
    public final o1 b() {
        return null;
    }

    @Override // wd.l0
    public final void dispose() {
        n1 h = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n1.a;
            Object obj = atomicReferenceFieldUpdater.get(h);
            if (obj instanceof e1) {
                if (obj != this) {
                    return;
                }
                n0 n0Var = b0.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(h, obj, n0Var)) {
                    if (atomicReferenceFieldUpdater.get(h) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof x0) || ((x0) obj).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = be.j.a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof be.o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                be.j jVar = (be.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = be.j.c;
                be.o oVar = (be.o) atomicReferenceFieldUpdater3.get(jVar);
                if (oVar == null) {
                    oVar = new be.o(jVar);
                    atomicReferenceFieldUpdater3.set(jVar, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar.d();
                return;
            }
        }
    }

    public a1 getParent() {
        return h();
    }

    public final n1 h() {
        n1 n1Var = this.d;
        if (n1Var != null) {
            return n1Var;
        }
        kotlin.jvm.internal.j.h("job");
        throw null;
    }

    public abstract boolean i();

    @Override // wd.x0
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th2);

    @Override // be.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + b0.j(this) + "[job@" + b0.j(h()) + ']';
    }
}
