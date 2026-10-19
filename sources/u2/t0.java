package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.k7;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class t0 implements y2.i {
    public final Uri a;
    public final g2.b0 b;
    public final c c;
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

    public t0(w0 w0Var, Uri uri, g2.h hVar, c cVar, w0 w0Var2, e2.i iVar) {
        this.x = w0Var;
        this.a = uri;
        this.b = new g2.b0(hVar);
        this.c = cVar;
        this.d = w0Var2;
        this.e = iVar;
        u.g.getAndIncrement();
        this.s = b(0L, null);
    }

    @Override // y2.i
    public final void O() {
        this.h = true;
    }

    @Override // y2.i
    public final void a() {
        g2.h hVar;
        c3.o oVar;
        int i10;
        int i11 = 0;
        String str = null;
        while (i11 == 0 && !this.h) {
            try {
                long j10 = this.f.a;
                g2.m b10 = b(j10, str);
                this.s = b10;
                long open = this.b.open(b10);
                if (this.h) {
                    if (i11 != 1 && this.c.b() != -1) {
                        this.f.a = this.c.b();
                    }
                    k7.a(this.b);
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
                    c3.j0 z10 = this.x.z(new v0(0, true));
                    this.v = z10;
                    z10.b(w0.j0);
                }
                this.c.c(hVar, this.a, this.b.a.getResponseHeaders(), j10, j11, this.d);
                if (this.x.J != null && (oVar = (c3.o) this.c.c) != null) {
                    c3.o b11 = oVar.b();
                    if (b11 instanceof v3.d) {
                        ((v3.d) b11).t = true;
                    }
                }
                if (this.n) {
                    c cVar = this.c;
                    long j12 = this.r;
                    c3.o oVar2 = (c3.o) cVar.c;
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
                        c cVar2 = this.c;
                        c3.s sVar = this.f;
                        c3.o oVar3 = (c3.o) cVar2.c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) cVar2.d;
                        lVar.getClass();
                        i11 = oVar3.f(lVar, sVar);
                        long b12 = this.c.b();
                        if (b12 > this.x.s + j10) {
                            this.e.d();
                            w0 w0Var2 = this.x;
                            w0Var2.H.post(w0Var2.G);
                            j10 = b12;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.c.b() != -1) {
                    this.f.a = this.c.b();
                }
                k7.a(this.b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.c.b() != -1) {
                    this.f.a = this.c.b();
                }
                k7.a(this.b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j10, String str) {
        Map map = w0.i0;
        if (str != null && !str.startsWith("W/")) {
            a5.a aVar = new a5.a(4, 5);
            aVar.y(map.entrySet());
            aVar.x("If-Range", str);
            map = aVar.g();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.x.r;
        Uri uri = this.a;
        u6.l(uri, "The uri must be set.");
        return new g2.m(uri, 1, null, map, j10, -1L, str2, 6);
    }
}
