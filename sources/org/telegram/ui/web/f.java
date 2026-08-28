package org.telegram.ui.web;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f extends Drawable {
    public final /* synthetic */ int a;
    public final nz0 b;
    public final /* synthetic */ h c;

    public f(h hVar, String str, int i9) {
        this.a = i9;
        switch (i9) {
            case 1:
                this.c = hVar;
                this.b = new nz0(str, 14.0f, AndroidUtilities.bold());
                break;
            default:
                this.c = hVar;
                this.b = new nz0(str, 14.0f, AndroidUtilities.bold());
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
    public final void setAlpha(int i9) {
        int i10 = this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i9 = this.a;
    }

    private final void a(int i9) {
    }

    private final void b(int i9) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
