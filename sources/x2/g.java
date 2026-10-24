package x2;

import b2.w;
import e9.b0;
import i2.o1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class g implements Comparable {
    public final boolean a;
    public final boolean b;

    public g(w wVar, int i10) {
        this.a = (wVar.e & 1) != 0;
        this.b = o1.e(i10, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        return b0.a.c(this.b, gVar.b).c(this.a, gVar.a).e();
    }
}
