package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b2 extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ z2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2(z2 z2Var, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = z2Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.a) {
            case 0:
                z2 z2Var = this.b;
                if (z2Var.o2.getVisibility() == 0 && z2Var.o2.getLayoutParams().width != (x10 = (int) (((z2Var.j2.getX() + z2Var.j2.getMeasuredWidth()) - z2Var.o2.getX()) + org.telegram.messenger.i0.L(10.0f)))) {
                    z2Var.o2.getLayoutParams().width = x10;
                    z2Var.o2.invalidate();
                    z2Var.o2.requestLayout();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                z2 z2Var2 = this.b;
                if (z2Var2.m1 && z2Var2.A0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - z2Var2.A0.c()) - org.telegram.messenger.i0.L(6.0f), 0.0f);
                    float e = z2Var2.C0.e(false, z2Var2.E0 ? 1.0f : 0.0f);
                    canvas.scale(e, e, z2Var2.A0.c() / 2.0f, org.telegram.messenger.i0.L(20.0f));
                    org.telegram.ui.Components.e6 e6Var = z2Var2.A0;
                    e6Var.B = zs.e4;
                    e6Var.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                z2 z2Var3 = this.b;
                if (z2Var3.m1 && z2Var3.z0 != null) {
                    canvas.save();
                    canvas.translate((getMeasuredWidth() - z2Var3.z0.c()) - org.telegram.messenger.i0.L(6.0f), 0.0f);
                    float e7 = z2Var3.B0.e(false, z2Var3.D0 ? 1.0f : 0.0f);
                    canvas.scale(e7, e7, z2Var3.z0.c() / 2.0f, org.telegram.messenger.i0.L(20.0f));
                    org.telegram.ui.Components.e6 e6Var2 = z2Var3.z0;
                    e6Var2.B = zs.e4;
                    e6Var2.draw(canvas);
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
                return drawable == this.b.A0 || super.verifyDrawable(drawable);
            case 2:
                return drawable == this.b.z0 || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
