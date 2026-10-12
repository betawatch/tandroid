package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
            if (!kVar.t()) {
                g1Var.finishFragment();
                return;
            }
            kVar2 = ((org.telegram.ui.ActionBar.m2) g1Var).actionBar;
            kVar2.s();
            g1Var.s.clear();
            AndroidUtilities.forEachViews((RecyclerView) g1Var.a, (Utilities.Callback<View>) new bi.f(23));
        }
    }
}
