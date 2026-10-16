package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class x00 extends org.telegram.ui.Components.s6 {
    public final /* synthetic */ int s = 0;
    public final Object v;
    public final /* synthetic */ ViewGroup w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x00(zh.d7 d7Var, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.w = d7Var;
        this.v = drawable;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                y00 y00Var = (y00) this.w;
                int a2 = y00Var.w.a(y00Var.v, false);
                setTextColor(a2);
                Paint paint = (Paint) this.v;
                paint.setColor(org.telegram.ui.ActionBar.g6.m1(org.telegram.ui.ActionBar.g6.I.q() ? 0.2f : 0.1f, a2));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getWidth() - getDrawable().c()) - AndroidUtilities.dpf2(9.32f), (getHeight() - AndroidUtilities.dpf2(14.66f)) / 2.0f, getWidth(), (AndroidUtilities.dpf2(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                super.dispatchDraw(canvas);
                break;
            default:
                Drawable drawable = (Drawable) this.v;
                if (!((zh.d7) this.w).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - AndroidUtilities.dp(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.messenger.sk.A(17.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(17.0f) + measuredWidth, (AndroidUtilities.dp(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x00(y00 y00Var, Context context) {
        super(context, false, true, true);
        this.w = y00Var;
        this.v = new Paint(1);
    }
}
