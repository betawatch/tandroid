package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class rj extends org.telegram.ui.Components.yc {
    public final /* synthetic */ an d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(an anVar, Context context) {
        super(context);
        this.d = anVar;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        an anVar = this.d;
        qj qjVar = anVar.Z;
        if (qjVar != null) {
            qjVar.invalidate();
        }
        if (getVisibility() != 8) {
            anVar.E9(true);
            FrameLayout frameLayout = anVar.Q;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            anVar.K9();
            anVar.M9();
            View view = anVar.fragmentView;
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
