package s2;

import a8.wa;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import e2.s0;
import e2.t0;
import h2.m0;
import h9.h2;
import h9.i0;
import j2.c0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d implements b3.j {
    public static final s0.b J = new s0.b(8);
    public i0 D;
    public i0 E;
    public Uri F;
    public m G;
    public boolean H;
    public final org.telegram.ui.Components.n a;
    public final t b;
    public final pb.b c;
    public wa f;
    public b3.o h;
    public Handler n;
    public r2.k r;
    public p s;
    public t0 w;
    public i0 x;
    public i0 y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long I = -9223372036854775807L;

    public d(org.telegram.ui.Components.n nVar, pb.b bVar, t tVar) {
        this.a = nVar;
        this.b = tVar;
        this.c = bVar;
    }

    @Override // b3.j
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.r rVar = (b3.r) lVar;
        if (i7 == 0) {
            long j11 = rVar.a;
            uVar = new x2.u(rVar.b, j3);
        } else {
            long j12 = rVar.a;
            j2.m mVar = rVar.b;
            c0 c0Var = rVar.d;
            uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        }
        this.f.t(uVar, rVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
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

    public final m b(Uri uri, boolean z9) {
        HashMap hashMap = this.d;
        c cVar = (c) hashMap.get(uri);
        if (cVar == null) {
            return null;
        }
        m a10 = c.a(cVar, uri);
        if (a10 != null && z9) {
            g(uri);
            c cVar2 = (c) hashMap.get(uri);
            cVar2.getClass();
            HashMap hashMap2 = cVar2.b;
            b bVar = (b) f1.l(hashMap2, uri, uri);
            bVar.getClass();
            if (!bVar.x) {
                b bVar2 = (b) f1.l(hashMap2, uri, uri);
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
            return this.D;
        }
        if (i7 != 3) {
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
        boolean z9 = true;
        while (it.hasNext()) {
            z9 &= j3 <= ((b) it.next()).r;
        }
        return z9;
    }

    public final boolean f(Uri uri) {
        int i7;
        c cVar = (c) this.d.get(uri);
        if (cVar == null) {
            return false;
        }
        b bVar = (b) f1.l(cVar.b, uri, uri);
        bVar.getClass();
        if (bVar.e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, m0.h0(bVar.e.u));
        m mVar = bVar.e;
        return mVar.o || (i7 = mVar.d) == 2 || i7 == 1 || bVar.f + max > elapsedRealtime;
    }

    public final void g(Uri uri) {
        if (uri.equals(this.F)) {
            return;
        }
        List list = this.s.e;
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (uri.equals(((o) list.get(i7)).a)) {
                m mVar = this.G;
                if (mVar == null || !mVar.o) {
                    this.F = uri;
                    c cVar = (c) this.d.get(uri);
                    cVar.getClass();
                    m a10 = c.a(cVar, uri);
                    if (a10 != null && a10.o) {
                        this.G = a10;
                        this.r.v(a10);
                        return;
                    } else {
                        Uri d = d(uri);
                        b bVar = (b) f1.l(cVar.b, uri, uri);
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
            b bVar = (b) f1.l(cVar.b, uri, uri);
            bVar.getClass();
            bVar.c.a();
            IOException iOException = bVar.w;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // b3.j
    public final b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.a;
        j2.m mVar = rVar.b;
        c0 c0Var = rVar.d;
        x2.u uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        int i10 = rVar.c;
        this.c.getClass();
        Throwable th2 = iOException;
        while (true) {
            if (th2 == null) {
                min = Math.min((i7 - 1) * 1000, 5000);
                break;
            }
            if ((th2 instanceof t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.v) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).a == 2008)) {
                break;
            }
            th2 = th2.getCause();
        }
        min = -9223372036854775807L;
        boolean z9 = min == -9223372036854775807L;
        this.f.r(uVar, i10, iOException, z9);
        return z9 ? b3.o.f : new b3.i(0, min, false);
    }

    @Override // b3.j
    public final void o1(b3.l lVar, long j3, long j10) {
        p pVar;
        b3.r rVar = (b3.r) lVar;
        q qVar = (q) rVar.f;
        boolean z9 = qVar instanceof m;
        if (z9) {
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
            this.D = w.a(pVar.g);
            this.E = w.a(pVar.h);
            this.F = ((w) this.x.get(0)).c();
            this.e.add(new a(this));
            a(this.x);
            a(this.y);
            a(this.D);
            a(this.E);
            j2.m mVar = rVar.b;
            c0 c0Var = rVar.d;
            x2.u uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
            c cVar = (c) this.d.get(this.F);
            cVar.getClass();
            if (z9) {
                Uri uri = rVar.d.c;
                b bVar = (b) f1.l(cVar.b, uri, uri);
                bVar.getClass();
                bVar.d((m) qVar, uVar);
            } else {
                c.b(cVar, this.F, false);
            }
            this.c.getClass();
            this.f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (t0 e10) {
            this.w = e10;
        }
    }

    @Override // b3.j
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.a;
        j2.m mVar = rVar.b;
        c0 c0Var = rVar.d;
        x2.u uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        this.c.getClass();
        this.f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
