package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class y8 extends f2.a1 {
    public boolean a;
    public final /* synthetic */ l9 b;

    public y8(l9 l9Var) {
        this.b = l9Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        og.e eVar;
        l9 l9Var = this.b;
        ArrayList arrayList = l9Var.D;
        int L0 = l9Var.c.L0();
        int abs = L0 == -1 ? 0 : Math.abs(l9Var.c.N0() - L0) + 1;
        if (abs > 0) {
            int size = l9Var.d.V2.x.size();
            if (!l9Var.G && !l9Var.E && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.h(21, this, (h9) l.d.i(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (i11 != 0 && this.a) {
            l9Var.f.e(i11 < 0, true);
        }
        this.a = true;
        l9Var.r.b(L0 != 0 || top < l9Var.d.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT < 31 || (eVar = l9Var.V) == null) {
            return;
        }
        eVar.f(i10, i11);
        l9Var.f0();
    }
}
