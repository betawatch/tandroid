// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class y18 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y28 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y18(y28 y28Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = y28Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x;
        byte b = this.a;
        y28 y28Var = this.b;
        switch (b) {
            case 0:
                if (y28Var.v2.getVisibility() == 0 && y28Var.v2.getLayoutParams().width != (x = (int) (((y28Var.q2.getX() + y28Var.q2.getMeasuredWidth()) - y28Var.v2.getX()) + gl.L(10.0f)))) {
                    y28Var.v2.getLayoutParams().width = x;
                    y28Var.v2.invalidate();
                    y28Var.v2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                if (y28Var.t1 && y28Var.H0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - y28Var.H0.c()) - gl.L(6.0f), 0.0f);
                    float e = y28Var.J0.e(false, y28Var.L0 ? 1.0f : 0.0f);
                    canvas.scale(e, e, y28Var.H0.c() / 2.0f, gl.L(20.0f));
                    gn gnVar = y28Var.H0;
                    gnVar.C = kk7.d4;
                    gnVar.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                if (y28Var.t1 && y28Var.G0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - y28Var.G0.c()) - gl.L(6.0f), 0.0f);
                    float e2 = y28Var.I0.e(false, y28Var.K0 ? 1.0f : 0.0f);
                    canvas.scale(e2, e2, y28Var.G0.c() / 2.0f, gl.L(20.0f));
                    gn gnVar2 = y28Var.G0;
                    gnVar2.C = kk7.d4;
                    gnVar2.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        byte b = this.a;
        y28 y28Var = this.b;
        switch (b) {
            case 1:
                return drawable == y28Var.H0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == y28Var.G0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
