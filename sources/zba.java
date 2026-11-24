// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zba extends cv3 {
    public boolean W;
    public int a0;
    public int b0;
    public ValueAnimator c0;
    public final /* synthetic */ tca d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zba(tca tcaVar, Context context, gca gcaVar, ylb ylbVar) {
        super(context, gcaVar, null, 1, true, ylbVar);
        this.d0 = tcaVar;
    }

    @Override // cv3
    public final void c(float f) {
        this.d0.T0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            qu3 editText = this.d0.n1.getEditText();
            editText.setOffsetY(editText.getOffsetY() - ((this.b0 - editText.getScrollY()) + (this.a0 - editText.getMeasuredHeight())));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
            ofFloat.addUpdateListener(new p29(editText, (byte) 27));
            ValueAnimator valueAnimator = this.c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.c0 = ofFloat;
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(d53.f);
            ofFloat.start();
            this.W = false;
        }
        super.dispatchDraw(canvas);
    }

    @Override // cv3
    public final void f() {
        super.f();
        e34 emojiView = getEmojiView();
        tca tcaVar = this.d0;
        if (emojiView != null) {
            emojiView.x0 = false;
            emojiView.x2 = false;
            emojiView.setShouldDrawBackground(false);
            emojiView.setBottomInset(tcaVar.B2.d);
        }
        FrameLayout frameLayout = tcaVar.X1;
        if (frameLayout != null) {
            frameLayout.bringToFront();
        }
        yba ybaVar = tcaVar.m1;
        if (ybaVar != null) {
            ybaVar.bringToFront();
        }
        yba ybaVar2 = tcaVar.p1;
        if (ybaVar2 != null) {
            ybaVar2.bringToFront();
        }
    }

    @Override // cv3
    public final void q(int i, int i2) {
        tca tcaVar = this.d0;
        yba ybaVar = tcaVar.m1;
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
        tcaVar.q2 = ybaVar.getTop() + tcaVar.p2;
        ybaVar.invalidate();
    }
}
