package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.rz0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class e extends Drawable {
    public final /* synthetic */ int a;
    public final rz0 b;
    public final /* synthetic */ g c;

    public e(g gVar, String str, int i10) {
        this.a = i10;
        switch (i10) {
            case 1:
                this.c = gVar;
                this.b = new rz0(str, 14.0f, org.telegram.messenger.i0.o());
                break;
            default:
                this.c = gVar;
                this.b = new rz0(str, 14.0f, org.telegram.messenger.i0.o());
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
