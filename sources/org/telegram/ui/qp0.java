package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qp0 implements hi.a, tg.a {
    public final org.telegram.ui.Components.w9 a;
    public final /* synthetic */ PhotoViewer b;

    public qp0(PhotoViewer photoViewer) {
        this.b = photoViewer;
        this.a = new org.telegram.ui.Components.w9(photoViewer.b0, photoViewer.e0, 0, false);
    }

    @Override // tg.a
    public final vg.f a() {
        vg.f fVar = new vg.f(this);
        this.b.Z.add(fVar);
        return fVar;
    }

    @Override // hi.a
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        this.b.U0(canvas, this.a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }
}
