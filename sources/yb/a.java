package yb;

import java.util.Arrays;
import n6.l;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        u2.c cVar = new u2.c(a.class.getSimpleName(), 14);
        u2.c cVar2 = new u2.c(13, false);
        ((u2.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.c = this.a;
        cVar2.b = "text";
        String valueOf = String.valueOf(this.b);
        y7.a aVar = new y7.a(13, false);
        ((u2.c) cVar.d).d = aVar;
        cVar.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        y7.a aVar2 = new y7.a(13, false);
        ((u2.c) cVar.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        u2.c cVar3 = new u2.c(13, false);
        aVar2.d = cVar3;
        cVar.d = cVar3;
        cVar3.c = this.d;
        cVar3.b = "mid";
        return cVar.toString();
    }
}
