package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xz extends org.telegram.ui.Components.f6 {
    public final /* synthetic */ int s = 0;
    public final Object w;
    public final /* synthetic */ ViewGroup x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(rh.w7 w7Var, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.x = w7Var;
        this.w = drawable;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                yz yzVar = (yz) this.x;
                int a2 = yzVar.x.a(yzVar.w, false);
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
                    drawable.setBounds(measuredWidth, org.telegram.messenger.z20.y(17.0f, getMeasuredHeight(), 2), org.telegram.messenger.i0.L(17.0f) + measuredWidth, (org.telegram.messenger.i0.L(17.0f) + getMeasuredHeight()) / 2);
                    drawable.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz(yz yzVar, Context context) {
        super(context, false, true, true);
        this.x = yzVar;
        this.w = new Paint(1);
    }
}
