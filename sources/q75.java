// default package

import android.graphics.Canvas;
import android.view.View;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class q75 extends iu3 {
    public final /* synthetic */ j95 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q75(j95 j95Var, LaunchActivity launchActivity, r85 r85Var, e eVar, vnb vnbVar) {
        super(launchActivity, r85Var, eVar, 5, true, vnbVar);
        this.W = j95Var;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != getEditText()) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        j95 j95Var = this.W;
        j95Var.A1.getEditText().setTranslationY(view.getMeasuredHeight() - j95Var.q5.f);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // iu3
    public final void f() {
        super.f();
        o24 emojiView = getEmojiView();
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(this.W.b.getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        t84 t84Var = this.W.q5;
        if (t84Var.f == 0.0f) {
            t84Var.c(getMeasuredHeight());
        } else {
            t84Var.a(getMeasuredHeight());
        }
    }

    @Override // iu3
    public final void p() {
        int max = this.e ? Math.max(0, getEmojiPadding()) : this.O ? Math.max(0, getKeyboardHeight()) : 0;
        v2d v2dVar = this.W.w3;
        if (max > 0) {
            v2dVar.g(max);
        } else {
            v2dVar.i(false);
        }
    }

    @Override // iu3
    public final void y() {
        this.W.b.requestApplyInsets();
    }
}
