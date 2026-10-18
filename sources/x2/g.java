package x2;

import b2.w;
import e9.b0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final boolean a;
    public final boolean b;

    public g(w wVar, int i10) {
        this.a = (wVar.e & 1) != 0;
        this.b = i2.d.e(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.a.c(this.b, gVar.b).c(this.a, gVar.a).e();
    }
}
