package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ zs0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ wr0(PhotoViewer photoViewer, View view, zs0 zs0Var, float f7, float f10, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = zs0Var;
        this.d = f7;
        this.e = f10;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.U8;
        View view = this.b;
        zs0 zs0Var = this.c;
        view.setOutlineProvider(zs0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.x3.setOutlineProvider(zs0Var);
        photoViewer.x3.setClipToOutline(true);
        mu0 mu0Var = photoViewer.E2;
        if (mu0Var != null) {
            mu0Var.setOutlineProvider(zs0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.x3.setTranslationY(this.d);
        float f7 = this.e;
        view.setTranslationY(f7);
        mu0 mu0Var2 = photoViewer.E2;
        if (mu0Var2 != null) {
            mu0Var2.setTranslationY(f7);
        }
        photoViewer.Y5 = 0.0f;
        photoViewer.e0.invalidate();
        this.f.start();
    }
}
