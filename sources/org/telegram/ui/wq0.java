package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wq0 implements org.telegram.ui.Components.rm0 {
    public final /* synthetic */ br0 a;

    public wq0(br0 br0Var) {
        this.a = br0Var;
    }

    @Override // org.telegram.ui.Components.rm0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        br0 br0Var = this.a;
        br0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) br0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        br0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.rm0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.rm0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.b(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.rm0
    public final boolean d(int i10) {
        br0 br0Var = this.a;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        return br0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) br0Var.f.get(i10)).id);
    }
}
