package qh;

import android.app.Activity;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class p9 extends i5 {
    public final /* synthetic */ ba z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(ba baVar, Activity activity, org.telegram.ui.Components.ba baVar2, h5 h5Var) {
        super(activity, baVar2, h5Var);
        this.z0 = baVar;
    }

    @Override // qh.i5
    public final void b() {
        r6 r6Var = this.d;
        if (r6Var != null && !r6Var.u) {
            if (this.n != null) {
                Matrix matrix = r6Var.n0;
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

    @Override // qh.i5
    public final void i() {
        e9 e9Var;
        ba baVar = this.z0;
        r6 r6Var = baVar.H1;
        if (r6Var == null || !r6Var.u || !r6Var.K || (e9Var = baVar.s1) == null || e9Var.O0 == null) {
            return;
        }
        for (int i10 = 0; i10 < baVar.s1.O0.getChildCount(); i10++) {
            View childAt = baVar.s1.O0.getChildAt(i10);
            if (childAt instanceof eg.y1) {
                ((eg.y1) childAt).s();
            }
        }
    }
}
