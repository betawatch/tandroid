package pg;

import android.view.ViewTreeObserver;
import org.telegram.messenger.re;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ re b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ m e;

    public /* synthetic */ i(m mVar, re reVar, int i3, int i10, int i11) {
        this.a = i11;
        this.e = mVar;
        this.b = reVar;
        this.c = i3;
        this.d = i10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        float f10;
        float f11;
        float f12;
        float f13;
        switch (this.a) {
            case 0:
                m mVar = this.e;
                mVar.l(false);
                CropAreaView cropAreaView = mVar.a;
                re reVar = this.b;
                if (reVar != null) {
                    float f14 = reVar.v;
                    if (f14 > 1.0E-4f) {
                        cropAreaView.setLockedAspectRatio(f14);
                        l lVar = mVar.N;
                        if (lVar != null) {
                            lVar.A(true);
                        }
                    }
                    mVar.setFreeform(reVar.u);
                    float aspectRatio = cropAreaView.getAspectRatio();
                    int i3 = reVar.k;
                    int i10 = this.c;
                    int i11 = this.d;
                    if (i3 == 90 || i3 == 270) {
                        aspectRatio = 1.0f / aspectRatio;
                        k kVar = mVar.M;
                        f10 = kVar.b;
                        f11 = kVar.a;
                    } else {
                        k kVar2 = mVar.M;
                        f10 = kVar2.a;
                        f11 = kVar2.b;
                        i11 = i10;
                        i10 = i11;
                    }
                    if (!mVar.y || cropAreaView.getLockAspectRatio() <= 0.0f) {
                        cropAreaView.e(mVar.getCurrentWidth(), mVar.getCurrentHeight(), (((float) i3) + mVar.M.g) % 180.0f != 0.0f, mVar.y);
                    } else {
                        cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                        cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
                    }
                    k.d(mVar.M, i3);
                    cropAreaView.setActualRect((aspectRatio * reVar.e) / reVar.f);
                    k kVar3 = mVar.M;
                    kVar3.j = reVar.l;
                    k.e(kVar3, reVar.d);
                    k kVar4 = mVar.M;
                    float f15 = reVar.a * i10;
                    float f16 = kVar4.f;
                    k.f(kVar4, f15 * f16, reVar.b * i11 * f16);
                    float max = Math.max(cropAreaView.getCropWidth() / f10, cropAreaView.getCropHeight() / f11);
                    k kVar5 = mVar.M;
                    k.g(kVar5, reVar.c * (max / kVar5.f), 0.0f, 0.0f);
                    mVar.r(false);
                    l lVar2 = mVar.N;
                    if (lVar2 != null) {
                        lVar2.Q(false);
                    }
                }
                cropAreaView.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
            default:
                m mVar2 = this.e;
                mVar2.l(false);
                CropAreaView cropAreaView2 = mVar2.a;
                re reVar2 = this.b;
                if (reVar2 != null) {
                    float f17 = reVar2.v;
                    if (f17 > 1.0E-4f) {
                        cropAreaView2.setLockedAspectRatio(f17);
                        l lVar3 = mVar2.N;
                        if (lVar3 != null) {
                            lVar3.A(true);
                        }
                    }
                    mVar2.setFreeform(reVar2.u);
                    float aspectRatio2 = cropAreaView2.getAspectRatio();
                    int i12 = reVar2.k;
                    int i13 = this.c;
                    int i14 = this.d;
                    if (i12 == 90 || i12 == 270) {
                        aspectRatio2 = 1.0f / aspectRatio2;
                        k kVar6 = mVar2.M;
                        f12 = kVar6.b;
                        f13 = kVar6.a;
                    } else {
                        k kVar7 = mVar2.M;
                        f12 = kVar7.a;
                        f13 = kVar7.b;
                        i14 = i13;
                        i13 = i14;
                    }
                    if (!mVar2.y || cropAreaView2.getLockAspectRatio() <= 0.0f) {
                        cropAreaView2.e(mVar2.getCurrentWidth(), mVar2.getCurrentHeight(), (((float) i12) + mVar2.M.g) % 180.0f != 0.0f, mVar2.y);
                    } else {
                        cropAreaView2.setLockedAspectRatio(1.0f / cropAreaView2.getLockAspectRatio());
                        cropAreaView2.setActualRect(cropAreaView2.getLockAspectRatio());
                    }
                    k.d(mVar2.M, i12);
                    cropAreaView2.setActualRect((aspectRatio2 * reVar2.e) / reVar2.f);
                    k kVar8 = mVar2.M;
                    kVar8.j = reVar2.l;
                    k.e(kVar8, reVar2.d);
                    k kVar9 = mVar2.M;
                    float f18 = reVar2.a * i13;
                    float f19 = kVar9.f;
                    k.f(kVar9, f18 * f19, reVar2.b * i14 * f19);
                    float max2 = Math.max(cropAreaView2.getCropWidth() / f12, cropAreaView2.getCropHeight() / f13);
                    k kVar10 = mVar2.M;
                    k.g(kVar10, reVar2.c * (max2 / kVar10.f), 0.0f, 0.0f);
                    mVar2.r(false);
                    l lVar4 = mVar2.N;
                    if (lVar4 != null) {
                        lVar4.Q(false);
                    }
                }
                cropAreaView2.getViewTreeObserver().removeOnPreDrawListener(this);
                break;
        }
        return false;
    }
}
