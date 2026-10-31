package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.l7;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t0 implements y2.i {
    public final Uri a;
    public final g2.c0 b;
    public final q5.d c;
    public final w0 d;
    public final e2.i e;
    public volatile boolean h;
    public long r;
    public g2.n s;
    public c3.k0 w;
    public boolean x;
    public final /* synthetic */ w0 y;
    public final c3.s f = new c3.s();
    public boolean n = true;

    public t0(w0 w0Var, Uri uri, g2.h hVar, q5.d dVar, w0 w0Var2, e2.i iVar) {
        this.y = w0Var;
        this.a = uri;
        this.b = new g2.c0(hVar);
        this.c = dVar;
        this.d = w0Var2;
        this.e = iVar;
        u.g.getAndIncrement();
        this.s = a(0L, null);
    }

    @Override // y2.i
    public final void R1() {
        this.h = true;
    }

    public final g2.n a(long j10, String str) {
        Map map = w0.i0;
        if (str != null && !str.startsWith("W/")) {
            a5.a aVar = new a5.a(4, 6);
            aVar.x(map.entrySet());
            aVar.w("If-Range", str);
            map = aVar.g();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.y.r;
        Uri uri = this.a;
        t6.l(uri, "The uri must be set.");
        return new g2.n(uri, 1, null, map, j10, -1L, str2, 6);
    }

    @Override // y2.i
    public final void b() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        String str = null;
        while (i11 == 0 && !this.h) {
            try {
                long j10 = this.f.a;
                g2.n a2 = a(j10, str);
                this.s = a2;
                long open = this.b.open(a2);
                if (this.h) {
                    if (i11 != 1 && this.c.n() != -1) {
                        this.f.a = this.c.n();
                    }
                    l7.a(this.b);
                    return;
                }
                List list = (List) this.b.a.getResponseHeaders().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (open != -1) {
                    open += j10;
                    w0 w0Var = this.y;
                    w0Var.H.post(new p0(w0Var, 0));
                }
                long j11 = open;
                this.y.J = p3.b.d(this.b.a.getResponseHeaders());
                g2.c0 c0Var = this.b;
                p3.b bVar = this.y.J;
                if (bVar == null || (i10 = bVar.f) == -1) {
                    hVar = c0Var;
                } else {
                    hVar = new t(c0Var, i10, this);
                    c3.k0 z10 = this.y.z(new v0(0, true));
                    this.w = z10;
                    z10.b(w0.j0);
                }
                this.c.u(hVar, this.a, this.b.a.getResponseHeaders(), j10, j11, this.d);
                if (this.y.J != null && (oVar = (c3.o) this.c.c) != null) {
                    c3.o b10 = oVar.b();
                    if (b10 instanceof v3.d) {
                        ((v3.d) b10).t = true;
                    }
                }
                if (this.n) {
                    q5.d dVar = this.c;
                    long j12 = this.r;
                    c3.o oVar2 = (c3.o) dVar.c;
                    oVar2.getClass();
                    oVar2.d(j10, j12);
                    this.n = false;
                }
                while (i11 == 0 && !this.h) {
                    try {
                        e2.i iVar = this.e;
                        synchronized (iVar) {
                            while (!iVar.b) {
                                iVar.a.getClass();
                                iVar.wait();
                            }
                        }
                        q5.d dVar2 = this.c;
                        c3.s sVar = this.f;
                        c3.o oVar3 = (c3.o) dVar2.c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) dVar2.d;
                        lVar.getClass();
                        i11 = oVar3.f(lVar, sVar);
                        long n10 = this.c.n();
                        if (n10 > this.y.s + j10) {
                            this.e.d();
                            w0 w0Var2 = this.y;
                            w0Var2.H.post(w0Var2.G);
                            j10 = n10;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.c.n() != -1) {
                    this.f.a = this.c.n();
                }
                l7.a(this.b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.c.n() != -1) {
                    this.f.a = this.c.n();
                }
                l7.a(this.b);
                throw th2;
            }
        }
    }
}
