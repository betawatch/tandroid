// default package

import android.view.ScaleGestureDetector;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class pbb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ qbb a;

    public pbb(qbb qbbVar) {
        this.a = qbbVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        wab wabVar;
        qbb qbbVar = this.a;
        rbb rbbVar = qbbVar.o0;
        if (!qbbVar.k0 || (wabVar = rbbVar.C0) == null || rbbVar.g0 != 0 || wabVar.s || rbbVar.B0.getFilledProgress() >= 1.0f) {
            return false;
        }
        float scaleFactor = rbbVar.U1 + ((scaleGestureDetector.getScaleFactor() - 1.0f) * 0.75f);
        rbbVar.U1 = scaleFactor;
        rbbVar.U1 = Utilities.i(scaleFactor, 1.0f, 0.0f);
        rbbVar.C0.setZoom(rbbVar.U1);
        r3d r3dVar = rbbVar.W0;
        if (r3dVar != null) {
            r3dVar.b(false, rbbVar.U1);
        }
        rbbVar.i0(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        qbb qbbVar = this.a;
        rbb rbbVar = qbbVar.o0;
        if (rbbVar.C0 == null || rbbVar.g0 != 0 || rbbVar.L0) {
            return false;
        }
        qbbVar.k0 = true;
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        qbb qbbVar = this.a;
        qbbVar.k0 = false;
        rbb rbbVar = qbbVar.o0;
        rbbVar.c(false);
        rbbVar.b();
        super.onScaleEnd(scaleGestureDetector);
    }
}
