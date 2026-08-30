package ph;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class s9 extends l5 {
    public final /* synthetic */ da z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(da daVar, Activity activity, org.telegram.ui.Components.ba baVar, k5 k5Var) {
        super(activity, baVar, k5Var);
        this.z0 = daVar;
    }

    @Override // ph.l5
    public final void b() {
        u6 u6Var = this.d;
        if (u6Var != null && !u6Var.u) {
            if (this.n != null) {
                Matrix matrix = u6Var.n0;
                Matrix matrix2 = this.T;
                matrix2.set(matrix);
                float width = 1.0f / getWidth();
                int i10 = this.d.k0;
                if (i10 < 0) {
                    i10 = this.f;
                }
                float f10 = width * i10;
                float height = 1.0f / getHeight();
                int i11 = this.d.l0;
                if (i11 < 0) {
                    i11 = this.h;
                }
                matrix2.preScale(f10, height * i11);
                matrix2.postScale(getWidth() / this.d.i0, getHeight() / this.d.j0);
                Matrix matrix3 = this.g0;
                matrix3.reset();
                this.f0.invert(matrix3);
                this.n.setTransform(matrix2);
                this.n.invalidate();
            }
            invalidate();
        }
        this.z0.j();
    }

    @Override // ph.l5
    public final void i() {
        h9 h9Var;
        da daVar = this.z0;
        u6 u6Var = daVar.H1;
        if (u6Var == null || !u6Var.u || !u6Var.K || (h9Var = daVar.s1) == null || h9Var.O0 == null) {
            return;
        }
        for (int i10 = 0; i10 < daVar.s1.O0.getChildCount(); i10++) {
            View childAt = daVar.s1.O0.getChildAt(i10);
            if (childAt instanceof dg.a2) {
                ((dg.a2) childAt).s();
            }
        }
    }
}
