package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rp0 extends org.telegram.ui.Cells.ja {
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            super.draw(canvas);
        } else {
            yf.j0.a(canvas, this, new s3(this, 12));
        }
    }
}
