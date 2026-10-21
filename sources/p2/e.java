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
import org.telegram.ui.fk0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class e implements y2.g {
    public static final fk0 J = new fk0(20);
    public n0 E;
    public Uri F;
    public n G;
    public boolean H;
    public final l2.f a;
    public final u b;
    public final oa.d c;
    public a5.a f;
    public y2.l h;
    public Handler n;
    public o2.l r;
    public q s;
    public w0 v;
    public n0 w;
    public n0 x;
    public n0 y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long I = -9223372036854775807L;

    public e(l2.f fVar, oa.d dVar, u uVar) {
        this.a = fVar;
        this.b = uVar;
        this.c = dVar;
    }

    @Override // y2.g
    public final void J(y2.i iVar, long j10, long j11, boolean z10) {
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
            x xVar = (x) list.get(i10);
            d dVar = new d(this, xVar);
            m2 it = y0.u(xVar.b.values()).iterator();
            while (it.hasNext()) {
                this.d.put((Uri) it.next(), dVar);
            }
        }
    }

    public final n b(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        d dVar = (d) hashMap.get(uri);
        if (dVar == null) {
            return null;
        }
        n a2 = d.a(dVar, uri);
        if (a2 != null && z10) {
            i(uri);
            d dVar2 = (d) hashMap.get(uri);
            dVar2.getClass();
            HashMap hashMap2 = dVar2.b;
            c cVar = (c) i2.e.i(hashMap2, uri, uri);
            cVar.getClass();
            if (!cVar.w) {
                c cVar2 = (c) i2.e.i(hashMap2, uri, uri);
                cVar2.getClass();
                cVar2.w = true;
                n a10 = d.a(dVar2, uri);
                if (a10 != null && !a10.o) {
                    d.b(dVar2, uri, true);
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
        j jVar;
        n nVar = this.G;
        if (nVar == null || !nVar.v.e || (jVar = (j) nVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar.b));
        int i10 = jVar.c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    @Override // y2.g
    public final k4.d e(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
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

    public final boolean f(x xVar, long j10) {
        d dVar = (d) this.d.get(xVar.c());
        if (dVar == null) {
            return false;
        }
        Iterator it = dVar.b.values().iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            z10 &= j10 <= ((c) it.next()).r;
        }
        return z10;
    }

    public final boolean g(Uri uri) {
        int i10;
        d dVar = (d) this.d.get(uri);
        if (dVar == null) {
            return false;
        }
        c cVar = (c) i2.e.i(dVar.b, uri, uri);
        cVar.getClass();
        if (cVar.e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, m0.h0(cVar.e.u));
        n nVar = cVar.e;
        return nVar.o || (i10 = nVar.d) == 2 || i10 == 1 || cVar.f + max > elapsedRealtime;
    }

    @Override // y2.g
    public final void h(y2.i iVar, long j10, long j11, int i10) {
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

    public final void i(Uri uri) {
        if (uri.equals(this.F)) {
            return;
        }
        List list = this.s.e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(((p) list.get(i10)).a)) {
                n nVar = this.G;
                if (nVar == null || !nVar.o) {
                    this.F = uri;
                    d dVar = (d) this.d.get(uri);
                    dVar.getClass();
                    n a2 = d.a(dVar, uri);
                    if (a2 != null && a2.o) {
                        this.G = a2;
                        this.r.v(a2);
                        return;
                    } else {
                        Uri d = d(uri);
                        c cVar = (c) i2.e.i(dVar.b, uri, uri);
                        cVar.getClass();
                        cVar.c(d);
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void j(Uri uri) {
        d dVar = (d) this.d.get(uri);
        if (dVar != null) {
            c cVar = (c) i2.e.i(dVar.b, uri, uri);
            cVar.getClass();
            cVar.c.a();
            IOException iOException = cVar.v;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // y2.g
    public final void k(y2.i iVar, long j10, long j11) {
        q qVar;
        y2.o oVar = (y2.o) iVar;
        r rVar = (r) oVar.f;
        boolean z10 = rVar instanceof n;
        if (z10) {
            String str = rVar.a;
            q qVar2 = q.n;
            Uri parse = Uri.parse(str);
            b2.v vVar = new b2.v();
            vVar.a = "0";
            vVar.q = v0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new p(parse, new b2.w(vVar), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            qVar = new q("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            qVar = (q) rVar;
        }
        this.s = qVar;
        try {
            this.w = x.b(qVar.e);
            this.x = x.a(qVar.f);
            this.y = x.a(qVar.g);
            this.E = x.a(qVar.h);
            this.F = ((x) this.w.get(0)).c();
            this.e.add(new a(this));
            a(this.w);
            a(this.x);
            a(this.y);
            a(this.E);
            g2.m mVar = oVar.b;
            b0 b0Var = oVar.d;
            u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
            d dVar = (d) this.d.get(this.F);
            dVar.getClass();
            if (z10) {
                Uri uri = oVar.d.c;
                c cVar = (c) i2.e.i(dVar.b, uri, uri);
                cVar.getClass();
                cVar.d((n) rVar, uVar);
            } else {
                d.b(dVar, this.F, false);
            }
            this.c.getClass();
            this.f.r(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (w0 e) {
            this.v = e;
        }
    }
}
