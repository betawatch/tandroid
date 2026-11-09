package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class v61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ w71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v61(w71 w71Var, Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 1:
                this.c = w71Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = w71Var;
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
                w71 w71Var = this.c;
                v61 v61Var = w71Var.E0;
                m71 m71Var = w71Var.y0;
                x61 x61Var = w71Var.a;
                org.telegram.ui.ActionBar.l6.t(v61Var, m71Var, x61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, x61Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.l6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, x61Var.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                w71 w71Var2 = this.c;
                v61 v61Var2 = w71Var2.F0;
                m71 m71Var2 = w71Var2.y0;
                x61 x61Var2 = w71Var2.a;
                org.telegram.ui.ActionBar.l6.t(v61Var2, m71Var2, x61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, x61Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.l6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, x61Var2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
