package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class wz extends org.telegram.ui.Components.f6 {
    public final /* synthetic */ int s = 0;
    public final Object w;
    public final /* synthetic */ ViewGroup x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz(rh.w7 w7Var, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.x = w7Var;
        this.w = drawable;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                xz xzVar = (xz) this.x;
                int a2 = xzVar.x.a(xzVar.w, false);
                setTextColor(a2);
                Paint paint = (Paint) this.w;
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(org.telegram.ui.ActionBar.t6.I.q() ? 0.2f : 0.1f, a2));
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set((getWidth() - getDrawable().c()) - org.telegram.messenger.i0.N(9.32f), (getHeight() - org.telegram.messenger.i0.N(14.66f)) / 2.0f, getWidth(), (org.telegram.messenger.i0.N(14.66f) + getHeight()) / 2.0f);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
                super.dispatchDraw(canvas);
                break;
            default:
                Drawable drawable = (Drawable) this.w;
                if (!((rh.w7) this.x).d) {
                    int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - org.telegram.messenger.i0.L(20.0f));
                    drawable.setBounds(measuredWidth, org.telegram.messenger.a30.y(17.0f, getMeasuredHeight(), 2), org.telegram.messenger.i0.L(17.0f) + measuredWidth, (org.telegram.messenger.i0.L(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz(xz xzVar, Context context) {
        super(context, false, true, true);
        this.x = xzVar;
        this.w = new Paint(1);
    }
}
