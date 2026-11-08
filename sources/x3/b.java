package x3;

import f3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.n;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final g c = new g();
    public n d;
    public int e;
    public int f;
    public long g;

    public final long a(p pVar, int i7) {
        pVar.readFully(this.a, 0, i7);
        long j3 = 0;
        for (int i10 = 0; i10 < i7; i10++) {
            j3 = (j3 << 8) | (r0[i10] & 255);
        }
        return j3;
    }
}
