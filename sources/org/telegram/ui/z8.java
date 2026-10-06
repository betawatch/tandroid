package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class z8 extends s4.s0 {
    public boolean a;
    public final /* synthetic */ m9 b;

    public z8(m9 m9Var) {
        this.b = m9Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        m9 m9Var = this.b;
        ArrayList arrayList = m9Var.F;
        int L0 = m9Var.b.L0();
        int abs = L0 == -1 ? 0 : Math.abs(m9Var.b.N0() - L0) + 1;
        if (abs > 0) {
            int size = m9Var.c.f3.x.size();
            if (!m9Var.I && !m9Var.G && !arrayList.isEmpty() && L0 + abs >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(9, this, (i9) hg.c.g(1, arrayList)));
            }
        }
        if (i11 != 0 && this.a) {
            m9Var.f.e(i11 < 0, true);
        }
        this.a = true;
    }
}
