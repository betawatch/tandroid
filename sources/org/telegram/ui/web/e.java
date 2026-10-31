package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class e extends Drawable {
    public final /* synthetic */ int a;
    public final qz0 b;
    public final /* synthetic */ g c;

    public e(g gVar, String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = gVar;
                this.b = new qz0(str, 14.0f, org.telegram.messenger.i0.o());
                break;
            default:
                this.c = gVar;
                this.b = new qz0(str, 14.0f, org.telegram.messenger.i0.o());
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                this.b.c(getBounds().centerX() - (this.b.c / 2.0f), getBounds().centerY(), 1.0f, this.c.s, canvas);
                break;
            default:
                this.b.c(getBounds().centerX() - (this.b.c / 2.0f), getBounds().centerY(), 1.0f, this.c.s, canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        int i11 = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i10 = this.a;
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
