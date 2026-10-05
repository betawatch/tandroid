package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class w91 extends org.telegram.ui.Cells.c8 {
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getTranslationY() != 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
        }
        super.onDraw(canvas);
    }
}
