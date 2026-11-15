package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class o extends e1 {
    public final /* synthetic */ int e;
    public final m f;

    public /* synthetic */ o(m mVar, int i7) {
        this.e = i7;
        this.f = mVar;
    }

    @Override // zd.e1
    public final boolean i() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // zd.e1
    public final void j(Throwable th2) {
        switch (this.e) {
            case 0:
                n1 h = h();
                m mVar = this.f;
                Throwable q10 = mVar.q(h);
                if (mVar.x()) {
                    ee.f fVar = (ee.f) mVar.d;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ee.f.n;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(fVar);
                        aa.b0 b0Var = ee.a.c;
                        if (kotlin.jvm.internal.j.a(obj, b0Var)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, b0Var, q10)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != b0Var) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                mVar.n(q10);
                if (!mVar.x()) {
                    mVar.o();
                    break;
                }
                break;
            default:
                this.f.resumeWith(gd.k.a);
                break;
        }
    }
}
