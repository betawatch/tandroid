package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tz extends View implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.h6 a;
    public fh.g b;
    public String c;

    public tz(Activity activity) {
        super(activity);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(true, false, false);
        this.a = h6Var;
        h6Var.u(-1);
        h6Var.b = 17;
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.w(org.telegram.messenger.g0.L(14.0f));
        h6Var.setCallback(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.h6 h6Var = this.a;
        int N = (int) (org.telegram.messenger.g0.N(30.0f) + h6Var.c());
        int width = (getWidth() - N) / 2;
        int i7 = N + width;
        fh.g gVar = this.b;
        if (gVar != null) {
            gVar.setBounds(width, 0, i7, getHeight());
            this.b.draw(canvas);
        }
        h6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.a.setBounds(0, 0, i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        fh.g gVar = this.b;
        if (gVar != null) {
            gVar.updateColors();
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
