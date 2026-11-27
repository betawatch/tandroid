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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class sg5 {
    public final ib3 a;
    public final h73 b;
    public final h73 c;
    public final pq8 d;
    public final qh5[] e;
    public final ko4[] f;
    public final mb3 g;
    public final ug5 h;
    public final t1c i;
    public final List j;
    public final ig8 l;
    public boolean m;
    public kh0 o;
    public Uri p;
    public Uri q;
    public boolean r;
    public e74 s;
    public final v34 k = new v34((byte) 4);
    public byte[] n = gcc.b;
    public long t = -9223372036854775807L;

    public sg5(ib3 ib3Var, mb3 mb3Var, qh5[] qh5VarArr, ko4[] ko4VarArr, z8d z8dVar, v2c v2cVar, pq8 pq8Var, List list, ig8 ig8Var) {
        this.a = ib3Var;
        this.g = mb3Var;
        this.h = mb3Var.y;
        this.e = qh5VarArr;
        this.f = ko4VarArr;
        this.d = pq8Var;
        this.j = list;
        this.l = ig8Var;
        f73 f73Var = (f73) z8dVar.b;
        h73 createDataSource = f73Var.createDataSource();
        this.b = createDataSource;
        if (v2cVar != null) {
            createDataSource.addTransferListener(v2cVar);
        }
        this.c = f73Var.createDataSource();
        this.i = new t1c("", ko4VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < qh5VarArr.length; i++) {
            if ((ko4VarArr[i].f & TLObject.FLAG_14) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        t1c t1cVar = this.i;
        int[] e = ype.e(arrayList);
        qg5 qg5Var = new qg5(0, t1cVar, e);
        qg5Var.h = qg5Var.e(t1cVar.d[e[0]]);
        this.s = qg5Var;
    }

    public static rg5 f(fh5 fh5Var, long j, int i) {
        long j2 = fh5Var.k;
        po5 po5Var = fh5Var.s;
        int i2 = (int) (j - j2);
        po5 po5Var2 = fh5Var.r;
        if (i2 == po5Var2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < po5Var.size()) {
                return new rg5((dh5) po5Var.get(i), j, i);
            }
            return null;
        }
        ch5 ch5Var = (ch5) po5Var2.get(i2);
        if (i == -1) {
            return new rg5(ch5Var, j, -1);
        }
        if (i < ch5Var.y.size()) {
            return new rg5((dh5) ch5Var.y.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < po5Var2.size()) {
            return new rg5((dh5) po5Var2.get(i3), j + 1, -1);
        }
        if (po5Var.isEmpty()) {
            return null;
        }
        return new rg5((dh5) po5Var.get(0), j + 1, 0);
    }

    public final ga6 a(Uri uri) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        mb3 mb3Var = this.g;
        lb3 lb3Var = (lb3) mb3Var.d.get(uri);
        qh5 qh5Var = lb3Var != null ? lb3Var.a : null;
        qh5Var.getClass();
        HashMap hashMap = qh5Var.b;
        int size = hashMap.size();
        v9c it = bp5.q(hashMap.values()).iterator();
        boolean z = false;
        int i = 0;
        while (it.hasNext()) {
            if (mb3Var.e(elapsedRealtime, (Uri) it.next())) {
                i++;
            }
        }
        int length = this.s.length();
        ug5 ug5Var = this.h;
        if (ug5Var != null && ug5Var.k) {
            z = true;
        }
        boolean z2 = z;
        return new ga6(z2, size, i, length, d(elapsedRealtime, z2));
    }

    public final gm6[] b(vg5 vg5Var, long j) {
        List list;
        sg5 sg5Var = this;
        vg5 vg5Var2 = vg5Var;
        int a = vg5Var2 == null ? -1 : sg5Var.i.a(vg5Var2.d);
        int length = sg5Var.s.length();
        gm6[] gm6VarArr = new gm6[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int j2 = sg5Var.s.j(i);
            Uri b = sg5Var.e[j2].b();
            mb3 mb3Var = sg5Var.g;
            if (mb3Var.h(b)) {
                fh5 b2 = mb3Var.b(b, z);
                b2.getClass();
                long j3 = b2.h - mb3Var.M;
                Pair e = sg5Var.e(vg5Var2, j2 != a ? true : z, b2, j3, j);
                long longValue = ((Long) e.first).longValue();
                int intValue = ((Integer) e.second).intValue();
                long j4 = b2.k;
                po5 po5Var = b2.s;
                po5 po5Var2 = b2.r;
                int i2 = (int) (longValue - j4);
                if (i2 < 0 || po5Var2.size() < i2) {
                    no5 no5Var = po5.b;
                    list = j99.e;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < po5Var2.size()) {
                        if (intValue != -1) {
                            ch5 ch5Var = (ch5) po5Var2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(ch5Var);
                            } else if (intValue < ch5Var.y.size()) {
                                po5 po5Var3 = ch5Var.y;
                                arrayList.addAll(po5Var3.subList(intValue, po5Var3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(po5Var2.subList(i2, po5Var2.size()));
                        intValue = 0;
                    }
                    if (b2.n != -9223372036854775807L) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < po5Var.size()) {
                            arrayList.addAll(po5Var.subList(intValue, po5Var.size()));
                        }
                    }
                    list = DesugarCollections.unmodifiableList(arrayList);
                }
                gm6VarArr[i] = new pg5(j3, list);
            } else {
                gm6VarArr[i] = gm6.z;
            }
            i++;
            sg5Var = this;
            vg5Var2 = vg5Var;
            z = false;
        }
        return gm6VarArr;
    }

    public final int c(vg5 vg5Var) {
        int i = vg5Var.F;
        if (i == -1) {
            return 1;
        }
        fh5 b = this.g.b(vg5Var.y, false);
        b.getClass();
        po5 po5Var = b.r;
        int i2 = (int) (vg5Var.s - b.k);
        if (i2 < 0) {
            return 1;
        }
        po5 po5Var2 = i2 < po5Var.size() ? ((ch5) po5Var.get(i2)).y : b.s;
        if (i >= po5Var2.size()) {
            return 2;
        }
        ah5 ah5Var = (ah5) po5Var2.get(i);
        if (ah5Var.y) {
            return 0;
        }
        return Objects.equals(Uri.parse(d2f.c(b.a, ah5Var.a)), vg5Var.b.a) ? 1 : 2;
    }

    public final int d(long j, boolean z) {
        e74 e74Var = this.s;
        int length = e74Var.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int j2 = e74Var.j(i2);
            qh5[] qh5VarArr = this.e;
            mb3 mb3Var = this.g;
            if (z) {
                if (!e74Var.a(i2, j) && !mb3Var.e(j, qh5VarArr[j2].b())) {
                }
                i++;
            } else {
                if (!e74Var.a(i2, j) && !mb3Var.g(qh5VarArr[j2], j)) {
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
    public final Pair e(vg5 vg5Var, boolean z, fh5 fh5Var, long j, long j2) {
        po5 po5Var;
        boolean z2 = true;
        if (vg5Var != null) {
            long j3 = vg5Var.s;
            int i = vg5Var.F;
            if (!z) {
                if (!vg5Var.Y) {
                    return new Pair(Long.valueOf(j3), Integer.valueOf(i));
                }
                if (i == -1) {
                    j3 = vg5Var.b();
                }
                return new Pair(Long.valueOf(j3), Integer.valueOf(i != -1 ? i + 1 : -1));
            }
        }
        long j4 = fh5Var.u;
        long j5 = fh5Var.k;
        po5 po5Var2 = fh5Var.s;
        po5 po5Var3 = fh5Var.r;
        long j6 = j + j4;
        long j7 = (vg5Var == null || this.r) ? j2 : vg5Var.h;
        if (!fh5Var.o && j7 >= j6) {
            return new Pair(Long.valueOf(j5 + po5Var3.size()), -1);
        }
        long j8 = j7 - j;
        Long valueOf = Long.valueOf(j8);
        mb3 mb3Var = this.g;
        int i2 = 0;
        if (mb3Var.L && vg5Var != null) {
            z2 = false;
        }
        int d = gcc.d(po5Var3, valueOf, z2);
        long j9 = d + j5;
        if (!mb3Var.L) {
            return new Pair(Long.valueOf(j9), -1);
        }
        if (d >= 0) {
            if (!po5Var3.isEmpty()) {
                ch5 ch5Var = (ch5) po5Var3.get(d);
                if (j8 < ch5Var.e + ch5Var.c) {
                    po5Var = ch5Var.y;
                    while (true) {
                        if (i2 < po5Var.size()) {
                            break;
                        }
                        ah5 ah5Var = (ah5) po5Var.get(i2);
                        if (j8 >= ah5Var.e + ah5Var.c) {
                            i2++;
                        } else if (ah5Var.x) {
                            j9 += (po5Var != po5Var2 || po5Var3.isEmpty()) ? 0L : 1L;
                            r3 = i2;
                        }
                    }
                }
            }
            po5Var = po5Var2;
            while (true) {
                if (i2 < po5Var.size()) {
                }
                i2++;
            }
        }
        return new Pair(Long.valueOf(j9), Integer.valueOf(r3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final og5 g(Uri uri, int i, boolean z) {
        rr4 rr4Var = (rr4) this.k.b;
        if (uri == null) {
            return null;
        }
        byte[] bArr = (byte[]) rr4Var.remove(uri);
        if (bArr != null) {
            return null;
        }
        n73 n73Var = new n73(uri, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1);
        ko4 ko4Var = this.f[i];
        int o = this.s.o();
        Object r = this.s.r();
        byte[] bArr2 = this.n;
        og5 og5Var = new og5(this.c, n73Var, 3, ko4Var, o, r, -9223372036854775807L, -9223372036854775807L, null);
        if (bArr2 == null) {
            bArr2 = gcc.b;
        }
        og5Var.s = bArr2;
        return og5Var;
    }
}
