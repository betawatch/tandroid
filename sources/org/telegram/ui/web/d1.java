package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.n2;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class d1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ f1 a;

    public d1(f1 f1Var) {
        this.a = f1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        if (i10 == -1) {
            f1 f1Var = this.a;
            kVar = ((n2) f1Var).actionBar;
            if (!kVar.t()) {
                f1Var.finishFragment();
                return;
            }
            kVar2 = ((n2) f1Var).actionBar;
            kVar2.s();
            f1Var.s.clear();
            AndroidUtilities.forEachViews((RecyclerView) f1Var.a, (Utilities.Callback<View>) new ci.e(23));
        }
    }
}
