package org.telegram.ui.web;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.r2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
