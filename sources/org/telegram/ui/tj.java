package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tj extends org.telegram.ui.Components.xc {
    public final /* synthetic */ cn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(cn cnVar, Context context) {
        super(context);
        this.d = cnVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        cn cnVar = this.d;
        sj sjVar = cnVar.Z;
        if (sjVar != null) {
            sjVar.invalidate();
        }
        if (getVisibility() != 8) {
            cnVar.F9(true);
            FrameLayout frameLayout = cnVar.Q;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            cnVar.L9();
            cnVar.N9();
            View view = cnVar.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i7) {
        FrameLayout frameLayout;
        super.setVisibility(i7);
        if (i7 != 8 || (frameLayout = this.d.Q) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
