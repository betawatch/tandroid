package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class b2 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(a3 a3Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = a3Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                a3 a3Var = this.b;
                if (a3Var.F2.getVisibility() == 0 && a3Var.F2.getLayoutParams().width != (x10 = (int) (((a3Var.A2.getX() + a3Var.A2.getMeasuredWidth()) - a3Var.F2.getX()) + AndroidUtilities.dp(10.0f)))) {
                    a3Var.F2.getLayoutParams().width = x10;
                    a3Var.F2.invalidate();
                    a3Var.F2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                a3 a3Var2 = this.b;
                if (a3Var2.D1 && a3Var2.R0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - a3Var2.R0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d = a3Var2.T0.d(a3Var2.V0 ? 1.0f : 0.0f, false);
                    canvas.scale(d, d, a3Var2.R0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.n6 n6Var = a3Var2.R0;
                    n6Var.w = 255;
                    n6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                a3 a3Var3 = this.b;
                if (a3Var3.D1 && a3Var3.Q0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - a3Var3.Q0.d()) - AndroidUtilities.dp(6.0f), 0.0f);
                    float d10 = a3Var3.S0.d(a3Var3.U0 ? 1.0f : 0.0f, false);
                    canvas.scale(d10, d10, a3Var3.Q0.d() / 2.0f, AndroidUtilities.dp(20.0f));
                    org.telegram.ui.Components.n6 n6Var2 = a3Var3.Q0;
                    n6Var2.w = 255;
                    n6Var2.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 1:
                return drawable == this.b.R0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == this.b.Q0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
