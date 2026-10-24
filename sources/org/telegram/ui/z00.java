package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class z00 extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.p6 a;
    public dh.d b;
    public String c;

    public z00(Activity activity) {
        super(activity);
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, false, false);
        this.a = p6Var;
        p6Var.u(-1);
        p6Var.b = 17;
        p6Var.x(AndroidUtilities.bold());
        p6Var.w(AndroidUtilities.dp(14.0f));
        p6Var.setCallback(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.p6 p6Var = this.a;
        int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + p6Var.c());
        int width = (getWidth() - dpf2) / 2;
        int i10 = dpf2 + width;
        dh.d dVar = this.b;
        if (dVar != null) {
            dVar.setBounds(width, 0, i10, getHeight());
            this.b.draw(canvas);
        }
        p6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.a.setBounds(0, 0, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        dh.d dVar = this.b;
        if (dVar != null) {
            dVar.updateColors();
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
