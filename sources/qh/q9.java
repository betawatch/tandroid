package qh;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class q9 extends j5 {
    public final /* synthetic */ ca z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(ca caVar, Activity activity, org.telegram.ui.Components.ba baVar, i5 i5Var) {
        super(activity, baVar, i5Var);
        this.z0 = caVar;
    }

    @Override // qh.j5
    public final void b() {
        s6 s6Var = this.d;
        if (s6Var != null && !s6Var.u) {
            if (this.n != null) {
                Matrix matrix = s6Var.n0;
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

    @Override // qh.j5
    public final void i() {
        f9 f9Var;
        ca caVar = this.z0;
        s6 s6Var = caVar.H1;
        if (s6Var == null || !s6Var.u || !s6Var.K || (f9Var = caVar.s1) == null || f9Var.O0 == null) {
            return;
        }
        for (int i10 = 0; i10 < caVar.s1.O0.getChildCount(); i10++) {
            View childAt = caVar.s1.O0.getChildAt(i10);
            if (childAt instanceof eg.y1) {
                ((eg.y1) childAt).s();
            }
        }
    }
}
