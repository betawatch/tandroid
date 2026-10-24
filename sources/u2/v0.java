package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.k7;
import v7.u6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class v0 implements y2.i {
    public final Uri a;
    public final g2.b0 b;
    public final c c;
    public final y0 d;
    public final e2.i e;
    public volatile boolean h;
    public long r;
    public g2.m s;
    public c3.l0 v;
    public boolean w;
    public final /* synthetic */ y0 x;
    public final c3.u f = new c3.u();
    public boolean n = true;

    public v0(y0 y0Var, Uri uri, g2.h hVar, c cVar, y0 y0Var2, e2.i iVar) {
        this.x = y0Var;
        this.a = uri;
        this.b = new g2.b0(hVar);
        this.c = cVar;
        this.d = y0Var2;
        this.e = iVar;
        v.g.getAndIncrement();
        this.s = b(0L, null);
    }

    @Override // y2.i
    public final void O() {
        this.h = true;
    }

    @Override // y2.i
    public final void a() {
        g2.h hVar;
        c3.q qVar;
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
                    y0 y0Var = this.x;
                    y0Var.H.post(new r0(y0Var, 0));
                }
                long j11 = open;
                this.x.J = p3.b.d(this.b.a.getResponseHeaders());
                g2.b0 b0Var = this.b;
                p3.b bVar = this.x.J;
                if (bVar == null || (i10 = bVar.f) == -1) {
                    hVar = b0Var;
                } else {
                    hVar = new u(b0Var, i10, this);
                    c3.l0 A = this.x.A(new x0(0, true));
                    this.v = A;
                    A.b(y0.j0);
                }
                this.c.c(hVar, this.a, this.b.a.getResponseHeaders(), j10, j11, this.d);
                if (this.x.J != null && (qVar = (c3.q) this.c.c) != null) {
                    c3.q b11 = qVar.b();
                    if (b11 instanceof v3.d) {
                        ((v3.d) b11).t = true;
                    }
                }
                if (this.n) {
                    c cVar = this.c;
                    long j12 = this.r;
                    c3.q qVar2 = (c3.q) cVar.c;
                    qVar2.getClass();
                    qVar2.d(j10, j12);
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
                        c3.u uVar = this.f;
                        c3.q qVar3 = (c3.q) cVar2.c;
                        qVar3.getClass();
                        c3.l lVar = (c3.l) cVar2.d;
                        lVar.getClass();
                        i11 = qVar3.f(lVar, uVar);
                        long b12 = this.c.b();
                        if (b12 > this.x.s + j10) {
                            this.e.d();
                            y0 y0Var2 = this.x;
                            y0Var2.H.post(y0Var2.G);
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
        Map map = y0.i0;
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
