package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r30 extends org.telegram.ui.Components.au {
    public final /* synthetic */ r50 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r30(r50 r50Var, LaunchActivity launchActivity, v40 v40Var, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(launchActivity, v40Var, o2Var, 5, true, c6Var);
        this.R = r50Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        r50 r50Var = this.R;
        r50Var.D.getEditText().setTranslationY(view.getMeasuredHeight() - r50Var.x3.e);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.au
    public final void f() {
        ViewGroup viewGroup;
        super.f();
        org.telegram.ui.Components.fz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.s0 = false;
            emojiView.t2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.R).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        vd.c cVar = this.R.x3;
        if (cVar.e == 0.0f) {
            cVar.c(getMeasuredHeight());
        } else {
            cVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.au
    public final void p() {
        ah.i iVar = this.R.y1;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.J ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            iVar.f(max);
        } else {
            iVar.h(false);
        }
    }

    @Override // org.telegram.ui.Components.au
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.R).containerView;
        viewGroup.requestApplyInsets();
    }
}
