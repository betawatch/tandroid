package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final /* synthetic */ d0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(d0 d0Var, Context context) {
        super(context);
        this.c = d0Var;
        this.a = new RectF();
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        d0 d0Var = this.c;
        y yVar = d0Var.S1;
        FrameLayout frameLayout = yVar.b;
        RectF rectF = this.a;
        if (zg.h.c(frameLayout, this, rectF)) {
            TextView textView = d0Var.T1;
            RectF rectF2 = this.b;
            if (zg.h.c(textView, this, rectF2)) {
                float L = rectF2.right - org.telegram.messenger.i0.L(32.0f);
                float centerY = rectF2.centerY() - org.telegram.messenger.i0.L(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(L, centerY);
                canvas.scale(org.telegram.messenger.i0.L(32.0f) / rectF.width(), org.telegram.messenger.i0.L(32.0f) / rectF.height());
                yVar.b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
