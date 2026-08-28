package s3;

import java.util.ArrayDeque;
import m3.l;
import n2.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final e c = new e();
    public p d;
    public int e;
    public int f;
    public long g;

    public final long a(l lVar, int i9) {
        lVar.readFully(this.a, 0, i9);
        long j10 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j10 = (j10 << 8) | (r0[i10] & 255);
        }
        return j10;
    }
}
