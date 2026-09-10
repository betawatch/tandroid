package zh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.je;
import org.telegram.ui.Components.ok0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e2 implements ok0 {
    public final /* synthetic */ a3 a;

    public e2(a3 a3Var) {
        this.a = a3Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ok0
    public final boolean k() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.ok0
    public final void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
        a3 a3Var = this.a;
        if (z10) {
            org.telegram.ui.Components.d5.a0(a3Var.C2, 1, a3Var.B1, new je(this, z10, p0Var, view));
        } else {
            a3Var.n0(new xh.m5(this, view, p0Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        a3 a3Var = this.a;
        Paint paint = a3Var.n2;
        com.google.firebase.messaging.n nVar = a3Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        nVar.z(f12, f13, a3Var.getMeasuredWidth() + f12, a3Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, (Paint) nVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public final void s() {
        ((l7) this.a.Q1).b(false);
    }

    @Override // org.telegram.ui.Components.ok0
    public final /* synthetic */ boolean t() {
        return false;
    }
}
