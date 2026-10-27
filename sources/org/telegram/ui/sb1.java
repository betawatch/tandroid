package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class sb1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ vc1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb1(vc1 vc1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = vc1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = vc1Var;
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
                vc1 vc1Var = this.c;
                sb1 sb1Var = vc1Var.E0;
                kc1 kc1Var = vc1Var.y0;
                ub1 ub1Var = vc1Var.a;
                org.telegram.ui.ActionBar.y6.s(sb1Var, kc1Var, ub1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ub1Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.y6.c1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ub1Var.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                vc1 vc1Var2 = this.c;
                sb1 sb1Var2 = vc1Var2.F0;
                kc1 kc1Var2 = vc1Var2.y0;
                ub1 ub1Var2 = vc1Var2.a;
                org.telegram.ui.ActionBar.y6.s(sb1Var2, kc1Var2, ub1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ub1Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.y6.c1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, ub1Var2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
