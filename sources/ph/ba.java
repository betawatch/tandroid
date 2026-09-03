package ph;

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h91;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class ba extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ ca a;

    public ba(ca caVar) {
        this.a = caVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        i9 i9Var;
        ca caVar = this.a;
        da daVar = caVar.B0;
        if (!caVar.x0 || (i9Var = daVar.y0) == null || daVar.c0 != 0 || i9Var.s || daVar.x0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = daVar.Q1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        daVar.Q1 = scaleFactor;
        daVar.Q1 = Utilities.clamp(scaleFactor, 1.0f, 0.0f);
        daVar.y0.setZoom(daVar.Q1);
        h91 h91Var = daVar.S0;
        if (h91Var != null) {
            h91Var.b(daVar.Q1, false);
        }
        daVar.j0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        ca caVar = this.a;
        da daVar = caVar.B0;
        if (daVar.y0 == null || daVar.c0 != 0 || daVar.H0) {
            return false;
        }
        caVar.x0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ca caVar = this.a;
        caVar.x0 = false;
        caVar.B0.f(false);
        da.c(caVar.B0);
        super.onScaleEnd(scaleGestureDetector);
    }
}
