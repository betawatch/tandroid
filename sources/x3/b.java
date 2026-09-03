package x3;

import java.util.ArrayDeque;
import org.telegram.ui.web.e0;
import r3.l;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final e c = new e();
    public e0 d;
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
