package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wq0 implements org.telegram.ui.Components.wl0 {
    public final /* synthetic */ br0 a;

    public wq0(br0 br0Var) {
        this.a = br0Var;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.f5 f5Var;
        br0 br0Var = this.a;
        br0Var.W = z10 ? 1 : 0;
        if (z10) {
            f5Var = ((org.telegram.ui.ActionBar.p2) br0Var).parentLayout;
            f5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        br0Var.K.c1(true);
    }

    @Override // org.telegram.ui.Components.wl0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.wl0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.a(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.wl0
    public final boolean d(int i10) {
        br0 br0Var = this.a;
        MediaController.AlbumEntry albumEntry = br0Var.J;
        return br0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) br0Var.f.get(i10)).id);
    }
}
