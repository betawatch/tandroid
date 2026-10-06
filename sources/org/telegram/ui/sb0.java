package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class sb0 extends org.telegram.ui.Cells.w8 {
    @Override // org.telegram.ui.Cells.w8, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
    }
}
