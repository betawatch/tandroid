package p2;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b2.r0;
import b2.s0;
import e2.d0;
import g2.u;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class c implements y2.g {
    public static final org.webrtc.audio.b E = new org.webrtc.audio.b(1);
    public final l.d a;
    public final s b;
    public final qb.b c;
    public a5.a f;
    public y2.l h;
    public Handler n;
    public o2.l r;
    public o s;
    public Uri v;
    public l w;
    public boolean x;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long y = -9223372036854775807L;

    public c(l.d dVar, qb.b bVar, s sVar) {
        this.a = dVar;
        this.b = sVar;
        this.c = bVar;
    }

    @Override // y2.g
    public final void E(y2.i iVar, long j3, long j10, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j11 = oVar.a;
        Uri uri = oVar.d.c;
        u2.t tVar = new u2.t(j10);
        this.c.getClass();
        this.f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
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
    @Override // y2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d m(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.a;
        Uri uri = oVar.d.c;
        u2.t tVar = new u2.t(j10);
        int i11 = oVar.c;
        this.c.getClass();
        if (!(iOException instanceof s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof u) && !(iOException instanceof y2.k)) {
            int i12 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            boolean z10 = j11 == -9223372036854775807L;
            this.f.r(tVar, i11, iOException, z10);
            return !z10 ? y2.l.f : new k4.d(0, j11, false);
        }
        j11 = -9223372036854775807L;
        if (j11 == -9223372036854775807L) {
        }
        this.f.r(tVar, i11, iOException, z10);
        if (!z10) {
        }
    }

    @Override // y2.g
    public final void n(y2.i iVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j11 = oVar.a;
            tVar = new u2.t(oVar.b);
        } else {
            long j12 = oVar.a;
            Uri uri = oVar.d.c;
            tVar = new u2.t(j10);
        }
        this.f.s(tVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // y2.g
    public final void o(y2.i iVar, long j3, long j10) {
        o oVar;
        y2.o oVar2 = (y2.o) iVar;
        p pVar = (p) oVar2.f;
        boolean z10 = pVar instanceof l;
        if (z10) {
            String str = pVar.a;
            o oVar3 = o.n;
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
        Uri uri2 = oVar2.d.c;
        u2.t tVar = new u2.t(j10);
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.f((l) pVar, tVar);
        } else {
            bVar.c(false);
        }
        this.c.getClass();
        this.f.p(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
