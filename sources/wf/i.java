package wf;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ MediaController.CropState a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ n d;

    public i(n nVar, MediaController.CropState cropState, int i10, int i11) {
        this.d = nVar;
        this.a = cropState;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        float f9;
        float f10;
        n nVar = this.d;
        nVar.l(false);
        CropAreaView cropAreaView = nVar.a;
        MediaController.CropState cropState = this.a;
        if (cropState != null) {
            float f11 = cropState.lockedAspectRatio;
            if (f11 > 1.0E-4f) {
                cropAreaView.setLockedAspectRatio(f11);
                m mVar = nVar.I;
                if (mVar != null) {
                    mVar.C(true);
                }
            }
            nVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i10 = cropState.transformRotation;
            int i11 = this.b;
            int i12 = this.c;
            if (i10 == 90 || i10 == 270) {
                aspectRatio = 1.0f / aspectRatio;
                l lVar = nVar.H;
                f9 = lVar.b;
                f10 = lVar.a;
            } else {
                l lVar2 = nVar.H;
                f9 = lVar2.a;
                f10 = lVar2.b;
                i12 = i11;
                i11 = i12;
            }
            if (!nVar.x || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(nVar.getCurrentWidth(), nVar.getCurrentHeight(), (((float) i10) + nVar.H.g) % 180.0f != 0.0f, nVar.x);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            l.d(nVar.H, i10);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            l lVar3 = nVar.H;
            lVar3.j = cropState.mirrored;
            l.e(lVar3, cropState.cropRotate);
            l lVar4 = nVar.H;
            float f12 = cropState.cropPx * i11;
            float f13 = lVar4.f;
            l.f(lVar4, f12 * f13, cropState.cropPy * i12 * f13);
            float max = Math.max(cropAreaView.getCropWidth() / f9, cropAreaView.getCropHeight() / f10);
            l lVar5 = nVar.H;
            l.g(lVar5, cropState.cropScale * (max / lVar5.f), 0.0f, 0.0f);
            nVar.r(false);
            m mVar2 = nVar.I;
            if (mVar2 != null) {
                mVar2.P(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
