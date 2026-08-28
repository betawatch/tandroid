package zf;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jp;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o0 extends j6 {
    public final /* synthetic */ int s;
    public final /* synthetic */ p0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(p0 p0Var, Context context, int i9) {
        super(context, true, true, true);
        this.s = i9;
        this.v = p0Var;
    }

    @Override // org.telegram.ui.Components.j6, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 0:
                p0 p0Var = this.v;
                if (p0Var.I > 0.0f) {
                    if (p0Var.H == null) {
                        p0Var.H = new jp(p0Var.d.getTextColor());
                    }
                    int dp = (int) ((1.0f - p0Var.I) * AndroidUtilities.dp(24.0f));
                    p0Var.H.setBounds(0, dp, getWidth(), getHeight() + dp);
                    p0Var.H.setAlpha((int) (p0Var.I * 255.0f));
                    p0Var.H.draw(canvas);
                    invalidate();
                }
                float f10 = p0Var.I;
                if (f10 < 1.0f) {
                    if (f10 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var.I * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var.I * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
            default:
                p0 p0Var2 = this.v;
                if (p0Var2.I > 0.0f) {
                    if (p0Var2.H == null) {
                        p0Var2.H = new jp(p0Var2.d.getTextColor());
                    }
                    int dp2 = (int) ((1.0f - p0Var2.I) * AndroidUtilities.dp(24.0f));
                    p0Var2.H.setBounds(0, dp2, getWidth(), getHeight() + dp2);
                    p0Var2.H.setAlpha((int) (p0Var2.I * 255.0f));
                    p0Var2.H.draw(canvas);
                    invalidate();
                }
                float f11 = p0Var2.I;
                if (f11 < 1.0f) {
                    if (f11 == 0.0f) {
                        super.onDraw(canvas);
                        break;
                    } else {
                        canvas.save();
                        canvas.translate(0.0f, (int) (p0Var2.I * AndroidUtilities.dp(-24.0f)));
                        canvas.scale(1.0f, 1.0f - (p0Var2.I * 0.4f));
                        super.onDraw(canvas);
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }
}
