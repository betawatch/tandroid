// default package

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class r7b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ s7b a;

    public r7b(s7b s7bVar) {
        this.a = s7bVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        y6b y6bVar;
        s7b s7bVar = this.a;
        t7b t7bVar = s7bVar.u0;
        if (!s7bVar.q0 || (y6bVar = t7bVar.C0) == null || t7bVar.g0 != 0 || y6bVar.s || t7bVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = t7bVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        t7bVar.U1 = scaleFactor;
        t7bVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        t7bVar.C0.setZoom(t7bVar.U1);
        azc azcVar = t7bVar.W0;
        if (azcVar != null) {
            azcVar.b(false, t7bVar.U1);
        }
        t7bVar.i0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        s7b s7bVar = this.a;
        t7b t7bVar = s7bVar.u0;
        if (t7bVar.C0 == null || t7bVar.g0 != 0 || t7bVar.L0) {
            return false;
        }
        s7bVar.q0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        s7b s7bVar = this.a;
        s7bVar.q0 = false;
        t7b t7bVar = s7bVar.u0;
        t7bVar.c(false);
        t7bVar.b();
        super.onScaleEnd(scaleGestureDetector);
    }
}
