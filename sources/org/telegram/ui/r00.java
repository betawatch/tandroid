package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r00 extends View implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.e6 a;
    public vg.f b;
    public String c;

    public r00(Activity activity) {
        super(activity);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(true, false, false);
        this.a = e6Var;
        e6Var.u(-1);
        e6Var.b = 17;
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.setCallback(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.e6 e6Var = this.a;
        int N = (int) (org.telegram.messenger.i0.N(30.0f) + e6Var.c());
        int width = (getWidth() - N) / 2;
        int i10 = N + width;
        vg.f fVar = this.b;
        if (fVar != null) {
            fVar.setBounds(width, 0, i10, getHeight());
            this.b.draw(canvas);
        }
        e6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.a.setBounds(0, 0, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        vg.f fVar = this.b;
        if (fVar != null) {
            fVar.updateColors();
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
