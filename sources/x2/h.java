package x2;

import b2.x;
import e9.b0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class h implements Comparable {
    public final boolean a;
    public final boolean b;

    public h(x xVar, int i10) {
        this.a = (xVar.e & 1) != 0;
        this.b = i0.a.b(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return b0.a.c(this.b, hVar.b).c(this.a, hVar.a).e();
    }
}
