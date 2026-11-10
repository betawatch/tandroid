package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rv0 extends hz {
    @Override // org.telegram.ui.hz, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(2.0f), 0.0f);
        super.draw(canvas, charSequence, i7, i10, f10, i11, i12, i13, paint);
        canvas.restore();
    }
}
