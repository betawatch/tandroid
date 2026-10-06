package u3;

import c3.p;
import ii.n4;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class b {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final e c = new e();
    public n4 d;
    public int e;
    public int f;
    public long g;

    public final long a(p pVar, int i10) {
        pVar.readFully(this.a, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (r0[i11] & 255);
        }
        return j3;
    }
}
