package yb;

import java.util.Arrays;
import n6.l;
import t0.h;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        h hVar = new h(a.class.getSimpleName(), 15);
        h hVar2 = new h(14, false);
        ((h) hVar.d).d = hVar2;
        hVar.d = hVar2;
        hVar2.c = this.a;
        hVar2.b = "text";
        String valueOf = String.valueOf(this.b);
        y7.a aVar = new y7.a(14, false);
        ((h) hVar.d).d = aVar;
        hVar.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        y7.a aVar2 = new y7.a(14, false);
        ((h) hVar.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        h hVar3 = new h(14, false);
        aVar2.d = hVar3;
        hVar.d = hVar3;
        hVar3.c = this.d;
        hVar3.b = "mid";
        return hVar.toString();
    }
}
