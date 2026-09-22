package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class vc1 extends FrameLayout {
    public final /* synthetic */ int a;
    public final RectF b;
    public final /* synthetic */ xd1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc1(xd1 xd1Var, Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = xd1Var;
                super(context);
                this.b = new RectF();
                break;
            default:
                this.c = xd1Var;
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
                xd1 xd1Var = this.c;
                vc1 vc1Var = xd1Var.D0;
                md1 md1Var = xd1Var.x0;
                xc1 xc1Var = xd1Var.a;
                org.telegram.ui.ActionBar.j6.s(vc1Var, md1Var, xc1Var);
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, xc1Var.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, xc1Var.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
            default:
                float measuredWidth2 = getMeasuredWidth();
                float measuredHeight2 = getMeasuredHeight();
                RectF rectF2 = this.b;
                rectF2.set(0.0f, 0.0f, measuredWidth2, measuredHeight2);
                xd1 xd1Var2 = this.c;
                vc1 vc1Var2 = xd1Var2.E0;
                md1 md1Var2 = xd1Var2.x0;
                xc1 xc1Var2 = xd1Var2.a;
                org.telegram.ui.ActionBar.j6.s(vc1Var2, md1Var2, xc1Var2);
                canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, xc1Var2.G("paintChatActionBackground"));
                if (org.telegram.ui.ActionBar.j6.a1()) {
                    canvas.drawRoundRect(rectF2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, xc1Var2.G("paintChatActionBackgroundDarken"));
                    break;
                }
                break;
        }
    }
}
