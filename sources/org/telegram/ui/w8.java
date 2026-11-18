package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class w8 extends v4.u0 {
    public boolean a;
    public final /* synthetic */ i9 b;

    public w8(i9 i9Var) {
        this.b = i9Var;
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        i9 i9Var = this.b;
        ArrayList arrayList = i9Var.x;
        int L0 = i9Var.b.L0();
        int abs = L0 == -1 ? 0 : Math.abs(i9Var.b.N0() - L0) + 1;
        if (abs > 0) {
            int size = i9Var.c.g3.E.size();
            if (!i9Var.F && !i9Var.y && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.g3(new oi.s2(29, this, (f9) i5.c.h(1, arrayList)));
            }
        }
        if (i10 != 0 && this.a) {
            i9Var.f.e(i10 < 0, true);
        }
        this.a = true;
    }
}
