package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.widget.TextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z8 extends TextView {
    public final Paint a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.b = h6Var;
        this.a = new Paint(1);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.8f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z6, this.b));
        Paint paint = this.a;
        paint.setColor(r12);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        Layout layout = getLayout();
        int i7 = 0;
        for (int i10 = 0; i10 < layout.getLineCount(); i10++) {
            i7 = Math.max(i7, (int) layout.getLineWidth(i10));
        }
        float f10 = i7 / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - f10) - org.telegram.messenger.g0.L(8.0f), height, paint);
        canvas.drawLine((getWidth() / 2.0f) + f10 + org.telegram.messenger.g0.L(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
