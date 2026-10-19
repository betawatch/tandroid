package u3;

import c3.p;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class b {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final g c = new g();
    public l2.f d;
    public int e;
    public int f;
    public long g;

    public final long a(p pVar, int i10) {
        pVar.readFully(this.a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (r0[i11] & 255);
        }
        return j10;
    }
}
