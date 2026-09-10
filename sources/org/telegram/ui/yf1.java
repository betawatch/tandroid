package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yf1 extends FrameLayout {
    public TextView a;
    public float b;
    public boolean c;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            float f7 = this.b + 0.013333334f;
            this.b = f7;
            if (f7 > 1.0f) {
                this.c = false;
                this.b = 1.0f;
            }
        } else {
            float f10 = this.b - 0.013333334f;
            this.b = f10;
            if (f10 < 0.0f) {
                this.c = true;
                this.b = 0.0f;
            }
        }
        this.a.setTranslationX(org.telegram.ui.Components.wr.f.getInterpolation(this.b) * AndroidUtilities.dp(8.0f) * (LocaleController.isRTL ? -1 : 1));
        invalidate();
    }
}
