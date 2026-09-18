package xb;

import java.util.Arrays;
import n6.l;
import v7.r1;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = y7.b.a;
        this.a = str == null ? "" : str;
        this.b = f7;
        this.c = i10;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.l(this.a, aVar.a) && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c && l.l(this.d, aVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    public final String toString() {
        r1 r1Var = new r1(a.class.getSimpleName(), 11);
        r1 r1Var2 = new r1(10, false);
        ((r1) r1Var.c).c = r1Var2;
        r1Var.c = r1Var2;
        r1Var2.d = this.a;
        r1Var2.b = "text";
        String valueOf = String.valueOf(this.b);
        y7.a aVar = new y7.a(10, false);
        ((r1) r1Var.c).c = aVar;
        r1Var.c = aVar;
        aVar.d = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        y7.a aVar2 = new y7.a(10, false);
        ((r1) r1Var.c).c = aVar2;
        aVar2.d = valueOf2;
        aVar2.b = "index";
        r1 r1Var3 = new r1(10, false);
        aVar2.c = r1Var3;
        r1Var.c = r1Var3;
        r1Var3.d = this.d;
        r1Var3.b = "mid";
        return r1Var.toString();
    }
}
