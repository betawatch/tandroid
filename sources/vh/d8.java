package vh;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;
import org.telegram.ui.Components.s9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d8 extends k4 {
    public final /* synthetic */ o8 C0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(o8 o8Var, Activity activity, s9 s9Var, j4 j4Var) {
        super(activity, s9Var, j4Var);
        this.C0 = o8Var;
    }

    @Override // vh.k4
    public final void b() {
        n5 n5Var = this.d;
        if (n5Var != null && !n5Var.u) {
            if (this.n != null) {
                Matrix matrix = n5Var.n0;
                Matrix matrix2 = this.W;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.k0;
                if (i10 < 0) {
                    i10 = this.f;
                }
                float f7 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f7, height * i11);
                matrix2.postScale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                Matrix matrix3 = this.j0;
                matrix3.reset();
                this.i0.invert(matrix3);
                this.n.setTransform(matrix2);
                this.n.invalidate();
            }
            invalidate();
        }
        this.C0.i();
    }

    @Override // vh.k4
    public final void i() {
        s7 s7Var;
        o8 o8Var = this.C0;
        n5 n5Var = o8Var.K1;
        if (n5Var == null || !n5Var.u || !n5Var.K || (s7Var = o8Var.v1) == null || s7Var.A0 == null) {
            return;
        }
        for (int i10 = 0; i10 < o8Var.v1.A0.getChildCount(); i10++) {
            View childAt = o8Var.v1.A0.getChildAt(i10);
            if (childAt instanceof jg.j1) {
                ((jg.j1) childAt).s();
            }
        }
    }
}
