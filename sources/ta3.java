// default package

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ta3 implements h86 {
    public static final k93 N = new k93((byte) 6);
    public mm5 E;
    public mm5 F;
    public mm5 G;
    public mm5 H;
    public Uri I;
    public df5 J;
    public Uri K;
    public boolean L;
    public final l69 a;
    public final lf5 b;
    public final i2f c;
    public kp f;
    public mv6 h;
    public Handler n;
    public ef5 r;
    public s93 s;
    public hf5 w;
    public av7 x;
    public se5 y;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long M = -9223372036854775807L;

    public ta3(l69 l69Var, i2f i2fVar, lf5 lf5Var) {
        this.a = l69Var;
        this.b = lf5Var;
        this.c = i2fVar;
    }

    @Override // h86
    public final void C0(k86 k86Var, long j, long j2, int i) {
        cv7 cv7Var = (cv7) k86Var;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        if (i != 0) {
            zxa zxaVar = cv7Var.d;
            e86Var.d = zxaVar.c;
            e86Var.e = zxaVar.d;
            e86Var.f = j2;
            e86Var.g = zxaVar.b;
        }
        this.f.u(new f86(e86Var), cv7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // h86
    public final void Z(k86 k86Var, long j, long j2) {
        hf5 hf5Var;
        cv7 cv7Var = (cv7) k86Var;
        if5 if5Var = (if5) cv7Var.f;
        boolean z = if5Var instanceof df5;
        if (z) {
            String str = if5Var.a;
            hf5 hf5Var2 = hf5.o;
            Uri parse = Uri.parse(str);
            em4 em4Var = new em4();
            em4Var.a = "0";
            em4Var.r = ud7.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new gf5(parse, new fm4(em4Var), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            hf5Var = new hf5("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list, null);
        } else {
            hf5Var = (hf5) if5Var;
        }
        this.w = hf5Var;
        p38 p38Var = new p38(hf5Var);
        try {
            p38Var.d();
            this.E = (mm5) p38Var.f;
            this.F = p38Var.c(1);
            this.G = p38Var.c(2);
            this.H = p38Var.c(3);
            sk4 sk4Var = this.w.n;
            if (sk4Var != null) {
                l69 l69Var = this.a;
                i4d i4dVar = new i4d(this);
                s93 s93Var = this.s;
                s93Var.getClass();
                se5 se5Var = new se5(l69Var, this, i4dVar, s93Var);
                this.y = se5Var;
                Uri uri = (Uri) sk4Var.b;
                String str2 = (String) sk4Var.c;
                kp kpVar = this.f;
                if (str2 != null) {
                    gre.p(se5Var.h.contains(str2));
                    se5Var.l = str2;
                }
                se5Var.k = true;
                se5Var.c(-9223372036854775807L);
                cv8 cv8Var = se5Var.a;
                pj4 pj4Var = new pj4((Object) se5Var, (byte) 6);
                cv8Var.e = uri;
                cv8Var.f = pj4Var;
                cv8Var.g = kpVar;
                cv8Var.i = new cdb(new Handler(g8c.z(), null));
                cv8Var.j = new mv6("SteeringManifestTracker");
                cv8Var.a = true;
                cv8Var.b();
            }
            this.I = ((of5) this.E.get(0)).b();
            this.e.add(new qa3(this));
            a(this.E, true);
            a(this.F, false);
            a(this.G, false);
            a(this.H, false);
            e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
            zxa zxaVar = cv7Var.d;
            e86Var.d = zxaVar.c;
            e86Var.e = zxaVar.d;
            e86Var.f = j2;
            e86Var.g = zxaVar.b;
            f86 f86Var = new f86(e86Var);
            sa3 sa3Var = (sa3) this.d.get(this.I);
            sa3Var.getClass();
            if (z) {
                Uri uri2 = cv7Var.d.c;
                HashMap hashMap = sa3Var.b;
                gre.p(hashMap.containsKey(uri2));
                ra3 ra3Var = (ra3) hashMap.get(uri2);
                ra3Var.getClass();
                ra3Var.d((df5) if5Var, f86Var);
            } else {
                sa3Var.e(this.I, false);
            }
            this.c.getClass();
            this.f.p(f86Var, 4);
        } catch (av7 e) {
            this.x = e;
        }
    }

    public final void a(List list, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            of5 of5Var = (of5) list.get(i);
            sa3 sa3Var = new sa3(this, of5Var, z);
            v5c it = ym5.q(of5Var.b.values()).iterator();
            while (it.hasNext()) {
                this.d.put((Uri) it.next(), sa3Var);
            }
        }
    }

    public final df5 b(Uri uri, boolean z) {
        HashMap hashMap = this.d;
        sa3 sa3Var = (sa3) hashMap.get(uri);
        if (sa3Var == null) {
            return null;
        }
        df5 b = sa3Var.b(uri);
        if (b != null && z) {
            h(uri, false);
            sa3 sa3Var2 = (sa3) hashMap.get(uri);
            sa3Var2.getClass();
            HashMap hashMap2 = sa3Var2.b;
            gre.p(hashMap2.containsKey(uri));
            ra3 ra3Var = (ra3) hashMap2.get(uri);
            ra3Var.getClass();
            if (!ra3Var.x) {
                gre.p(hashMap2.containsKey(uri));
                ra3 ra3Var2 = (ra3) hashMap2.get(uri);
                ra3Var2.getClass();
                ra3Var2.x = true;
                df5 b2 = sa3Var2.b(uri);
                if (b2 != null && !b2.o) {
                    sa3Var2.e(uri, true);
                }
            }
        }
        return b;
    }

    public final mm5 c(int i) {
        if (i == 0) {
            return this.E;
        }
        if (i == 1) {
            return this.F;
        }
        if (i == 2) {
            return this.G;
        }
        if (i != 3) {
            return null;
        }
        return this.H;
    }

    public final Uri d(Uri uri) {
        ze5 ze5Var;
        df5 df5Var = this.J;
        if (df5Var == null || !df5Var.v.e || (ze5Var = (ze5) df5Var.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(ze5Var.b));
        int i = ze5Var.c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    public final boolean e(long j, Uri uri) {
        sa3 sa3Var = (sa3) this.d.get(uri);
        if (sa3Var != null) {
            return sa3Var.c(j, uri);
        }
        return false;
    }

    public final boolean f(of5 of5Var, long j) {
        sa3 sa3Var = (sa3) this.d.get(of5Var.b());
        if (sa3Var == null) {
            return false;
        }
        Iterator it = sa3Var.b.values().iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= j <= ((ra3) it.next()).r;
        }
        return z;
    }

    public final boolean g(Uri uri) {
        byte b;
        sa3 sa3Var = (sa3) this.d.get(uri);
        if (sa3Var == null) {
            return false;
        }
        HashMap hashMap = sa3Var.b;
        gre.p(hashMap.containsKey(uri));
        ra3 ra3Var = (ra3) hashMap.get(uri);
        ra3Var.getClass();
        if (ra3Var.e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, g8c.i0(ra3Var.e.u));
        df5 df5Var = ra3Var.e;
        return df5Var.o || (b = df5Var.d) == 2 || b == 1 || ra3Var.f + max > elapsedRealtime;
    }

    public final void h(Uri uri, boolean z) {
        if (uri.equals(this.I)) {
            return;
        }
        HashMap hashMap = this.d;
        sa3 sa3Var = (sa3) hashMap.get(uri);
        boolean z2 = false;
        if (sa3Var != null ? sa3Var.c : false) {
            df5 df5Var = this.J;
            if (df5Var == null || !df5Var.o) {
                sa3 sa3Var2 = (sa3) hashMap.get(uri);
                sa3Var2.getClass();
                df5 b = sa3Var2.b(uri);
                if (b != null && b.o) {
                    z2 = true;
                }
                if (!z2 && z) {
                    sa3Var2.d(uri, d(uri));
                    this.K = uri;
                    return;
                }
                this.I = uri;
                if (!z2) {
                    sa3Var2.d(uri, d(uri));
                } else {
                    this.J = b;
                    this.r.v(b);
                }
            }
        }
    }

    public final void i(Uri uri) {
        sa3 sa3Var = (sa3) this.d.get(uri);
        if (sa3Var != null) {
            HashMap hashMap = sa3Var.b;
            gre.p(hashMap.containsKey(uri));
            ra3 ra3Var = (ra3) hashMap.get(uri);
            ra3Var.getClass();
            ra3Var.c.b();
            IOException iOException = ra3Var.w;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // h86
    public final void v(k86 k86Var, long j, long j2, boolean z) {
        cv7 cv7Var = (cv7) k86Var;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        this.c.getClass();
        this.f.o(f86Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // h86
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        long min;
        cv7 cv7Var = (cv7) k86Var;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        byte b = cv7Var.c;
        this.c.getClass();
        Throwable th = iOException;
        while (true) {
            if (th == null) {
                min = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((th instanceof av7) || (th instanceof FileNotFoundException) || (th instanceof ig5) || (th instanceof m86) || ((th instanceof r63) && ((r63) th).a == 2008)) {
                break;
            }
            th = th.getCause();
        }
        min = -9223372036854775807L;
        boolean z = min == -9223372036854775807L;
        this.f.s(f86Var, b, iOException, z);
        return z ? mv6.E : new i86(0, min);
    }
}
