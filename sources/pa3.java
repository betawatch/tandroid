// default package

import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pa3 {
    public final ra6 a;
    public final u8a b;
    public final int[] c;
    public final int d;
    public final h73 e;
    public final long f;
    public final fg8 g;
    public final na3[] h;
    public e74 i;
    public z53 j;
    public int k;
    public kh0 l;
    public boolean m;

    public pa3(n31 n31Var, ra6 ra6Var, z53 z53Var, u8a u8aVar, int i, int[] iArr, e74 e74Var, int i2, h73 h73Var, long j, boolean z, j99 j99Var, fg8 fg8Var) {
        ub9 ub9Var;
        na3[] na3VarArr;
        e84 hr4Var;
        ko4 ko4Var;
        o31 o31Var;
        this.a = ra6Var;
        this.j = z53Var;
        this.b = u8aVar;
        this.c = iArr;
        this.i = e74Var;
        this.d = i2;
        this.e = h73Var;
        this.k = i;
        this.f = j;
        fg8 fg8Var2 = fg8Var;
        this.g = fg8Var2;
        long d = z53Var.d(i);
        ArrayList a = a();
        this.h = new na3[e74Var.length()];
        int i3 = 0;
        int i4 = 0;
        while (i4 < this.h.length) {
            ub9 ub9Var2 = (ub9) a.get(e74Var.j(i4));
            xg0 G = u8aVar.G(ub9Var2.b);
            na3[] na3VarArr2 = this.h;
            xg0 xg0Var = G == null ? (xg0) ub9Var2.b.get(i3) : G;
            ko4 ko4Var2 = ub9Var2.a;
            String str = ko4Var2.s;
            if (!eg7.l(str)) {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    ub9Var = ub9Var2;
                    ko4Var = ko4Var2;
                    na3VarArr = na3VarArr2;
                    hr4Var = new vl6((uif) n31Var.c, !n31Var.b ? 3 : 1);
                } else if (Objects.equals(str, "image/jpeg")) {
                    hr4Var = new xf5(1, (byte) 1);
                } else if (Objects.equals(str, "image/png")) {
                    hr4Var = new zl0((byte) 1);
                } else {
                    int i5 = z ? 4 : 0;
                    ub9Var = ub9Var2;
                    na3VarArr = na3VarArr2;
                    hr4Var = new hr4((uif) n31Var.c, (n31Var.b ? i5 : i5 | 32) | hr4.g(3), null, j99Var, fg8Var2);
                    ko4Var = ko4Var2;
                }
                o31Var = new o31(hr4Var, i2, ko4Var);
                o31 o31Var2 = o31Var;
                long j2 = d;
                int i6 = i4;
                na3VarArr[i6] = new na3(j2, ub9Var, xg0Var, o31Var2, 0L, ub9Var.b());
                i4 = i6 + 1;
                fg8Var2 = fg8Var;
                d = j2;
                i3 = 0;
            } else if (n31Var.b) {
                hr4Var = new meb(((uif) n31Var.c).s(ko4Var2), ko4Var2);
            } else {
                o31Var = null;
                ub9Var = ub9Var2;
                na3VarArr = na3VarArr2;
                o31 o31Var22 = o31Var;
                long j22 = d;
                int i62 = i4;
                na3VarArr[i62] = new na3(j22, ub9Var, xg0Var, o31Var22, 0L, ub9Var.b());
                i4 = i62 + 1;
                fg8Var2 = fg8Var;
                d = j22;
                i3 = 0;
            }
            ub9Var = ub9Var2;
            ko4Var = ko4Var2;
            na3VarArr = na3VarArr2;
            o31Var = new o31(hr4Var, i2, ko4Var);
            o31 o31Var222 = o31Var;
            long j222 = d;
            int i622 = i4;
            na3VarArr[i622] = new na3(j222, ub9Var, xg0Var, o31Var222, 0L, ub9Var.b());
            i4 = i622 + 1;
            fg8Var2 = fg8Var;
            d = j222;
            i3 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((fa) list.get(i)).c);
        }
        return arrayList;
    }

    public final na3 b(int i) {
        na3[] na3VarArr = this.h;
        na3 na3Var = na3VarArr[i];
        xg0 G = this.b.G(na3Var.b.b);
        if (G == null || G.equals(na3Var.c)) {
            return na3Var;
        }
        na3 na3Var2 = new na3(na3Var.e, na3Var.b, G, na3Var.a, na3Var.f, na3Var.d);
        na3VarArr[i] = na3Var2;
        return na3Var2;
    }
}
