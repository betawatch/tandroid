package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class w8 extends s4.t0 {
    public boolean a;
    public final /* synthetic */ j9 b;

    public w8(j9 j9Var) {
        this.b = j9Var;
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        j9 j9Var = this.b;
        ArrayList arrayList = j9Var.G;
        int L0 = j9Var.c.L0();
        int abs = L0 == -1 ? 0 : Math.abs(j9Var.c.N0() - L0) + 1;
        if (abs > 0) {
            int size = j9Var.d.W2.x.size();
            if (!j9Var.J && !j9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(12, this, (f9) hg.c.g(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (i11 != 0 && this.a) {
            j9Var.f.e(i11 < 0, true);
        }
        this.a = true;
        j9Var.r.b(L0 != 0 || top < j9Var.d.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT < 31 || (hVar = j9Var.Y) == null) {
            return;
        }
        hVar.f(i10, i11);
        j9Var.f0();
    }
}
