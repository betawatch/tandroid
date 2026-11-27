// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s58 implements h49 {
    public final /* synthetic */ o68 a;

    public s58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override // h49
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        fd7 fd7Var = new fd7(this, w49Var, view, (byte) 24);
        if (z) {
            fd7Var.run();
        } else {
            this.a.d0(fd7Var);
        }
    }

    @Override // h49
    public final boolean j() {
        return true;
    }

    @Override // h49
    public final boolean k() {
        ((ccb) this.a.A1).b(false);
        return false;
    }

    @Override // h49
    public final boolean p() {
        return false;
    }

    @Override // h49
    public final void n() {
    }

    @Override // h49
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
