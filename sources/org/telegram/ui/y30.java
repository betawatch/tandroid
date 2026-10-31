package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y30 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ org.telegram.ui.Components.ip E1;
    public final /* synthetic */ b50 F1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y30(b50 b50Var, LaunchActivity launchActivity, org.telegram.ui.Components.ip ipVar) {
        super(launchActivity, null);
        this.F1 = b50Var;
        this.E1 = ipVar;
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.i0.L(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.ip ipVar = this.E1;
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
            this.F1.b.invalidate();
        }
    }
}
