// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class p58 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o68 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p58(o68 o68Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = o68Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x;
        byte b = this.a;
        o68 o68Var = this.b;
        switch (b) {
            case 0:
                if (o68Var.p2.getVisibility() == 0 && o68Var.p2.getLayoutParams().width != (x = (int) (((o68Var.k2.getX() + o68Var.k2.getMeasuredWidth()) - o68Var.p2.getX()) + hl.L(10.0f)))) {
                    o68Var.p2.getLayoutParams().width = x;
                    o68Var.p2.invalidate();
                    o68Var.p2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                if (o68Var.n1 && o68Var.B0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - o68Var.B0.c()) - hl.L(6.0f), 0.0f);
                    float e = o68Var.D0.e(false, o68Var.F0 ? 1.0f : 0.0f);
                    canvas.scale(e, e, o68Var.B0.c() / 2.0f, hl.L(20.0f));
                    hn hnVar = o68Var.B0;
                    hnVar.C = jn7.d4;
                    hnVar.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                if (o68Var.n1 && o68Var.A0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - o68Var.A0.c()) - hl.L(6.0f), 0.0f);
                    float e2 = o68Var.C0.e(false, o68Var.E0 ? 1.0f : 0.0f);
                    canvas.scale(e2, e2, o68Var.A0.c() / 2.0f, hl.L(20.0f));
                    hn hnVar2 = o68Var.A0;
                    hnVar2.C = jn7.d4;
                    hnVar2.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        byte b = this.a;
        o68 o68Var = this.b;
        switch (b) {
            case 1:
                return drawable == o68Var.B0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == o68Var.A0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
