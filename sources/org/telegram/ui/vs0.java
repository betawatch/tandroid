package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ float a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ PhotoViewer c;

    public vs0(PhotoViewer photoViewer, float f10, Runnable runnable) {
        this.c = photoViewer;
        this.a = f10;
        this.b = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PhotoViewer photoViewer = this.c;
        photoViewer.m6 = null;
        photoViewer.c6 = 0.0f;
        photoViewer.Y5 = 0.0f;
        photoViewer.d6 = 0.0f;
        float r22 = photoViewer.r2(false);
        photoViewer.b6 = r22;
        photoViewer.X5 = r22;
        photoViewer.b0.invalidate();
        CropAreaView cropAreaView = photoViewer.z1.b.a;
        float r23 = photoViewer.r2(false);
        cropAreaView.k0 = 0.0f;
        cropAreaView.l0 = r23;
        cropAreaView.m0 = 0.0f;
        cropAreaView.n0 = 0.0f;
        cropAreaView.invalidate();
        photoViewer.z1.c.setRotated(false);
        float f10 = this.a;
        if (Math.abs(f10) > 0.0f) {
            org.telegram.ui.Components.af0 af0Var = photoViewer.z1;
            zf.e eVar = af0Var.c;
            if (eVar != null) {
                eVar.b(0.0f);
                eVar.setRotated(false);
            }
            if (af0Var.b.m(f10)) {
                photoViewer.Y0.setColorFilter(new PorterDuffColorFilter(photoViewer.z1(org.telegram.ui.ActionBar.k6.zf), PorterDuff.Mode.MULTIPLY));
            } else {
                photoViewer.Y0.setColorFilter((ColorFilter) null);
            }
        }
        MediaController.CropState cropState = photoViewer.U4.c;
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
