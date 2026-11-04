package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v8 extends u4.t0 {
    public boolean a;
    public final /* synthetic */ h9 b;

    public v8(h9 h9Var) {
        this.b = h9Var;
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        h9 h9Var = this.b;
        ArrayList arrayList = h9Var.y;
        int L0 = h9Var.b.L0();
        int abs = L0 == -1 ? 0 : Math.abs(h9Var.b.N0() - L0) + 1;
        if (abs > 0) {
            int size = h9Var.c.g3.E.size();
            if (!h9Var.G && !h9Var.E && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(19, this, (e9) k2.p1.h(1, arrayList)));
            }
        }
        if (i10 != 0 && this.a) {
            h9Var.f.e(i10 < 0, true);
        }
        this.a = true;
    }
}
