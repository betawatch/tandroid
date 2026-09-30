package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class z40 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.tp t1;
    public final /* synthetic */ d60 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(d60 d60Var, LaunchActivity launchActivity, org.telegram.ui.Components.tp tpVar) {
        super(launchActivity, null);
        this.u1 = d60Var;
        this.t1 = tpVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.tp tpVar = this.t1;
            tpVar.f = alpha;
            tpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.u1).containerView;
            viewGroup.invalidate();
        }
    }
}
