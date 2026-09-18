package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class tc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ vd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc1(vd1 vd1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = vd1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = vd1Var;
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
                vd1 vd1Var = this.c;
                tc1 tc1Var = vd1Var.D0;
                kd1 kd1Var = vd1Var.x0;
                vc1 vc1Var = vd1Var.a;
                org.telegram.ui.ActionBar.j6.s(tc1Var, kd1Var, vc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, vc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, vc1Var.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                vd1 vd1Var2 = this.c;
                tc1 tc1Var2 = vd1Var2.E0;
                kd1 kd1Var2 = vd1Var2.x0;
                vc1 vc1Var2 = vd1Var2.a;
                org.telegram.ui.ActionBar.j6.s(tc1Var2, kd1Var2, vc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, vc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, vc1Var2.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
