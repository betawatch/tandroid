package xb;

import java.util.Arrays;
import n6.l;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        v7.l lVar = new v7.l(a.class.getSimpleName(), 12);
        v7.l lVar2 = new v7.l(11, false);
        ((v7.l) lVar.d).d = lVar2;
        lVar.d = lVar2;
        lVar2.c = this.a;
        lVar2.b = "text";
        String valueOf = String.valueOf(this.b);
        y7.a aVar = new y7.a(11, false);
        ((v7.l) lVar.d).d = aVar;
        lVar.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        y7.a aVar2 = new y7.a(11, false);
        ((v7.l) lVar.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        v7.l lVar3 = new v7.l(11, false);
        aVar2.d = lVar3;
        lVar.d = lVar3;
        lVar3.c = this.d;
        lVar3.b = "mid";
        return lVar.toString();
    }
}
