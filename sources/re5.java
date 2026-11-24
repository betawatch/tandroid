// default package

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class re5 {
    public final pa3 a;
    public final o63 b;
    public final o63 c;
    public final g29 d;
    public final of5[] e;
    public final fm4[] f;
    public final ta3 g;
    public final se5 h;
    public final sxb i;
    public final List j;
    public final uc8 l;
    public boolean m;
    public jh0 o;
    public Uri p;
    public Uri q;
    public boolean r;
    public k64 s;
    public final pj4 k = new pj4((byte) 2);
    public byte[] n = g8c.b;
    public long t = -9223372036854775807L;

    public re5(pa3 pa3Var, ta3 ta3Var, of5[] of5VarArr, fm4[] fm4VarArr, l69 l69Var, vyb vybVar, g29 g29Var, List list, uc8 uc8Var) {
        this.a = pa3Var;
        this.g = ta3Var;
        this.h = ta3Var.y;
        this.e = of5VarArr;
        this.f = fm4VarArr;
        this.d = g29Var;
        this.j = list;
        this.l = uc8Var;
        m63 m63Var = (m63) l69Var.b;
        o63 createDataSource = m63Var.createDataSource();
        this.b = createDataSource;
        if (vybVar != null) {
            createDataSource.addTransferListener(vybVar);
        }
        this.c = m63Var.createDataSource();
        this.i = new sxb("", fm4VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < of5VarArr.length; i++) {
            if ((fm4VarArr[i].f & TLObject.FLAG_14) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        sxb sxbVar = this.i;
        int[] e = gle.e(arrayList);
        pe5 pe5Var = new pe5(0, sxbVar, e);
        pe5Var.h = pe5Var.e(sxbVar.d[e[0]]);
        this.s = pe5Var;
    }

    public static qe5 f(df5 df5Var, long j, int i) {
        long j2 = df5Var.k;
        mm5 mm5Var = df5Var.s;
        int i2 = (int) (j - j2);
        mm5 mm5Var2 = df5Var.r;
        if (i2 == mm5Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < mm5Var.size()) {
                return new qe5((bf5) mm5Var.get(i), j, i);
            }
            return null;
        }
        af5 af5Var = (af5) mm5Var2.get(i2);
        if (i == -1) {
            return new qe5(af5Var, j, -1);
        }
        if (i < af5Var.y.size()) {
            return new qe5((bf5) af5Var.y.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < mm5Var2.size()) {
            return new qe5((bf5) mm5Var2.get(i3), j + 1, -1);
        }
        if (mm5Var.isEmpty()) {
            return null;
        }
        return new qe5((bf5) mm5Var.get(0), j + 1, 0);
    }

    public final c86 a(Uri uri) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ta3 ta3Var = this.g;
        sa3 sa3Var = (sa3) ta3Var.d.get(uri);
        of5 of5Var = sa3Var != null ? sa3Var.a : null;
        of5Var.getClass();
        HashMap hashMap = of5Var.b;
        int size = hashMap.size();
        v5c it = ym5.q(hashMap.values()).iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            if (ta3Var.e(elapsedRealtime, (Uri) it.next())) {
                i++;
            }
        }
        int length = this.s.length();
        se5 se5Var = this.h;
        if (se5Var != null && se5Var.k) {
            z = true;
        }
        boolean z2 = z;
        return new c86(z2, size, i, length, d(elapsedRealtime, z2));
    }

    public final bk6[] b(te5 te5Var, long j) {
        List list;
        re5 re5Var = this;
        te5 te5Var2 = te5Var;
        int a = te5Var2 == null ? -1 : re5Var.i.a(te5Var2.d);
        int length = re5Var.s.length();
        bk6[] bk6VarArr = new bk6[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int k = re5Var.s.k(i);
            Uri b = re5Var.e[k].b();
            ta3 ta3Var = re5Var.g;
            if (ta3Var.g(b)) {
                df5 b2 = ta3Var.b(b, z);
                b2.getClass();
                long j2 = b2.h - ta3Var.M;
                Pair e = re5Var.e(te5Var2, k != a ? true : z, b2, j2, j);
                long longValue = ((Long) e.first).longValue();
                int intValue = ((Integer) e.second).intValue();
                long j3 = b2.k;
                mm5 mm5Var = b2.s;
                mm5 mm5Var2 = b2.r;
                int i2 = (int) (longValue - j3);
                if (i2 < 0 || mm5Var2.size() < i2) {
                    km5 km5Var = mm5.b;
                    list = w59.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < mm5Var2.size()) {
                        if (intValue != -1) {
                            af5 af5Var = (af5) mm5Var2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(af5Var);
                            } else if (intValue < af5Var.y.size()) {
                                mm5 mm5Var3 = af5Var.y;
                                arrayList.addAll(mm5Var3.subList(intValue, mm5Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(mm5Var2.subList(i2, mm5Var2.size()));
                        intValue = 0;
                    }
                    if (b2.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < mm5Var.size()) {
                            arrayList.addAll(mm5Var.subList(intValue, mm5Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                }
                bk6VarArr[i] = new oe5(j2, list);
            } else {
                bk6VarArr[i] = bk6.z;
            }
            i++;
            re5Var = this;
            te5Var2 = te5Var;
            z = false;
        }
        return bk6VarArr;
    }

    public final int c(te5 te5Var) {
        int i = te5Var.F;
        if (i == -1) {
            return 1;
        }
        df5 b = this.g.b(te5Var.y, false);
        b.getClass();
        mm5 mm5Var = b.r;
        int i2 = (int) (te5Var.s - b.k);
        if (i2 < 0) {
            return 1;
        }
        mm5 mm5Var2 = i2 < mm5Var.size() ? ((af5) mm5Var.get(i2)).y : b.s;
        if (i >= mm5Var2.size()) {
            return 2;
        }
        ye5 ye5Var = (ye5) mm5Var2.get(i);
        if (ye5Var.y) {
            return 0;
        }
        return Objects.equals(Uri.parse(jxe.c(b.a, ye5Var.a)), te5Var.b.a) ? 1 : 2;
    }

    public final int d(long j, boolean z) {
        k64 k64Var = this.s;
        int length = k64Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int k = k64Var.k(i2);
            of5[] of5VarArr = this.e;
            ta3 ta3Var = this.g;
            if (z) {
                if (!k64Var.a(i2, j) && !ta3Var.e(j, of5VarArr[k].b())) {
                }
                i++;
            } else {
                if (!k64Var.a(i2, j) && !ta3Var.f(of5VarArr[k], j)) {
                }
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6 A[EDGE_INSN: B:58:0x00d6->B:60:0x00d6 BREAK  A[LOOP:0: B:44:0x00aa->B:48:0x00d3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair e(te5 te5Var, boolean z, df5 df5Var, long j, long j2) {
        mm5 mm5Var;
        boolean z2 = true;
        if (te5Var != null) {
            long j3 = te5Var.s;
            int i = te5Var.F;
            if (!z) {
                if (!te5Var.Y) {
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i));
                }
                if (i == -1) {
                    j3 = te5Var.b();
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i != -1 ? i + 1 : -1));
            }
        }
        long j4 = df5Var.u;
        long j5 = df5Var.k;
        mm5 mm5Var2 = df5Var.s;
        mm5 mm5Var3 = df5Var.r;
        long j6 = j + j4;
        long j7 = (te5Var == null || this.r) ? j2 : te5Var.h;
        if (!df5Var.o && j7 >= j6) {
            return new Pair(Long.valueOf(j5 + mm5Var3.size()), -1);
        }
        long j8 = j7 - j;
        Long valueOf = Long.valueOf(j8);
        ta3 ta3Var = this.g;
        int i2 = 0;
        if (ta3Var.L && te5Var != null) {
            z2 = false;
        }
        int d = g8c.d(mm5Var3, valueOf, z2);
        long j9 = d + j5;
        if (!ta3Var.L) {
            return new Pair(Long.valueOf(j9), -1);
        }
        if (d >= 0) {
            if (!mm5Var3.isEmpty()) {
                af5 af5Var = (af5) mm5Var3.get(d);
                if (j8 < af5Var.e + af5Var.c) {
                    mm5Var = af5Var.y;
                    while (true) {
                        if (i2 < mm5Var.size()) {
                            break;
                        }
                        ye5 ye5Var = (ye5) mm5Var.get(i2);
                        if (j8 >= ye5Var.e + ye5Var.c) {
                            i2++;
                        } else if (ye5Var.x) {
                            j9 += (mm5Var != mm5Var2 || mm5Var3.isEmpty()) ? 0L : 1L;
                            r3 = i2;
                        }
                    }
                }
            }
            mm5Var = mm5Var2;
            while (true) {
                if (i2 < mm5Var.size()) {
                }
                i2++;
            }
        }
        return new Pair(Long.valueOf(j9), Integer.valueOf(r3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ne5 g(Uri uri, int i, boolean z) {
        np4 np4Var = (np4) this.k.b;
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) np4Var.remove(uri);
        if (bArr != null) {
            return null;
        }
        u63 u63Var = new u63(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        fm4 fm4Var = this.f[i];
        int p = this.s.p();
        Object s = this.s.s();
        byte[] bArr2 = this.n;
        ne5 ne5Var = new ne5(this.c, u63Var, 3, fm4Var, p, s, -9223372036854775807L, -9223372036854775807L, null);
        if (bArr2 == null) {
            bArr2 = g8c.b;
        }
        ne5Var.s = bArr2;
        return ne5Var;
    }
}
