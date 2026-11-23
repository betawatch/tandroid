package s2;

import a8.xa;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import e2.s0;
import e2.t0;
import h2.l0;
import h9.h2;
import h9.i0;
import j2.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Cells.c5;
import r0.f1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class d implements b3.k {
    public static final f1 K = new f1(16);
    public i0 E;
    public i0 F;
    public Uri G;
    public m H;
    public boolean I;
    public final c5 a;
    public final t b;
    public final qb.a c;
    public xa f;
    public b3.p h;
    public Handler n;
    public r2.k r;
    public p s;
    public t0 w;
    public i0 x;
    public i0 y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long J = -9223372036854775807L;

    public d(c5 c5Var, qb.a aVar, t tVar) {
        this.a = c5Var;
        this.b = tVar;
        this.c = aVar;
    }

    public final void a(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            w wVar = (w) list.get(i7);
            c cVar = new c(this, wVar);
            h2 it = h9.t0.q(wVar.b.values()).iterator();
            while (it.hasNext()) {
                this.d.put((Uri) it.next(), cVar);
            }
        }
    }

    public final m b(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        c cVar = (c) hashMap.get(uri);
        if (cVar == null) {
            return null;
        }
        m a10 = c.a(cVar, uri);
        if (a10 != null && z10) {
            g(uri);
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            HashMap hashMap2 = cVar2.b;
            b bVar = (b) p5.c.i(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.x) {
                b bVar2 = (b) p5.c.i(hashMap2, uri, uri);
                bVar2.getClass();
                bVar2.x = true;
                m a11 = c.a(cVar2, uri);
                if (a11 != null && !a11.o) {
                    c.b(cVar2, uri, true);
                }
            }
        }
        return a10;
    }

    public final i0 c(int i7) {
        if (i7 == 0) {
            return this.x;
        }
        if (i7 == 1) {
            return this.y;
        }
        if (i7 == 2) {
            return this.E;
        }
        if (i7 != 3) {
            return null;
        }
        return this.F;
    }

    public final Uri d(Uri uri) {
        i iVar;
        m mVar = this.H;
        if (mVar == null || !mVar.v.e || (iVar = (i) mVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.b));
        int i7 = iVar.c;
        if (i7 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
        }
        return buildUpon.build();
    }

    public final boolean e(w wVar, long j3) {
        c cVar = (c) this.d.get(wVar.c());
        if (cVar == null) {
            return false;
        }
        Iterator it = cVar.b.values().iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            z10 &= j3 <= ((b) it.next()).r;
        }
        return z10;
    }

    public final boolean f(Uri uri) {
        int i7;
        c cVar = (c) this.d.get(uri);
        if (cVar == null) {
            return false;
        }
        b bVar = (b) p5.c.i(cVar.b, uri, uri);
        bVar.getClass();
        if (bVar.e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, l0.h0(bVar.e.u));
        m mVar = bVar.e;
        return mVar.o || (i7 = mVar.d) == 2 || i7 == 1 || bVar.f + max > elapsedRealtime;
    }

    public final void g(Uri uri) {
        if (uri.equals(this.G)) {
            return;
        }
        List list = this.s.e;
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (uri.equals(((o) list.get(i7)).a)) {
                m mVar = this.H;
                if (mVar == null || !mVar.o) {
                    this.G = uri;
                    c cVar = (c) this.d.get(uri);
                    cVar.getClass();
                    m a10 = c.a(cVar, uri);
                    if (a10 != null && a10.o) {
                        this.H = a10;
                        this.r.v(a10);
                        return;
                    } else {
                        Uri d = d(uri);
                        b bVar = (b) p5.c.i(cVar.b, uri, uri);
                        bVar.getClass();
                        bVar.c(d);
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void h(Uri uri) {
        c cVar = (c) this.d.get(uri);
        if (cVar != null) {
            b bVar = (b) p5.c.i(cVar.b, uri, uri);
            bVar.getClass();
            bVar.c.a();
            IOException iOException = bVar.w;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // b3.k
    public final b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.a;
        j2.m mVar2 = sVar.b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        int i10 = sVar.c;
        this.c.getClass();
        Throwable th2 = iOException;
        while (true) {
            if (th2 == null) {
                min = Math.min((i7 - 1) * 1000, 5000);
                break;
            }
            if ((th2 instanceof t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).a == 2008)) {
                break;
            }
            th2 = th2.getCause();
        }
        min = -9223372036854775807L;
        boolean z10 = min == -9223372036854775807L;
        this.f.r(uVar, i10, iOException, z10);
        return z10 ? b3.p.f : new b3.i(0, min, false);
    }

    @Override // b3.k
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        b3.s sVar = (b3.s) mVar;
        long j11 = sVar.a;
        j2.m mVar2 = sVar.b;
        b0 b0Var = sVar.d;
        x2.u uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.c.getClass();
        this.f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // b3.k
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.s sVar = (b3.s) mVar;
        if (i7 == 0) {
            long j11 = sVar.a;
            uVar = new x2.u(sVar.b, j3);
        } else {
            long j12 = sVar.a;
            j2.m mVar2 = sVar.b;
            b0 b0Var = sVar.d;
            uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        }
        this.f.u(uVar, sVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
    }

    @Override // b3.k
    public final void z(b3.m mVar, long j3, long j10) {
        p pVar;
        b3.s sVar = (b3.s) mVar;
        q qVar = (q) sVar.f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.a;
            p pVar2 = p.n;
            Uri parse = Uri.parse(str);
            e2.t tVar = new e2.t();
            tVar.a = "0";
            tVar.q = s0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new e2.u(tVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.s = pVar;
        try {
            this.x = w.b(pVar.e);
            this.y = w.a(pVar.f);
            this.E = w.a(pVar.g);
            this.F = w.a(pVar.h);
            this.G = ((w) this.x.get(0)).c();
            this.e.add(new a(this));
            a(this.x);
            a(this.y);
            a(this.E);
            a(this.F);
            j2.m mVar2 = sVar.b;
            b0 b0Var = sVar.d;
            x2.u uVar = new x2.u(mVar2, b0Var.c, b0Var.d, j3, j10, b0Var.b);
            c cVar = (c) this.d.get(this.G);
            cVar.getClass();
            if (z10) {
                Uri uri = sVar.d.c;
                b bVar = (b) p5.c.i(cVar.b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, uVar);
            } else {
                c.b(cVar, this.G, false);
            }
            this.c.getClass();
            this.f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (t0 e10) {
            this.w = e10;
        }
    }
}
