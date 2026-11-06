package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn0 implements Runnable {
    public final /* synthetic */ PhotoViewer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ep0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ AnimatorSet f;

    public /* synthetic */ zn0(PhotoViewer photoViewer, View view, ep0 ep0Var, float f10, float f11, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = ep0Var;
        this.d = f10;
        this.e = f11;
        this.f = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.Y8;
        View view = this.b;
        ep0 ep0Var = this.c;
        view.setOutlineProvider(ep0Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.w3.setOutlineProvider(ep0Var);
        photoViewer.w3.setClipToOutline(true);
        nq0 nq0Var = photoViewer.E2;
        if (nq0Var != null) {
            nq0Var.setOutlineProvider(ep0Var);
            photoViewer.E2.setClipToOutline(true);
        }
        photoViewer.w3.setTranslationY(this.d);
        float f10 = this.e;
        view.setTranslationY(f10);
        nq0 nq0Var2 = photoViewer.E2;
        if (nq0Var2 != null) {
            nq0Var2.setTranslationY(f10);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.e0.invalidate();
        this.f.start();
    }
}
