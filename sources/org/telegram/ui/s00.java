package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class s00 extends org.telegram.ui.Components.q6 {
    public final /* synthetic */ int s = 0;
    public final Object v;
    public final /* synthetic */ ViewGroup w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s00(zh.j7 j7Var, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.w = j7Var;
        this.v = drawable;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                t00 t00Var = (t00) this.w;
                int a2 = t00Var.w.a(t00Var.v, false);
                setTextColor(a2);
                Paint paint = (Paint) this.v;
                paint.setColor(org.telegram.ui.ActionBar.j6.l1(org.telegram.ui.ActionBar.j6.I.q() ? 0.2f : 0.1f, a2));
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getWidth() - getDrawable().d()) - AndroidUtilities.dpf2(9.32f), (getHeight() - AndroidUtilities.dpf2(14.66f)) / 2.0f, getWidth(), (AndroidUtilities.dpf2(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
                super.dispatchDraw(canvas);
                break;
            default:
                Drawable drawable = (Drawable) this.v;
                if (!((zh.j7) this.w).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().d()) - AndroidUtilities.dp(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.messenger.wl.y(17.0f, getMeasuredHeight(), 2), AndroidUtilities.dp(17.0f) + measuredWidth, (AndroidUtilities.dp(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s00(t00 t00Var, Context context) {
        super(context, false, true, true);
        this.w = t00Var;
        this.v = new Paint(1);
    }
}
