// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zy3 extends FrameLayout {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ t14 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy3(t14 t14Var, Context context, boolean z) {
        super(context);
        this.b = t14Var;
        this.a = z;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        t14 t14Var = this.b;
        gz3 gz3Var = t14Var.C0;
        bz3 bz3Var = t14Var.E0;
        fz3 fz3Var = t14Var.H0;
        if (this.a || !(view == bz3Var || view == fz3Var)) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        float y = gz3Var.getY() + gz3Var.getMeasuredHeight() + 1.0f;
        if (view == bz3Var) {
            y = Math.max(y, fz3Var.getY() + fz3Var.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y - (gl.L(16.0f) * t14Var.a.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t14 t14Var = this.b;
        t14Var.L0 = true;
        t14Var.Z();
        mz3 mz3Var = t14Var.U0;
        if (mz3Var != null) {
            mz3Var.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t14 t14Var = this.b;
        t14Var.L0 = false;
        t14Var.Z();
        mz3 mz3Var = t14Var.U0;
        if (mz3Var != null) {
            mz3Var.a();
        }
    }
}
