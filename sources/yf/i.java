package yf;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        float f10;
        float f11;
        n nVar = this.d;
        nVar.l(false);
        CropAreaView cropAreaView = nVar.a;
        MediaController.CropState cropState = this.a;
        if (cropState != null) {
            float f12 = cropState.lockedAspectRatio;
            if (f12 > 1.0E-4f) {
                cropAreaView.setLockedAspectRatio(f12);
                m mVar = nVar.J;
                if (mVar != null) {
                    mVar.M0(true);
                }
            }
            nVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i10 = cropState.transformRotation;
            int i11 = this.b;
            int i12 = this.c;
            if (i10 == 90 || i10 == 270) {
                aspectRatio = 1.0f / aspectRatio;
                l lVar = nVar.I;
                f10 = lVar.b;
                f11 = lVar.a;
            } else {
                l lVar2 = nVar.I;
                f10 = lVar2.a;
                f11 = lVar2.b;
                i12 = i11;
                i11 = i12;
            }
            if (!nVar.x || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(nVar.getCurrentWidth(), nVar.getCurrentHeight(), (((float) i10) + nVar.I.g) % 180.0f != 0.0f, nVar.x);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            l.d(nVar.I, i10);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            l lVar3 = nVar.I;
            lVar3.j = cropState.mirrored;
            l.e(lVar3, cropState.cropRotate);
            l lVar4 = nVar.I;
            float f13 = cropState.cropPx * i11;
            float f14 = lVar4.f;
            l.f(lVar4, f13 * f14, cropState.cropPy * i12 * f14);
            float max = Math.max(cropAreaView.getCropWidth() / f10, cropAreaView.getCropHeight() / f11);
            l lVar5 = nVar.I;
            l.g(lVar5, cropState.cropScale * (max / lVar5.f), 0.0f, 0.0f);
            nVar.r(false);
            m mVar2 = nVar.J;
            if (mVar2 != null) {
                mVar2.G1(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
