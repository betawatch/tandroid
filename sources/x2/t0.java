package x2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class t0 implements b3.l {
    public final Uri a;
    public final j2.c0 b;
    public final hy0 c;
    public final w0 d;
    public final h2.i e;
    public volatile boolean h;
    public long r;
    public j2.m s;
    public f3.j0 w;
    public boolean x;
    public final /* synthetic */ w0 y;
    public final f3.s f = new f3.s();
    public boolean n = true;

    public t0(w0 w0Var, Uri uri, j2.h hVar, hy0 hy0Var, w0 w0Var2, h2.i iVar) {
        this.y = w0Var;
        this.a = uri;
        this.b = new j2.c0(hVar);
        this.c = hy0Var;
        this.d = w0Var2;
        this.e = iVar;
        u.g.getAndIncrement();
        this.s = b(0L, null);
    }

    @Override // b3.l
    public final void a() {
        j2.h hVar;
        f3.o oVar;
        int i7;
        int i10 = 0;
        String str = null;
        while (i10 == 0 && !this.h) {
            try {
                long j3 = this.f.a;
                j2.m b10 = b(j3, str);
                this.s = b10;
                long open = this.b.open(b10);
                if (this.h) {
                    if (i10 != 1 && this.c.x() != -1) {
                        this.f.a = this.c.x();
                    }
                    c8.p0.a(this.b);
                    return;
                }
                List list = (List) this.b.a.getResponseHeaders().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (open != -1) {
                    open += j3;
                    w0 w0Var = this.y;
                    w0Var.H.post(new p0(w0Var, 0));
                }
                long j10 = open;
                this.y.J = s3.b.d(this.b.a.getResponseHeaders());
                j2.c0 c0Var = this.b;
                s3.b bVar = this.y.J;
                if (bVar == null || (i7 = bVar.f) == -1) {
                    hVar = c0Var;
                } else {
                    hVar = new t(c0Var, i7, this);
                    f3.j0 x10 = this.y.x(new v0(0, true));
                    this.w = x10;
                    x10.g(w0.j0);
                }
                this.c.E(hVar, this.a, this.b.a.getResponseHeaders(), j3, j10, this.d);
                if (this.y.J != null && (oVar = (f3.o) this.c.c) != null) {
                    f3.o a10 = oVar.a();
                    if (a10 instanceof y3.d) {
                        ((y3.d) a10).t = true;
                    }
                }
                if (this.n) {
                    hy0 hy0Var = this.c;
                    long j11 = this.r;
                    f3.o oVar2 = (f3.o) hy0Var.c;
                    oVar2.getClass();
                    oVar2.d(j3, j11);
                    this.n = false;
                }
                while (i10 == 0 && !this.h) {
                    try {
                        h2.i iVar = this.e;
                        synchronized (iVar) {
                            while (!iVar.b) {
                                iVar.a.getClass();
                                iVar.wait();
                            }
                        }
                        hy0 hy0Var2 = this.c;
                        f3.s sVar = this.f;
                        f3.o oVar3 = (f3.o) hy0Var2.c;
                        oVar3.getClass();
                        f3.l lVar = (f3.l) hy0Var2.d;
                        lVar.getClass();
                        i10 = oVar3.f(lVar, sVar);
                        long x11 = this.c.x();
                        if (x11 > this.y.s + j3) {
                            this.e.d();
                            w0 w0Var2 = this.y;
                            w0Var2.H.post(w0Var2.G);
                            j3 = x11;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.c.x() != -1) {
                    this.f.a = this.c.x();
                }
                c8.p0.a(this.b);
            } catch (Throwable th2) {
                if (i10 != 1 && this.c.x() != -1) {
                    this.f.a = this.c.x();
                }
                c8.p0.a(this.b);
                throw th2;
            }
        }
    }

    public final j2.m b(long j3, String str) {
        Map map = w0.i0;
        if (str != null && !str.startsWith("W/")) {
            wa waVar = new wa(4, 10);
            waVar.w(map.entrySet());
            waVar.v("If-Range", str);
            map = waVar.e();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.y.r;
        Uri uri = this.a;
        ia.k(uri, "The uri must be set.");
        return new j2.m(uri, 1, null, map, j3, -1L, str2, 6);
    }

    @Override // b3.l
    public final void q0() {
        this.h = true;
    }
}
