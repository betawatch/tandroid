// default package

import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rk1 extends tl5 implements qk1 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final tl5[] g;

    public rk1(String str, int i, int i2, long j, long j2, tl5[] tl5VarArr) {
        super("CHAP");
        String str2;
        jte.f(i <= i2);
        this.b = str;
        this.c = i;
        this.d = i2;
        int length = tl5VarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str2 = null;
                break;
            }
            tl5 tl5Var = tl5VarArr[i3];
            if (tl5Var instanceof ojb) {
                ojb ojbVar = (ojb) tl5Var;
                mo5 mo5Var = ojbVar.c;
                if (ojbVar.a.equals("TIT2") && !mo5Var.isEmpty()) {
                    str2 = (String) mo5Var.get(0);
                    break;
                }
            }
            i3++;
        }
        if (str2 != null) {
            new sy5(null, str2);
        }
        this.e = j;
        this.f = j2;
        this.g = tl5VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rk1.class != obj.getClass()) {
            return false;
        }
        rk1 rk1Var = (rk1) obj;
        return this.c == rk1Var.c && this.d == rk1Var.d && this.e == rk1Var.e && this.f == rk1Var.f && this.b.equals(rk1Var.b) && Arrays.equals(this.g, rk1Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
