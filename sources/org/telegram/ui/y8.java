package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class y8 extends s4.s0 {
    public boolean a;
    public final /* synthetic */ l9 b;

    public y8(l9 l9Var) {
        this.b = l9Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.i iVar;
        l9 l9Var = this.b;
        ArrayList arrayList = l9Var.G;
        int L0 = l9Var.c.L0();
        int abs = L0 == -1 ? 0 : Math.abs(l9Var.c.N0() - L0) + 1;
        if (abs > 0) {
            int size = l9Var.d.Y2.x.size();
            if (!l9Var.J && !l9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.h6(9, this, (h9) hg.k0.g(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (i11 != 0 && this.a) {
            l9Var.f.e(i11 < 0, true);
        }
        this.a = true;
        l9Var.r.b(L0 != 0 || top < l9Var.d.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT < 31 || (iVar = l9Var.Y) == null) {
            return;
        }
        iVar.f(i10, i11);
        l9Var.f0();
    }
}
