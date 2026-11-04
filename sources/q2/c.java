package q2;

import b8.od;
import d2.u;
import d2.u0;
import d2.v;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public mb.b a;
    public boolean b;
    public int c;

    public static void a(int i3, ArrayList arrayList) {
        if (od.d(i3, 0, 7, d) == -1 || arrayList.contains(Integer.valueOf(i3))) {
            return;
        }
        arrayList.add(Integer.valueOf(i3));
    }

    public final v b(v vVar) {
        if (!this.b || !this.a.l(vVar)) {
            return vVar;
        }
        u a10 = vVar.a();
        String str = vVar.k;
        a10.r = u0.n("application/x-media3-cues");
        a10.P = this.a.q0(vVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(vVar.s);
        sb2.append(str != null ? " ".concat(str) : "");
        a10.j = sb2.toString();
        a10.w = Long.MAX_VALUE;
        return new v(a10);
    }
}
