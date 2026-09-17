package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class ub0 extends org.telegram.ui.Cells.w8 {
    @Override // org.telegram.ui.Cells.w8, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
    }
}
