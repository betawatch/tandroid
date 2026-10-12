package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class tk extends org.telegram.ui.Components.qd {
    public final /* synthetic */ fo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(fo foVar, Context context) {
        super(context);
        this.d = foVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        fo foVar = this.d;
        sk skVar = foVar.Y;
        if (skVar != null) {
            skVar.invalidate();
        }
        if (getVisibility() != 8) {
            foVar.m9(true);
            FrameLayout frameLayout = foVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            foVar.t9();
            foVar.w9();
            View view = foVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        FrameLayout frameLayout;
        super.setVisibility(i10);
        if (i10 != 8 || (frameLayout = this.d.P) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
