package s3;

import java.util.ArrayDeque;
import m3.l;
import n2.b0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final f c = new f();
    public b0 d;
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
