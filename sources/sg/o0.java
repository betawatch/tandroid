package sg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.q6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class o0 extends q6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ p0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, Context context, int i10) {
        super(context, true, true, true);
        this.s = i10;
        this.v = p0Var;
    }

    @Override // org.telegram.ui.Components.q6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                p0 p0Var = this.v;
                if (p0Var.O > 0.0f) {
                    if (p0Var.N == null) {
                        p0Var.N = new eq(p0Var.f.getTextColor());
                    }
                    int dp = (int) ((1.0f - p0Var.O) * AndroidUtilities.dp(24.0f));
                    p0Var.N.setBounds(0, dp, getWidth(), getHeight() + dp);
                    p0Var.N.setAlpha((int) (p0Var.O * 255.0f));
                    p0Var.N.draw(canvas);
                    invalidate();
                }
                float f7 = p0Var.O;
                if (f7 < 1.0f) {
                    if (f7 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var.O * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var.O * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                p0 p0Var2 = this.v;
                if (p0Var2.O > 0.0f) {
                    if (p0Var2.N == null) {
                        p0Var2.N = new eq(p0Var2.f.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - p0Var2.O) * AndroidUtilities.dp(24.0f));
                    p0Var2.N.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    p0Var2.N.setAlpha((int) (p0Var2.O * 255.0f));
                    p0Var2.N.draw(canvas);
                    invalidate();
                }
                float f10 = p0Var2.O;
                if (f10 < 1.0f) {
                    if (f10 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var2.O * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var2.O * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
