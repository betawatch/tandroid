package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
