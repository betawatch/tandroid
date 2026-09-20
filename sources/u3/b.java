package u3;

import c3.p;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class b {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final e c = new e();
    public ka.c d;
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
