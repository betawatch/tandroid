package w3;

import e3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final g c = new g();
    public y00 d;
    public int e;
    public int f;
    public long g;

    public final long a(p pVar, int i3) {
        pVar.readFully(this.a, 0, i3);
        long j10 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            j10 = (j10 << 8) | (r0[i10] & 255);
        }
        return j10;
    }
}
