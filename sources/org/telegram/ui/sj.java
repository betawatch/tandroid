package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sj extends org.telegram.ui.Components.cd {
    public final /* synthetic */ bn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(bn bnVar, Context context) {
        super(context);
        this.d = bnVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        bn bnVar = this.d;
        rj rjVar = bnVar.a0;
        if (rjVar != null) {
            rjVar.invalidate();
        }
        if (getVisibility() != 8) {
            bnVar.G9(true);
            FrameLayout frameLayout = bnVar.R;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            bnVar.M9();
            bnVar.O9();
            View view = bnVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i7) {
        FrameLayout frameLayout;
        super.setVisibility(i7);
        if (i7 != 8 || (frameLayout = this.d.R) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
