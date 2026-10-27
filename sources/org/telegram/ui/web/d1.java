package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.r2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
            kVar = ((r2) f1Var).actionBar;
            if (!kVar.q()) {
                f1Var.finishFragment();
                return;
            }
            kVar2 = ((r2) f1Var).actionBar;
            kVar2.p();
            f1Var.v.clear();
            AndroidUtilities.forEachViews((RecyclerView) f1Var.a, (Utilities.Callback<View>) new di.e(23));
        }
    }
}
