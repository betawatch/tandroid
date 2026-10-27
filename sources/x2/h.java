package x2;

import b2.x;
import c3.h0;
import f9.w;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
