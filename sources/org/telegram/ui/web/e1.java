package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.n2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
            kVar = ((n2) g1Var).actionBar;
            if (!kVar.s()) {
                g1Var.finishFragment();
                return;
            }
            kVar2 = ((n2) g1Var).actionBar;
            kVar2.r();
            g1Var.s.clear();
            AndroidUtilities.forEachViews((RecyclerView) g1Var.a, (Utilities.Callback<View>) new ai.i(23));
        }
    }
}
