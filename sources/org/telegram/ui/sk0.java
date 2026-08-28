package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sk0 extends Drawable {
    public final /* synthetic */ org.telegram.ui.Components.nz0 a;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 b;

    public sk0(org.telegram.ui.Components.nz0 nz0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        this.a = nz0Var;
        this.b = b6Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.c(getBounds().centerX() - (this.a.c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, this.b), canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
