package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class u41 extends ViewOutlineProvider {
    public final Rect a = new Rect();
    public final /* synthetic */ Integer b;
    public final /* synthetic */ z51 c;

    public u41(z51 z51Var, Integer num) {
        this.c = z51Var;
        this.b = num;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float width = (this.b == null ? view.getWidth() / 2.0f : r0.intValue()) + AndroidUtilities.dp(20.0f);
        float width2 = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        z51 z51Var = this.c;
        boolean n10 = z51Var.n();
        Rect rect = this.a;
        if (n10) {
            rect.set((int) ((width - (z51Var.a1 * width)) + view.getPaddingLeft()), (int) com.google.android.gms.internal.cast.a6.x(1.0f, z51Var.b1, AndroidUtilities.dp(z51Var.d1), com.google.android.gms.internal.cast.a6.x(1.0f, z51Var.b1, height, view.getPaddingTop())), (int) (((width2 - width) * z51Var.a1) + view.getPaddingLeft() + width), (int) com.google.android.gms.internal.cast.a6.x(1.0f, z51Var.b1, AndroidUtilities.dp(z51Var.d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((width - (z51Var.a1 * width)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width2 - width) * z51Var.a1) + view.getPaddingLeft() + width), (int) ((height * z51Var.b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
