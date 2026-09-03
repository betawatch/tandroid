package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class th0 extends FrameLayout {
    public TLRPC.User a;
    public org.telegram.ui.Components.f90 b;
    public org.telegram.ui.Components.u00 c;
    public boolean d;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.f90 f90Var = this.b;
        org.telegram.ui.Components.u00 u00Var = this.c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30);
        this.d = true;
        boolean z4 = u00Var.getVisibility() == 0;
        f90Var.setVisibility(8);
        if (z4) {
            u00Var.setVisibility(8);
        }
        super.onMeasure(i10, makeMeasureSpec);
        if (z4) {
            u00Var.getLayoutParams().width = getMeasuredWidth();
            u00Var.setVisibility(0);
        }
        f90Var.setVisibility(0);
        f90Var.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(24.0f);
        this.d = false;
        super.onMeasure(i10, makeMeasureSpec);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
