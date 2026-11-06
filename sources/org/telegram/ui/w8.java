package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class w8 extends v4.s0 {
    public boolean a;
    public final /* synthetic */ i9 b;

    public w8(i9 i9Var) {
        this.b = i9Var;
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        i9 i9Var = this.b;
        ArrayList arrayList = i9Var.y;
        int L0 = i9Var.b.L0();
        int abs = L0 == -1 ? 0 : Math.abs(i9Var.b.N0() - L0) + 1;
        if (abs > 0) {
            int size = i9Var.c.f3.D.size();
            if (!i9Var.F && !i9Var.D && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(14, this, (f9) jg.g.i(1, arrayList)));
            }
        }
        if (i10 != 0 && this.a) {
            i9Var.f.e(i10 < 0, true);
        }
        this.a = true;
    }
}
