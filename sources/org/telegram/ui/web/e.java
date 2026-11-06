package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.my0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class e extends Drawable {
    public final /* synthetic */ int a;
    public final my0 b;
    public final /* synthetic */ g c;

    public e(g gVar, String str, int i7) {
        this.a = i7;
        switch (i7) {
            case 1:
                this.c = gVar;
                this.b = new my0(str, 14.0f, org.telegram.messenger.g0.o());
                break;
            default:
                this.c = gVar;
                this.b = new my0(str, 14.0f, org.telegram.messenger.g0.o());
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
    public final void setAlpha(int i7) {
        int i10 = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.a;
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
