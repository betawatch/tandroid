package org.telegram.ui;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ zn0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        PhotoViewer photoViewer = this.b;
        switch (i7) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.f9;
                this.b.v2(false, 0, 0, true, false, false);
                break;
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.f9;
                photoViewer.Y2();
                break;
            case 2:
                Drawable[] drawableArr3 = PhotoViewer.f9;
                this.b.v2(false, 0, 0, false, false, false);
                break;
            case 3:
                Drawable[] drawableArr4 = PhotoViewer.f9;
                photoViewer.z0(false, false);
                org.telegram.ui.Components.ti tiVar = photoViewer.b2;
                if (tiVar != null) {
                    tiVar.a(true);
                }
                org.telegram.ui.ActionBar.g2 g2Var = photoViewer.m4;
                if (g2Var != null) {
                    g2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 4:
                photoViewer.t7 = null;
                break;
            case 5:
                Drawable[] drawableArr5 = PhotoViewer.f9;
                photoViewer.z0(true, false);
                break;
            default:
                PhotoViewer.L(photoViewer);
                break;
        }
    }
}
