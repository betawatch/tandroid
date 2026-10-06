package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
            kVar = ((org.telegram.ui.ActionBar.n2) h1Var).actionBar;
            if (!kVar.s()) {
                h1Var.finishFragment();
                return;
            }
            kVar2 = ((org.telegram.ui.ActionBar.n2) h1Var).actionBar;
            kVar2.r();
            h1Var.v.clear();
            AndroidUtilities.forEachViews((RecyclerView) h1Var.a, (Utilities.Callback<View>) new ai.i(23));
        }
    }
}
