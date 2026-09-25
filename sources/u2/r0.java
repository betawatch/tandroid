package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import v7.n7;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class r0 implements y2.i {
    public final Uri a;
    public final g2.b0 b;
    public final la.h c;
    public final u0 d;
    public final e2.g e;
    public volatile boolean h;
    public long r;
    public g2.m s;
    public c3.h0 v;
    public boolean w;
    public final /* synthetic */ u0 x;
    public final c3.s f = new c3.s();
    public boolean n = true;

    public r0(u0 u0Var, Uri uri, g2.h hVar, la.h hVar2, u0 u0Var2, e2.g gVar) {
        this.x = u0Var;
        this.a = uri;
        this.b = new g2.b0(hVar);
        this.c = hVar2;
        this.d = u0Var2;
        this.e = gVar;
        t.b.getAndIncrement();
        this.s = b(0L);
    }

    @Override // y2.i
    public final void D() {
        this.h = true;
    }

    @Override // y2.i
    public final void a() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        while (i11 == 0 && !this.h) {
            try {
                long j3 = this.f.a;
                g2.m b10 = b(j3);
                this.s = b10;
                long open = this.b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.c.E() != -1) {
                        this.f.a = this.c.E();
                    }
                    n7.a(this.b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    u0 u0Var = this.x;
                    u0Var.H.post(new o0(u0Var, 0));
                }
                long j10 = open;
                this.x.J = p3.b.d(this.b.a.getResponseHeaders());
                g2.b0 b0Var = this.b;
                p3.b bVar = this.x.J;
                if (bVar == null || (i10 = bVar.f) == -1) {
                    hVar = b0Var;
                } else {
                    hVar = new s(b0Var, i10, this);
                    c3.h0 z10 = this.x.z(new t0(0, true));
                    this.v = z10;
                    z10.b(u0.h0);
                }
                this.c.O(hVar, this.a, this.b.a.getResponseHeaders(), j3, j10, this.d);
                if (this.x.J != null && (oVar = (c3.o) this.c.c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).s = true;
                    }
                }
                if (this.n) {
                    la.h hVar2 = this.c;
                    long j11 = this.r;
                    c3.o oVar2 = (c3.o) hVar2.c;
                    oVar2.getClass();
                    oVar2.h(j3, j11);
                    this.n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.g gVar = this.e;
                        synchronized (gVar) {
                            while (!gVar.b) {
                                gVar.a.getClass();
                                gVar.wait();
                            }
                        }
                        la.h hVar3 = this.c;
                        c3.s sVar = this.f;
                        c3.o oVar3 = (c3.o) hVar3.c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long E = this.c.E();
                        if (E > this.x.s + j3) {
                            this.e.d();
                            u0 u0Var2 = this.x;
                            u0Var2.H.post(u0Var2.G);
                            j3 = E;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.c.E() != -1) {
                    this.f.a = this.c.E();
                }
                n7.a(this.b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.c.E() != -1) {
                    this.f.a = this.c.E();
                }
                n7.a(this.b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.x.r;
        Map map2 = u0.g0;
        Uri uri = this.a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }
}
