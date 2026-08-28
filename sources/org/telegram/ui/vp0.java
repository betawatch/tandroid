package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vp0 implements org.telegram.ui.Components.xk0 {
    public final /* synthetic */ zp0 a;

    public vp0(zp0 zp0Var) {
        this.a = zp0Var;
    }

    @Override // org.telegram.ui.Components.xk0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        zp0 zp0Var = this.a;
        zp0Var.S = z10 ? 1 : 0;
        if (z10) {
            b5Var = ((org.telegram.ui.ActionBar.o2) zp0Var).parentLayout;
            b5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        zp0Var.G.d1(true);
    }

    @Override // org.telegram.ui.Components.xk0
    public final boolean b(int i9) {
        return this.a.H.j(i9) == 0;
    }

    @Override // org.telegram.ui.Components.xk0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.T && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.d(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.xk0
    public final boolean d(int i9) {
        zp0 zp0Var = this.a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        return zp0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i9).imageId) : ((MediaController.SearchImage) zp0Var.f.get(i9)).id);
    }
}
