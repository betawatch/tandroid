package ui;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class c implements a {
    public final Paint a = new Paint(1);
    public int b;

    public final void a(int i7) {
        if (this.b != i7) {
            this.b = i7;
            this.a.setColor(i7);
        }
    }

    @Override // ui.a
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        canvas.drawRect(f10, f11, f12, f13, this.a);
    }
}
