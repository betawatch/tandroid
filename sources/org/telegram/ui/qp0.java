package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qp0 extends org.telegram.ui.Cells.ia {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            yf.j0.a(canvas, this, new t3(this, 12));
        }
    }
}
