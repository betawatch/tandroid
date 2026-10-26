package u2;

import a8.hc;
import a8.ng;
import a8.yb;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class t0 implements y2.i {
    public final Uri a;
    public final g2.b0 b;
    public final s4.d c;
    public final w0 d;
    public final e2.i e;
    public volatile boolean h;
    public long r;
    public g2.m s;
    public c3.j0 v;
    public boolean w;
    public final /* synthetic */ w0 x;
    public final c3.s f = new c3.s();
    public boolean n = true;

    public t0(w0 w0Var, Uri uri, g2.h hVar, s4.d dVar, w0 w0Var2, e2.i iVar) {
        this.x = w0Var;
        this.a = uri;
        this.b = new g2.b0(hVar);
        this.c = dVar;
        this.d = w0Var2;
        this.e = iVar;
        u.g.getAndIncrement();
        this.s = a(0L, null);
    }

    public final g2.m a(long j10, String str) {
        Map map = w0.i0;
        if (str != null && !str.startsWith("W/")) {
            ng ngVar = new ng(4, 7);
            ngVar.x(map.entrySet());
            ngVar.w("If-Range", str);
            map = ngVar.e();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.x.r;
        Uri uri = this.a;
        yb.l(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map, j10, -1L, str2, 6);
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
                g2.m a2 = a(j10, str);
                this.s = a2;
                long open = this.b.open(a2);
                if (this.h) {
                    if (i11 != 1 && this.c.l() != -1) {
                        this.f.a = this.c.l();
                    }
                    hc.a(this.b);
                    return;
                }
                List list = (List) this.b.a.getResponseHeaders().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (open != -1) {
                    open += j10;
                    w0 w0Var = this.x;
                    w0Var.H.post(new p0(w0Var, 0));
                }
                long j11 = open;
                this.x.J = p3.b.d(this.b.a.getResponseHeaders());
                g2.b0 b0Var = this.b;
                p3.b bVar = this.x.J;
                if (bVar == null || (i10 = bVar.f) == -1) {
                    hVar = b0Var;
                } else {
                    hVar = new t(b0Var, i10, this);
                    c3.j0 x9 = this.x.x(new v0(0, true));
                    this.v = x9;
                    x9.b(w0.j0);
                }
                this.c.q(hVar, this.a, this.b.a.getResponseHeaders(), j10, j11, this.d);
                if (this.x.J != null && (oVar = (c3.o) this.c.c) != null) {
                    c3.o b10 = oVar.b();
                    if (b10 instanceof v3.d) {
                        ((v3.d) b10).t = true;
                    }
                }
                if (this.n) {
                    s4.d dVar = this.c;
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
                        s4.d dVar2 = this.c;
                        c3.s sVar = this.f;
                        c3.o oVar3 = (c3.o) dVar2.c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) dVar2.d;
                        lVar.getClass();
                        i11 = oVar3.f(lVar, sVar);
                        long l4 = this.c.l();
                        if (l4 > this.x.s + j10) {
                            this.e.d();
                            w0 w0Var2 = this.x;
                            w0Var2.H.post(w0Var2.G);
                            j10 = l4;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.c.l() != -1) {
                    this.f.a = this.c.l();
                }
                hc.a(this.b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.c.l() != -1) {
                    this.f.a = this.c.l();
                }
                hc.a(this.b);
                throw th2;
            }
        }
    }

    @Override // y2.i
    public final void f0() {
        this.h = true;
    }
}
