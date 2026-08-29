package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vp0 implements org.telegram.ui.Components.kl0 {
    public final /* synthetic */ zp0 a;

    public vp0(zp0 zp0Var) {
        this.a = zp0Var;
    }

    @Override // org.telegram.ui.Components.kl0
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

    @Override // org.telegram.ui.Components.kl0
    public final boolean b(int i10) {
        return this.a.H.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.kl0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.T && (view instanceof org.telegram.ui.Cells.r5)) {
            org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
            r5Var.w.d(r5Var);
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean d(int i10) {
        zp0 zp0Var = this.a;
        MediaController.AlbumEntry albumEntry = zp0Var.F;
        return zp0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) zp0Var.f.get(i10)).id);
    }
}
