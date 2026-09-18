package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xq0 implements org.telegram.ui.Components.nl0 {
    public final /* synthetic */ cr0 a;

    public xq0(cr0 cr0Var) {
        this.a = cr0Var;
    }

    @Override // org.telegram.ui.Components.nl0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        cr0 cr0Var = this.a;
        cr0Var.W = z10 ? 1 : 0;
        if (z10) {
            e5Var = ((org.telegram.ui.ActionBar.o2) cr0Var).parentLayout;
            e5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        cr0Var.K.e1(true);
    }

    @Override // org.telegram.ui.Components.nl0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.nl0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.w.b(s5Var);
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public final boolean d(int i10) {
        cr0 cr0Var = this.a;
        MediaController.AlbumEntry albumEntry = cr0Var.J;
        return cr0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) cr0Var.f.get(i10)).id);
    }
}
