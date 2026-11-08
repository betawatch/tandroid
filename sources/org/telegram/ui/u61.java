package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class u61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ v71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u61(v71 v71Var, Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 1:
                this.c = v71Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = v71Var;
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
                v71 v71Var = this.c;
                u61 u61Var = v71Var.E0;
                l71 l71Var = v71Var.y0;
                w61 w61Var = v71Var.a;
                org.telegram.ui.ActionBar.k6.t(u61Var, l71Var, w61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                v71 v71Var2 = this.c;
                u61 u61Var2 = v71Var2.F0;
                l71 l71Var2 = v71Var2.y0;
                w61 w61Var2 = v71Var2.a;
                org.telegram.ui.ActionBar.k6.t(u61Var2, l71Var2, w61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var2.d("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.k6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var2.d("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
