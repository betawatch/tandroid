// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w65 extends TextView {
    public final RectF a;
    public final /* synthetic */ g95 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w65(g95 g95Var, Context context) {
        super(context);
        this.b = g95Var;
        this.a = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.a;
        rectF.set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), this.b.Z2);
        super.onDraw(canvas);
    }
}
