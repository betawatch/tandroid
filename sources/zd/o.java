package zd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                        com.google.android.gms.internal.clearcut.e eVar = ee.a.c;
                        if (kotlin.jvm.internal.j.a(obj, eVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(fVar, eVar, q10)) {
                                if (atomicReferenceFieldUpdater.get(fVar) != eVar) {
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
