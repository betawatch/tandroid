// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yzb extends wla {
    public final xl3 V;
    public final /* synthetic */ b0c W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzb(b0c b0cVar, Context context) {
        super(context);
        this.W = b0cVar;
        this.V = new xl3((byte) 7);
    }

    @Override // wla, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int L = gl.L(8.0f) + this.W.d.getWidth();
        canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - L, getHeight(), kk7.d4, 31);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        ama.a(canvas, getLayout());
        canvas.restore();
        RectF rectF = gl.P;
        rectF.set((getWidth() - L) - gl.L(24.0f), 0.0f, getWidth() - L, getHeight());
        this.V.s(canvas, rectF, 2, 1.0f);
        canvas.restore();
    }
}
