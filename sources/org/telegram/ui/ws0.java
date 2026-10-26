package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ws0 extends AnimatorListenerAdapter {
    public final /* synthetic */ float a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ PhotoViewer c;

    public ws0(PhotoViewer photoViewer, float f7, Runnable runnable) {
        this.c = photoViewer;
        this.a = f7;
        this.b = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.c;
        photoViewer.p6 = null;
        photoViewer.f6 = 0.0f;
        photoViewer.b6 = 0.0f;
        photoViewer.g6 = 0.0f;
        float t22 = photoViewer.t2(false);
        photoViewer.e6 = t22;
        photoViewer.a6 = t22;
        photoViewer.e0.invalidate();
        CropAreaView cropAreaView = photoViewer.C1.b.a;
        float t23 = photoViewer.t2(false);
        cropAreaView.n0 = 0.0f;
        cropAreaView.o0 = t23;
        cropAreaView.p0 = 0.0f;
        cropAreaView.q0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.C1.c.setRotated(false);
        float f7 = this.a;
        if (Math.abs(f7) > 0.0f) {
            org.telegram.ui.Components.of0 of0Var = photoViewer.C1;
            ng.f fVar = of0Var.c;
            if (fVar != null) {
                fVar.b(0.0f);
                fVar.setRotated(false);
            }
            if (of0Var.b.m(f7)) {
                org.telegram.ui.ActionBar.f7.t(photoViewer.b1, org.telegram.ui.ActionBar.y6.zf, photoViewer.v2, PorterDuff.Mode.MULTIPLY);
            } else {
                photoViewer.b1.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.X4.c;
        if (cropState != null) {
            cropState.cropPy = 0.0f;
            cropState.cropPx = 0.0f;
            cropState.cropPh = 1.0f;
            cropState.cropPw = 1.0f;
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
