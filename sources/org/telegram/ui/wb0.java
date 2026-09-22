package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class wb0 extends org.telegram.ui.Cells.x8 {
    @Override // org.telegram.ui.Cells.x8, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
    }
}
