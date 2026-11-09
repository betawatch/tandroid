package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class sz extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.i6 a;
    public fh.g b;
    public String c;

    public sz(Activity activity) {
        super(activity);
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, false, false);
        this.a = i6Var;
        i6Var.u(-1);
        i6Var.b = 17;
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.setCallback(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.i6 i6Var = this.a;
        int N = (int) (org.telegram.messenger.g0.N(30.0f) + i6Var.c());
        int width = (getWidth() - N) / 2;
        int i7 = N + width;
        fh.g gVar = this.b;
        if (gVar != null) {
            gVar.setBounds(width, 0, i7, getHeight());
            this.b.draw(canvas);
        }
        i6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        this.a.setBounds(0, 0, i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.b6
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

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
