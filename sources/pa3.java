// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pa3 {
    public final String a;
    public final go4 b;
    public final go4 c;
    public final byte d;
    public final int e;

    /* JADX WARN: Multi-variable type inference failed */
    public pa3(String str, go4 go4Var, go4 go4Var2, int i, int i2) {
        jte.f(i == 0 || i2 == 0);
        jte.f(!TextUtils.isEmpty(str));
        this.a = str;
        go4Var.getClass();
        this.b = go4Var;
        go4Var2.getClass();
        this.c = go4Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pa3.class != obj.getClass()) {
            return false;
        }
        pa3 pa3Var = (pa3) obj;
        return this.d == pa3Var.d && this.e == pa3Var.e && this.a.equals(pa3Var.a) && this.b.equals(pa3Var.b) && this.c.equals(pa3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ts2.j((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
