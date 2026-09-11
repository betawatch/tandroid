package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class x8 extends s4.s0 {
    public boolean a;
    public final /* synthetic */ k9 b;

    public x8(k9 k9Var) {
        this.b = k9Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        k9 k9Var = this.b;
        ArrayList arrayList = k9Var.G;
        int L0 = k9Var.c.L0();
        int abs = L0 == -1 ? 0 : Math.abs(k9Var.c.N0() - L0) + 1;
        if (abs > 0) {
            int size = k9Var.d.Y2.x.size();
            if (!k9Var.J && !k9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(11, this, (g9) i2.g.h(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (i11 != 0 && this.a) {
            k9Var.f.e(i11 < 0, true);
        }
        this.a = true;
        k9Var.r.b(L0 != 0 || top < k9Var.d.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT < 31 || (fVar = k9Var.Y) == null) {
            return;
        }
        fVar.f(i10, i11);
        k9Var.f0();
    }
}
