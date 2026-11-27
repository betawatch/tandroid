// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class t58 implements h49 {
    public final /* synthetic */ o68 a;

    public t58(o68 o68Var) {
        this.a = o68Var;
    }

    @Override // h49
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        gd7 gd7Var = new gd7(this, w49Var, view, (byte) 24);
        if (z) {
            gd7Var.run();
        } else {
            this.a.d0(gd7Var);
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
