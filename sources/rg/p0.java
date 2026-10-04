package rg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class p0 extends p6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ q0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(q0 q0Var, Context context, int i10) {
        super(context, true, true, true);
        this.s = i10;
        this.v = q0Var;
    }

    @Override // org.telegram.ui.Components.p6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                q0 q0Var = this.v;
                if (q0Var.M > 0.0f) {
                    if (q0Var.L == null) {
                        q0Var.L = new wp(q0Var.d.getTextColor());
                    }
                    int dp = (int) ((1.0f - q0Var.M) * AndroidUtilities.dp(24.0f));
                    q0Var.L.setBounds(0, dp, getWidth(), getHeight() + dp);
                    q0Var.L.setAlpha((int) (q0Var.M * 255.0f));
                    q0Var.L.draw(canvas);
                    invalidate();
                }
                float f7 = q0Var.M;
                if (f7 < 1.0f) {
                    if (f7 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (q0Var.M * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (q0Var.M * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                q0 q0Var2 = this.v;
                if (q0Var2.M > 0.0f) {
                    if (q0Var2.L == null) {
                        q0Var2.L = new wp(q0Var2.d.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - q0Var2.M) * AndroidUtilities.dp(24.0f));
                    q0Var2.L.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    q0Var2.L.setAlpha((int) (q0Var2.M * 255.0f));
                    q0Var2.L.draw(canvas);
                    invalidate();
                }
                float f10 = q0Var2.M;
                if (f10 < 1.0f) {
                    if (f10 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (q0Var2.M * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (q0Var2.M * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
