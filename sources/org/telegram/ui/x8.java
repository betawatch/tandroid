package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x8 extends v4.u0 {
    public boolean a;
    public final /* synthetic */ j9 b;

    public x8(j9 j9Var) {
        this.b = j9Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        j9 j9Var = this.b;
        ArrayList arrayList = j9Var.x;
        int L0 = j9Var.b.L0();
        int abs = L0 == -1 ? 0 : Math.abs(j9Var.b.N0() - L0) + 1;
        if (abs > 0) {
            int size = j9Var.c.g3.E.size();
            if (!j9Var.F && !j9Var.y && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.g3(new u5(3, this, (g9) i5.c.h(1, arrayList)));
            }
        }
        if (i10 != 0 && this.a) {
            j9Var.f.e(i10 < 0, true);
        }
        this.a = true;
    }
}
