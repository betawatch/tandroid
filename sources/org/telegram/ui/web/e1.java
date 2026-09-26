package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class e1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ g1 a;

    public e1(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        if (i10 == -1) {
            g1 g1Var = this.a;
            kVar = ((org.telegram.ui.ActionBar.m2) g1Var).actionBar;
            if (!kVar.s()) {
                g1Var.finishFragment();
                return;
            }
            kVar2 = ((org.telegram.ui.ActionBar.m2) g1Var).actionBar;
            kVar2.r();
            g1Var.s.clear();
            AndroidUtilities.forEachViews((RecyclerView) g1Var.a, (Utilities.Callback<View>) new ai.i(23));
        }
    }
}
