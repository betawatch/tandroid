package org.telegram.ui;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class sx extends org.telegram.ui.Components.q5 {
    @Override // org.telegram.ui.Components.q5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
