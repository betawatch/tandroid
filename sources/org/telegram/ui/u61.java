package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u61 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ x71 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u61(x71 x71Var, Context context, int i7) {
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
                u61 u61Var = x71Var.F0;
                n71 n71Var = x71Var.z0;
                w61 w61Var = x71Var.a;
                org.telegram.ui.ActionBar.n6.t(u61Var, n71Var, w61Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var.g("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.n6.d1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var.g("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                x71 x71Var2 = this.c;
                u61 u61Var2 = x71Var2.G0;
                n71 n71Var2 = x71Var2.z0;
                w61 w61Var2 = x71Var2.a;
                org.telegram.ui.ActionBar.n6.t(u61Var2, n71Var2, w61Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var2.g("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.n6.d1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, w61Var2.g("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
