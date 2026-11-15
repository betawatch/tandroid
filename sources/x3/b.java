package x3;

import f3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.ff;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class b {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final g c = new g();
    public ff d;
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
