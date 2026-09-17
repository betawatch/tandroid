package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
