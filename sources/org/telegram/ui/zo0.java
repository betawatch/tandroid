package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class zo0 extends org.telegram.ui.Cells.fa {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            zf.j0.a(canvas, this, new v3(this, 15));
        }
    }
}
