package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ ae1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc1(ae1 ae1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = ae1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = ae1Var;
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
                ae1 ae1Var = this.c;
                yc1 yc1Var = ae1Var.D0;
                pd1 pd1Var = ae1Var.x0;
                ad1 ad1Var = ae1Var.a;
                org.telegram.ui.ActionBar.j6.s(yc1Var, pd1Var, ad1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ad1Var.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ad1Var.F("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                ae1 ae1Var2 = this.c;
                yc1 yc1Var2 = ae1Var2.E0;
                pd1 pd1Var2 = ae1Var2.x0;
                ad1 ad1Var2 = ae1Var2.a;
                org.telegram.ui.ActionBar.j6.s(yc1Var2, pd1Var2, ad1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ad1Var2.F("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ad1Var2.F("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
