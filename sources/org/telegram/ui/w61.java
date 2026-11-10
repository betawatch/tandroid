package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ x71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w61(x71 x71Var, Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 1:
                this.c = x71Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = x71Var;
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
                x71 x71Var = this.c;
                w61 w61Var = x71Var.E0;
                n71 n71Var = x71Var.y0;
                y61 y61Var = x71Var.a;
                org.telegram.ui.ActionBar.m6.t(w61Var, n71Var, y61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, y61Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.m6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, y61Var.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                x71 x71Var2 = this.c;
                w61 w61Var2 = x71Var2.F0;
                n71 n71Var2 = x71Var2.y0;
                y61 y61Var2 = x71Var2.a;
                org.telegram.ui.ActionBar.m6.t(w61Var2, n71Var2, y61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, y61Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.m6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, y61Var2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
