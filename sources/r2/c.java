package r2;

import c8.e1;
import e2.s0;
import e2.t;
import e2.u;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public w7.s a;
    public boolean b;
    public int c;

    public static void a(int i7, ArrayList arrayList) {
        if (e1.d(i7, 0, 7, d) == -1 || arrayList.contains(Integer.valueOf(i7))) {
            return;
        }
        arrayList.add(Integer.valueOf(i7));
    }

    public final u b(u uVar) {
        if (!this.b || !this.a.w(uVar)) {
            return uVar;
        }
        t a10 = uVar.a();
        String str = uVar.k;
        a10.r = s0.n("application/x-media3-cues");
        a10.P = this.a.D(uVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uVar.s);
        sb2.append(str != null ? " ".concat(str) : "");
        a10.j = sb2.toString();
        a10.w = Long.MAX_VALUE;
        return new u(a10);
    }
}
