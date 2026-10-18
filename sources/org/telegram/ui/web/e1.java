package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
            kVar = ((org.telegram.ui.ActionBar.n2) g1Var).actionBar;
            if (!kVar.s()) {
                g1Var.finishFragment();
                return;
            }
            kVar2 = ((org.telegram.ui.ActionBar.n2) g1Var).actionBar;
            kVar2.r();
            g1Var.s.clear();
            AndroidUtilities.forEachViews((RecyclerView) g1Var.a, (Utilities.Callback<View>) new ci.e(23));
        }
    }
}
