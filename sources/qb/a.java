package qb;

import java.util.Arrays;
import n6.l;
import q5.d;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        return l.k(this.a, aVar.a) && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c && l.k(this.d, aVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Integer.valueOf(this.c), this.d});
    }

    public final String toString() {
        d dVar = new d(a.class.getSimpleName(), 24);
        d dVar2 = new d(23, false);
        ((d) dVar.d).d = dVar2;
        dVar.d = dVar2;
        dVar2.c = this.a;
        dVar2.b = "text";
        String valueOf = String.valueOf(this.b);
        boolean z10 = false;
        y7.a aVar = new y7.a(23, z10);
        ((d) dVar.d).d = aVar;
        dVar.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        y7.a aVar2 = new y7.a(23, z10);
        ((d) dVar.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        d dVar3 = new d(23, z10);
        aVar2.d = dVar3;
        dVar.d = dVar3;
        dVar3.c = this.d;
        dVar3.b = "mid";
        return dVar.toString();
    }
}
