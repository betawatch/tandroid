package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x30 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ org.telegram.ui.Components.ip F1;
    public final /* synthetic */ a50 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(a50 a50Var, LaunchActivity launchActivity, org.telegram.ui.Components.ip ipVar) {
        super(launchActivity, null);
        this.G1 = a50Var;
        this.F1 = ipVar;
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.i0.L(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.ip ipVar = this.F1;
            ipVar.f = alpha;
            ipVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.G1.b.invalidate();
        }
    }
}
