// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class w93 {
    public final String a;
    public final ko4 b;
    public final ko4 c;
    public final byte d;
    public final int e;

    /* JADX WARN: Multi-variable type inference failed */
    public w93(String str, ko4 ko4Var, ko4 ko4Var2, int i, int i2) {
        yve.f(i == 0 || i2 == 0);
        yve.f(!TextUtils.isEmpty(str));
        this.a = str;
        ko4Var.getClass();
        this.b = ko4Var;
        ko4Var2.getClass();
        this.c = ko4Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w93.class != obj.getClass()) {
            return false;
        }
        w93 w93Var = (w93) obj;
        return this.d == w93Var.d && this.e == w93Var.e && this.a.equals(w93Var.a) && this.b.equals(w93Var.b) && this.c.equals(w93Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + bs2.j((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
