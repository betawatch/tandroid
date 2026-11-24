// default package

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class w93 {
    public final n86 a;
    public final c5a b;
    public final int[] c;
    public final int d;
    public final o63 e;
    public final long f;
    public final qc8 g;
    public final u93[] h;
    public k64 i;
    public h53 j;
    public int k;
    public jh0 l;
    public boolean m;

    public w93(e31 e31Var, n86 n86Var, h53 h53Var, c5a c5aVar, int i, int[] iArr, k64 k64Var, int i2, o63 o63Var, long j, boolean z, w59 w59Var, qc8 qc8Var) {
        i89 i89Var;
        u93[] u93VarArr;
        j74 dp4Var;
        fm4 fm4Var;
        f31 f31Var;
        this.a = n86Var;
        this.j = h53Var;
        this.b = c5aVar;
        this.c = iArr;
        this.i = k64Var;
        this.d = i2;
        this.e = o63Var;
        this.k = i;
        this.f = j;
        qc8 qc8Var2 = qc8Var;
        this.g = qc8Var2;
        long d = h53Var.d(i);
        ArrayList a = a();
        this.h = new u93[k64Var.length()];
        int i3 = 0;
        int i4 = 0;
        while (i4 < this.h.length) {
            i89 i89Var2 = (i89) a.get(k64Var.k(i4));
            wg0 N = c5aVar.N(i89Var2.b);
            u93[] u93VarArr2 = this.h;
            wg0 wg0Var = N == null ? (wg0) i89Var2.b.get(i3) : N;
            fm4 fm4Var2 = i89Var2.a;
            String str = fm4Var2.s;
            if (!ud7.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    i89Var = i89Var2;
                    fm4Var = fm4Var2;
                    u93VarArr = u93VarArr2;
                    dp4Var = new qj6((eef) e31Var.c, !e31Var.b ? 3 : 1);
                } else if (Objects.equals(str, "image/jpeg")) {
                    dp4Var = new wd5(1, (byte) 1);
                } else if (Objects.equals(str, "image/png")) {
                    dp4Var = new yl0((byte) 1);
                } else {
                    int i5 = z ? 4 : 0;
                    i89Var = i89Var2;
                    u93VarArr = u93VarArr2;
                    dp4Var = new dp4((eef) e31Var.c, (e31Var.b ? i5 : i5 | 32) | dp4.g(3), null, w59Var, qc8Var2);
                    fm4Var = fm4Var2;
                }
                f31Var = new f31(dp4Var, i2, fm4Var);
                f31 f31Var2 = f31Var;
                long j2 = d;
                int i6 = i4;
                u93VarArr[i6] = new u93(j2, i89Var, wg0Var, f31Var2, 0L, i89Var.b());
                i4 = i6 + 1;
                qc8Var2 = qc8Var;
                d = j2;
                i3 = 0;
            } else if (e31Var.b) {
                dp4Var = new pab(((eef) e31Var.c).r(fm4Var2), fm4Var2);
            } else {
                f31Var = null;
                i89Var = i89Var2;
                u93VarArr = u93VarArr2;
                f31 f31Var22 = f31Var;
                long j22 = d;
                int i62 = i4;
                u93VarArr[i62] = new u93(j22, i89Var, wg0Var, f31Var22, 0L, i89Var.b());
                i4 = i62 + 1;
                qc8Var2 = qc8Var;
                d = j22;
                i3 = 0;
            }
            i89Var = i89Var2;
            fm4Var = fm4Var2;
            u93VarArr = u93VarArr2;
            f31Var = new f31(dp4Var, i2, fm4Var);
            f31 f31Var222 = f31Var;
            long j222 = d;
            int i622 = i4;
            u93VarArr[i622] = new u93(j222, i89Var, wg0Var, f31Var222, 0L, i89Var.b());
            i4 = i622 + 1;
            qc8Var2 = qc8Var;
            d = j222;
            i3 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((ea) list.get(i)).c);
        }
        return arrayList;
    }

    public final u93 b(int i) {
        u93[] u93VarArr = this.h;
        u93 u93Var = u93VarArr[i];
        wg0 N = this.b.N(u93Var.b.b);
        if (N == null || N.equals(u93Var.c)) {
            return u93Var;
        }
        u93 u93Var2 = new u93(u93Var.e, u93Var.b, N, u93Var.a, u93Var.f, u93Var.d);
        u93VarArr[i] = u93Var2;
        return u93Var2;
    }
}
