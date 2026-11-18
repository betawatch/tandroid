package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class uz extends View implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.m6 a;
    public fh.g b;
    public String c;

    public uz(Activity activity) {
        super(activity);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(true, false, false);
        this.a = m6Var;
        m6Var.u(-1);
        m6Var.b = 17;
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.setCallback(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.m6 m6Var = this.a;
        int N = (int) (org.telegram.messenger.g0.N(30.0f) + m6Var.c());
        int width = (getWidth() - N) / 2;
        int i7 = N + width;
        fh.g gVar = this.b;
        if (gVar != null) {
            gVar.setBounds(width, 0, i7, getHeight());
            this.b.draw(canvas);
        }
        m6Var.draw(canvas);
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
