package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class z40 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.sp t1;
    public final /* synthetic */ d60 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(d60 d60Var, LaunchActivity launchActivity, org.telegram.ui.Components.sp spVar) {
        super(launchActivity, null);
        this.u1 = d60Var;
        this.t1 = spVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.sp spVar = this.t1;
            spVar.f = alpha;
            spVar.draw(canvas);
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
