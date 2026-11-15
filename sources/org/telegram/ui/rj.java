package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class rj extends org.telegram.ui.Components.tc {
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
        qj qjVar = anVar.a0;
        if (qjVar != null) {
            qjVar.invalidate();
        }
        if (getVisibility() != 8) {
            anVar.G9(true);
            FrameLayout frameLayout = anVar.R;
            if (frameLayout != null) {
                frameLayout.setTranslationY(f10);
            }
            anVar.M9();
            anVar.O9();
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
        if (i7 != 8 || (frameLayout = this.d.R) == null) {
            return;
        }
        frameLayout.setTranslationY(0.0f);
    }
}
