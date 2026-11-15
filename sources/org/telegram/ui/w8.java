package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w8 extends v4.t0 {
    public boolean a;
    public final /* synthetic */ i9 b;

    public w8(i9 i9Var) {
        this.b = i9Var;
    }

    @Override // v4.t0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        i9 i9Var = this.b;
        ArrayList arrayList = i9Var.y;
        int L0 = i9Var.b.L0();
        int abs = L0 == -1 ? 0 : Math.abs(i9Var.b.N0() - L0) + 1;
        if (abs > 0) {
            int size = i9Var.c.g3.E.size();
            if (!i9Var.G && !i9Var.E && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                org.telegram.messenger.g0.h3(new u5(3, this, (f9) i5.c.h(1, arrayList)));
            }
        }
        if (i10 != 0 && this.a) {
            i9Var.f.e(i10 < 0, true);
        }
        this.a = true;
    }
}
