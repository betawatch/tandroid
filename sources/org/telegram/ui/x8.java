package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x8 extends s4.s0 {
    public boolean a;
    public final /* synthetic */ j9 b;

    public x8(j9 j9Var) {
        this.b = j9Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        j9 j9Var = this.b;
        ArrayList arrayList = j9Var.y;
        int L0 = j9Var.b.L0();
        int abs = L0 == -1 ? 0 : Math.abs(j9Var.b.N0() - L0) + 1;
        if (abs > 0) {
            int size = j9Var.c.f3.D.size();
            if (!j9Var.F && !j9Var.D && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.i0.g3(new h0(8, this, (g9) i0.a.g(1, arrayList)));
            }
        }
        if (i11 != 0 && this.a) {
            j9Var.f.e(i11 < 0, true);
        }
        this.a = true;
    }
}
