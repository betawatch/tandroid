// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class z9a extends rt3 {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final /* synthetic */ taa d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z9a(taa taaVar, Context context, gaa gaaVar, wjb wjbVar) {
        super(context, gaaVar, null, 1, true, wjbVar);
        this.d0 = taaVar;
    }

    @Override // rt3
    public final void c(float f) {
        this.d0.T0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            gt3 editText = this.d0.n1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new x89(editText, (byte) 25));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(s33.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // rt3
    public final void f() {
        super.f();
        t14 emojiView = getEmojiView();
        taa taaVar = this.d0;
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(taaVar.B2.d);
        }
        FrameLayout frameLayout = taaVar.X1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        y9a y9aVar = taaVar.m1;
        if (y9aVar != null) {
            y9aVar.bringToFront();
        }
        y9a y9aVar2 = taaVar.p1;
        if (y9aVar2 != null) {
            y9aVar2.bringToFront();
        }
    }

    @Override // rt3
    public final void q(int i, int i2) {
        taa taaVar = this.d0;
        y9a y9aVar = taaVar.m1;
        if (TextUtils.isEmpty(getEditText().getText())) {
            getEditText().animate().cancel();
            getEditText().setOffsetY(0.0f);
            this.W = false;
        } else {
            this.W = true;
            this.a0 = getEditText().getMeasuredHeight();
            this.b0 = getEditText().getScrollY();
            invalidate();
        }
        taaVar.q2 = y9aVar.getTop() + taaVar.p2;
        y9aVar.invalidate();
    }
}
