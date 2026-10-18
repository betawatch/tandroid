package p2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b2.v0;
import b2.w0;
import e2.m0;
import e9.m2;
import e9.n0;
import e9.y0;
import g2.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.hk0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class d implements y2.g {
    public static final hk0 J = new hk0(20);
    public n0 E;
    public Uri F;
    public m G;
    public boolean H;
    public final l2.f a;
    public final t b;
    public final oa.d c;
    public a5.a f;
    public y2.l h;
    public Handler n;
    public o2.l r;
    public p s;
    public w0 v;
    public n0 w;
    public n0 x;
    public n0 y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long I = -9223372036854775807L;

    public d(l2.f fVar, oa.d dVar, t tVar) {
        this.a = fVar;
        this.b = tVar;
        this.c = dVar;
    }

    @Override // y2.g
    public final void I(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.a;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.c.getClass();
        this.f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void a(List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            w wVar = (w) list.get(i10);
            c cVar = new c(this, wVar);
            m2 it = y0.u(wVar.b.values()).iterator();
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
        m a2 = c.a(cVar, uri);
        if (a2 != null && z10) {
            g(uri);
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            HashMap hashMap2 = cVar2.b;
            b bVar = (b) i2.d.i(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.w) {
                b bVar2 = (b) i2.d.i(hashMap2, uri, uri);
                bVar2.getClass();
                bVar2.w = true;
                m a10 = c.a(cVar2, uri);
                if (a10 != null && !a10.o) {
                    c.b(cVar2, uri, true);
                }
            }
        }
        return a2;
    }

    public final n0 c(int i10) {
        if (i10 == 0) {
            return this.w;
        }
        if (i10 == 1) {
            return this.x;
        }
        if (i10 == 2) {
            return this.y;
        }
        if (i10 != 3) {
            return null;
        }
        return this.E;
    }

    public final Uri d(Uri uri) {
        i iVar;
        m mVar = this.G;
        if (mVar == null || !mVar.v.e || (iVar = (i) mVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar.b));
        int i10 = iVar.c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
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
        int i10;
        c cVar = (c) this.d.get(uri);
        if (cVar == null) {
            return false;
        }
        b bVar = (b) i2.d.i(cVar.b, uri, uri);
        bVar.getClass();
        if (bVar.e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, m0.h0(bVar.e.u));
        m mVar = bVar.e;
        return mVar.o || (i10 = mVar.d) == 2 || i10 == 1 || bVar.f + max > elapsedRealtime;
    }

    public final void g(Uri uri) {
        if (uri.equals(this.F)) {
            return;
        }
        List list = this.s.e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(((o) list.get(i10)).a)) {
                m mVar = this.G;
                if (mVar == null || !mVar.o) {
                    this.F = uri;
                    c cVar = (c) this.d.get(uri);
                    cVar.getClass();
                    m a2 = c.a(cVar, uri);
                    if (a2 != null && a2.o) {
                        this.G = a2;
                        this.r.v(a2);
                        return;
                    } else {
                        Uri d = d(uri);
                        b bVar = (b) i2.d.i(cVar.b, uri, uri);
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
            b bVar = (b) i2.d.i(cVar.b, uri, uri);
            bVar.getClass();
            bVar.c.a();
            IOException iOException = bVar.v;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // y2.g
    public final k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.a;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        int i11 = oVar.c;
        this.c.getClass();
        Throwable th2 = iOException;
        while (true) {
            if (th2 == null) {
                min = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
                break;
            }
            if ((th2 instanceof w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).a == 2008)) {
                break;
            }
            th2 = th2.getCause();
        }
        min = -9223372036854775807L;
        boolean z10 = min == -9223372036854775807L;
        this.f.t(uVar, i11, iOException, z10);
        return z10 ? y2.l.f : new k4.d(0, min, false);
    }

    @Override // y2.g
    public final void l(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.a;
            uVar = new u2.u(oVar.b, j10);
        } else {
            long j13 = oVar.a;
            g2.m mVar = oVar.b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        }
        this.f.v(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // y2.g
    public final void n(y2.i iVar, long j10, long j11) {
        p pVar;
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.a;
            p pVar2 = p.n;
            Uri parse = Uri.parse(str);
            b2.v vVar = new b2.v();
            vVar.a = "0";
            vVar.q = v0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new b2.w(vVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.s = pVar;
        try {
            this.w = w.b(pVar.e);
            this.x = w.a(pVar.f);
            this.y = w.a(pVar.g);
            this.E = w.a(pVar.h);
            this.F = ((w) this.w.get(0)).c();
            this.e.add(new a(this));
            a(this.w);
            a(this.x);
            a(this.y);
            a(this.E);
            g2.m mVar = oVar.b;
            b0 b0Var = oVar.d;
            u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
            c cVar = (c) this.d.get(this.F);
            cVar.getClass();
            if (z10) {
                Uri uri = oVar.d.c;
                b bVar = (b) i2.d.i(cVar.b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, uVar);
            } else {
                c.b(cVar, this.F, false);
            }
            this.c.getClass();
            this.f.r(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (w0 e) {
            this.v = e;
        }
    }
}
