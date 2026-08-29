package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u8 extends f2.a1 {
    public boolean a;
    public final /* synthetic */ h9 b;

    public u8(h9 h9Var) {
        this.b = h9Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        lg.e eVar;
        h9 h9Var = this.b;
        ArrayList arrayList = h9Var.C;
        int L0 = h9Var.c.L0();
        int abs = L0 == -1 ? 0 : Math.abs(h9Var.c.N0() - L0) + 1;
        if (abs > 0) {
            int size = h9Var.d.U2.x.size();
            if (!h9Var.F && !h9Var.D && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(14, this, (d9) j7.l1.i(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (i11 != 0 && this.a) {
            h9Var.f.e(i11 < 0, true);
        }
        this.a = true;
        h9Var.r.b(L0 != 0 || top < h9Var.d.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT < 31 || (eVar = h9Var.U) == null) {
            return;
        }
        eVar.f(i10, i11);
        h9Var.f0();
    }
}
