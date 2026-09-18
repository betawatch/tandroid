package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class xq0 implements org.telegram.ui.Components.xl0 {
    public final /* synthetic */ cr0 a;

    public xq0(cr0 cr0Var) {
        this.a = cr0Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        cr0 cr0Var = this.a;
        cr0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) cr0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        cr0Var.K.e1(true);
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.xl0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.a(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean d(int i10) {
        cr0 cr0Var = this.a;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        return cr0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) cr0Var.f.get(i10)).id);
    }
}
