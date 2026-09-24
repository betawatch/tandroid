package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class e1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ h1 a;

    public e1(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        if (i10 == -1) {
            h1 h1Var = this.a;
            kVar = ((org.telegram.ui.ActionBar.m2) h1Var).actionBar;
            if (!kVar.s()) {
                h1Var.finishFragment();
                return;
            }
            kVar2 = ((org.telegram.ui.ActionBar.m2) h1Var).actionBar;
            kVar2.r();
            h1Var.s.clear();
            AndroidUtilities.forEachViews((RecyclerView) h1Var.a, (Utilities.Callback<View>) new ai.i(23));
        }
    }
}
