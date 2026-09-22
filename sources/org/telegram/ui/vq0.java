package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class vq0 implements org.telegram.ui.Components.ml0 {
    public final /* synthetic */ ar0 a;

    public vq0(ar0 ar0Var) {
        this.a = ar0Var;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        ar0 ar0Var = this.a;
        ar0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) ar0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        ar0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.ml0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.b(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.ml0
    public final boolean d(int i10) {
        ar0 ar0Var = this.a;
        MediaController.AlbumEntry albumEntry = ar0Var.J;
        return ar0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) ar0Var.f.get(i10)).id);
    }
}
