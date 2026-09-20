package xb;

import java.util.Arrays;
import n6.l;
import v7.s1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        s1 s1Var = new s1(a.class.getSimpleName(), 11);
        s1 s1Var2 = new s1(10, false);
        ((s1) s1Var.c).c = s1Var2;
        s1Var.c = s1Var2;
        s1Var2.d = this.a;
        s1Var2.b = "text";
        String valueOf = String.valueOf(this.b);
        y7.a aVar = new y7.a(10, false);
        ((s1) s1Var.c).c = aVar;
        s1Var.c = aVar;
        aVar.d = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        y7.a aVar2 = new y7.a(10, false);
        ((s1) s1Var.c).c = aVar2;
        aVar2.d = valueOf2;
        aVar2.b = "index";
        s1 s1Var3 = new s1(10, false);
        aVar2.c = s1Var3;
        s1Var.c = s1Var3;
        s1Var3.d = this.d;
        s1Var3.b = "mid";
        return s1Var.toString();
    }
}
