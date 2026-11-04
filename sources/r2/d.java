package r2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b8.kg;
import d2.u0;
import d2.v0;
import g2.n0;
import g9.g2;
import g9.i0;
import g9.t0;
import i2.c0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements a3.k {
    public static final org.telegram.utils.twidget.a K = new org.telegram.utils.twidget.a();
    public i0 E;
    public i0 F;
    public Uri G;
    public m H;
    public boolean I;
    public final i9 a;
    public final t b;
    public final kb.a c;
    public kg f;
    public a3.q h;
    public Handler n;
    public q2.l r;
    public p s;
    public v0 w;
    public i0 x;
    public i0 y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long J = -9223372036854775807L;

    public d(i9 i9Var, kb.a aVar, t tVar) {
        this.a = i9Var;
        this.b = tVar;
        this.c = aVar;
    }

    @Override // a3.k
    public final void M(a3.m mVar, long j10, long j11, int i3) {
        w2.u uVar;
        a3.t tVar = (a3.t) mVar;
        if (i3 == 0) {
            long j12 = tVar.a;
            uVar = new w2.u(tVar.b, j10);
        } else {
            long j13 = tVar.a;
            i2.n nVar = tVar.b;
            c0 c0Var = tVar.d;
            uVar = new w2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        }
        this.f.u(uVar, tVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i3);
    }

    public final void a(List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            w wVar = (w) list.get(i3);
            c cVar = new c(this, wVar);
            g2 it = t0.q(wVar.b.values()).iterator();
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
            b bVar = (b) f1.p(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.x) {
                b bVar2 = (b) f1.p(hashMap2, uri, uri);
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

    public final i0 c(int i3) {
        if (i3 == 0) {
            return this.x;
        }
        if (i3 == 1) {
            return this.y;
        }
        if (i3 == 2) {
            return this.E;
        }
        if (i3 != 3) {
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
        int i3 = iVar.c;
        if (i3 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i3));
        }
        return buildUpon.build();
    }

    public final boolean e(w wVar, long j10) {
        c cVar = (c) this.d.get(wVar.c());
        if (cVar == null) {
            return false;
        }
        Iterator it = cVar.b.values().iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            z10 &= j10 <= ((b) it.next()).r;
        }
        return z10;
    }

    public final boolean f(Uri uri) {
        int i3;
        c cVar = (c) this.d.get(uri);
        if (cVar == null) {
            return false;
        }
        b bVar = (b) f1.p(cVar.b, uri, uri);
        bVar.getClass();
        if (bVar.e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, n0.h0(bVar.e.u));
        m mVar = bVar.e;
        return mVar.o || (i3 = mVar.d) == 2 || i3 == 1 || bVar.f + max > elapsedRealtime;
    }

    public final void g(Uri uri) {
        if (uri.equals(this.G)) {
            return;
        }
        List list = this.s.e;
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (uri.equals(((o) list.get(i3)).a)) {
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
                        b bVar = (b) f1.p(cVar.b, uri, uri);
                        bVar.getClass();
                        bVar.c(d);
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // a3.k
    public final void h(a3.m mVar, long j10, long j11) {
        p pVar;
        a3.t tVar = (a3.t) mVar;
        q qVar = (q) tVar.f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.a;
            p pVar2 = p.n;
            Uri parse = Uri.parse(str);
            d2.u uVar = new d2.u();
            uVar.a = "0";
            uVar.q = u0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new d2.v(uVar), null, null, null, null, null, null));
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
            i2.n nVar = tVar.b;
            c0 c0Var = tVar.d;
            w2.u uVar2 = new w2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
            c cVar = (c) this.d.get(this.G);
            cVar.getClass();
            if (z10) {
                Uri uri = tVar.d.c;
                b bVar = (b) f1.p(cVar.b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, uVar2);
            } else {
                c.b(cVar, this.G, false);
            }
            this.c.getClass();
            this.f.q(uVar2, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (v0 e10) {
            this.w = e10;
        }
    }

    public final void i(Uri uri) {
        c cVar = (c) this.d.get(uri);
        if (cVar != null) {
            b bVar = (b) f1.p(cVar.b, uri, uri);
            bVar.getClass();
            bVar.c.a();
            IOException iOException = bVar.w;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // a3.k
    public final a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        long min;
        a3.t tVar = (a3.t) mVar;
        long j12 = tVar.a;
        i2.n nVar = tVar.b;
        c0 c0Var = tVar.d;
        w2.u uVar = new w2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        int i10 = tVar.c;
        this.c.getClass();
        Throwable th2 = iOException;
        while (true) {
            if (th2 == null) {
                min = Math.min((i3 - 1) * 1000, 5000);
                break;
            }
            if ((th2 instanceof v0) || (th2 instanceof FileNotFoundException) || (th2 instanceof i2.v) || (th2 instanceof a3.p) || ((th2 instanceof i2.k) && ((i2.k) th2).a == 2008)) {
                break;
            }
            th2 = th2.getCause();
        }
        min = -9223372036854775807L;
        boolean z10 = min == -9223372036854775807L;
        this.f.s(uVar, i10, iOException, z10);
        return z10 ? a3.q.f : new a3.i(0, min, false);
    }

    @Override // a3.k
    public final void q0(a3.m mVar, long j10, long j11, boolean z10) {
        a3.t tVar = (a3.t) mVar;
        long j12 = tVar.a;
        i2.n nVar = tVar.b;
        c0 c0Var = tVar.d;
        w2.u uVar = new w2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.c.getClass();
        this.f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
