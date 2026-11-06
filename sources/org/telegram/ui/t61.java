package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class t61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ u71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t61(u71 u71Var, Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 1:
                this.c = u71Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = u71Var;
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
                u71 u71Var = this.c;
                t61 t61Var = u71Var.E0;
                k71 k71Var = u71Var.y0;
                v61 v61Var = u71Var.a;
                org.telegram.ui.ActionBar.k6.t(t61Var, k71Var, v61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, v61Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, v61Var.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                u71 u71Var2 = this.c;
                t61 t61Var2 = u71Var2.F0;
                k71 k71Var2 = u71Var2.y0;
                v61 v61Var2 = u71Var2.a;
                org.telegram.ui.ActionBar.k6.t(t61Var2, k71Var2, v61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, v61Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, v61Var2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
