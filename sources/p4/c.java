package p4;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.p0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import d5.f0;
import h3.s0;
import h3.t1;
import j4.h0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n5.e0;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.fk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements l0 {
    public static final fk0 A = new fk0(14);
    public final e0 a;
    public final q b;
    public final v9.d c;
    public h0 f;
    public q0 h;
    public Handler n;
    public o4.m r;
    public m s;
    public Uri v;
    public j w;
    public boolean x;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long y = -9223372036854775807L;

    public c(e0 e0Var, v9.d dVar, q qVar) {
        this.a = e0Var;
        this.b = qVar;
        this.c = dVar;
    }

    public final j a(Uri uri, boolean z10) {
        HashMap hashMap = this.d;
        j jVar = ((b) hashMap.get(uri)).d;
        if (jVar != null && z10 && !uri.equals(this.v)) {
            List list = this.s.e;
            int i9 = 0;
            while (true) {
                if (i9 >= list.size()) {
                    break;
                }
                if (uri.equals(((l) list.get(i9)).a)) {
                    j jVar2 = this.w;
                    if (jVar2 == null || !jVar2.o) {
                        this.v = uri;
                        b bVar = (b) hashMap.get(uri);
                        j jVar3 = bVar.d;
                        if (jVar3 == null || !jVar3.o) {
                            bVar.c(b(uri));
                            return jVar;
                        }
                        this.w = jVar3;
                        this.r.t(jVar3);
                        return jVar;
                    }
                } else {
                    i9++;
                }
            }
        }
        return jVar;
    }

    public final Uri b(Uri uri) {
        f fVar;
        j jVar = this.w;
        if (jVar == null || !jVar.v.e || (fVar = (f) ((o8.q0) jVar.t).get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar.b));
        int i9 = fVar.c;
        if (i9 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i9));
        }
        return buildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i9;
        b bVar = (b) this.d.get(uri);
        if (bVar.d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, f0.S(bVar.d.u));
        j jVar = bVar.d;
        return jVar.o || (i9 = jVar.d) == 2 || i9 == 1 || bVar.e + max > elapsedRealtime;
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void e(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        j4.q qVar = new j4.q();
        this.c.getClass();
        this.f.d(qVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    @Override // com.google.android.exoplayer2.upstream.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k0 h(n0 n0Var, IOException iOException, int i9) {
        long j10;
        t0 t0Var = (t0) n0Var;
        long j11 = t0Var.a;
        Uri uri = t0Var.d.c;
        j4.q qVar = new j4.q();
        int i10 = t0Var.c;
        this.c.getClass();
        if (!(iOException instanceof t1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof com.google.android.exoplayer2.upstream.e0) && !(iOException instanceof p0)) {
            int i11 = com.google.android.exoplayer2.upstream.n.b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof com.google.android.exoplayer2.upstream.n) || ((com.google.android.exoplayer2.upstream.n) th).a != 2008) {
                }
            }
            j10 = Math.min((i9 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            boolean z10 = j10 == -9223372036854775807L;
            this.f.i(qVar, i10, iOException, z10);
            return !z10 ? q0.f : new k0(0, j10, false);
        }
        j10 = -9223372036854775807L;
        if (j10 == -9223372036854775807L) {
        }
        this.f.i(qVar, i10, iOException, z10);
        if (!z10) {
        }
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void m(n0 n0Var, long j10, long j11) {
        m mVar;
        t0 t0Var = (t0) n0Var;
        n nVar = (n) t0Var.f;
        boolean z10 = nVar instanceof j;
        if (z10) {
            String str = nVar.a;
            m mVar2 = m.n;
            Uri parse = Uri.parse(str);
            s0 s0Var = new s0();
            s0Var.a = "0";
            s0Var.n = "application/x-mpegURL";
            List singletonList = Collections.singletonList(new l(parse, new h3.t0(s0Var), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            mVar = new m("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            mVar = (m) nVar;
        }
        this.s = mVar;
        this.v = ((l) mVar.e.get(0)).a;
        this.e.add(new a(this));
        List list2 = mVar.d;
        int size = list2.size();
        for (int i9 = 0; i9 < size; i9++) {
            Uri uri = (Uri) list2.get(i9);
            this.d.put(uri, new b(this, uri));
        }
        Uri uri2 = t0Var.d.c;
        j4.q qVar = new j4.q();
        b bVar = (b) this.d.get(this.v);
        if (z10) {
            bVar.d((j) nVar);
        } else {
            bVar.c(bVar.a);
        }
        this.c.getClass();
        this.f.f(qVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
