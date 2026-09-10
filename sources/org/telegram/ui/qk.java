package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qk extends org.telegram.ui.Components.nd {
    public final /* synthetic */ eo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(eo eoVar, Context context) {
        super(context);
        this.d = eoVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        eo eoVar = this.d;
        ok okVar = eoVar.Y;
        if (okVar != null) {
            okVar.invalidate();
        }
        if (getVisibility() != 8) {
            eoVar.h9(true);
            FrameLayout frameLayout = eoVar.P;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f7);
            }
            eoVar.o9();
            eoVar.r9();
            View view = eoVar.fragmentView;
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
