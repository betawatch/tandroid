package u3;

import java.util.ArrayDeque;
import o3.l;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final f c = new f();
    public o1.a d;
    public int e;
    public int f;
    public long g;

    public final long a(l lVar, int i10) {
        lVar.readFully(this.a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (r0[i11] & 255);
        }
        return j10;
    }
}
