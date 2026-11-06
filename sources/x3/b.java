package x3;

import f3.p;
import java.util.ArrayDeque;
import org.telegram.ui.Components.n;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
