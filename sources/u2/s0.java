package u2;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import v7.k7;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class s0 implements y2.i {
    public final Uri a;
    public final g2.b0 b;
    public final t0.h c;
    public final v0 d;
    public final e2.i e;
    public volatile boolean h;
    public long r;
    public g2.m s;
    public c3.j0 v;
    public boolean w;
    public final /* synthetic */ v0 x;
    public final c3.s f = new c3.s();
    public boolean n = true;

    public s0(v0 v0Var, Uri uri, g2.h hVar, t0.h hVar2, v0 v0Var2, e2.i iVar) {
        this.x = v0Var;
        this.a = uri;
        this.b = new g2.b0(hVar);
        this.c = hVar2;
        this.d = v0Var2;
        this.e = iVar;
        t.g.getAndIncrement();
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
                    if (i11 != 1 && this.c.g() != -1) {
                        this.f.a = this.c.g();
                    }
                    k7.a(this.b);
                    return;
                }
                List list = (List) this.b.a.getResponseHeaders().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (open != -1) {
                    open += j10;
                    v0 v0Var = this.x;
                    v0Var.H.post(new o0(v0Var, 0));
                }
                long j11 = open;
                this.x.J = p3.b.d(this.b.a.getResponseHeaders());
                g2.b0 b0Var = this.b;
                p3.b bVar = this.x.J;
                if (bVar == null || (i10 = bVar.f) == -1) {
                    hVar = b0Var;
                } else {
                    hVar = new s(b0Var, i10, this);
                    c3.j0 z10 = this.x.z(new u0(0, true));
                    this.v = z10;
                    z10.b(v0.j0);
                }
                this.c.h(hVar, this.a, this.b.a.getResponseHeaders(), j10, j11, this.d);
                if (this.x.J != null && (oVar = (c3.o) this.c.c) != null) {
                    c3.o b11 = oVar.b();
                    if (b11 instanceof v3.d) {
                        ((v3.d) b11).t = true;
                    }
                }
                if (this.n) {
                    t0.h hVar2 = this.c;
                    long j12 = this.r;
                    c3.o oVar2 = (c3.o) hVar2.c;
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
                        t0.h hVar3 = this.c;
                        c3.s sVar = this.f;
                        c3.o oVar3 = (c3.o) hVar3.c;
                        oVar3.getClass();
                        c3.l lVar = (c3.l) hVar3.d;
                        lVar.getClass();
                        i11 = oVar3.f(lVar, sVar);
                        long g10 = this.c.g();
                        if (g10 > this.x.s + j10) {
                            this.e.d();
                            v0 v0Var2 = this.x;
                            v0Var2.H.post(v0Var2.G);
                            j10 = g10;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i11 == 1) {
                    i11 = 0;
                } else if (this.c.g() != -1) {
                    this.f.a = this.c.g();
                }
                k7.a(this.b);
            } catch (Throwable th2) {
                if (i11 != 1 && this.c.g() != -1) {
                    this.f.a = this.c.g();
                }
                k7.a(this.b);
                throw th2;
            }
        }
    }

    public final g2.m b(long j10, String str) {
        Map map = v0.i0;
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
