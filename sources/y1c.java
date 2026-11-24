// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y1c extends xna {
    public final in3 V;
    public final /* synthetic */ b2c W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1c(b2c b2cVar, Context context) {
        super(context);
        this.W = b2cVar;
        this.V = new in3((byte) 7);
    }

    @Override // xna, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int L = gm.L(8.0f) + this.W.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - L, getHeight(), nm7.d4, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        boa.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = gm.P;
        rectF.set((getWidth() - L) - gm.L(24.0f), 0.0f, getWidth() - L, getHeight());
        this.V.r(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
