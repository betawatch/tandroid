package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r30 extends org.telegram.ui.Components.tt {
    public final /* synthetic */ s50 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(s50 s50Var, LaunchActivity launchActivity, w40 w40Var, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(launchActivity, w40Var, n2Var, 5, true, c6Var);
        this.R = s50Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        s50 s50Var = this.R;
        s50Var.D.getEditText().setTranslationY(view.getMeasuredHeight() - s50Var.x3.e);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.tt
    public final void f() {
        ViewGroup viewGroup;
        super.f();
        org.telegram.ui.Components.yy emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.s0 = false;
            emojiView.t2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.e3) this.R).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        ud.c cVar = this.R.x3;
        if (cVar.e == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.tt
    public final void p() {
        yg.i iVar = this.R.y1;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.J ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            iVar.f(max);
        } else {
            iVar.h(false);
        }
    }

    @Override // org.telegram.ui.Components.tt
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.R).containerView;
        viewGroup.requestApplyInsets();
    }
}
