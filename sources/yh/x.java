package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
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
        y yVar = d0Var.a0;
        FrameLayout frameLayout = yVar.b;
        RectF rectF = this.a;
        if (ih.j.c(frameLayout, this, rectF)) {
            TextView textView = d0Var.b0;
            RectF rectF2 = this.b;
            if (ih.j.c(textView, this, rectF2)) {
                float dp = rectF2.right - AndroidUtilities.dp(32.0f);
                float centerY = rectF2.centerY() - AndroidUtilities.dp(16.0f);
                if (rectF.isEmpty()) {
                    return;
                }
                canvas.save();
                canvas.translate(dp, centerY);
                canvas.scale(AndroidUtilities.dp(32.0f) / rectF.width(), AndroidUtilities.dp(32.0f) / rectF.height());
                yVar.b.draw(canvas);
                canvas.restore();
            }
        }
    }
}
