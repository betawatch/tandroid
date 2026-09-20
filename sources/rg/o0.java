package rg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tp;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class o0 extends o6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ p0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, Context context, int i10) {
        super(context, true, true, true);
        this.s = i10;
        this.v = p0Var;
    }

    @Override // org.telegram.ui.Components.o6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                p0 p0Var = this.v;
                if (p0Var.M > 0.0f) {
                    if (p0Var.L == null) {
                        p0Var.L = new tp(p0Var.d.getTextColor());
                    }
                    int dp = (int) ((1.0f - p0Var.M) * AndroidUtilities.dp(24.0f));
                    p0Var.L.setBounds(0, dp, getWidth(), getHeight() + dp);
                    p0Var.L.setAlpha((int) (p0Var.M * 255.0f));
                    p0Var.L.draw(canvas);
                    invalidate();
                }
                float f7 = p0Var.M;
                if (f7 < 1.0f) {
                    if (f7 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var.M * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var.M * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                p0 p0Var2 = this.v;
                if (p0Var2.M > 0.0f) {
                    if (p0Var2.L == null) {
                        p0Var2.L = new tp(p0Var2.d.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - p0Var2.M) * AndroidUtilities.dp(24.0f));
                    p0Var2.L.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    p0Var2.L.setAlpha((int) (p0Var2.M * 255.0f));
                    p0Var2.L.draw(canvas);
                    invalidate();
                }
                float f10 = p0Var2.M;
                if (f10 < 1.0f) {
                    if (f10 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var2.M * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var2.M * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
