package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class w extends FrameLayout {
    public final RectF a;
    public final RectF b;
    public final /* synthetic */ c0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c0 c0Var, Context context) {
        super(context);
        this.c = c0Var;
        this.a = new RectF();
        this.b = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        c0 c0Var = this.c;
        x xVar = c0Var.a0;
        FrameLayout frameLayout = xVar.b;
        RectF rectF = this.a;
        if (ih.k.c(frameLayout, this, rectF)) {
            TextView textView = c0Var.b0;
            RectF rectF2 = this.b;
            if (ih.k.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(dp, centerY);
                canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                xVar.b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
