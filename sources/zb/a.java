package zb;

import java.util.Arrays;
import o6.l;
import s4.d;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final float b;
    public final int c;
    public final String d;

    public a(float f7, int i10, String str, String str2) {
        int i11 = z7.b.a;
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
        d dVar = new d(a.class.getSimpleName(), 19);
        d dVar2 = new d(18, false);
        ((d) dVar.d).d = dVar2;
        dVar.d = dVar2;
        dVar2.c = this.a;
        dVar2.b = "text";
        String valueOf = String.valueOf(this.b);
        z7.a aVar = new z7.a(18, false);
        ((d) dVar.d).d = aVar;
        dVar.d = aVar;
        aVar.c = valueOf;
        aVar.b = "confidence";
        String valueOf2 = String.valueOf(this.c);
        z7.a aVar2 = new z7.a(18, false);
        ((d) dVar.d).d = aVar2;
        aVar2.c = valueOf2;
        aVar2.b = "index";
        d dVar3 = new d(18, false);
        aVar2.d = dVar3;
        dVar.d = dVar3;
        dVar3.c = this.d;
        dVar3.b = "mid";
        return dVar.toString();
    }
}
