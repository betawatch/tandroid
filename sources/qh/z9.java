package qh;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h91;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class z9 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ aa a;

    public z9(aa aaVar) {
        this.a = aaVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        f9 f9Var;
        aa aaVar = this.a;
        ba baVar = aaVar.B0;
        if (!aaVar.x0 || (f9Var = baVar.y0) == null || baVar.c0 != 0 || f9Var.s || baVar.x0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = baVar.Q1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        baVar.Q1 = scaleFactor;
        baVar.Q1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        baVar.y0.setZoom(baVar.Q1);
        h91 h91Var = baVar.S0;
        if (h91Var != null) {
            h91Var.b(baVar.Q1, false);
        }
        baVar.j0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        aa aaVar = this.a;
        ba baVar = aaVar.B0;
        if (baVar.y0 == null || baVar.c0 != 0 || baVar.H0) {
            return false;
        }
        aaVar.x0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        aa aaVar = this.a;
        aaVar.x0 = false;
        aaVar.B0.f(false);
        ba.c(aaVar.B0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
