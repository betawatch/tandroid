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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qg5 {
    public final bc3 a;
    public final a83 b;
    public final a83 c;
    public final et8 d;
    public final nh5[] e;
    public final go4[] f;
    public final fc3 g;
    public final rg5 h;
    public final uzb i;
    public final List j;
    public final we8 l;
    public boolean m;
    public ji0 o;
    public Uri p;
    public Uri q;
    public boolean r;
    public t74 s;
    public final k44 k = new k44((byte) 5);
    public byte[] n = hac.b;
    public long t = -9223372036854775807L;

    public qg5(bc3 bc3Var, fc3 fc3Var, nh5[] nh5VarArr, go4[] go4VarArr, k6d k6dVar, w0c w0cVar, et8 et8Var, List list, we8 we8Var) {
        this.a = bc3Var;
        this.g = fc3Var;
        this.h = fc3Var.y;
        this.e = nh5VarArr;
        this.f = go4VarArr;
        this.d = et8Var;
        this.j = list;
        this.l = we8Var;
        y73 y73Var = (y73) k6dVar.b;
        a83 createDataSource = y73Var.createDataSource();
        this.b = createDataSource;
        if (w0cVar != null) {
            createDataSource.addTransferListener(w0cVar);
        }
        this.c = y73Var.createDataSource();
        this.i = new uzb("", go4VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < nh5VarArr.length; i++) {
            if ((go4VarArr[i].f & TLObject.FLAG_14) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        uzb uzbVar = this.i;
        int[] e = ine.e(arrayList);
        og5 og5Var = new og5(0, uzbVar, e);
        og5Var.h = og5Var.e(uzbVar.d[e[0]]);
        this.s = og5Var;
    }

    public static pg5 f(ch5 ch5Var, long j, int i) {
        long j2 = ch5Var.k;
        mo5 mo5Var = ch5Var.s;
        int i2 = (int) (j - j2);
        mo5 mo5Var2 = ch5Var.r;
        if (i2 == mo5Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < mo5Var.size()) {
                return new pg5((ah5) mo5Var.get(i), j, i);
            }
            return null;
        }
        zg5 zg5Var = (zg5) mo5Var2.get(i2);
        if (i == -1) {
            return new pg5(zg5Var, j, -1);
        }
        if (i < zg5Var.y.size()) {
            return new pg5((ah5) zg5Var.y.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < mo5Var2.size()) {
            return new pg5((ah5) mo5Var2.get(i3), j + 1, -1);
        }
        if (mo5Var.isEmpty()) {
            return null;
        }
        return new pg5((ah5) mo5Var.get(0), j + 1, 0);
    }

    public final ba6 a(Uri uri) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fc3 fc3Var = this.g;
        ec3 ec3Var = (ec3) fc3Var.d.get(uri);
        nh5 nh5Var = ec3Var != null ? ec3Var.a : null;
        nh5Var.getClass();
        HashMap hashMap = nh5Var.b;
        int size = hashMap.size();
        v7c it = yo5.q(hashMap.values()).iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            if (fc3Var.e(elapsedRealtime, (Uri) it.next())) {
                i++;
            }
        }
        int length = this.s.length();
        rg5 rg5Var = this.h;
        if (rg5Var != null && rg5Var.k) {
            z = true;
        }
        boolean z2 = z;
        return new ba6(z2, size, i, length, d(elapsedRealtime, z2));
    }

    public final em6[] b(sg5 sg5Var, long j) {
        List list;
        qg5 qg5Var = this;
        sg5 sg5Var2 = sg5Var;
        int a = sg5Var2 == null ? -1 : qg5Var.i.a(sg5Var2.d);
        int length = qg5Var.s.length();
        em6[] em6VarArr = new em6[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int k = qg5Var.s.k(i);
            Uri b = qg5Var.e[k].b();
            fc3 fc3Var = qg5Var.g;
            if (fc3Var.g(b)) {
                ch5 b2 = fc3Var.b(b, z);
                b2.getClass();
                long j2 = b2.h - fc3Var.M;
                Pair e = qg5Var.e(sg5Var2, k != a ? true : z, b2, j2, j);
                long longValue = ((Long) e.first).longValue();
                int intValue = ((Integer) e.second).intValue();
                long j3 = b2.k;
                mo5 mo5Var = b2.s;
                mo5 mo5Var2 = b2.r;
                int i2 = (int) (longValue - j3);
                if (i2 < 0 || mo5Var2.size() < i2) {
                    ko5 ko5Var = mo5.b;
                    list = y79.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < mo5Var2.size()) {
                        if (intValue != -1) {
                            zg5 zg5Var = (zg5) mo5Var2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(zg5Var);
                            } else if (intValue < zg5Var.y.size()) {
                                mo5 mo5Var3 = zg5Var.y;
                                arrayList.addAll(mo5Var3.subList(intValue, mo5Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(mo5Var2.subList(i2, mo5Var2.size()));
                        intValue = 0;
                    }
                    if (b2.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < mo5Var.size()) {
                            arrayList.addAll(mo5Var.subList(intValue, mo5Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                }
                em6VarArr[i] = new ng5(j2, list);
            } else {
                em6VarArr[i] = em6.z;
            }
            i++;
            qg5Var = this;
            sg5Var2 = sg5Var;
            z = false;
        }
        return em6VarArr;
    }

    public final int c(sg5 sg5Var) {
        int i = sg5Var.F;
        if (i == -1) {
            return 1;
        }
        ch5 b = this.g.b(sg5Var.y, false);
        b.getClass();
        mo5 mo5Var = b.r;
        int i2 = (int) (sg5Var.s - b.k);
        if (i2 < 0) {
            return 1;
        }
        mo5 mo5Var2 = i2 < mo5Var.size() ? ((zg5) mo5Var.get(i2)).y : b.s;
        if (i >= mo5Var2.size()) {
            return 2;
        }
        xg5 xg5Var = (xg5) mo5Var2.get(i);
        if (xg5Var.y) {
            return 0;
        }
        return Objects.equals(Uri.parse(lze.c(b.a, xg5Var.a)), sg5Var.b.a) ? 1 : 2;
    }

    public final int d(long j, boolean z) {
        t74 t74Var = this.s;
        int length = t74Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int k = t74Var.k(i2);
            nh5[] nh5VarArr = this.e;
            fc3 fc3Var = this.g;
            if (z) {
                if (!t74Var.a(i2, j) && !fc3Var.e(j, nh5VarArr[k].b())) {
                }
                i++;
            } else {
                if (!t74Var.a(i2, j) && !fc3Var.f(nh5VarArr[k], j)) {
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
    public final Pair e(sg5 sg5Var, boolean z, ch5 ch5Var, long j, long j2) {
        mo5 mo5Var;
        boolean z2 = true;
        if (sg5Var != null) {
            long j3 = sg5Var.s;
            int i = sg5Var.F;
            if (!z) {
                if (!sg5Var.Y) {
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i));
                }
                if (i == -1) {
                    j3 = sg5Var.b();
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i != -1 ? i + 1 : -1));
            }
        }
        long j4 = ch5Var.u;
        long j5 = ch5Var.k;
        mo5 mo5Var2 = ch5Var.s;
        mo5 mo5Var3 = ch5Var.r;
        long j6 = j + j4;
        long j7 = (sg5Var == null || this.r) ? j2 : sg5Var.h;
        if (!ch5Var.o && j7 >= j6) {
            return new Pair(Long.valueOf(j5 + mo5Var3.size()), -1);
        }
        long j8 = j7 - j;
        Long valueOf = Long.valueOf(j8);
        fc3 fc3Var = this.g;
        int i2 = 0;
        if (fc3Var.L && sg5Var != null) {
            z2 = false;
        }
        int d = hac.d(mo5Var3, valueOf, z2);
        long j9 = d + j5;
        if (!fc3Var.L) {
            return new Pair(Long.valueOf(j9), -1);
        }
        if (d >= 0) {
            if (!mo5Var3.isEmpty()) {
                zg5 zg5Var = (zg5) mo5Var3.get(d);
                if (j8 < zg5Var.e + zg5Var.c) {
                    mo5Var = zg5Var.y;
                    while (true) {
                        if (i2 < mo5Var.size()) {
                            break;
                        }
                        xg5 xg5Var = (xg5) mo5Var.get(i2);
                        if (j8 >= xg5Var.e + xg5Var.c) {
                            i2++;
                        } else if (xg5Var.x) {
                            j9 += (mo5Var != mo5Var2 || mo5Var3.isEmpty()) ? 0L : 1L;
                            r3 = i2;
                        }
                    }
                }
            }
            mo5Var = mo5Var2;
            while (true) {
                if (i2 < mo5Var.size()) {
                }
                i2++;
            }
        }
        return new Pair(Long.valueOf(j9), Integer.valueOf(r3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mg5 g(Uri uri, int i, boolean z) {
        or4 or4Var = (or4) this.k.b;
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) or4Var.remove(uri);
        if (bArr != null) {
            return null;
        }
        g83 g83Var = new g83(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        go4 go4Var = this.f[i];
        int p = this.s.p();
        Object s = this.s.s();
        byte[] bArr2 = this.n;
        mg5 mg5Var = new mg5(this.c, g83Var, 3, go4Var, p, s, -9223372036854775807L, -9223372036854775807L, null);
        if (bArr2 == null) {
            bArr2 = hac.b;
        }
        mg5Var.s = bArr2;
        return mg5Var;
    }
}
