package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ts0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ qr0(PhotoViewer photoViewer, View view, ts0 ts0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = ts0Var;
        this.d = f10;
        this.e = f11;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Q8;
        View view = this.b;
        ts0 ts0Var = this.c;
        view.setOutlineProvider(ts0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.u3.setOutlineProvider(ts0Var);
        photoViewer.u3.setClipToOutline(true);
        hu0 hu0Var = photoViewer.B2;
        if (hu0Var != null) {
            hu0Var.setOutlineProvider(ts0Var);
            photoViewer.B2.setClipToOutline(true);
        }
        photoViewer.u3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        hu0 hu0Var2 = photoViewer.B2;
        if (hu0Var2 != null) {
            hu0Var2.setTranslationY(f10);
        }
        photoViewer.V5 = 0.0f;
        photoViewer.b0.invalidate();
        this.f.start();
    }
}
