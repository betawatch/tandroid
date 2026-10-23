package org.telegram.ui;

import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
            int size = m9Var.d.Z2.y.size();
            if (!m9Var.J && !m9Var.H && !arrayList.isEmpty() && abs + L0 >= size - 5) {
                AndroidUtilities.runOnUIThread(new h0(7, this, (i9) i2.o1.i(1, arrayList)));
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
        m9Var.e0();
    }
}
