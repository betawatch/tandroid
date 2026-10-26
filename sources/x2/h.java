package x2;

import b2.x;
import c3.h0;
import f9.w;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class h implements Comparable {
    public final boolean a;
    public final boolean b;

    public h(x xVar, int i10) {
        this.a = (xVar.e & 1) != 0;
        this.b = h0.e(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return w.a.c(this.b, hVar.b).c(this.a, hVar.a).e();
    }
}
