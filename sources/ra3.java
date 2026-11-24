// default package

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ra3 implements h86 {
    public final Uri a;
    public final HashSet b;
    public final mv6 c;
    public final o63 d;
    public df5 e;
    public long f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public IOException w;
    public boolean x;
    public final /* synthetic */ ta3 y;

    public ra3(ta3 ta3Var, Uri uri, String str) {
        this.y = ta3Var;
        this.a = uri;
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        hashSet.add(str);
        this.c = new mv6("DefaultHlsPlaylistTracker:MediaPlaylist");
        this.d = ((m63) ta3Var.a.b).createDataSource();
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
        this.y.f.u(new f86(e86Var), cv7Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // h86
    public final void Z(k86 k86Var, long j, long j2) {
        cv7 cv7Var = (cv7) k86Var;
        if5 if5Var = (if5) cv7Var.f;
        e86 e86Var = new e86(cv7Var.a, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        if (if5Var instanceof df5) {
            d((df5) if5Var, f86Var);
            this.y.f.p(f86Var, 4);
        } else {
            av7 b = av7.b("Loaded playlist has unexpected type.", null);
            this.w = b;
            this.y.f.s(f86Var, 4, b, true);
        }
        this.y.c.getClass();
    }

    public final Uri a() {
        df5 df5Var = this.e;
        Uri uri = this.a;
        if (df5Var != null) {
            cf5 cf5Var = df5Var.v;
            if (cf5Var.a != -9223372036854775807L || cf5Var.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                df5 df5Var2 = this.e;
                if (df5Var2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(df5Var2.k + df5Var2.r.size()));
                    df5 df5Var3 = this.e;
                    if (df5Var3.n != -9223372036854775807L) {
                        mm5 mm5Var = df5Var3.s;
                        int size = mm5Var.size();
                        if (!mm5Var.isEmpty() && ((ye5) jle.b(mm5Var)).y) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                cf5 cf5Var2 = this.e.v;
                if (cf5Var2.a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", cf5Var2.b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void b(Uri uri) {
        ta3 ta3Var = this.y;
        bv7 d = ta3Var.b.d(ta3Var.w, this.e);
        Map map = Collections.EMPTY_MAP;
        gre.l(uri, "The uri must be set.");
        c5a c5aVar = new c5a(this.d, new u63(uri, 1, null, map, 0L, -1L, null, 1), d);
        se5 se5Var = ta3Var.y;
        String str = null;
        if (se5Var != null && se5Var.k) {
            sa3 sa3Var = (sa3) ta3Var.d.get(this.a);
            HashSet hashSet = this.b;
            if (sa3Var != null) {
                String str2 = sa3Var.a.d;
                if (hashSet.contains(str2)) {
                    str = str2;
                }
            }
            str = (String) jle.a(hashSet, null);
        }
        c5aVar.b = str;
        cv7 cv7Var = new cv7(c5aVar);
        this.c.r0(cv7Var, this, ta3Var.c.v3(cv7Var.c));
    }

    public final void c(Uri uri) {
        this.r = 0L;
        if (this.s) {
            return;
        }
        mv6 mv6Var = this.c;
        if (mv6Var.W() || mv6Var.S()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.n;
        if (elapsedRealtime >= j) {
            b(uri);
        } else {
            this.s = true;
            this.y.n.postDelayed(new gu2((Object) this, (Object) uri, (byte) 28), j - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.net.Uri, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(df5 df5Var, f86 f86Var) {
        boolean z;
        boolean z2;
        long j;
        mm5 mm5Var;
        long j2;
        long j3;
        int i;
        df5 df5Var2;
        ?? r1;
        bk2 bk2Var;
        boolean z3;
        cf5 cf5Var;
        int size;
        int size2;
        int size3;
        boolean z4 = df5Var.o;
        mm5 mm5Var2 = df5Var.r;
        long j4 = df5Var.k;
        df5 df5Var3 = this.e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f = elapsedRealtime;
        ta3 ta3Var = this.y;
        CopyOnWriteArrayList copyOnWriteArrayList = ta3Var.e;
        if (df5Var3 != null) {
            long j5 = df5Var3.k;
            if (j4 <= j5 && (j4 < j5 || ((size = mm5Var2.size() - df5Var3.r.size()) == 0 ? !((size2 = df5Var.s.size()) > (size3 = df5Var3.s.size()) || (size2 == size3 && z4 && !df5Var3.o)) : size <= 0))) {
                z = false;
                mm5 mm5Var3 = df5Var.r;
                long j6 = 0;
                if (!z) {
                    z2 = true;
                    if (df5Var.p) {
                        j = df5Var.h;
                        mm5Var = mm5Var2;
                    } else {
                        df5 df5Var4 = ta3Var.J;
                        j = df5Var4 != null ? df5Var4.h : 0L;
                        mm5Var = mm5Var2;
                        if (df5Var3 != null) {
                            long j7 = df5Var3.h;
                            long j8 = df5Var3.k;
                            mm5 mm5Var4 = df5Var3.r;
                            int size4 = mm5Var4.size();
                            j2 = j4;
                            int i2 = (int) (j2 - j8);
                            af5 af5Var = i2 < mm5Var4.size() ? (af5) mm5Var4.get(i2) : null;
                            if (af5Var != null) {
                                j3 = af5Var.e;
                            } else {
                                if (size4 == j2 - j8) {
                                    j3 = df5Var3.u;
                                }
                                long j9 = j;
                                if (df5Var.i) {
                                    i = df5Var.j;
                                } else {
                                    df5 df5Var5 = ta3Var.J;
                                    i = df5Var5 != null ? df5Var5.j : 0;
                                    if (df5Var3 != null) {
                                        int i3 = (int) (j2 - df5Var3.k);
                                        mm5 mm5Var5 = df5Var3.r;
                                        af5 af5Var2 = i3 < mm5Var5.size() ? (af5) mm5Var5.get(i3) : null;
                                        if (af5Var2 != null) {
                                            i = (df5Var3.j + af5Var2.d) - ((af5) mm5Var3.get(0)).d;
                                        }
                                    }
                                }
                                r1 = 0;
                                df5Var2 = new df5(df5Var.d, df5Var.a, df5Var.b, df5Var.e, df5Var.g, j9, true, i, df5Var.k, df5Var.l, df5Var.m, df5Var.n, df5Var.c, df5Var.o, df5Var.p, df5Var.q, mm5Var3, df5Var.s, df5Var.v, df5Var.t, df5Var.w, df5Var.x);
                            }
                            j = j7 + j3;
                            long j92 = j;
                            if (df5Var.i) {
                            }
                            r1 = 0;
                            df5Var2 = new df5(df5Var.d, df5Var.a, df5Var.b, df5Var.e, df5Var.g, j92, true, i, df5Var.k, df5Var.l, df5Var.m, df5Var.n, df5Var.c, df5Var.o, df5Var.p, df5Var.q, mm5Var3, df5Var.s, df5Var.v, df5Var.t, df5Var.w, df5Var.x);
                        }
                    }
                    j2 = j4;
                    long j922 = j;
                    if (df5Var.i) {
                    }
                    r1 = 0;
                    df5Var2 = new df5(df5Var.d, df5Var.a, df5Var.b, df5Var.e, df5Var.g, j922, true, i, df5Var.k, df5Var.l, df5Var.m, df5Var.n, df5Var.c, df5Var.o, df5Var.p, df5Var.q, mm5Var3, df5Var.s, df5Var.v, df5Var.t, df5Var.w, df5Var.x);
                } else if (!z4) {
                    z2 = true;
                    mm5Var = mm5Var2;
                    j2 = j4;
                    df5Var2 = df5Var3;
                    r1 = 0;
                } else if (df5Var3.o) {
                    mm5Var = mm5Var2;
                    j2 = j4;
                    df5Var2 = df5Var3;
                    r1 = 0;
                    z2 = true;
                } else {
                    z2 = true;
                    mm5Var = mm5Var2;
                    df5Var2 = new df5(df5Var3.d, df5Var3.a, df5Var3.b, df5Var3.e, df5Var3.g, df5Var3.h, df5Var3.i, df5Var3.j, df5Var3.k, df5Var3.l, df5Var3.m, df5Var3.n, df5Var3.c, true, df5Var3.p, df5Var3.q, df5Var3.r, df5Var3.s, df5Var3.v, df5Var3.t, df5Var3.w, df5Var3.x);
                    r1 = 0;
                    j2 = j4;
                }
                this.e = df5Var2;
                Uri uri = this.a;
                if (df5Var2 == df5Var3) {
                    this.w = r1;
                    this.h = elapsedRealtime;
                    if (uri.equals(ta3Var.K)) {
                        ta3Var.I = uri;
                        ta3Var.K = r1;
                    }
                    if (uri.equals(ta3Var.I)) {
                        if (ta3Var.J == null) {
                            ta3Var.L = !df5Var2.o;
                            ta3Var.M = df5Var2.h;
                        }
                        ta3Var.J = df5Var2;
                        ta3Var.r.v(df5Var2);
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((mf5) it.next()).a();
                    }
                } else if (!df5Var2.o) {
                    long size5 = j2 + mm5Var.size();
                    df5 df5Var6 = this.e;
                    if (size5 < df5Var6.k) {
                        bk2Var = new bk2();
                        z3 = z2;
                    } else {
                        bk2Var = ((double) (elapsedRealtime - this.h)) > ((double) g8c.i0(df5Var6.m)) * 3.5d ? new bk2() : r1;
                        z3 = false;
                    }
                    if (bk2Var != null) {
                        this.w = bk2Var;
                        dd ddVar = new dd((Object) bk2Var, z2 ? 1 : 0, (byte) 8);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((mf5) it2.next()).b(uri, ddVar, z3);
                        }
                    }
                }
                df5 df5Var7 = this.e;
                cf5Var = df5Var7.v;
                long j10 = df5Var7.m;
                if (!cf5Var.e) {
                    if (df5Var7 == df5Var3) {
                        long j11 = df5Var7.n;
                        if (j11 != -9223372036854775807L) {
                            j6 = j11 / 2;
                        } else {
                            j10 /= 2;
                        }
                    }
                    this.n = (g8c.i0(j6) + elapsedRealtime) - f86Var.f;
                    if (this.e.o) {
                        return;
                    }
                    if (uri.equals(ta3Var.I) || this.x) {
                        c(a());
                        return;
                    }
                    return;
                }
                if (df5Var7 == df5Var3) {
                    j10 /= 2;
                }
                j6 = j10;
                this.n = (g8c.i0(j6) + elapsedRealtime) - f86Var.f;
                if (this.e.o) {
                }
            }
        }
        z = true;
        mm5 mm5Var32 = df5Var.r;
        long j62 = 0;
        if (!z) {
        }
        this.e = df5Var2;
        Uri uri2 = this.a;
        if (df5Var2 == df5Var3) {
        }
        df5 df5Var72 = this.e;
        cf5Var = df5Var72.v;
        long j102 = df5Var72.m;
        if (!cf5Var.e) {
        }
        j62 = j102;
        this.n = (g8c.i0(j62) + elapsedRealtime) - f86Var.f;
        if (this.e.o) {
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
        ta3 ta3Var = this.y;
        ta3Var.c.getClass();
        ta3Var.f.o(f86Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // h86
    public final i86 w1(k86 k86Var, long j, long j2, IOException iOException, int i) {
        cv7 cv7Var = (cv7) k86Var;
        i86 i86Var = mv6.y;
        long j3 = cv7Var.a;
        byte b = cv7Var.c;
        e86 e86Var = new e86(j3, cv7Var.b, j);
        zxa zxaVar = cv7Var.d;
        e86Var.d = zxaVar.c;
        e86Var.e = zxaVar.d;
        e86Var.f = j2;
        e86Var.g = zxaVar.b;
        f86 f86Var = new f86(e86Var);
        boolean z = zxaVar.c.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof jf5;
        Uri uri = this.a;
        ta3 ta3Var = this.y;
        if (z || z2) {
            int i2 = iOException instanceof lg5 ? ((lg5) iOException).c : ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (z2 || i2 == 400 || i2 == 503) {
                this.n = SystemClock.elapsedRealtime();
                c(uri);
                kp kpVar = ta3Var.f;
                String str = g8c.a;
                kpVar.s(f86Var, b, iOException, true);
                return i86Var;
            }
        }
        dd ddVar = new dd((Object) iOException, i, (byte) 8);
        Iterator it = ta3Var.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((mf5) it.next()).b(uri, ddVar, false);
        }
        i2f i2fVar = ta3Var.c;
        if (z3) {
            i2fVar.getClass();
            long w3 = i2f.w3(ddVar);
            i86Var = w3 != -9223372036854775807L ? new i86(0, w3) : mv6.E;
        }
        boolean a = i86Var.a();
        ta3Var.f.s(f86Var, b, iOException, !a);
        if (!a) {
            i2fVar.getClass();
        }
        return i86Var;
    }
}
