package yd;

import b8.ib;
import b8.jc;
import be.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import wd.b0;
import wd.c2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements c2 {
    public Object a = e.p;
    public wd.m b;
    public final /* synthetic */ c c;

    public b(c cVar) {
        this.c = cVar;
    }

    @Override // wd.c2
    public final void a(be.r rVar, int i3) {
        wd.m mVar = this.b;
        if (mVar != null) {
            mVar.a(rVar, i3);
        }
    }

    public final Object b(zd.d dVar) {
        k kVar;
        k kVar2;
        Object obj = this.a;
        boolean z10 = true;
        if (obj == e.p || obj == e.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.h;
            c cVar = this.c;
            k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
            while (!cVar.r(c.b.get(cVar), true)) {
                long andIncrement = c.c.getAndIncrement(cVar);
                long j10 = e.b;
                long j11 = andIncrement / j10;
                int i3 = (int) (andIncrement % j10);
                if (kVar3.c != j11) {
                    k l10 = cVar.l(j11, kVar3);
                    if (l10 == null) {
                        continue;
                    } else {
                        kVar = l10;
                    }
                } else {
                    kVar = kVar3;
                }
                Object z11 = cVar.z(kVar, i3, andIncrement, null);
                t tVar = e.m;
                if (z11 == tVar) {
                    throw new IllegalStateException("unreachable");
                }
                t tVar2 = e.o;
                if (z11 == tVar2) {
                    if (andIncrement < cVar.p()) {
                        kVar.b();
                    }
                    kVar3 = kVar;
                } else {
                    if (z11 != e.n) {
                        kVar.b();
                        this.a = z11;
                        return Boolean.valueOf(z10);
                    }
                    wd.m l11 = b0.l(jc.b(dVar));
                    try {
                        this.b = l11;
                        try {
                            Object z12 = cVar.z(kVar, i3, andIncrement, this);
                            if (z12 == tVar) {
                                a(kVar, i3);
                            } else {
                                if (z12 == tVar2) {
                                    if (andIncrement < cVar.p()) {
                                        kVar.b();
                                    }
                                    k kVar4 = (k) c.h.get(cVar);
                                    while (true) {
                                        if (cVar.r(c.b.get(cVar), true)) {
                                            wd.m mVar = this.b;
                                            kotlin.jvm.internal.j.b(mVar);
                                            this.b = null;
                                            this.a = e.l;
                                            Throwable m10 = cVar.m();
                                            if (m10 == null) {
                                                mVar.resumeWith(Boolean.FALSE);
                                            } else {
                                                mVar.resumeWith(ib.a(m10));
                                            }
                                        } else {
                                            long andIncrement2 = c.c.getAndIncrement(cVar);
                                            long j12 = e.b;
                                            long j13 = andIncrement2 / j12;
                                            int i10 = (int) (andIncrement2 % j12);
                                            if (kVar4.c != j13) {
                                                kVar2 = cVar.l(j13, kVar4);
                                                if (kVar2 == null) {
                                                }
                                            } else {
                                                kVar2 = kVar4;
                                            }
                                            Object z13 = cVar.z(kVar2, i10, andIncrement2, this);
                                            if (z13 == e.m) {
                                                a(kVar2, i10);
                                                break;
                                            }
                                            if (z13 == e.o) {
                                                if (andIncrement2 < cVar.p()) {
                                                    kVar2.b();
                                                }
                                                kVar4 = kVar2;
                                            } else {
                                                if (z13 == e.n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                kVar2.b();
                                                this.a = z13;
                                                this.b = null;
                                            }
                                        }
                                    }
                                } else {
                                    kVar.b();
                                    this.a = z12;
                                    this.b = null;
                                }
                                l11.B(Boolean.TRUE, null);
                            }
                            Object r5 = l11.r();
                            gd.a aVar = gd.a.a;
                            return r5;
                        } catch (Throwable th2) {
                            th = th2;
                            l11.A();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
            this.a = e.l;
            Throwable m11 = cVar.m();
            if (m11 != null) {
                int i11 = be.s.a;
                throw m11;
            }
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
