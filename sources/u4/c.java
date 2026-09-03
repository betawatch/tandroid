package u4;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import b4.e0;
import g5.b0;
import g5.h0;
import g5.j0;
import g5.l0;
import g5.m0;
import g5.p0;
import h5.d0;
import j3.r1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.MediaDataController;
import s8.n0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c implements h0 {
    public static final s0.b B = new s0.b(12);
    public final o3.c a;
    public final p b;
    public final z9.d c;
    public e0 f;
    public m0 h;
    public Handler n;
    public t4.m r;
    public l s;
    public Uri v;
    public i w;
    public boolean x;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long y = -9223372036854775807L;

    public c(o3.c cVar, z9.d dVar, p pVar) {
        this.a = cVar;
        this.b = pVar;
        this.c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    @Override // g5.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c4.e X(j0 j0Var, IOException iOException, int i10) {
        long j10;
        p0 p0Var = (p0) j0Var;
        long j11 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        int i11 = p0Var.c;
        this.c.getClass();
        if (!(iOException instanceof r1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof b0) && !(iOException instanceof l0)) {
            int i12 = g5.n.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g5.n) || ((g5.n) th2).a != 2008) {
                }
            }
            j10 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            boolean z4 = j10 == -9223372036854775807L;
            this.f.s(jVar, i11, iOException, z4);
            return !z4 ? m0.f : new c4.e(0, j10, false);
        }
        j10 = -9223372036854775807L;
        if (j10 == -9223372036854775807L) {
        }
        this.f.s(jVar, i11, iOException, z4);
        if (!z4) {
        }
    }

    public final i a(Uri uri, boolean z4) {
        HashMap hashMap = this.d;
        i iVar = ((b) hashMap.get(uri)).d;
        if (iVar != null && z4 && !uri.equals(this.v)) {
            List list = this.s.e;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (uri.equals(((k) list.get(i10)).a)) {
                    i iVar2 = this.w;
                    if (iVar2 == null || !iVar2.o) {
                        this.v = uri;
                        b bVar = (b) hashMap.get(uri);
                        i iVar3 = bVar.d;
                        if (iVar3 == null || !iVar3.o) {
                            bVar.c(b(uri));
                            return iVar;
                        }
                        this.w = iVar3;
                        this.r.t(iVar3);
                        return iVar;
                    }
                } else {
                    i10++;
                }
            }
        }
        return iVar;
    }

    public final Uri b(Uri uri) {
        e eVar;
        i iVar = this.w;
        if (iVar == null || !iVar.v.e || (eVar = (e) ((n0) iVar.t).get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.b));
        int i10 = eVar.c;
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
        long max = Math.max(30000L, d0.S(bVar.d.u));
        i iVar = bVar.d;
        return iVar.o || (i10 = iVar.d) == 2 || i10 == 1 || bVar.e + max > elapsedRealtime;
    }

    @Override // g5.h0
    public final void k1(j0 j0Var, long j10, long j11) {
        l lVar;
        p0 p0Var = (p0) j0Var;
        m mVar = (m) p0Var.f;
        boolean z4 = mVar instanceof i;
        if (z4) {
            String str = mVar.a;
            l lVar2 = l.n;
            Uri parse = Uri.parse(str);
            j3.m0 m0Var = new j3.m0();
            m0Var.a = "0";
            m0Var.n = "application/x-mpegURL";
            List singletonList = Collections.singletonList(new k(parse, new j3.n0(m0Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            lVar = new l("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            lVar = (l) mVar;
        }
        this.s = lVar;
        this.v = ((k) lVar.e.get(0)).a;
        this.e.add(new a(this));
        List list2 = lVar.d;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list2.get(i10);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = p0Var.d.c;
        o4.j jVar = new o4.j();
        b bVar = (b) this.d.get(this.v);
        if (z4) {
            bVar.d((i) mVar);
        } else {
            bVar.c(bVar.a);
        }
        this.c.getClass();
        this.f.p(jVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // g5.h0
    public final void x0(j0 j0Var, long j10, long j11, boolean z4) {
        p0 p0Var = (p0) j0Var;
        long j12 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        this.c.getClass();
        this.f.m(jVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
