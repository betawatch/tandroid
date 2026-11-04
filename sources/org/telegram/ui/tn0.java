package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ wo0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ tn0(PhotoViewer photoViewer, View view, wo0 wo0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = wo0Var;
        this.d = f10;
        this.e = f11;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.V8;
        View view = this.b;
        wo0 wo0Var = this.c;
        view.setOutlineProvider(wo0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.y3.setOutlineProvider(wo0Var);
        photoViewer.y3.setClipToOutline(true);
        fq0 fq0Var = photoViewer.F2;
        if (fq0Var != null) {
            fq0Var.setOutlineProvider(wo0Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.y3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        fq0 fq0Var2 = photoViewer.F2;
        if (fq0Var2 != null) {
            fq0Var2.setTranslationY(f10);
        }
        photoViewer.Z5 = 0.0f;
        photoViewer.f0.invalidate();
        this.f.start();
    }
}
