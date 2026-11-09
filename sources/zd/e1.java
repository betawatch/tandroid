package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class e1 extends ee.j implements l0, x0 {
    public n1 d;

    @Override // zd.x0
    public final o1 b() {
        return null;
    }

    @Override // zd.l0
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
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = ee.j.a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof ee.o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                kotlin.jvm.internal.j.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                ee.j jVar = (ee.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = ee.j.c;
                ee.o oVar = (ee.o) atomicReferenceFieldUpdater3.get(jVar);
                if (oVar == null) {
                    oVar = new ee.o(jVar);
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

    @Override // zd.x0
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th2);

    @Override // ee.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + b0.j(this) + "[job@" + b0.j(h()) + ']';
    }
}
