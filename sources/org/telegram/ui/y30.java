package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y30 extends s4.s0 {
    public final /* synthetic */ i60 a;

    public y30(i60 i60Var) {
        this.a = i60Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        i60 i60Var = this.a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.invalidate();
        i60Var.a2.invalidate();
    }
}
