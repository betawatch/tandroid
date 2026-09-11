package xb;

import java.util.Arrays;
import n6.l;
import v7.a6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        a6 a6Var = new a6(a.class.getSimpleName());
        a6 a6Var2 = new a6(8, false);
        ((a6) a6Var.d).d = a6Var2;
        a6Var.d = a6Var2;
        a6Var2.c = this.a;
        a6Var2.b = "text";
        String valueOf = String.valueOf(this.b);
        y7.a aVar = new y7.a(8, false);
        ((a6) a6Var.d).d = aVar;
        a6Var.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        y7.a aVar2 = new y7.a(8, false);
        ((a6) a6Var.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        a6 a6Var3 = new a6(8, false);
        aVar2.d = a6Var3;
        a6Var.d = a6Var3;
        a6Var3.c = this.d;
        a6Var3.b = "mid";
        return a6Var.toString();
    }
}
