package x2;

import a8.ja;
import a8.xa;
import android.net.Uri;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class s0 implements b3.l {
    public final Uri a;
    public final j2.b0 b;
    public final ld0 c;
    public final v0 d;
    public final h2.i e;
    public volatile boolean h;
    public long r;
    public j2.m s;
    public f3.i0 w;
    public boolean x;
    public final /* synthetic */ v0 y;
    public final f3.s f = new f3.s();
    public boolean n = true;

    public s0(v0 v0Var, Uri uri, j2.h hVar, ld0 ld0Var, v0 v0Var2, h2.i iVar) {
        this.y = v0Var;
        this.a = uri;
        this.b = new j2.b0(hVar);
        this.c = ld0Var;
        this.d = v0Var2;
        this.e = iVar;
        t.g.getAndIncrement();
        this.s = b(0L, null);
    }

    @Override // b3.l
    public final void D() {
        this.h = true;
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
                    if (i10 != 1 && this.c.v() != -1) {
                        this.f.a = this.c.v();
                    }
                    c8.q0.a(this.b);
                    return;
                }
                List list = (List) this.b.a.getResponseHeaders().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (open != -1) {
                    open += j3;
                    v0 v0Var = this.y;
                    v0Var.I.post(new o0(v0Var, 0));
                }
                long j10 = open;
                this.y.K = s3.b.d(this.b.a.getResponseHeaders());
                j2.b0 b0Var = this.b;
                s3.b bVar = this.y.K;
                if (bVar == null || (i7 = bVar.f) == -1) {
                    hVar = b0Var;
                } else {
                    hVar = new s(b0Var, i7, this);
                    f3.i0 B = this.y.B(new u0(0, true));
                    this.w = B;
                    B.g(v0.k0);
                }
                this.c.C(hVar, this.a, this.b.a.getResponseHeaders(), j3, j10, this.d);
                if (this.y.K != null && (oVar = (f3.o) this.c.c) != null) {
                    f3.o a10 = oVar.a();
                    if (a10 instanceof y3.d) {
                        ((y3.d) a10).t = true;
                    }
                }
                if (this.n) {
                    ld0 ld0Var = this.c;
                    long j11 = this.r;
                    f3.o oVar2 = (f3.o) ld0Var.c;
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
                        ld0 ld0Var2 = this.c;
                        f3.s sVar = this.f;
                        f3.o oVar3 = (f3.o) ld0Var2.c;
                        oVar3.getClass();
                        f3.l lVar = (f3.l) ld0Var2.d;
                        lVar.getClass();
                        i10 = oVar3.f(lVar, sVar);
                        long v = this.c.v();
                        if (v > this.y.s + j3) {
                            this.e.d();
                            v0 v0Var2 = this.y;
                            v0Var2.I.post(v0Var2.H);
                            j3 = v;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i10 == 1) {
                    i10 = 0;
                } else if (this.c.v() != -1) {
                    this.f.a = this.c.v();
                }
                c8.q0.a(this.b);
            } catch (Throwable th2) {
                if (i10 != 1 && this.c.v() != -1) {
                    this.f.a = this.c.v();
                }
                c8.q0.a(this.b);
                throw th2;
            }
        }
    }

    public final j2.m b(long j3, String str) {
        Map map = v0.j0;
        if (str != null && !str.startsWith("W/")) {
            xa xaVar = new xa(4, 10);
            xaVar.v(map.entrySet());
            xaVar.u("If-Range", str);
            map = xaVar.d();
        }
        Map map2 = Collections.EMPTY_MAP;
        String str2 = this.y.r;
        Uri uri = this.a;
        ja.k(uri, "The uri must be set.");
        return new j2.m(uri, 1, null, map, j3, -1L, str2, 6);
    }
}
