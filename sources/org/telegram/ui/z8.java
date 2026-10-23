package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class z8 extends s4.r0 {
    public boolean a;
    public final /* synthetic */ m9 b;

    public z8(m9 m9Var) {
        this.b = m9Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        bh.f fVar;
        m9 m9Var = this.b;
        ArrayList arrayList = m9Var.G;
        int L0 = m9Var.c.L0();
        int abs = L0 == -1 ? 0 : Math.abs(m9Var.c.N0() - L0) + 1;
        if (abs > 0) {
            int size = m9Var.d.W2.x.size();
            if (!m9Var.J && !m9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new i0(7, this, (i9) i2.e.h(1, arrayList)));
            }
        }
        View childAt = recyclerView.getChildAt(0);
        int top = childAt != null ? childAt.getTop() : 0;
        if (i11 != 0 && this.a) {
            m9Var.f.e(i11 < 0, true);
        }
        this.a = true;
        m9Var.r.b(L0 != 0 || top < m9Var.d.getPaddingTop(), true);
        if (Build.VERSION.SDK_INT < 31 || (fVar = m9Var.Y) == null) {
            return;
        }
        fVar.f(i10, i11);
        m9Var.f0();
    }
}
