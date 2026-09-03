package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class yk0 extends Drawable {
    public final /* synthetic */ org.telegram.ui.Components.k01 a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 b;

    public yk0(org.telegram.ui.Components.k01 k01Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = k01Var;
        this.b = g6Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.c(getBounds().centerX() - (this.a.c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, this.b), canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
