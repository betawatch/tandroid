package th;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.nd;
import org.telegram.ui.kp;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d2 implements lj0 {
    public final /* synthetic */ z2 a;

    public d2(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ boolean A() {
        return false;
    }

    @Override // org.telegram.ui.Components.lj0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.lj0
    public final boolean h() {
        return this.a.L0();
    }

    @Override // org.telegram.ui.Components.lj0
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        z2 z2Var = this.a;
        Paint paint = z2Var.W1;
        j2.f fVar = z2Var.y1;
        float f12 = -f10;
        float f13 = -f11;
        fVar.x(f12, f13, z2Var.getMeasuredWidth() + f12, z2Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) fVar.a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, (Paint) fVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.lj0
    public final void t() {
        ((f7) this.a.z1).b(false);
    }

    @Override // org.telegram.ui.Components.lj0
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        z2 z2Var = this.a;
        if (z10) {
            org.telegram.ui.Components.s4.Z(z2Var.l2, 1, z2Var.k1, new nd(this, z10, o0Var, view));
        } else {
            z2Var.l0(new kp(this, view, o0Var, z10, z11));
        }
    }
}
