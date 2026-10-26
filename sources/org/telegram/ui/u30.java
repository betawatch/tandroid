package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class u30 extends org.telegram.ui.Components.ru {
    public final /* synthetic */ v50 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u30(v50 v50Var, LaunchActivity launchActivity, z40 z40Var, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(launchActivity, z40Var, r2Var, 5, true, u6Var);
        this.V = v50Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        v50 v50Var = this.V;
        v50Var.H.getEditText().setTranslationY(view.getMeasuredHeight() - v50Var.B3.f);
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.ru
    public final void f() {
        ViewGroup viewGroup;
        super.f();
        org.telegram.ui.Components.sz emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.w0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            viewGroup = ((org.telegram.ui.ActionBar.k3) this.V).containerView;
            emojiView.setBottomInset(viewGroup.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        oe.e eVar = this.V.B3;
        if (eVar.f == 0.0f) {
            eVar.c(getMeasuredHeight());
        } else {
            eVar.a(getMeasuredHeight());
        }
    }

    @Override // org.telegram.ui.Components.ru
    public final void p() {
        rh.i iVar = this.V.C1;
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.N ? Math.max(0, getKeyboardHeight()) : 0;
        if (max > 0) {
            iVar.g(max);
        } else {
            iVar.i(false);
        }
    }

    @Override // org.telegram.ui.Components.ru
    public final void y() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.V).containerView;
        viewGroup.requestApplyInsets();
    }
}
