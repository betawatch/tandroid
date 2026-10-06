package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class rq0 implements org.telegram.ui.Components.cm0 {
    public final /* synthetic */ wq0 a;

    public rq0(wq0 wq0Var) {
        this.a = wq0Var;
    }

    @Override // org.telegram.ui.Components.cm0
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        wq0 wq0Var = this.a;
        wq0Var.W = z10 ? 1 : 0;
        if (z10) {
            c5Var = ((org.telegram.ui.ActionBar.n2) wq0Var).parentLayout;
            c5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        wq0Var.K.d1(true);
    }

    @Override // org.telegram.ui.Components.cm0
    public final boolean b(int i10) {
        return this.a.L.j(i10) == 0;
    }

    @Override // org.telegram.ui.Components.cm0
    public final void c(View view, boolean z10) {
        if (z10 == this.a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.w.a(t5Var);
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public final boolean d(int i10) {
        wq0 wq0Var = this.a;
        MediaController.AlbumEntry albumEntry = wq0Var.J;
        return wq0Var.b.containsKey(albumEntry != null ? Integer.valueOf(albumEntry.photos.get(i10).imageId) : ((MediaController.SearchImage) wq0Var.f.get(i10)).id);
    }
}
