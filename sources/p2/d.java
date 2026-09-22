package p2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b2.r0;
import b2.s0;
import e2.d0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.js0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class d implements y2.h {
    public static final js0 E = new js0(11);
    public final k2.u a;
    public final t b;
    public final qb.b c;
    public a5.a f;
    public y2.m h;
    public Handler n;
    public o2.l r;
    public p s;
    public Uri v;
    public m w;
    public boolean x;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long y = -9223372036854775807L;

    public d(k2.u uVar, qb.b bVar, t tVar) {
        this.a = uVar;
        this.b = tVar;
        this.c = bVar;
    }

    @Override // y2.h
    public final void V(y2.j jVar, long j3, long j10, boolean z10) {
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.a;
        Uri uri = pVar.d.c;
        u2.t tVar = new u2.t(j10);
        this.c.getClass();
        this.f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final m a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        m mVar = ((c) hashMap.get(uri)).d;
        if (mVar != null && z10) {
            if (!uri.equals(this.v)) {
                List list = this.s.e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    }
                    if (uri.equals(((o) list.get(i10)).a)) {
                        m mVar2 = this.w;
                        if (mVar2 == null || !mVar2.o) {
                            this.v = uri;
                            c cVar = (c) hashMap.get(uri);
                            m mVar3 = cVar.d;
                            if (mVar3 == null || !mVar3.o) {
                                cVar.e(b(uri));
                            } else {
                                this.w = mVar3;
                                this.r.v(mVar3);
                            }
                        }
                    } else {
                        i10++;
                    }
                }
            }
            c cVar2 = (c) hashMap.get(uri);
            m mVar4 = cVar2.d;
            if (!cVar2.v) {
                cVar2.v = true;
                if (mVar4 != null && !mVar4.o) {
                    cVar2.c(true);
                }
            }
        }
        return mVar;
    }

    public final Uri b(Uri uri) {
        i iVar;
        m mVar = this.w;
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

    public final boolean c(Uri uri) {
        int i10;
        c cVar = (c) this.d.get(uri);
        if (cVar.d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, d0.e0(cVar.d.u));
        m mVar = cVar.d;
        return mVar.o || (i10 = mVar.d) == 2 || i10 == 1 || cVar.e + max > elapsedRealtime;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    @Override // y2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d n(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        y2.p pVar = (y2.p) jVar;
        long j12 = pVar.a;
        Uri uri = pVar.d.c;
        u2.t tVar = new u2.t(j10);
        int i11 = pVar.c;
        this.c.getClass();
        if (!(iOException instanceof s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g2.u) && !(iOException instanceof y2.l)) {
            int i12 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            boolean z10 = j11 == -9223372036854775807L;
            this.f.r(tVar, i11, iOException, z10);
            return !z10 ? y2.m.f : new k4.d(0, j11, false);
        }
        j11 = -9223372036854775807L;
        if (j11 == -9223372036854775807L) {
        }
        this.f.r(tVar, i11, iOException, z10);
        if (!z10) {
        }
    }

    @Override // y2.h
    public final void o(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        if (i10 == 0) {
            long j11 = pVar.a;
            tVar = new u2.t(pVar.b);
        } else {
            long j12 = pVar.a;
            Uri uri = pVar.d.c;
            tVar = new u2.t(j10);
        }
        this.f.s(tVar, pVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // y2.h
    public final void q(y2.j jVar, long j3, long j10) {
        p pVar;
        y2.p pVar2 = (y2.p) jVar;
        q qVar = (q) pVar2.f;
        boolean z10 = qVar instanceof m;
        if (z10) {
            String str = qVar.a;
            p pVar3 = p.n;
            Uri parse = Uri.parse(str);
            b2.r rVar = new b2.r();
            rVar.a = "0";
            rVar.p = r0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new o(parse, new b2.s(rVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            pVar = new p("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            pVar = (p) qVar;
        }
        this.s = pVar;
        this.v = ((o) pVar.e.get(0)).a;
        this.e.add(new a(this));
        List list2 = pVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new c(this, uri));
        }
        Uri uri2 = pVar2.d.c;
        u2.t tVar = new u2.t(j10);
        c cVar = (c) this.d.get(this.v);
        if (z10) {
            cVar.f((m) qVar, tVar);
        } else {
            cVar.c(false);
        }
        this.c.getClass();
        this.f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
