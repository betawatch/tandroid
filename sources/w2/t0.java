package w2;

import android.net.Uri;
import b8.kg;
import b8.uc;
import b8.zb;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t0 implements a3.m {
    public final Uri a;
    public final i2.c0 b;
    public final p7.d c;
    public final w0 d;
    public final g2.j e;
    public volatile boolean h;
    public long r;
    public i2.n s;
    public e3.i0 w;
    public boolean x;
    public final /* synthetic */ w0 y;
    public final e3.s f = new e3.s();
    public boolean n = true;

    public t0(w0 w0Var, Uri uri, i2.h hVar, p7.d dVar, w0 w0Var2, g2.j jVar) {
        this.y = w0Var;
        this.a = uri;
        this.b = new i2.c0(hVar);
        this.c = dVar;
        this.d = w0Var2;
        this.e = jVar;
        u.g.getAndIncrement();
        this.s = b(0L, null);
    }

    @Override // a3.m
    public final void X1() {
        this.h = true;
    }

    @Override // a3.m
    public final void a() {
        i2.h hVar;
        e3.o oVar;
        int i3;
        int i10 = 0;
        String str = null;
        while (i10 == 0 && !this.h) {
            try {
                long j10 = this.f.a;
                i2.n b10 = b(j10, str);
                this.s = b10;
                long open = this.b.open(b10);
                if (this.h) {
                    if (i10 != 1 && this.c.p() != -1) {
                        this.f.a = this.c.p();
                    }
                    uc.a(this.b);
                    return;
                }
                List list = (List) this.b.a.getResponseHeaders().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (open != -1) {
                    open += j10;
                    w0 w0Var = this.y;
                    w0Var.I.post(new p0(w0Var, 0));
                }
                long j11 = open;
                this.y.K = r3.b.d(this.b.a.getResponseHeaders());
                i2.c0 c0Var = this.b;
                r3.b bVar = this.y.K;
                if (bVar == null || (i3 = bVar.f) == -1) {
                    hVar = c0Var;
                } else {
                    hVar = new t(c0Var, i3, this);
                    e3.i0 z10 = this.y.z(new v0(0, true));
                    this.w = z10;
                    z10.g(w0.k0);
                }
                this.c.y(hVar, this.a, this.b.a.getResponseHeaders(), j10, j11, this.d);
                if (this.y.K != null && (oVar = (e3.o) this.c.d) != null) {
                    e3.o a10 = oVar.a();
                    if (a10 instanceof x3.d) {
                        ((x3.d) a10).t = true;
                    }
                }
                if (this.n) {
                    p7.d dVar = this.c;
                    long j12 = this.r;
                    e3.o oVar2 = (e3.o) dVar.d;
                    oVar2.getClass();
                    oVar2.d(j10, j12);
                    this.n = false;
                }
                while (i10 == 0 && !this.h) {
                    try {
                        g2.j jVar = this.e;
                        synchronized (jVar) {
                            while (!jVar.b) {
                                jVar.a.getClass();
                                jVar.wait();
                            }
                        }
                        p7.d dVar2 = this.c;
                        e3.s sVar = this.f;
                        e3.o oVar3 = (e3.o) dVar2.d;
                        oVar3.getClass();
                        e3.l lVar = (e3.l) dVar2.c;
                        lVar.getClass();
                        i10 = oVar3.f(lVar, sVar);
                        long p10 = this.c.p();
                        if (p10 > this.y.s + j10) {
                            this.e.d();
                            w0 w0Var2 = this.y;
                            w0Var2.I.post(w0Var2.H);
                            j10 = p10;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.c.p() != -1) {
                    this.f.a = this.c.p();
                }
                uc.a(this.b);
            } catch (Throwable th2) {
                if (i10 != 1 && this.c.p() != -1) {
                    this.f.a = this.c.p();
                }
                uc.a(this.b);
                throw th2;
            }
        }
    }

    public final i2.n b(long j10, String str) {
        Map map = w0.j0;
        if (str != null && !str.startsWith("W/")) {
            kg kgVar = new kg(4, 8);
            kgVar.x(map.entrySet());
            kgVar.w("If-Range", str);
            map = kgVar.f();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.y.r;
        Uri uri = this.a;
        zb.k(uri, "The uri must be set.");
        return new i2.n(uri, 1, null, map, j10, -1L, str2, 6);
    }
}
