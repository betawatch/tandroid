package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y00 extends View implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.r6 a;
    public eh.d b;
    public String c;

    public y00(Activity activity) {
        super(activity);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, false, false);
        this.a = r6Var;
        r6Var.u(-1);
        r6Var.b = 17;
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.setCallback(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.r6 r6Var = this.a;
        int dpf2 = (int) (AndroidUtilities.dpf2(30.0f) + r6Var.c());
        int width = (getWidth() - dpf2) / 2;
        int i10 = dpf2 + width;
        eh.d dVar = this.b;
        if (dVar != null) {
            dVar.setBounds(width, 0, i10, getHeight());
            this.b.draw(canvas);
        }
        r6Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.a.setBounds(0, 0, i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        eh.d dVar = this.b;
        if (dVar != null) {
            dVar.updateColors();
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
