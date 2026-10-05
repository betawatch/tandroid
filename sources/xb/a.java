package xb;

import java.util.Arrays;
import n6.l;
import v7.k;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        k kVar = new k(a.class.getSimpleName(), 12);
        k kVar2 = new k(11, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.c = this.a;
        kVar2.b = "text";
        String valueOf = String.valueOf(this.b);
        y7.a aVar = new y7.a(11, false);
        ((k) kVar.d).d = aVar;
        kVar.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        y7.a aVar2 = new y7.a(11, false);
        ((k) kVar.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        k kVar3 = new k(11, false);
        aVar2.d = kVar3;
        kVar.d = kVar3;
        kVar3.c = this.d;
        kVar3.b = "mid";
        return kVar.toString();
    }
}
