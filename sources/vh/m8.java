package vh;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.s81;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m8 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ n8 a;

    public m8(n8 n8Var) {
        this.a = n8Var;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        t7 t7Var;
        n8 n8Var = this.a;
        o8 o8Var = n8Var.n0;
        if (!n8Var.j0 || (t7Var = o8Var.B0) == null || o8Var.f0 != 0 || t7Var.s || o8Var.A0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = o8Var.T1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        o8Var.T1 = scaleFactor;
        o8Var.T1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        o8Var.B0.setZoom(o8Var.T1);
        s81 s81Var = o8Var.V0;
        if (s81Var != null) {
            s81Var.b(false, o8Var.T1);
        }
        o8Var.i0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        n8 n8Var = this.a;
        o8 o8Var = n8Var.n0;
        if (o8Var.B0 == null || o8Var.f0 != 0 || o8Var.K0) {
            return false;
        }
        n8Var.j0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        n8 n8Var = this.a;
        n8Var.j0 = false;
        n8Var.n0.e(false);
        o8.b(n8Var.n0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
