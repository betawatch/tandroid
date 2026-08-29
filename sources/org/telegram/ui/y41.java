package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class y41 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ d61 c;

    public y41(d61 d61Var, Integer num) {
        this.c = d61Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        d61 d61Var = this.c;
        boolean n10 = d61Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (d61Var.W0 * width)) + view.getPaddingLeft()), (int) com.google.android.recaptcha.internal.a.z(1.0f, d61Var.X0, AndroidUtilities.dp(d61Var.Z0), com.google.android.recaptcha.internal.a.z(1.0f, d61Var.X0, height, view.getPaddingTop())), (int) (((width2 - width) * d61Var.W0) + view.getPaddingLeft() + width), (int) com.google.android.recaptcha.internal.a.z(1.0f, d61Var.X0, AndroidUtilities.dp(d61Var.Z0), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (d61Var.W0 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * d61Var.W0) + view.getPaddingLeft() + width), (int) ((height * d61Var.X0) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
