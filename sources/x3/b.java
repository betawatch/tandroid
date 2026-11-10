package x3;

import f3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.m;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class b {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final g c = new g();
    public m d;
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
