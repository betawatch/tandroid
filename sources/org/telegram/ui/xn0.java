package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xn0 implements si.a, eh.b {
    public final org.telegram.ui.Components.ba a;
    public final /* synthetic */ PhotoViewer b;

    public xn0(PhotoViewer photoViewer) {
        this.b = photoViewer;
        this.a = new org.telegram.ui.Components.ba(photoViewer.c0, photoViewer.f0, 0, false);
    }

    @Override // eh.b
    public final gh.g b() {
        gh.g gVar = new gh.g(this, this, this);
        this.b.a0.add(gVar);
        return gVar;
    }

    @Override // si.a
    public final void l(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        this.b.U0(canvas, this.a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override // eh.b
    public final /* synthetic */ void d(gh.g gVar) {
    }
}
