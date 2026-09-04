package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class uc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ wd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc1(wd1 wd1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = wd1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = wd1Var;
                this.b = new RectF();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float measuredWidth = getMeasuredWidth();
                float measuredHeight = getMeasuredHeight();
                RectF rectF = this.b;
                rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
                wd1 wd1Var = this.c;
                uc1 uc1Var = wd1Var.D0;
                ld1 ld1Var = wd1Var.x0;
                wc1 wc1Var = wd1Var.a;
                org.telegram.ui.ActionBar.j6.s(uc1Var, ld1Var, wc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                wd1 wd1Var2 = this.c;
                uc1 uc1Var2 = wd1Var2.E0;
                ld1 ld1Var2 = wd1Var2.x0;
                wc1 wc1Var2 = wd1Var2.a;
                org.telegram.ui.ActionBar.j6.s(uc1Var2, ld1Var2, wc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, wc1Var2.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
