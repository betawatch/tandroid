package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s20 extends TextView {
    public final RectF a;
    public final /* synthetic */ b50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s20(b50 b50Var, Context context) {
        super(context);
        this.b = b50Var;
        this.a = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), this.b.X2);
        super.onDraw(canvas);
    }
}
