package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vn0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ PhotoViewer c;

    public /* synthetic */ vn0(PhotoViewer photoViewer, View view, int i3) {
        this.a = i3;
        this.c = photoViewer;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.c;
                photoViewer.C3 = false;
                this.b.setOutlineProvider(null);
                ImageView imageView = photoViewer.y3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                fq0 fq0Var = photoViewer.F2;
                if (fq0Var != null) {
                    fq0Var.setOutlineProvider(null);
                }
                SurfaceView surfaceView = photoViewer.D2;
                if (surfaceView != null) {
                    surfaceView.setVisibility(0);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer2 = this.c;
                photoViewer2.C3 = false;
                photoViewer2.j4.run();
                org.telegram.messenger.g0.i3(new hk0(6, this, this.b), 100L);
                break;
        }
    }
}
