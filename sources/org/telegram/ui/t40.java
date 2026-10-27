package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t40 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.eq x1;
    public final /* synthetic */ x50 y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t40(x50 x50Var, LaunchActivity launchActivity, org.telegram.ui.Components.eq eqVar) {
        super(launchActivity, null);
        this.y1 = x50Var;
        this.x1 = eqVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.eq eqVar = this.x1;
            eqVar.f = alpha;
            eqVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.k3) this.y1).containerView;
            viewGroup.invalidate();
        }
    }
}
