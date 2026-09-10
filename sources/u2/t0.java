package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import m.e3;
import v7.n7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class t0 implements y2.k {
    public final Uri a;
    public final g2.b0 b;
    public final e3 c;
    public final w0 d;
    public final e2.g e;
    public volatile boolean h;
    public long r;
    public g2.m s;
    public c3.h0 v;
    public boolean w;
    public final /* synthetic */ w0 x;
    public final c3.s f = new c3.s();
    public boolean n = true;

    public t0(w0 w0Var, Uri uri, g2.h hVar, e3 e3Var, w0 w0Var2, e2.g gVar) {
        this.x = w0Var;
        this.a = uri;
        this.b = new g2.b0(hVar);
        this.c = e3Var;
        this.d = w0Var2;
        this.e = gVar;
        u.b.getAndIncrement();
        this.s = b(0L);
    }

    @Override // y2.k
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
                    if (i11 != 1 && this.c.D() != -1) {
                        this.f.a = this.c.D();
                    }
                    n7.a(this.b);
                    return;
                }
                if (open != -1) {
                    open += j3;
                    w0 w0Var = this.x;
                    w0Var.H.post(new r0(w0Var, 0));
                }
                long j10 = open;
                this.x.J = p3.b.d(this.b.a.getResponseHeaders());
                g2.b0 b0Var = this.b;
                p3.b bVar = this.x.J;
                if (bVar == null || (i10 = bVar.f) == -1) {
                    hVar = b0Var;
                } else {
                    hVar = new t(b0Var, i10, this);
                    c3.h0 z10 = this.x.z(new v0(0, true));
                    this.v = z10;
                    z10.b(w0.h0);
                }
                this.c.N(hVar, this.a, this.b.a.getResponseHeaders(), j3, j10, this.d);
                if (this.x.J != null && (oVar = (c3.o) this.c.c) != null) {
                    c3.o c10 = oVar.c();
                    if (c10 instanceof v3.d) {
                        ((v3.d) c10).s = true;
                    }
                }
                if (this.n) {
                    e3 e3Var = this.c;
                    long j11 = this.r;
                    c3.o oVar2 = (c3.o) e3Var.c;
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
                        e3 e3Var2 = this.c;
                        c3.s sVar = this.f;
                        c3.o oVar3 = (c3.o) e3Var2.c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) e3Var2.d;
                        lVar.getClass();
                        i11 = oVar3.m(lVar, sVar);
                        long D = this.c.D();
                        if (D > this.x.s + j3) {
                            this.e.d();
                            w0 w0Var2 = this.x;
                            w0Var2.H.post(w0Var2.G);
                            j3 = D;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.c.D() != -1) {
                    this.f.a = this.c.D();
                }
                n7.a(this.b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.c.D() != -1) {
                    this.f.a = this.c.D();
                }
                n7.a(this.b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j3) {
        Map map = Collections.EMPTY_MAP;
        String str = this.x.r;
        Map map2 = w0.g0;
        Uri uri = this.a;
        e2.d.i(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map2, j3, -1L, str, 6);
    }

    @Override // y2.k
    public final void k() {
        this.h = true;
    }
}
