package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class f1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ h1 a;

    public f1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        if (i10 == -1) {
            h1 h1Var = this.a;
            kVar = ((org.telegram.ui.ActionBar.m2) h1Var).actionBar;
            if (!kVar.t()) {
                h1Var.finishFragment();
                return;
            }
            kVar2 = ((org.telegram.ui.ActionBar.m2) h1Var).actionBar;
            kVar2.s();
            h1Var.s.clear();
            AndroidUtilities.forEachViews((RecyclerView) h1Var.a, (Utilities.Callback<View>) new bi.f(23));
        }
    }
}
