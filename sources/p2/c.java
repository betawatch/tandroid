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
import u2.u;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c implements y2.i {
    public static final js0 E = new js0(10);
    public final l2.h a;
    public final s b;
    public final rb.a c;
    public a5.a f;
    public y2.n h;
    public Handler n;
    public o2.l r;
    public o s;
    public Uri v;
    public l w;
    public boolean x;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long y = -9223372036854775807L;

    public c(l2.h hVar, rb.a aVar, s sVar) {
        this.a = hVar;
        this.b = sVar;
        this.c = aVar;
    }

    @Override // y2.i
    public final void C(y2.k kVar, long j3, long j10, boolean z10) {
        y2.q qVar = (y2.q) kVar;
        long j11 = qVar.a;
        Uri uri = qVar.d.c;
        u uVar = new u(j10);
        this.c.getClass();
        this.f.m(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final l a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        l lVar = ((b) hashMap.get(uri)).d;
        if (lVar != null && z10) {
            if (!uri.equals(this.v)) {
                List list = this.s.e;
                int i10 = 0;
                while (true) {
                    if (i10 >= list.size()) {
                        break;
                    }
                    if (uri.equals(((n) list.get(i10)).a)) {
                        l lVar2 = this.w;
                        if (lVar2 == null || !lVar2.o) {
                            this.v = uri;
                            b bVar = (b) hashMap.get(uri);
                            l lVar3 = bVar.d;
                            if (lVar3 == null || !lVar3.o) {
                                bVar.e(b(uri));
                            } else {
                                this.w = lVar3;
                                this.r.v(lVar3);
                            }
                        }
                    } else {
                        i10++;
                    }
                }
            }
            b bVar2 = (b) hashMap.get(uri);
            l lVar4 = bVar2.d;
            if (!bVar2.v) {
                bVar2.v = true;
                if (lVar4 != null && !lVar4.o) {
                    bVar2.c(true);
                }
            }
        }
        return lVar;
    }

    public final Uri b(Uri uri) {
        h hVar;
        l lVar = this.w;
        if (lVar == null || !lVar.v.e || (hVar = (h) lVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hVar.b));
        int i10 = hVar.c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i10;
        b bVar = (b) this.d.get(uri);
        if (bVar.d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, d0.e0(bVar.d.u));
        l lVar = bVar.d;
        return lVar.o || (i10 = lVar.d) == 2 || i10 == 1 || bVar.e + max > elapsedRealtime;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    @Override // y2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d k(y2.k kVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        y2.q qVar = (y2.q) kVar;
        long j12 = qVar.a;
        Uri uri = qVar.d.c;
        u uVar = new u(j10);
        int i11 = qVar.c;
        this.c.getClass();
        if (!(iOException instanceof s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g2.u) && !(iOException instanceof y2.m)) {
            int i12 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            boolean z10 = j11 == -9223372036854775807L;
            this.f.q(uVar, i11, iOException, z10);
            return !z10 ? y2.n.f : new k4.d(0, j11, false);
        }
        j11 = -9223372036854775807L;
        if (j11 == -9223372036854775807L) {
        }
        this.f.q(uVar, i11, iOException, z10);
        if (!z10) {
        }
    }

    @Override // y2.i
    public final void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        y2.q qVar = (y2.q) kVar;
        if (i10 == 0) {
            long j11 = qVar.a;
            uVar = new u(qVar.b);
        } else {
            long j12 = qVar.a;
            Uri uri = qVar.d.c;
            uVar = new u(j10);
        }
        this.f.r(uVar, qVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // y2.i
    public final void p(y2.k kVar, long j3, long j10) {
        o oVar;
        y2.q qVar = (y2.q) kVar;
        p pVar = (p) qVar.f;
        boolean z10 = pVar instanceof l;
        if (z10) {
            String str = pVar.a;
            o oVar2 = o.n;
            Uri parse = Uri.parse(str);
            b2.r rVar = new b2.r();
            rVar.a = "0";
            rVar.p = r0.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new n(parse, new b2.s(rVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            oVar = new o("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            oVar = (o) pVar;
        }
        this.s = oVar;
        this.v = ((n) oVar.e.get(0)).a;
        this.e.add(new a(this));
        List list2 = oVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = qVar.d.c;
        u uVar = new u(j10);
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.f((l) pVar, uVar);
        } else {
            bVar.c(false);
        }
        this.c.getClass();
        this.f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
