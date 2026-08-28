package tf;

import android.view.ViewTreeObserver;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ MediaController.CropState a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ n d;

    public i(n nVar, MediaController.CropState cropState, int i9, int i10) {
        this.d = nVar;
        this.a = cropState;
        this.b = i9;
        this.c = i10;
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
                m mVar = nVar.I;
                if (mVar != null) {
                    mVar.v(true);
                }
            }
            nVar.setFreeform(cropState.freeform);
            float aspectRatio = cropAreaView.getAspectRatio();
            int i9 = cropState.transformRotation;
            int i10 = this.b;
            int i11 = this.c;
            if (i9 == 90 || i9 == 270) {
                aspectRatio = 1.0f / aspectRatio;
                l lVar = nVar.H;
                f10 = lVar.b;
                f11 = lVar.a;
            } else {
                l lVar2 = nVar.H;
                f10 = lVar2.a;
                f11 = lVar2.b;
                i11 = i10;
                i10 = i11;
            }
            if (!nVar.x || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(nVar.getCurrentWidth(), nVar.getCurrentHeight(), (((float) i9) + nVar.H.g) % 180.0f != 0.0f, nVar.x);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            l.d(nVar.H, i9);
            cropAreaView.setActualRect((aspectRatio * cropState.cropPw) / cropState.cropPh);
            l lVar3 = nVar.H;
            lVar3.j = cropState.mirrored;
            l.e(lVar3, cropState.cropRotate);
            l lVar4 = nVar.H;
            float f13 = cropState.cropPx * i10;
            float f14 = lVar4.f;
            l.f(lVar4, f13 * f14, cropState.cropPy * i11 * f14);
            float max = Math.max(cropAreaView.getCropWidth() / f10, cropAreaView.getCropHeight() / f11);
            l lVar5 = nVar.H;
            l.g(lVar5, cropState.cropScale * (max / lVar5.f), 0.0f, 0.0f);
            nVar.r(false);
            m mVar2 = nVar.I;
            if (mVar2 != null) {
                mVar2.C(false);
            }
        }
        cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
