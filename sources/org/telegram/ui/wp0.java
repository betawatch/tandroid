package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wp0 implements org.telegram.ui.Components.al0 {
    public final /* synthetic */ aq0 a;

    public wp0(aq0 aq0Var) {
        this.a = aq0Var;
    }

    @Override // org.telegram.ui.Components.al0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        aq0 aq0Var = this.a;
        aq0Var.S = z10 ? 1 : 0;
        if (z10) {
            b5Var = ((org.telegram.ui.ActionBar.n2) aq0Var).parentLayout;
            b5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        aq0Var.G.d1(true);
    }

    @Override // org.telegram.ui.Components.al0
    public final boolean b(int i10) {
        return this.a.H.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.al0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.T && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.w.d(q5Var);
        }
    }

    @Override // org.telegram.ui.Components.al0
    public final boolean d(int i10) {
        aq0 aq0Var = this.a;
        MediaController.AlbumEntry albumEntry = aq0Var.F;
        return aq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) aq0Var.f.get(i10)).id);
    }
}
