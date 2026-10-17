package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class yo0 extends org.telegram.ui.Cells.fa {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            zf.i0.a(canvas, this, new v3(this, 15));
        }
    }
}
